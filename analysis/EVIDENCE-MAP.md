# SystemHelper 核心数据流—代码证据地图

> 样本 SHA256: `38a9010600bc91fd468701f53ba37ea0d43cb8e906544d0700a799f592011428`。
> 本文件列出具体可核验代码入口与字段，并以高权限预装、所有权限可用为能力威胁模型。它是静态追踪，未产生设备真实网络数据。

## 一、控制层：什么时候运行

| 触发源 | 执行入口 | 核心动作 |
| --- | --- | --- |
| Application 初始化 | [DMApplication.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/DMApplication.java) | 初始化运行环境 |
| 开机/快速启动 | [OnBootReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/OnBootReceiver.java) | 初始化，延迟启动，注册/信号/应用周期计划 |
| SIM 变化 | [SIMStateReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/SIMStateReceiver.java) | 卡状态检测与触发注册 |
| 联网变化 | [ConnectStateReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/ConnectStateReceiver.java) | 变更上报条件 |
| 周期注册 | [ScheduleRegisterReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/ScheduleRegisterReceiver.java) | 设备注册/周期调度 |
| 应用用量 | [AppInfoRegisterReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/AppInfoRegisterReceiver.java) | 发起应用用量与流量统计 |
| 信号获取/上传 | [GetSignalInfoReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java), [SignalInfoRegisterReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/SignalInfoRegisterReceiver.java) | 获取移动网络、位置并缓存/上报 |
| 执行作业 | [RegisterIntentService.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/service/RegisterIntentService.java), [RegisterJobService.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/service/RegisterJobService.java) | 根据 RegType 调用业务注册 |

数值默认值见 [全局配置 d.java](../decompiled/jadx/sources/c/d/a/b/d.java)：普通注册周期 `s=86400000ms`（24小时）、应用上报 `t=86400000ms`（24小时）、信号上报 `u=43200000ms`（12小时）、获取信号 `v=1800000ms`（30分钟）。首次三个随机等待 `m/n/o` 分别为 `new Random().nextInt(86400000)`，不能把它们当作固定值。实际调度可被 SharedPreferences 和导出管理 Binder 改变。

## 二、收集层：取了什么

| 数据集 | 入口代码 | API与产出 |
| --- | --- | --- |
| 设备/SIM/双卡/网络状态 | [control/b.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/b.java) | IMEI、IMSI、ICCID、MNC、网络制式、5G/VoNR/VoLTE、SIM槽等形成 DeviceInfo JSON |
| 信号/基站/定位 | [control/d.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/d.java), [n.java](../decompiled/jadx/sources/c/d/a/b/n.java) | 读取 TelephonyManager/SignalStrength，Cell ID、TAC、PCI、RSRP/RSRQ/SINR、频段及位置字段 |
| 应用、使用时长、流量 | [control/f.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/f.java), [b.java](../decompiled/jadx/sources/c/d/a/b/b.java) | `getInstalledApplications`、`queryAndAggregateUsageStats`、`NetworkStatsManager.querySummary`；包名、App label、前台用时、上下行流量 |
| 定位补全 | [GetSignalInfoReceiver.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/GetSignalInfoReceiver.java) | 百度定位回调，经纬度/高度/方向/速度写入信号对象 |

## 三、存储、发送与加密

| 阶段 | 代码位置 | 特征 |
| --- | --- | --- |
| 组装和择机上传 | [control/g.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/g.java) | 根据中国/联通网络、网络连通、Wi-Fi 等条件直接上报或入队 |
| 注册历史缓存 | [e.java](../decompiled/jadx/sources/c/d/a/b/e.java) | `dmregister` SQLite，`jsonString` 文本 |
| 信号缓存 | [m.java](../decompiled/jadx/sources/c/d/a/b/m.java) | `signal` SQLite，`jsonString` 文本 |
| 加密上传 | [control/g.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/control/g.java), [f.java](../decompiled/jadx/sources/c/d/a/b/f.java) | JSON → MD5、AES/ECB/PKCS5Padding、RSA/ECB/PKCS1Padding 摘要加密 → HTTP(S) POST |
| 终点地址与间隔 | [l.java](../decompiled/jadx/sources/c/d/a/b/l.java), [d.java](../decompiled/jadx/sources/c/d/a/b/d.java) | `serverAddress` / `http://dm.wo.com.cn:18080/register` 与周期字段 |

## 四、导出 Binder 安全链

1. [Manifest](../decoded/AndroidManifest.xml) 声明 `RegisterHelperService exported=true`，但未对其设置 `android:permission`。
2. [RegisterHelperService.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/service/RegisterHelperService.java) 的 `onBind` 直接返回管理 Binder，代码未见 UID 验证。
3. [a.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/service/a.java) 的 `onTransact` 只调用 `Parcel.enforceInterface` 校验接口令牌，**不等价于检查调用者的 UID/签名权限**。
4. 确认事务号：**1** → `a(String)` 设置服务器地址；**2** → `a(int)` 修改时间间隔；**3** → `b()` 清空 SharedPreferences；**4** → `a(boolean)` 修改日志；**5** → `a()` 读取日志设置。
5. 数值间隔未见正数/区间验证（`i`、`i*8/5`、`i*4/5`、`i*6/5`、`i*3/5`），有异常值、过小调度、溢出的配置风险；要通过运行态验证具体唤醒行为。
6. [l.java](../decompiled/jadx/sources/c/d/a/b/l.java) 的 `h(Context)` 在 `GlobalSetting.b=false` 的默认分支返回持久化 `serverAddress`。外部组件可尝试重定向**加密上报报文**或阻断正常上报；不能直接断言外部服务器可解密报文。
7. 另有 [TestActivity.java](../decompiled/jadx/sources/com/mobiletools/systemhelper/Activity/TestActivity.java) exported=true，访问设备信息并展示 JSON，尚需实际调用路径验证。

## 五、边界与审计技巧

- **基础真实性**：`original/SystemHelper.apk` SHA256；`analysis/verification/apksigner.txt` 与后续 API 版本矩阵。
- **可还原性**：`decompiled/apktool/smali/` 有 1,149 份 Smali，可作为逐字节近似反汇编的完整代码级基线；`decoded/dex-xrefs.json` 保存 86,395 个引用索引。
- **高层可读性**：JADX 常规 `decompiled/jadx/sources/`（6 errors）和 `decompiled/jadx-fallback/sources/`（退出码 0）。反编译不等于源码。
- **原生代码**：`decompiled/native/libindoor.so.asm`、`liblocSDK8b.so.asm`；完整指令文本不等于人工理解全部 JNI 原生算法。
- **不可由静态证明**：终端实际 AppOps、系统授权开关、服务端接收、手机位置轨迹、跨进程可达性在特定固件上的细节、实际上传频率及留存期。

所有证据来自提供 APK 的离线静态逆向及仓库 CI，未向运营商或定位服务器发送请求。
