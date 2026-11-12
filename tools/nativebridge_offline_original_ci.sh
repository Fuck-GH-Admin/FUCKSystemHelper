#!/usr/bin/env bash
# Fail-closed original APK install/smoke probe in disposable Android35 Native Bridge.
# No host/guest outbound network; no persistent test device/real SIM/account.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
: "$RUNNER_TEMP"
PRIVATE="$RUNNER_TEMP/systemhelper-private-nativebridge"
RECEIPT="$ROOT/analysis/malware/runtime/arm64/nativebridge-original-ci-receipt.json"
mkdir -p "$(dirname "$RECEIPT")" "$PRIVATE"
chmod 700 "$PRIVATE"

guest_isolated=0
host4=0
host6=0
stage="ISOLATION_NOT_STARTED"
run_success=0
cleanup_status="NOT_RUN"
serial=""
export ANDROID_SERIAL=""

# Any process/guest failure must stop and remove the sample before restoring
# host WAN. If removal is not provable, host firewall stays installed.
cleanup() {
  local code="$?"
  trap - EXIT
  set +e
  if [[ -n "$serial" ]]; then
    adb -s "$serial" shell am force-stop com.mobiletools.systemhelper >/dev/null 2>&1
    adb -s "$serial" uninstall com.mobiletools.systemhelper >/dev/null 2>&1
    remaining="$(adb -s "$serial" shell pm path com.mobiletools.systemhelper 2>/dev/null | tr -d '\r')"
    if [[ -n "$remaining" ]]; then
      echo "FAIL CLOSED: APK removal could not be proven; host firewall NOT restored" >&2
      cleanup_status="PACKAGE_STILL_INSTALLED_HOST_BLOCK_MAINTAINED"
      code=96
    else
      cleanup_status="NO_SAMPLE_INSTALLED_AFTER_CLEANUP"
    fi
  else
    cleanup_status="NO_GUEST_SELECTED_NO_INSTALL"
  fi
  if [[ "$cleanup_status" != PACKAGE_STILL_INSTALLED_HOST_BLOCK_MAINTAINED ]]; then
    if (( host6 )); then sudo ip6tables -D OUTPUT ! -o lo -j REJECT >/dev/null 2>&1; fi
    if (( host4 )); then sudo iptables -D OUTPUT ! -o lo -j REJECT >/dev/null 2>&1; fi
  fi

  export FINAL_STAGE="$stage" FINAL_RUN_SUCCESS="$run_success" \
    FINAL_CLEANUP="$cleanup_status" FINAL_GUEST_ISOLATED="$guest_isolated" \
    FINAL_HOST4="$host4" FINAL_HOST6="$host6" FINAL_RECEIPT="$RECEIPT" \
    FINAL_PRIVATE="$PRIVATE"
  python3 - <<'PY'
import json, os
from pathlib import Path
receipt = {
  "sample": "SystemHelper APK original unchanged",
  "expected_sha256": "38a9010600bc91fd468701f53ba37ea0d43cb8e906544d0700a799f592011428",
  "emulator_class": "TRANSLATED_ARM64_CANDIDATE; not real AArch64",
  "stage": os.environ["FINAL_STAGE"],
  "probe_completed": os.environ["FINAL_RUN_SUCCESS"] == "1",
  "guest_ipv4_and_ipv6_output_denied_before_apk_install": os.environ["FINAL_GUEST_ISOLATED"] == "1",
  "host_ipv4_output_reject_activated": os.environ["FINAL_HOST4"] == "1",
  "host_ipv6_output_reject_activated": os.environ["FINAL_HOST6"] == "1",
  "cleanup_status": os.environ["FINAL_CLEANUP"],
  "raw_evidence_not_uploaded": True,
  "note": "This receipt does not establish unobserved JNI, private OEM dependency resolution or ptrace/system runtime effects."
}
summary = Path(os.environ["FINAL_PRIVATE"]) / "evidence" / "summary.tsv"
if summary.exists():
    allowed = {"install", "installed_apk_sha256", "main.process", "main.maps_visibility",
               "remote.process", "remote.maps_visibility", "broadcast_probe_actor"}
    values = {}
    for line in summary.read_text(errors="replace").splitlines():
        k,sep,v=line.partition("\t")
        if (sep and k in allowed) or (sep and k.endswith(".so")):
            values[k] = v[:300]
    receipt["sanitized_probe_status"] = values
Path(os.environ["FINAL_RECEIPT"]).write_text(json.dumps(receipt, indent=2, ensure_ascii=False)+"\n")
print(json.dumps(receipt, indent=2, ensure_ascii=False))
PY
  exit "$code"
}
trap cleanup EXIT

# Emulator runner has already booted a clean, disposable guest.
serial="$(adb devices | awk '$1 ~ /^emulator-[0-9]+$/ && $2=="device" {print $1; exit}')"
[[ -n "$serial" ]] || { stage="NO_DISPOSABLE_EMULATOR"; exit 2; }
export ANDROID_SERIAL="$serial"
[[ "$(adb -s "$serial" shell getprop ro.kernel.qemu | tr -d '\r\n')" == 1 ]] \
  || { stage="NOT_EMULATOR"; exit 2; }
[[ "$(adb -s "$serial" shell getprop ro.product.cpu.abilist | tr -d '\r\n')" == *arm64-v8a* ]] \
  || { stage="NO_ARM64_ABI"; exit 2; }

# Host egress deny before any APK installation. Loopback needed for ADB.
sudo iptables -I OUTPUT 1 ! -o lo -j REJECT
host4=1
sudo ip6tables -I OUTPUT 1 ! -o lo -j REJECT
host6=1
sudo iptables -S OUTPUT | grep -q -- '-A OUTPUT ! -o lo -j REJECT'
sudo ip6tables -S OUTPUT | grep -q -- '-A OUTPUT ! -o lo -j REJECT'
stage="HOST_OUTPUT_DENIED"

# Google APIs non-Playstore images may allow adb root, but do not bypass it
# if they do not. Never install the sample until both guest rules are proven.
adb -s "$serial" root > "$PRIVATE/adb-root.PRIVATE.txt" 2>&1 \
  || { stage="ADB_ROOT_BLOCKED"; exit 2; }
adb -s "$serial" wait-for-device
[[ "$(adb -s "$serial" shell id -u | tr -d '\r\n')" == 0 ]] \
  || { stage="GUEST_NOT_ROOT"; exit 2; }
adb -s "$serial" shell iptables -I OUTPUT 1 -j REJECT \
  || { stage="GUEST_IPV4_RULE_FAILED"; exit 2; }
adb -s "$serial" shell ip6tables -I OUTPUT 1 -j REJECT \
  || { stage="GUEST_IPV6_RULE_FAILED"; exit 2; }
v4="$(adb -s "$serial" shell iptables -S OUTPUT | tr -d '\r')"
v6="$(adb -s "$serial" shell ip6tables -S OUTPUT | tr -d '\r')"
r4="$(printf '%s\n' "$v4" | awk '/^-A OUTPUT / {print; exit}')"
r6="$(printf '%s\n' "$v6" | awk '/^-A OUTPUT / {print; exit}')"
[[ "$r4" == '-A OUTPUT -j REJECT' ||
   "$r4" == '-A OUTPUT -j REJECT --reject-with icmp-port-unreachable' ]] \
  || { stage="GUEST_IPV4_NOT_DENIED"; exit 2; }
[[ "$r6" == '-A OUTPUT -j REJECT' ||
   "$r6" == '-A OUTPUT -j REJECT --reject-with icmp6-port-unreachable' ]] \
  || { stage="GUEST_IPV6_NOT_DENIED"; exit 2; }
guest_isolated=1
stage="T1_NETWORK_GATES_PASSED"

# The original APK is passed unchanged. Failure is a valid BLOCKED finding;
# no DEX-only fallback, no re-sign, no private-library substitution.
if PROBE_I_ACKNOWLEDGE_DISPOSABLE_EMULATOR=YES \
   PROBE_HOST_NETWORK_ISOLATED=YES \
   OUTDIR="$PRIVATE/evidence" \
   bash "$PROBE" run > "$PRIVATE/probe.stdout.PRIVATE.txt" \
                       2> "$PRIVATE/probe.stderr.PRIVATE.txt"; then
  run_success=1
  stage="ORIGINAL_APK_PROBE_RECORDED"
else
  stage="ORIGINAL_APK_INSTALL_OR_PROBE_BLOCKED"
fi

# cleanup() must stop and uninstall before the host egress lock is removed.
exit 0
