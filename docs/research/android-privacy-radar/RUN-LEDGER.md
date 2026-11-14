# Android Privacy Radar | Run Ledger
建立：2026-11-14（北京时间）。
| 巡检时间 CST | 时间窗口/来源类别 | 新发现 | 报告路径 | 备注 |
|---|---|---|---|---|
| 2026-11-14 初始化 | 阅读 main README，建立研究范围 | 本轮为配置初始化，尚未执行周期性全面检索 | — | 不以既有 SystemHelper 审计内容冒充新成果 |
| 2026-11-15 00:08 | 首次基线：main 样本/模拟器证据与 Android 2026-11 公告、AOSP 特权权限、Telephony、VPN、vivo 官方文档 | 基线补齐：整理 6 层证据、8 项假设；**未获得新的 SystemHelper 真机/联网实测** | [reports/2026-11-15-0008-CST.md](reports/2026-11-15-0008-CST.md) | 实验 NOT_RUN；去重主键：来源URL+首次发布日期+受影响版本+具体结论；main `fe7b5b6` |
| 2026-11-15 03:43 | 增量窗口 00:08–03:43 CST；复查 main HEAD/最近提交、Android 2026-11 ASB、Pixel 2026-11 公告、AOSP signature permission allowlist、VpnService、NetGuard、Orbot/Rethink VPN 问题、vivo/iQOO 与 SystemHelper 公开线索 | **无可证实的新 SystemHelper 实测或新发布的直接关联材料**；官方资料再次确认 signature allowlist 与 privapp allowlist 分属不同机制、VPN 排除不等于断网，属既有机制补充而非新漏洞 | — | main 仍 `fe7b5b6`；来源原文：https://source.android.com/docs/core/permissions/signature-permission-allowlist 、https://developer.android.com/develop/connectivity/vpn 、https://github.com/M66B/NetGuard 、https://github.com/guardianproject/orbot-android/issues/774；未查到与本包可验证的关联，H01/H02/H06 保持 UNKNOWN；实验 NOT_RUN；去重：URL+版本+发布日期+结论 |
