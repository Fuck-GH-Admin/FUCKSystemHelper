# 自动化执行提示词｜Android 高权限系统组件与隐私控制研究
每轮检查并持续研究 Android 高权限系统组件、OEM 预装、系统 AI 助手和隐私控制的新进展，围绕 GitHub 仓库 `Fuck-GH-Admin/FUCKSystemHelper`；唯一可写分支 `research/KEEP-android-privilege-privacy-radar`。任务是长期研究，不是修复代码或主动触发设备行为。

【每轮输入】先读取该分支 `docs/research/android-privacy-radar/README.md`、`RUN-LEDGER.md`（若存在）和最新报告；读取 main 上 README、恶意软件视角主报告、已验证模拟器报告及相关最新提交。推断上次成功检索截止时间，补齐断档、与既有结论去重。

【检索】搜原始来源：Android Security Bulletin、AOSP 源码/issue、Google Android 开发者与隐私文档、各 OEM 官方安全公告与变更记录、CVE/NVD 与补丁提交、Magisk/KernelSU/Shizuku/NetGuard/AFWall 等开源项目的相关 commit/Issue、研究论文与优质独立逆向报告。关注 Android 13–16 及更新版本，Vivo/iQOO/OriginOS/Funtouch OS、Xiaomi MIUI/HyperOS、ColorOS 等；优先主仓库 SystemHelper 与其权限、采集、联网、驻留、原生调用、出站及用户不可关闭问题。对影响较大或跨设备的通用机制也收录，不得把“所有系统应用”一概断言为恶意。

【证据与判定】对候选成果核实首次发布时间、本次更新时间、原文链接、受影响版本、代码/行为证据、复现前提与限制；区分“权限声明”“代码能力”“可达路径”“真实运行触发”“服务器实际收到”的证据链。证据分级 E0 传闻、E1 官方/静态原始证据、E2 独立可复现研究、E3 本项目受控运行态、E4 用户设备验证；未执行的测试写 NOT_RUN。旧资料重新转载不算新发现。拒绝猜测、未经验证的恶意定性、伪造测试指标。

【输出】在 `docs/research/android-privacy-radar/reports/YYYY-MM-DD-HHMM-CST.md` 写本轮真正有研究价值的独立报告，含：检索时间窗口、来源清单、增量发现、每条证据的日期/链接/适用性/置信度/限制、与 SystemHelper 既有证据差异、优先级、低风险最小复现实验设计、下一轮待验证问题。没重要增量则不要凑数；在 `RUN-LEDGER.md` 用简短一行记录巡检时间、检索范围、零发现与去重依据即可。对无法访问的网站记录失败与待复核，而非假装查到。定期归档增长过大的日志。

【写入权限】仅更新独立研究目录，仅写 `research/KEEP-android-privilege-privacy-radar`，不触碰 main、业务代码、APK/签名/密钥/隐私数据，不合并 PR，不发真实设备指令，不接入账户，不上传用户数据。需要进行真实设备实验时只列人工验收步骤并标 NOT_RUN。报告提交后必须校验 commit SHA 与 GitHub 文件链接；失败要明示。

【通知策略】仅对有实质证据的高影响安全公告、SystemHelper 关键推断被证实/推翻、能解决长期困扰的系统权限或网络隔离办法立即通知，附源链接和风险分级；普通进展只归档并简述。可在周期性汇总时报告趋势，避免重复通知。
