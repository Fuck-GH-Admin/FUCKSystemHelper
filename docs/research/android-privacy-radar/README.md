# Android 高权限系统组件与隐私控制研究雷达
> 长期保留分支：`research/KEEP-android-privilege-privacy-radar`。2026-11-14 建立。此分支专用于持续研究档案，不是功能修复/恶意行为复现工作分支。

## 目标
持续发现与 **Android 预装/系统/特权应用、权限和 AppOps、隐私数据采集、联网控制、OEM ROM 机制** 直接相关的新证据，优先服务仓库 `com.mobiletools.systemhelper` 3.0.1 的未解技术问题，同时覆盖 Vivo/iQOO、MIUI/HyperOS 与 AOSP 上对应用数据/网络/语音助手控制的工程实践。

## 操作约束
- **唯一可写分支**：`research/KEEP-android-privilege-privacy-radar`。不得写 `main` 或其他分支，不得修改 `original/`、`decompiled/`、`analysis/` 等已有审计材料或代码；不得开 PR、合并或创建外部 issue。
- 所有新档案只写 `docs/research/android-privacy-radar/`。不能删除/覆盖此前证据。每次提交必须核验 SHA、文件链接；不可写则报告失败。
- 从 `README.md` 与最近一条报告开始阅读，再读 main 上 `README.md`、`analysis/malware/PRIMARY-MALWARE-THREAT-ASSESSMENT.md`、`analysis/malware/runtime/emulator-api33-x86_64/VERIFIED-FINDINGS.md` 及最近相关提交。**已有证据不等于新发现**。
- 不使用私人设备、不连接设备、不传真实账号、密钥、定位、通信或其他个人数据，不绕过登录/付费/反爬限制。禁止将公开线索推断成真实已发生的监控、后门或数据外传。
- 证据分级：E0 外部帖子/未经验证；E1 官方公告/原始代码/可定位静态证据；E2 第三方可复现实验；E3 本仓库运行态受控实测；E4 用户真实设备由用户提供的可复核结果。不能把 API 调用可达性说成已实际触发。
- 风险判断区分：能力存在、路径可达、受系统权限限制、运行态执行、对外发送、后端使用。只建议合规隔离测试和防护方法，不自行执行攻击性行为。

## 本轮检索与报告
完整规则：[`AUTOMATION-PROMPT.md`](./AUTOMATION-PROMPT.md)。
- 检索新发布或有实质性更新的 Android 安全公告、AOSP 变更、厂商 ROM 更新、CVE、开源项目 Issue/commit、论文和独立逆向/取证报告。
- 每项提供首次发布时间/本次修订时间、证据原始链接、适用 Android API/OEM/ROM/包版本、复现前提、与仓库关联、限制、后续最小测试。
- 在 `reports/` 按 `YYYY-MM-DD-HHMM-CST.md` 归档**有价值**的发现；在 `RUN-LEDGER.md` 汇总每轮检索范围、窗口、零发现及去重键。不要为六次空巡检生成六份冗长报告。
- 对于 0-day 或真实安全风险，首先核查官方通告与已公开信息；不发布未修补漏洞的武器化步骤。
- 仅在发现与 SystemHelper/OEM 高权限隐私问题直接相关的高置信增量时通知用户；普通更新归档即可。

## 研究维度
1. `SystemHelper` 隐蔽驻留、跨应用采集、遥测出站、原生行为、启动条件和真实设备 vs 模拟器差异。
2. 特权权限、签名权限、SELinux、AppOps、厂商服务以及用户设置无法约束系统应用的边界。
3. 网络隔离（Android 每应用联网、VPN/Clash 共存、root/非 root 防火墙、DNS/IPv6/QUIC 漏网与可验证的实际数据流）。
4. 系统语音助手选择、预装 AI 组件禁用、系统应用卸载/冻结及更新恢复。
5. 安全、开源、可复现的权限审计与操作回滚手段。

## 起始基线
- 仓库 main 中现有目标样本是 SystemHelper 3.0.1；静态能力与 Android 13 模拟器观测已有报告，不能误称本次定时任务新验证。
- 尚未做任意用户真实设备验证；定时任务仅做公开资料研究和当前仓库证据对照。
- 首轮可以创建 `RUN-LEDGER.md`，之后按需追加并将历史记录分期归档，防止单文件无限膨胀。
