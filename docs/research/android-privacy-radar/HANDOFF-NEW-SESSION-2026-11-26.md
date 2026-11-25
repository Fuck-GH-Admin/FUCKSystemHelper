# 新会话接手提示词：FUCKSystemHelper 静态逆向 Wave 02

> 直接把“接手提示词正文”复制到新的 ChatGPT 会话。新会话应先完整读取仓库与本文件，再继续工作，不要要求用户重复背景。

## 接手提示词正文

我们继续研究公开仓库：

https://github.com/Fuck-GH-Admin/FUCKSystemHelper

这是对 Android 高权限预装组件 SystemHelper 及其内嵌/捆绑定位代码进行的长期、可复核静态逆向与隐私研究。请把它当成严肃的软件行为审计，不要用模糊的模拟实验替代真实证据。

### 一、写入边界

唯一允许写入的长期研究分支：

`research/KEEP-android-privilege-privacy-radar`

唯一允许写入的目录：

`docs/research/android-privacy-radar/`

禁止：

- 修改 main；
- 修改 APK、反编译源码、Smali、ELF 或原始证据；
- 合并 PR；
- 自动改业务代码；
- 把模拟服务器/伪造回包当成真实服务器证据；
- 在静态链未扒清楚前要求用户做实体设备测试。

所有研究结果、包括固定密钥、IV、ELF 偏移、算法、请求字段和复现方法，都应公开写入报告。不要为了“安全”自行删去可复现信息。研究目标就是透明和独立复核。

### 二、第一步必须做什么

先检查 GitHub 当前状态，不要直接从记忆开始：

1. 读取 main 当前 HEAD，并确认是否仍为：
   `fe7b5b66d6f82168f99d95af98259de2e9deeb81`
2. 读取研究分支当前 HEAD。
3. 完整读取以下文件：
   - `docs/research/android-privacy-radar/plans/2026-11-25-static-investigation-wave-02.md`
   - `docs/research/android-privacy-radar/reports/2026-11-25-2242-CST.md`
   - `docs/research/android-privacy-radar/reports/2026-11-25-2302-CST.md`
   - `docs/research/android-privacy-radar/reports/2026-11-26-0056-CST.md`
   - `docs/research/android-privacy-radar/RUN-LEDGER.md`
   - `docs/research/android-privacy-radar/repro/recover-baidu-aes-constants.py`
4. 如果 main HEAD 变化，先 diff 与当前研究相关的文件，再继续结论。
5. 不要重复已经完成的 AES/VDR 基础工作，除非用于反证。

### 三、证据等级

继续沿用：

- E0：字符串、命名、相似版本、外部线索；
- E1：当前样本 Java/Smali/DEX/ELF 静态证据；
- E2：真实设备/模拟器运行时证据；
- E3：真实网络请求/响应或服务端证据；
- E4：多设备/多版本独立复现。

必须始终区分：

- 读取数据 ≠ 已上传；
- 构造请求 ≠ 已发送；
- 已发送 ≠ 服务端已接收；
- 服务端已接收 ≠ 已持久化；
- 配置解析器支持字段 ≠ 服务器当前真的下发该字段；
- native 函数存在 ≠ native 算法已经还原。

当前用户要求：**先把客户端静态逻辑尽可能扒清楚，再由用户自己做本地实机测试。**

### 四、已经确认的关键事实，不要重新从零调查

#### 1. SystemHelper 自有上报

已有专项报告确认：

- R/B/F/S/T 注册线程均可启动；
- SignalInfo 可以进入 R 注册对象；
- RegisterHelperService exported，且没有组件级 permission；
- Binder 可以修改 serverAddress、周期、日志和偏好；
- OnBootReceiver exported 且存在非开机 Action 的 F/B 分支；
- SIMStateReceiver 有 T 检查分支；
- dmregister 是 best-effort 队列，不是可靠事务队列。

详情读 2026-11-25-0032-CST.md 和 1300-CST.md。

#### 2. GNSS NavigationMessage → locnu

已经闭合：

`GnssNavigationMessage → z → x → s → AES(info/enl) → https://ofloc.map.baidu.com/locnu`

这是 Android GnssNavigationMessage 导航电文，不要误称为完整 GNSS 原始测量数据。

#### 3. 固定 AES 已完全公开并可复现

ARM64：

`extracted/lib/arm64-v8a/liblocSDK8b.so`

Git blob：

`4c673c37ce9da9f39891f9dae333c63201ba55d6`

JNI：

`Java_com_baidu_location_Jni_ldkaiv`

固定结果：

- AES key: `qsHcaEWjX0j1dGmZ`
- AES IV: `1122334455667788`
- AES/CBC/PKCS5PADDING
- Android Base64 flag 0

原始 34 bytes：

`53506c4647627f43721b461c4a685d6b4e02050704040b0d0e0e090b080877797a43`

XOR：

`decoded[i] = encoded[i] XOR ((34 + i) & 0xff)`

结果：

`qsHcaEWjX0j1dGmZ|1122334455667788\0`

复现脚本已经在仓库：

`docs/research/android-privacy-radar/repro/recover-baidu-aes-constants.py`

不要再次隐去 key/IV；用户明确要求公开透明。

#### 4. enc=2 的边界

不能写成“整个定位请求使用上述 AES”。

已经确认：

- GNSS locnu 的 info/enl 明确调用 n.java AES；
- 普通定位/热点请求的 bloc 使用 Jni.f native 编码；
- 当 AES 参数可用时请求可追加 `&enc=2`；
- 响应 JSON 存在 `enc` 字段时，n.java AES 用于解密响应字段。

因此 Jni.f 与 n.java AES 是两个不同机制。

#### 5. cl_pre / wf_pre / ll_pre

SharedPreferences：

`MapCoreServicePregck`

Base64 + 差分，不是 AES。

上限约 5 条。

确认字段：

- cl_pre：lon, lat, time；
- wf_pre：lon, lat, time；
- ll_pre：cVar.A(), radius/int, altitude, time, speed, Android Location lon, Android Location lat。

特别重要：

**不要把 wf_pre 解释成 Wi-Fi-only。**

当前 f.java 控制流显示 wf_pre 的入队语句并没有被严格的 source == wf 条件包围。详见 2026-11-26-0056-CST.md。

q()/t() 语义已经由 com.baidu.location.c.toString() 确认：

- q() = latitude
- t() = longitude

当前已确认消费者之一是 Wi-Fi hotspot 识别请求。

#### 6. intime.dat

已闭合主链：

`Location → z Handler message 1 → j.k().e(location) → j.c → j.d → F byte buffer → intime.dat → upload thread → itsdata.map.baidu.com`

目标：

`https://itsdata.map.baidu.com/long-conn-gps/sdk.php`

multipart 字段：

`location_dat`

文件包含：

- 时间；
- lon/lat；
- 后续点差分；
- bearing；
- speed；
- SDK 版本；
- packageName:CUID 派生身份串。

身份串仅做随机单字节 XOR 混淆，不是 AES。

上传路径使用自定义 TLS 工厂；TrustManager 只检查证书有效期，另有 HostnameVerifier 比较 URL host。

默认 j.java 配置：

- on=1
- bash=0.7
- net=3G|4G
- tcon=1
- tcsh=307200
- per=15
- spsh=3.5
- acsh=3.0
- stspsh=0.5
- drstsh=300
- stper=60
- nondron=0
- nondrper=60
- w=500
- x=0

当前未确认真实 cc.php 回包值。

未决：

- j.x 是否被外部直接写入；
- 500ms gate 实际是否有效；
- 上传线程和下一次 delete/rewrite 的真实竞争行为。

#### 7. VDR

重要纠正：

`qt=vdr` 当前确认的是 **VDR 配置获取**，不是已经证明的 VDR 轨迹上传。

endpoint：

`https://loc.map.baidu.com/cfgs/loc/commcfgs`

响应 data：

Base64 → GZIP → JSON → `vdrconfig_gz`

配置字段 `kahts` 写入 d.N，并改变公共网络基类分派：

- N != 1 → HttpsURLConnection + 自定义弱 TrustManager；
- N == 1 → OkHttp 默认 TLS。

VDR 坐标写入：

- q() latitude → d.n；
- t() longitude → d.o；
- 请求 x = longitude；
- y = latitude。

当前扫描没有找到 w.f86a/f87b 的 Java 非空赋值。

### 五、下一会话 P0：不要换题，先完成这两个

## P0-A：彻底还原 y.java / yo*.dat / cltr / cldc

这是当前最重要的新通道。

已经发现：

`a.a.a.b.y`

本地文件：

- yo.dat
- yoh.dat
- yom.dat
- yol.dat
- yor.dat

API > 28 时可能切换到：

- yo2.dat
- yoh2.dat
- yom2.dat
- yol2.dat
- yor2.dat

上传器构造：

- `cltr[index]`
- `cldc[index]`
- `trtm`
- 非 j==1 时 `qt=cltrg`

网络目标在：

- `a.a.a.i.d.f324b`
- `a.a.a.i.i.j()`

之间选择。

同一个 `LocUploadThreadManager`（z.java）负责：

- message 1 → intime.dat；
- message 2/3 → y.a(...)；
- message 4 → 周期任务 / x.b().a()；
- message 11 → GnssNavigationMessage。

请继续回答：

1. yo/yoh/yom/yol/yor 每类文件实际存什么？
2. 所有 producer 是哪些方法/类？
3. 每条记录的明文结构是什么？
4. Jni.f/Jni.b 前的原始数据是什么？
5. cltr 与 cldc 的模式含义是什么？
6. 两个 endpoint 的最终字符串是什么？
7. 响应成功后是否真正删除/消费本地记录？
8. 失败是否保留？
9. 是否包含 Location、cell、Wi-Fi scan、CUID、时间等敏感字段？
10. y.java 是否是除 intime.dat / locnu 之外的独立批量轨迹/环境数据上传链？

要求：producer → file → reader → request → response → cleanup 全链闭合。

## P0-B：继续还原 Jni.f 与 Jni.a(String)

当前固定 AES 已闭合，不要继续花时间重新提取 ldkaiv。

重点是：

- `Jni.f(String)`
- `Jni.b(String)`
- `Jni.a(String)`
- native `ee`
- native `a(byte[], 132456)`

目标：

1. Java wrapper 到 ELF symbol/helper；
2. 输入格式；
3. 输出格式；
4. 是否压缩/混淆/加密/校验；
5. 是否有固定表/seed/key；
6. 写出独立 reproducer；
7. 如果不能完整还原，明确最后缺哪个函数或表。

### 六、P1

1. 全仓/Smali 搜索对 j.x 的写入，反证 500ms gate；
2. Smali 核对：
   `Location.distanceBetween(this.y.getAltitude(), this.y.getLongitude(), this.z.getLatitude(), this.z.getLongitude(), ...)`
   是否确实为 altitude 参数错位；
3. 查 intime.dat 上传与下次覆盖的线程竞争；
4. 继续追 d.java 除 kahts 外的 VDR 配置消费者；
5. 寻找真正的 VDR 数据/传感器上传，而不是把配置请求误判为上传。

### 七、工作方式

请直接调查，不要先问用户重复信息。

每发现一条重要链：

1. 回读完整 Java 上下文；
2. 对关键反编译异常再查 Smali；
3. 需要 native 时查 ELF；
4. 主动找反证；
5. 标记 E0/E1/E2/E3/E4；
6. 报告先写研究分支；
7. 更新 RUN-LEDGER；
8. 回读提交后的文件和 commit，确认没有写 main。

不要只在聊天里总结而不提交。

用户会在你把静态逻辑尽量扒清楚之后，自己负责本地真实设备验证。

## 接手提示词结束

## 本文件的用途

这是会话交接文档，不是新的证据报告。具体证据以 reports/ 和 main 基线源码为准。若本文件与后续报告冲突，以更新且有原始代码/Smali/ELF 证据的报告为准。
