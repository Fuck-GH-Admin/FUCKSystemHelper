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
- `original/SystemHelper.apk` — 未修改的输入原件。
- `tools/apk_inspect.py`、`tools/static_values.py`、`tools/apk_signing.py` — 脱离网络、仅依赖 Python 标准库（签名脚本另需 cryptography）的可重放提取程序。

## 重要边界

- 静态分析能够确认代码中存在的调用路径、可访问的数据字段和声明的组件，但不能证明实际手机固件给定的系统服务状态、每次通信发生时的负载、服务器后续处理或用户授权 UI。
- 未使用 JADX/Apktool 的高层 Java 反编译器；本归档含完整 DEX 原件与逐方法 Dalvik 字节码视图。资源的二进制原件均保留；除 Manifest 外未批量将 ARSC 转为可编辑 XML。
- 两份原生 SO 只完成 ELF 静态元数据、符号、字符串分析，并未完成 AArch64 全函数逆向控制流重建。
- 在公开仓库再分发厂商 APK/SDK 可能涉及版权、第三方密钥和公开传播风险；应由仓库维护者确认发布范围。

## 复现

```bash
python3 tools/apk_inspect.py
python3 tools/static_values.py
python3 tools/apk_signing.py
sha256sum original/SystemHelper.apk
```