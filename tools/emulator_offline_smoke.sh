#!/usr/bin/env bash
# Offline sandbox smoke test of the exact supplied sample.
# No modification of the sample, no real user data, no real SIM, no live internet.
set -uo pipefail
ROOT="$(cd "$(dirname "$0")/../../.." && pwd)"
cd "$ROOT"
OUT="analysis/malware/runtime/emulator-api33-x86_64"
mkdir -p "$OUT"
: > "$OUT/steps.tsv"
: > "$OUT/emulator-logcat.txt"
record() { printf '%s\t%s\t%s\n' "$1" "$2" "$3" >> "$OUT/steps.tsv"; }
read_shell() { adb shell "$@" 2>&1 | tr -d '\r'; }
echo 'Android x86_64 sandbox — API 33; no Vivo privileged framework' > "$OUT/environment.txt"
echo 'Original APK SHA256:' >> "$OUT/environment.txt"
sha256sum original/SystemHelper.apk >> "$OUT/environment.txt"
adb shell getprop ro.build.version.sdk >> "$OUT/environment.txt" 2>&1
adb shell getprop ro.product.cpu.abi >> "$OUT/environment.txt" 2>&1
adb shell getprop ro.build.fingerprint >> "$OUT/environment.txt" 2>&1
record boot PASS 'emulator ready'

# Fail closed: the guest network firewall MUST be active before APK installation.
adb root > "$OUT/adb-root.txt" 2>&1 || true
adb wait-for-device
UID_RESULT="$(read_shell id -u)"
if [[ "$UID_RESULT" != "0" ]]; then
  record containment FAILED "adb root unavailable: $UID_RESULT — sample NOT installed"
  exit 17
fi
if ! read_shell iptables -I OUTPUT 1 -j REJECT > "$OUT/firewall-ipv4.txt"; then
  record containment FAILED "iptables deny-all cannot be installed; sample NOT installed"
  exit 18
fi
if ! read_shell ip6tables -I OUTPUT 1 -j REJECT > "$OUT/firewall-ipv6.txt"; then
  record containment FAILED "ip6tables deny-all cannot be installed; sample NOT installed"
  exit 19
fi
if ! read_shell iptables -C OUTPUT -j REJECT >> "$OUT/firewall-ipv4.txt"; then
  record containment FAILED "iptables firewall self-check failed; sample NOT installed"
  exit 20
fi
if ! read_shell ip6tables -C OUTPUT -j REJECT >> "$OUT/firewall-ipv6.txt"; then
  record containment FAILED "ip6tables firewall self-check failed; sample NOT installed"
  exit 21
fi
read_shell svc wifi disable >> "$OUT/firewall-ipv4.txt" || true
read_shell svc data disable >> "$OUT/firewall-ipv4.txt" || true
read_shell settings put global airplane_mode_on 1 >> "$OUT/firewall-ipv4.txt" || true
record containment PASS 'guest IPv4 and IPv6 OUTPUT DROP/REJECT active before APK install'

set +e
adb install -r original/SystemHelper.apk > "$OUT/adb-install.txt" 2>&1
INSTALL_STATUS=$?
set -e
if [[ $INSTALL_STATUS -ne 0 ]]; then
  record install FAILED "adb install exit=$INSTALL_STATUS; see adb-install.txt"
  exit 0
fi
record install PASS 'adb install -r returned 0'
read_shell pm path com.mobiletools.systemhelper > "$OUT/pm-path.txt"
read_shell dumpsys package com.mobiletools.systemhelper > "$OUT/dumpsys-package.txt"
read_shell cmd appops get com.mobiletools.systemhelper > "$OUT/appops.txt"
read_shell dumpsys alarm > "$OUT/dumpsys-alarm-before.txt"

adb logcat -c >/dev/null 2>&1 || true
# The activity intentionally probes the app's own permission checks.
timeout 20s adb shell am start -W -n 'com.mobiletools.systemhelper/com.mobiletools.systemhelper.Activity.TestActivity' > "$OUT/activity-start.txt" 2>&1
record activity "$?" 'am start -W of exported TestActivity'
sleep 8
read_shell pidof com.mobiletools.systemhelper > "$OUT/pidof-main.txt" || true
read_shell dumpsys activity activities > "$OUT/activity-after.txt" || true
# Harmless explicit non-system action: probe whether exported component is reachable.
timeout 20s adb shell am broadcast -n 'com.mobiletools.systemhelper/com.mobiletools.systemhelper.control.OnBootReceiver' -a 'com.lab.systemhelper.EMULATOR_PROBE' > "$OUT/exported-receiver-probe.txt" 2>&1
record exported_broadcast "$?" 'explicit non-protected Intent to exported OnBootReceiver'
sleep 7
adb logcat -d -v threadtime > "$OUT/emulator-logcat.txt" 2>&1 || true
read_shell dumpsys alarm > "$OUT/dumpsys-alarm-after.txt" || true
read_shell dumpsys activity services > "$OUT/dumpsys-services.txt" || true
adb shell am force-stop com.mobiletools.systemhelper > "$OUT/force-stop.txt" 2>&1 || true

python3 - <<'PY'
from pathlib import Path
import json, re, hashlib
p=Path("analysis/malware/runtime/emulator-api33-x86_64")
files={x.name:x.read_text(errors="replace") for x in p.iterdir() if x.is_file() and x.stat().st_size < 20_000_000}
raw=files.get("emulator-logcat.txt","")
matches=[l for l in raw.splitlines() if re.search(r"SystemHelper|RegisterThread|DeviceInfoReader|Baidu|Fatal signal|FATAL EXCEPTION|SecurityException|UnsatisfiedLinkError|AndroidRuntime",l,re.I)]
counts={phrase: sum(phrase.lower() in x.lower() for x in matches) for phrase in ["RegisterThread","DeviceInfoReader","Baidu","FATAL EXCEPTION","SecurityException","UnsatisfiedLinkError","OnBootReceiver"]}
status=files.get("steps.tsv","")
summary={
 "test_type":"untrusted APK offline x86_64 emulator smoke test",
 "virtual_device":"Android API 33 google_apis x86_64",
 "vivo_framework_present":False,
 "arm64_native_code_executed":False,
 "real_user_data":False,
 "network_containment":"guest IPv4+IPv6 OUTPUT REJECT installed BEFORE APK install",
 "raw_logcat_sha256":hashlib.sha256(raw.encode()).hexdigest(),
 "relevant_log_line_count":len(matches),
 "relevant_log_tag_counts":counts,
 "steps":status.strip().splitlines(),
 "install_output":files.get("adb-install.txt","").strip()[:2000],
 "activity_output":files.get("activity-start.txt","").strip()[:1800],
 "exported_receiver_output":files.get("exported-receiver-probe.txt","").strip()[:1800],
 "limitations":[
   "Android x86_64 system does not load this APK's arm64-v8a native SO libraries",
   "AOSP/Google emulator lacks Vivo private telephony APIs and platform privileges",
   "Network blocked; cannot claim real backend delivery or server behavior",
   "Running on emulator does not prove actual OEM device execution",
 ]
}
(p/"RESULTS.json").write_text(json.dumps(summary,ensure_ascii=False,indent=2)+"\n")
(p/"RESULTS.md").write_text("# Offline Android 33 Emulator: controlled smoke test\n\n"
"Exact source: original/SystemHelper.apk. Never sent genuine device data to any endpoint.\n\n"
"## Steps\n\n"+ "\n".join("- "+line.replace("\t"," — ") for line in summary["steps"])+"\n\n"
"## Crash and component observations\n\n"
"Use [RESULTS.json](RESULTS.json) for the full summarized statuses. "
"Raw logs are attached only as workflow artifacts; they are not committed to the public repository.\n\n"
+"\n".join(f"- {key}: {value}" for key,value in counts.items())+"\n\n"
"## Critical boundaries\n\n"+ "\n".join("- "+line for line in summary["limitations"])+"\n")
PY
record complete PASS 'summary written, raw logs available as run artifacts'
