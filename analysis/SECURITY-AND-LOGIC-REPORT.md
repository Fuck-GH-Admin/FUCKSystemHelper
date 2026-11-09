# SystemHelper（com.mobiletools.systemhelper）完整静态逻辑与安全审计

**样本时间**：2026-11-10；**静态检查，不运行 APK，不调用远端服务**。

## 0. 结论与假设

该 APK 是一个由 Vivo/iQOO 签名、面向国内运营商环境的终端信息上报/网络质量诊断代理，与中国联通服务关联。它实际包含设备/SIM/蜂窝网络/信号/位置/应用使用与按 UID 归属的流量统计采集、后台定时/事件触发、本地 SQLite 缓存、AES+RSA 的应用层报文封装、HTTP(S) POST、一个对外导出的 Binder 管理接口，以及百度定位 SDK 和原生定位库。**不能把它理解为只获取信号强度的无害系统工具。**

威胁模型：按要求假定该 APK 被系统高权限预装，Manifest 中请求的权限及隐含系统接口调用均可用；分析其最大可触及的数据和路径。该假设并不自动证明每一次定时器都会运行、数据被远端收到，或百度 SDK 的所有代码路径都由宿主触发。

## 1. 文件身份、签名和可信度

- 原件大小：4,107,356 bytes；SHA-256 `38a9010600bc91fd468701f53ba37ea0d43cb8e906544d0700a799f592011428`。
- 包名：`com.mobiletools.systemhelper`；`versionCode=31`；`versionName=3.0.1-20250515`；minSdk 31 / targetSdk 33 / compileSdk 33。
- `android:sharedUserId="com.mobiletools.systemhelper.uid"`。这是设备安装时的 UID 配置请求；其实际共享关系需要现场 `pm` 数据验证，不可据此推断与任何其他具体 APP 共用 UID。
- APK Signing Block：v2 一名 BBK/iQOO 签名者，v3 两名签名者：适用于 SDK 33+ 的 Vivo platform app 与适用于 SDK 24–32 的 BBK/iQOO。证书 SHA-256 为：Vivo `915191fccf5058fa4b21c9c8ea8897040d313d18838850e986fc00055117d1db`；BBK `bcc35d4d3606f154f0402ab7634e8490c0b244c2675c3c6238986987024f0c02`。这强烈支持 OEM 来源，**但目前仅提取证书，未验 APK 签名摘要/签名合法性，亦未和当前固件基线对比**。
- 内置 `assets/pub.cer`：主题与签发者均为 `UNICOM`，RSA 1024 位，证书自签。它用于业务数据的 RSA 加密，不是 Android APK 的代码签名证书。

证据：`decoded/AndroidManifest.xml`；`decoded/signing-metadata.json`；`decoded/static-values.json`。

## 2. 权限与 Android 组件攻击面

主要 Manifest 权限包括：`INTERNET`、`RECEIVE_BOOT_COMPLETED`、`ACCESS_FINE_LOCATION`、`ACCESS_COARSE_LOCATION`、`ACCESS_BACKGROUND_LOCATION`、`READ_PHONE_STATE`、`READ_PRECISE_PHONE_STATE`、`READ_PRIVILEGED_PHONE_STATE`、`PACKAGE_USAGE_STATS`、`QUERY_ALL_PACKAGES`、`READ_EXTERNAL_STORAGE`、`ACCESS_NETWORK_STATE`、`ACCESS_WIFI_STATE`、`CHANGE_WIFI_STATE`、`FOREGROUND_SERVICE`、`ACCESS_LOCATION_EXTRA_COMMANDS`、`SCHEDULE_EXACT_ALARM`。

已明确的组件：
- `DMApplication` — Application 初始化。
- `OnBootReceiver` — exported，监听 BOOT_COMPLETED / QUICKBOOT_POWERON。
- `SIMStateReceiver` — exported，SIM 状态接收。
- `ConnectStateReceiver` — exported，CONNECTIVITY_CHANGE 状态接收。
- `ScheduleRegisterReceiver`、`AppInfoRegisterReceiver`、`SignalInfoRegisterReceiver`、`GetSignalInfoReceiver` — 非显式导出定时/信号广播接收器。
- `RegisterIntentService` — 内部执行注册逻辑。
- `RegisterJobService` — `android.permission.BIND_JOB_SERVICE` 约束，由 JobScheduler 调用。
- `RegisterHelperService` — **exported=true，无 android:permission**，向外提供 Binder 管理接口。
- `com.baidu.location.f` — `:remote` 进程百度定位服务。
- `TestActivity` — **exported=true**，提供设备信息展示/测试 Activity（调用 `DeviceManager` 构建设备信息 JSON）。

APP 另声明保护级别为 signature 的 `com.mobiletools.systemhelper.permission`，但未绑定到上述 `RegisterHelperService`，不能保护其 Binder 入口。

## 3. 启动、调度、状态机

1. `DMApplication.onCreate` 初始化运行上下文与共享状态。
2. `OnBootReceiver.onReceive` 读取日志开关，初始化设备管理器；开机广播路径写明 `boot delayed for 4 minutes`，并调用 `AlarmHelper` 对注册、信号获取、信号上报、应用信息和周期数据分别设定精确唤醒。使用 `AlarmManager.setExactAndAllowWhileIdle`，因此在 Doze 情况下仍有主动唤醒能力。
3. SIM 变化由 `SIMStateReceiver` 处理；网络变化由 `ConnectStateReceiver` 处理；`GetSignalInfoReceiver` 启动定位和读取蜂窝网络信号。
4. `ScheduleRegisterReceiver`、`AppInfoRegisterReceiver`、`SignalInfoRegisterReceiver` 分别触发类别数据/重新调度；`RegisterIntentService.onHandleIntent` 接收 `RegType`；`RegisterJobService` 也作为任务执行入口。
5. `DeviceManager` (`Lc/d/a/a/n;`) 以 `T`、`A`、`R`、`B`、`F`、`S` 等类别决定创建设备模型、启动应用采集线程、读取信号 SQLite、交由注册线程上报。`T` 分支检查 ICCID 是否变更，未变更可跳过；`A` 分支进入 `control/f` 应用统计线程；`R` 分支读取信号 JSON 数组；`B/F/S` 走设备状态上传类路径。对于每一类别的完整频率与边界，以原始 Dalvik 代码为准，不应仅凭字符串拟定绝对固定时间表。
6. Vivo 分支的 `operator_service_improve_plan` 与 `device_provisioned` 影响 `GlobalSetting.isUserPermissionOpen` 的状态；在本报告的高权限、功能全可用假设下，按允许路径研究其数据采集能力。但某些回调的注册可在该开关检查之外发生；因此关闭开关不能简单等同于彻底停止一切系统事件观察。

主要证据：`disassembly/com__mobiletools__systemhelper__control__OnBootReceiver.dalvik.txt`、`...__GetSignalInfoReceiver.dalvik.txt`、`...__AppInfoRegisterReceiver.dalvik.txt`、`disassembly/c__d__a__a__n.dalvik.txt`、`disassembly/c__d__a__b__a.dalvik.txt`、`disassembly/c__d__a__b__l.dalvik.txt`。

## 4. 数据采集与 JSON 结构

### 4.1 DeviceInfo 主结构

`control/b->a(): String` 生成 JSON，明确的键：`Manuf`、`Model`、`HWVersion`、`SWVersion`、`OS`、`OSVersion`、`IMEI1`、`ICCID1`、`IMSI1`、`MNC1`、`NetworkType1`、`TAC1`、`CID1`、`PCI1`、`VolteEnabled1`、`5GEnabled1`、`VoNREnable1`，以及后缀 `2` 的第二卡槽同类字段；`DataSlot`、`AccType`、`IPv6`、`SubType`、`DeviceType`、`RegType`、`SpecVersion=5.0`、`ClientVersion=3.0.1`、`Time`、`SigInfo`、`AppInfo`、`DeviceInfo`。`DeviceManager` 的硬件读取器还针对 Vivo 提供隐藏/反射式访问 `com.android.internal.telephony.VivoTelephonyApiParams`、`getITelephony`、`vivoTelephonyApi`、`getParamValues` 的适配。具备读取 SIM/IMEI/IMSI、双卡数据卡槽、5G/VoLTE/VoNR 状态的代码路径。

### 4.2 SignalInfo 结构

`Lc/d/a/b/n;->a():JSONObject` 明确包含：`Time`、`IMEI`、`ICCID`、`ClientVersion`、`MNC`、`IMSI`、`TAC`、`CID`、`PCI`、`NetworkType`、`ARFCN`、`Bands`、`Bandwidth`、`CQITableIndex`、`CQIIndex`、`RSRP`、`RSRQ`、`SINR`、`CSIRSRP`、`CSIRSRQ`、`CSISINR`、`Uspeed`、`Dspeed`、`CallDisconnectCause`、`DataFailCause`、`EPSFallback`、`LONGITUDE`、`LATITUDE`、`ALTITUDE`、`SPEED`、`BEARING`。

`control/d` 通过 `TelephonyManager` / `SignalStrength` / `getServiceState` 与蜂窝信号对象读取，按双卡和 LTE/NSA/SA 等制式分支。`GetSignalInfoReceiver$a` 经百度定位回调取得坐标后补充信号结构，并写入 `SignalDatabaseHelper`。

### 4.3 AppInfo 结构

`control/f` 中的 `PackageManager.getInstalledApplications()`、`UsageStatsManager.queryAndAggregateUsageStats()`、`NetworkStatsManager.querySummary()` 构成：已安装应用及包名/名称、按应用前台累计时长、按 UID 计算的蜂窝与 Wi-Fi 网络上/下行流量。`Lc/d/a/b/b;->a(): JSONObject` 输出 `appLabel`、`pkgName`、`Time`、`runTime`、`tx1/rx1/tx2/rx2`、`totalData1`、`totalData2`、`totalDataWiFi` 等字段。

**隐私含义**：设备稳定标识符 + 双卡关联 + 粗到精的地理位置轨迹 + 应用使用习惯 + 应用流量，可用于长期设备画像及行为分析。此处是“代码具有收集并打包能力”的静态结论，实际频率、数据保留期及服务端处理尚无运行态证据。

证据：`disassembly/com__mobiletools__systemhelper__control__b.dalvik.txt`、`...__f.dalvik.txt`、`disassembly/c__d__a__b__b.dalvik.txt`、`...__n.dalvik.txt`、`disassembly/com__mobiletools__systemhelper__control__d.dalvik.txt`。

## 5. 联网：目标、闸门、队列、传输

- 原始静态字段 `Lc/d/a/b/d;->l` 在 DEX `static_values` 中设为 `http://dm.wo.com.cn:18080/register`，可由 SharedPreferences `serverAddress` 覆盖。
- `control/g->b(DeviceInfo)` 先检查应用标志和数据、China 网络条件、联网状态、联通卡或 Wi-Fi 条件；直接尝试上报，或将 JSON 写入 `dmregister` 待处理。并非所有状态都立刻上传。
- `control/g->a(DeviceInfo)` 将设备模型序列化 JSON，先计算 MD5，利用 `assets/pub.cer` 加密其摘要并 Base64/URL 编码放入 `&sign=`；连接字符串还包含 `?ver=5.0`、`&model=`、`&manuf=`。JSON 数据使用 `AES/ECB/PKCS5Padding` 应用层加密。注意：AES 密钥材料为从 JSON 计算的 MD5 摘要（需要据调用参数理解其循环派生关系），不同于随机生成的认证密钥。HTTP body 为 `application/encrypted-json`。
- `Lc/d/a/b/f` 的联网 helper 同时有 `http://` 和 `https://` 分支，`HttpURLConnection`/`HttpsURLConnection`，均配置连接/读取超时、POST、写入字节流并检查响应码。**默认端点选择 HTTP 而非 HTTPS**。
- Baidu 定位 SDK 另带 `https://loc.map.baidu.com/sdk.php`、`https://loc.map.baidu.com/cc.php`、`https://api.map.baidu.com/sdkcs/verify` 等一系列独立网络地址；`http://ofloc.map.baidu.com/offline_loc` 亦在代码中。SDK 的端点不能全部等同于本宿主每次都会调用，需要运行态观测确认。

## 6. 数据落盘与日志

- `HistoryDatabaseHelper` (`Lc/d/a/b/e`) 创建 `dmregister(ID integer primary key autoincrement, jsonString text)`；可插入待上报 JSON、查询最旧记录、删除或轮换历史记录。
- `SignalDatabaseHelper` (`Lc/d/a/b/m`) 创建 `signal(ID integer primary key autoincrement, jsonString text)`；插入信号 JSON，批量查询为 JSON 数组、清理队列。
- SharedPreferences 名 `com_mobiletools_systemhelper_preference`，存储 `serverAddress`、`preference_enable_log`、`appInfoInterval`、`appInfoInterval2`、`scheduleInterval2`、`signalInfoInterval2` 等调度/控制参数。
- `control/g` 在加密 JSON 前拼接 `register postString:` 并经过日志 helper。是否实际写 Logcat 受日志开关控制，但**已存在可输出原始 JSON 的调用路径**。在具有系统日志读取权的设备用户或组件存在时，这是额外泄露面。
- 未见这两份 SQLite helper 自身使用 SQLCipher 或对 jsonString 进行额外应用层加密；这不意味着其它无权限 APP 可以读应用私有数据库。

## 7. 导出 Binder — 明确的本地攻击面

Manifest: `RegisterHelperService` exported=true 且没有 `android:permission`；自定义的 signature 权限没有施加到该 service。

`service/a$a->onTransact` 由 Binder 分派 1–5 号事务，调用 `service/a` 接口：
1. `a():boolean` — 查询日志开关；
2. `a(boolean)` — 设置日志开关；
3. `b():void` — 删除 SharedPreferences 文件；
4. `a(int)` — 根据传入整数调整多个不同的后台任务间隔；
5. `a(String)` — 设置 `serverAddress`。

实现位于 `RegisterHelperService$a`，通过 `Lc/d/a/b/l;->a(Context,String)` 持久化网络地址。代码未见针对调用方 UID/签名的身份检查。只要别的本地 APP 能绑定此 exported service 并完成 Binder 事务，便有机会更改本应用配置、触发额外日志、影响周期任务或重定向上报 URL。**这里没有证明远程网页可直接攻击，也没有证明重定向后的外部服务器可直接解密 AES 密文。**

另一个导出点 `TestActivity` 在 `onCreate` 请求电话/定位权限，加载并显示设备 JSON；需要单独评估是否通过 Activity 绕过其原有的运行条件或向外暴露信息。当前没有证据声称它存在任意代码执行。

证据：`decoded/AndroidManifest.xml`、`disassembly/com__mobiletools__systemhelper__service__a$a.dalvik.txt`、`...__RegisterHelperService$a.dalvik.txt`、`disassembly/com__mobiletools__systemhelper__Activity__TestActivity.dalvik.txt`。

## 8. 业务加密与安全性质

发现 MD5、`RSA/ECB/PKCS1Padding`、`AES/ECB/PKCS5Padding` 和内置 RSA 1024 位联通公钥。此处存在现代设计中的多个弱项：AES ECB 不能隐藏相同明文块结构，且缺少认证加密的完整性语义；RSA 1024 位安全裕度不足；摘要使用 MD5 并将密钥材料与明文关联；默认 HTTP 没有 TLS 传输保护。不能等同于“所有上传 JSON 明文可见”，因为字节体经过应用层加密；也不能评价为稳健的现代安全协议。需要动态分析报文与服务端响应来验证重放、篡改、回滚、重定向的具体后果。

## 9. 第三方 SDK、原生二进制和附加网络面

- 百度定位 Android SDK 存在独立进程服务 `com.baidu.location.f`，网络验证、定位、GNSS、蜂窝小区、传感器、室内定位和 BLE 扫描路径。Manifest 明确提供百度 LBS API_KEY；密钥为 APK 内置公开材料，仓库公开发布时需注意配额滥用风险。
- `liblocSDK8b.so` 暴露约 18 个 `Java_com_baidu_*` JNI 符号，包括编码/混淆与定位计算调用；`libindoor.so` 暴露约 134 个相关 JNI 符号，含室内/停车/地铁定位。**这两份 SO 尚未做逐函数 AArch64 反汇编与全控制流逆向。**
- `libindoor.so` 的 NEEDED 中含 `libapp_BaiduVIlib.so`、`libmml_framework.so`，这两个文件未包含在此 APK 的 `lib/` 内。单凭静态包内容，不能判定全部室内定位功能在目标固件上可装载。
- `La/a/a/i/i;->c(String)` 使用 `Runtime.exec("getprop " + 参数)` 执行命令读取系统属性；**不是此前笼统声称的“完全没有执行系统命令”**，但当前该方法内容也没有证明它执行了 shell 任意远控命令。
- 在分析到的宿主代码中未发现 `DexClassLoader` 动态加载器、直接短信读取、通讯录批量读取、录音或摄像头采集的明确调用链；这属于搜索结果的范围限制，不构成绝对不存在证明。

## 10. 风险矩阵

| 编号 | 风险 | 静态证据 | 结论强度 | 优先级 |
|---|---|---|---|---|
| F-01 | 未受权限保护的 exported Binder 可修改 serverAddress、日志、间隔 | Manifest + onTransact + setter | 高 | 高 |
| F-02 | 联合采集持久标识、位置轨迹、移动网络、应用使用习惯及流量 | JSON 序列化 + Package/Usage/NetworkStats API | 高 | 高 |
| F-03 | 默认 HTTP + AES/ECB + MD5 + RSA1024 的业务加密设计 | 字符串、Cipher/MessageDigest 调用、公钥证书 | 高 | 高 |
| F-04 | 调试日志可输出加密前 JSON，且日志开关可由导出服务改写 | RegisterThread + SharedPreferences setter | 高 | 高 |
| F-05 | exported TestActivity 构建设备 JSON，涉及被动触发信息收集 | Manifest + Activity 代码 | 中 | 中 |
| F-06 | Baidu SDK 包含自有遥测/定位网络端点与原生库 | SDK 包、DEX 和 ELF | 高（能力）/待证（实际触发） | 中高 |
| F-07 | 系统共享 UID 与特权电话权限扩大潜在访问边界 | Manifest | 高（声明）/待证（设备授权） | 中高 |

**不应直接宣称**：APK 是木马、所有采集项都已经传输、外部应用能够解密重定向后的密文、服务端保留了多少天、厂商已违反何法律，或特定手机固件实际开启了哪项 AppOps。以上均需要另证。

## 11. 本次交付的完整程度与未完成任务

已完成：原始 APK 保存、全部 ZIP 成员提取、Manifest 解码、1,149 类/8,767 实际声明方法的结构索引、8,308 个有字节码方法的逐方法指令字记录（包括 xrefs）、静态值表、证书提取、两个 ELF 的符号表、核心逻辑审计与风险判断。

未完成：JADX 源码级可读 Java 反编译、所有 try/catch 控制流与跨方法动态分派恢复、完整 ARM64 SO 逐函数逆向、资源表全 XML 化、APK 签名摘要的密码学验证、真机 Android framework 权限/AppOps 与 Binder 验证、真实联网流量取证和服务端行为验证。因此不能称为逐函数语义完全复原；**原件和可重放的 Dalvik 级索引已保存，遗漏均透明列明**。

后续动态取证的最小要求：隔离测试手机、备份原厂 APK 与分区清单、记录 `dumpsys package`/`appops`/`dumpsys jobscheduler`/`alarm`/`ps`、由本机生成的仅测试数据负载、隔离网络中的 DNS/HTTP(S) 观察，以及对导出服务的本地权限边界验证。未经授权不要攻击实际运营商服务器。
