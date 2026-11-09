# FUCKSystemHelper — SystemHelper 3.0.1 静态逆向审计

本目录是针对用户提供的 `SystemHelper.apk` 的离线静态审计记录。以 **高权限系统预装且所有声明权限可用** 为威胁模型进行分析，不将普通第三方 APP 的权限限制当作该样本的安全保证。

**样本** `com.mobiletools.systemhelper` / 3.0.1-20250515，4,107,356 bytes，SHA-256 `38a9010600bc91fd468701f53ba37ea0d43cb8e906544d0700a799f592011428`。

## 导航

- `analysis/SECURITY-AND-LOGIC-REPORT.md` — 功能、调用链、数据结构、风险分级、限制。
- `analysis/critical-methods-index.txt` — 257 个核心方法的字符串与调用交叉索引。
- `decoded/AndroidManifest.xml` — 解码后的组件、权限与导出声明。
- `decoded/dex-symbols.txt` — 类、字段、方法全集。
- `decoded/dex-xrefs.json` — 方法中的 DEX 引用（方法、字段、字符串、类型），含代码偏移。
- `decoded/dex-classes.json`、`decoded/dex-method-metadata.json`、`decoded/dex-strings.txt`、`decoded/static-values.json` — DEX 原始语义索引。
- `decoded/signing-metadata.json` 与 `decoded/signing_certificates/` — APK v2/v3 的签名证书链提取结果，**不等同于完成签名密码学验证**。
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
- `tools/apk_inspect.py`、`tools/static_values.py`、`tools/apk_signing.py` — 脱离网络、仅依赖 Python 标准库（签名脚本另需 cryptography）的可重放提取程序。

## 重要边界

- 静态分析能够确认代码中存在的调用路径、可访问的数据字段和声明的组件，但不能证明实际手机固件给定的系统服务状态、每次通信发生时的负载、服务器后续处理或用户授权 UI。
- 初始本地归档含完整 DEX 原件与逐方法 Dalvik 字节码视图；**随后由 GitHub Actions 额外完成 JADX 与 Apktool 反编译**。JADX 常规输出有 6 个错误，详见补充 fallback 与 CI 日志。
- 两份原生 SO 已生成 AArch64 指令级 objdump 反汇编，但**未人工逐函数进行控制流与业务语义重建**。
- 在公开仓库再分发厂商 APK/SDK 可能涉及版权、第三方密钥和公开传播风险；应由仓库维护者确认发布范围。

## 复现

```bash
python3 tools/apk_inspect.py
python3 tools/static_values.py
python3 tools/apk_signing.py
sha256sum original/SystemHelper.apk
# 从仓库分片重新组装最初的静态分析归档：
cat archives/parts/audit_*.bin > /tmp/FUCKSystemHelper-full-reverse-artifacts.tar.gz
printf '%s  %s\n' 'ac46ba2286504e53a1f04bddc3b24603b8ba5d16a2760b0a50cd669a75e8647a' /tmp/FUCKSystemHelper-full-reverse-artifacts.tar.gz | sha256sum -c -
```