# FUCKSystemHelper — SystemHelper 3.0.1 静态逆向审计

本目录是针对用户提供的 `SystemHelper.apk` 的离线静态审计记录。以 **高权限系统预装且所有声明权限可用** 为威胁模型进行分析，不将普通第三方 APP 的权限限制当作该样本的安全保证。

**样本** `com.mobiletools.systemhelper` / 3.0.1-20250515，4,107,356 bytes，SHA-256 `38a9010600bc91fd468701f53ba37ea0d43cb8e906544d0700a799f592011428`。

## 当前审计主线（2026-11-10）

**主线已改为恶意预装程序 / 间谍软件 / 潜在木马的逆向审计。** 将全部相关权限和系统预装能力视为可以使用，优先查**隐蔽驻留、位置及跨应用行为收集、出站数据、运行时控制、原生反调试与命令执行**，并用代码、可达路径和现场证据三个层级评判。

- [恶意软件视角主报告](analysis/malware/PRIMARY-MALWARE-THREAT-ASSESSMENT.md) — 技术行为矩阵、主要疑点、木马判定门槛。
- [原生库解密/机器码证据](analysis/malware/NATIVE-FORENSICS.md) — 已恢复 231 条隐藏字符串、2 个 `system` 和 4 个 `ptrace` 调用点。
- [DEX 全量恶意能力扫描](analysis/malware/DEX-TECHNIQUE-SCAN.md) — 跨应用使用、定位、环境扫描、动态 DEX、短信/通讯录/音视频与远控接口的直接引用审计。
- [环境指纹专项](analysis/malware/AMBIENT-RECONNAISSANCE.md) — Wi‑Fi、BLE、蜂窝、传感器的 SDK 能力与宿主可达边界。
- [完整原生解码证据 JSON](analysis/malware/native-triage.json) — 逐调用点虚拟地址、解码字符串、ELF 依赖。
- [网络指标及本地工件](analysis/malware/IOC-AND-ARTIFACT-CATALOG.md) — 区分宿主服务器与第三方 SDK 域名。
- [隔离运行态取证计划](analysis/malware/ISOLATED-RUNTIME-FORENSICS-PLAN.md) — 如何证明真实执行、流量与反分析条件。
- [Android 13 虚拟机实测报告](analysis/malware/runtime/emulator-api33-x86_64/VERIFIED-FINDINGS.md) — 真实执行、权限拒绝、五个唤醒闹钟、崩溃栈与架构限制；[机器可读结果](analysis/malware/runtime/emulator-api33-x86_64/verified-results.json)；[原始运行证据](https://github.com/Fuck-GH-Admin/FUCKSystemHelper/actions/runs/42737147153/artifacts/13726724288)。

**截至当前**：宿主“长期终端遥测/敏感数据上报”能力已由代码确认。原生库存在 Shell 及反调试兼容的调用，但其在特定设备的装载和触发尚未证明；未找到完整远程指令执行型木马链。传统 IPC、缓存、加密设计薄弱点列为第二主线，不取代恶意行为研究。

## 2026-11-13：五专项并行逆向工作进展

目前统一在 `work/native-runtime-audit-20261111` 分支进行专项研究，`main` 尚未合并这些阶段性结果。完整状态与交叉验收见 [五专项统一整合报告](analysis/malware/workstreams/integration/STATUS-20261113.md)；自动一致性校验为 [integration/validate.py](analysis/malware/workstreams/integration/validate.py)。

- [01 · 室内原生库](analysis/malware/workstreams/01-libindoor/REPORT.md)：134 个 JNI 导出，当前逐函数语义矩阵为 3 个已理解、45 个部分理解、86 个仅识别用途；3 个 GPS Checker DEX 声明缺少同名导出，提供者待核。
- [02 · 定位原生库](analysis/malware/workstreams/02-locsdk/REPORT.md)：18 个 JNI 导出（8 个当前 DEX 声明），已完成部分算法与平坦化分派器静态恢复；复杂编码路径和 mode 映射待闭合。
- [03 · 宿主与 IPC](analysis/malware/workstreams/03-host-ipc/REPORT.md)：12 个组件、13 个外部入口/IPC 项，17 个运行时用例仍全部未执行。
- [04 · ARM64 动态验证](analysis/malware/workstreams/04-arm64-runtime/REPORT.md)：已完成样本校验与隔离预检工具，尚无合格 ARM64 guest 上的原版 APK / JNI / syscall 真实运行记录。
- [05 · 网络与协议](analysis/malware/workstreams/05-network-protocol/REPORT.md)：宿主与 SDK 静态链及本地提取方法实验有进展，但 D-helper 不能替代原版 D-APK。
- [GitHub Actions 离线一致性与回归测试](.github/workflows/workstream-audit.yml)：只读核验静态证据；提取 Java 的网络实验只在回环隔离环境运行，不接触生产服务器。

**重要区分：** 两个 SO 的直接依赖不同，`libindoor.so` 直接依赖两份未随 APK 提供的百度私有库，`liblocSDK8b.so` 则没有这两份库的直接 `DT_NEEDED`。不能把库中的 Shell/PTRACE 指令存在等同于其在目标固件上已执行，也不能将潜在控制面风险等同于远控木马已经证实。

## 导航

- [完整静态审计报告](analysis/SECURITY-AND-LOGIC-REPORT.md) — 功能、调用链、数据结构、风险分级与剩余限制（包含更新）。
- [深入逻辑复核](analysis/DEEP-DIVE-20261110.md) — 启动时序、24小时应用统计集合、失效的先删后发队列、加密与身份鉴权、精确 IPC 事务。
- [证据地图](analysis/EVIDENCE-MAP.md) — 具体方法、源码与风险的可点击定位。
- [签名独立验证结果](analysis/verification/v3-independent.json) — 两个 API 分段 signer、APK 内容摘要与签名的数学验证。
- `analysis/critical-methods-index.txt` — 257 个核心方法的字符串与调用交叉索引。
- `decoded/AndroidManifest.xml` — 解码后的组件、权限与导出声明。
- `decoded/dex-symbols.txt` — 类、字段、方法全集。
- `decoded/dex-xrefs.json` — 方法中的 DEX 引用（方法、字段、字符串、类型），含代码偏移。
- `decoded/dex-classes.json`、`decoded/dex-method-metadata.json`、`decoded/dex-strings.txt`、`decoded/static-values.json` — DEX 原始语义索引。
- `decoded/signing-metadata.json` 与 `decoded/signing_certificates/` — APK v2/v3 的签名证书链提取结果；**另已对 v3 两组 signer 完成独立 RSA 签名与 APK 摘要验证**。
- `decoded/native-symbols-*.txt` — ARM64 共享库 ELF 符号表。
- `disassembly/*.dalvik.txt` — 按类拆分的方法指令流、字节码单元、字符串与调用符号，全部保留指令字。**不是等价 Java 源码，也不是可以直接回编译的 smali**。
- `extracted/` — APK 的 ZIP 内容（原始 Manifest、DEX、资源、原生库与证书文件等）。
- `decompiled/apktool/` — Apktool 3.0.3 解包还原的完整 Smali、Manifest 与资源（1,149 个 Smali 文件；退出码 0）。
- `decompiled/jadx/` — JADX 1.5.6 生成的可读 Java；普通模式有 6 个反编译错误（退出码 3），不能视作完整无损源码。
- `decompiled/jadx-fallback/` — JADX fallback 模式的线性反编译补充（退出码 0）。
- `decompiled/native/` — 两份 ARM64 原生 SO 的 objdump 反汇编、readelf、strings。
- `decompiled/logs/` — 工具版本、输出与退出状态；`analysis/verification/` — 类覆盖与 APK 签名校验。
- `archives/parts/` — 完整压缩归档的 byte-exact 二进制分片；`archives/FUCKSystemHelper-full-reverse-artifacts.tar.gz` — 自动重组校验后的完整原始静态分析归档。
- `original/SystemHelper.apk` — 未修改的输入原件。
- `tools/apk_inspect.py`、`tools/static_values.py`、`tools/apk_signing.py`、`tools/verify_v3_signers.py` — 离线可重放的解析、证书提取和签名验证程序（签名脚本需 cryptography）。

## 重要边界

- 静态分析能够确认代码中存在的调用路径、可访问的数据字段和声明的组件，但不能证明实际手机固件给定的系统服务状态、每次通信发生时的负载、服务器后续处理或用户授权 UI。
- 已独立确认 v3 的 BBK/iQOO (API 24–32) 与 Vivo platform (API33+) 两组 RSA 签名合法、APK 内容摘要一致。Android `apksigner --print-certs` 对指定 API 范围显示的证书与原始签名块的分段结果有差异，已在报告中如实标记；不能把签名正确等同于 OEM 固件来源链认证。
- 最新复核发现缓存队列先删后传、采集应用列表范围与默认传输鉴权问题，旧版本报告已订正。
- 初始本地归档含完整 DEX 原件与逐方法 Dalvik 字节码视图；**随后由 GitHub Actions 额外完成 JADX 与 Apktool 反编译**。JADX 常规输出有 6 个错误，详见补充 fallback 与 CI 日志。
- 两份原生 SO 已生成 AArch64 指令级 objdump 反汇编，但**未人工逐函数进行控制流与业务语义重建**。
- 在公开仓库再分发厂商 APK/SDK 可能涉及版权、第三方密钥和公开传播风险；应由仓库维护者确认发布范围。

## 复现

```bash
python3 tools/apk_inspect.py
python3 tools/static_values.py
python3 tools/apk_signing.py
python3 tools/verify_v3_signers.py
sha256sum original/SystemHelper.apk
# 从仓库分片重新组装最初的静态分析归档：
cat archives/parts/audit_*.bin > /tmp/FUCKSystemHelper-full-reverse-artifacts.tar.gz
printf '%s  %s\n' 'ac46ba2286504e53a1f04bddc3b24603b8ba5d16a2760b0a50cd669a75e8647a' /tmp/FUCKSystemHelper-full-reverse-artifacts.tar.gz | sha256sum -c -
```