#!/usr/bin/env bash
# Disposable x86_64 API35 emulator qualification only. NEVER install/open APK.
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
OUT="$ROOT/analysis/malware/runtime/arm64/qualification-api35.json"
mkdir -p "$(dirname "$OUT")"

command -v adb >/dev/null || { echo "NO_ADB: cannot qualify guest"; exit 2; }
adb wait-for-device
api="$(adb shell getprop ro.build.version.sdk | tr -d '\r\n')"
abis="$(adb shell getprop ro.product.cpu.abilist | tr -d '\r\n')"
abis64="$(adb shell getprop ro.product.cpu.abilist64 | tr -d '\r\n')"
native_bridge="$(adb shell getprop ro.dalvik.vm.native.bridge | tr -d '\r\n')"
qemu="$(adb shell getprop ro.kernel.qemu | tr -d '\r\n')"
machine="$(adb shell uname -m | tr -d '\r\n')"
android_type="$(adb shell getprop ro.build.type | tr -d '\r\n')"

# Only read generic environment metadata. Do NOT record emulator serial/fingerprint.
if ! [[ "$api" =~ ^[0-9]+$ ]] || (( api < 31 )); then
  echo "INVALID_API: $api"; exit 3
fi
if [[ "$qemu" != "1" ]]; then
  echo "NOT_DISPOSABLE_QEMU: refusing qualification"; exit 4
fi
if [[ "$machine" != "x86_64" ]]; then
  echo "UNEXPECTED_ARCH: $machine"; exit 5
fi

status="NO_NATIVE_BRIDGE_CANDIDATE"
if [[ ",$abis," == *",arm64-v8a,"* ]] && \
   [[ -n "$native_bridge" && "$native_bridge" != "0" && "$native_bridge" != "false" ]]; then
  status="ADVERTISED_NATIVE_BRIDGE_CANDIDATE_NOT_PROVEN"
fi

export PROBE_API="$api" PROBE_ABIS="$abis" PROBE_ABIS64="$abis64" \
 PROBE_BRIDGE="$native_bridge" PROBE_QEMU="$qemu" PROBE_MACHINE="$machine" \
 PROBE_BUILD_TYPE="$android_type" PROBE_STATUS="$status" PROBE_OUTPUT="$OUT"
python3 - <<'PY'
import json, os
from pathlib import Path
out = {
    "probe": "Google APIs API35 x86_64 native bridge qualification (NO APK EXECUTION)",
    "status": os.environ["PROBE_STATUS"],
    "android_api": int(os.environ["PROBE_API"]),
    "advertised_abi_list": os.environ["PROBE_ABIS"].split(","),
    "advertised_abi_list64": os.environ["PROBE_ABIS64"].split(","),
    "native_bridge_property": os.environ["PROBE_BRIDGE"],
    "qemu": os.environ["PROBE_QEMU"] == "1",
    "guest_uname_m": os.environ["PROBE_MACHINE"],
    "build_type": os.environ["PROBE_BUILD_TYPE"],
    "original_apk_installed_or_executed": False,
    "native_arm64_execution_observed": False,
    "limitations": (
        "ABI advertising/native-bridge property is only a T1 candidate. "
        "No ELF load, APK install, JNI, system/ptrace, host/guest network "
        "containment qualification, or OEM privileges are established."
    )
}
Path(os.environ["PROBE_OUTPUT"]).write_text(
    json.dumps(out, ensure_ascii=False, indent=2)+"\n", encoding="utf-8"
)
print(json.dumps(out, ensure_ascii=False, indent=2))
PY
echo "QUALIFICATION_RESULT=$status"
echo "NO APK was installed, launched, or executed."
