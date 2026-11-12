#!/usr/bin/env bash
# Environment-only firewall diagnostic. No APK install, no app launch, no sample bytes used.
set -euo pipefail
dev="$(adb devices | awk '$1 ~ /^emulator-[0-9]+$/ && $2=="device" {print $1; exit}')"
[[ -n "$dev" ]] || { echo "GUEST_NOT_FOUND"; exit 3; }
[[ "$(adb -s "$dev" shell getprop ro.kernel.qemu | tr -d '\r\n')" == "1" ]] || exit 4
echo 'GUEST_ANDROID_API:' "$(adb -s "$dev" shell getprop ro.build.version.sdk | tr -d '\r\n')"
adb -s "$dev" root >/dev/null
timeout 30s adb -s "$dev" wait-for-device
echo 'GUEST_ROOT:' "$(adb -s "$dev" shell id -u | tr -d '\r\n')"
echo "IPTABLES_VERSION:"
adb -s "$dev" shell iptables --version
echo "IP6TABLES_VERSION:"
adb -s "$dev" shell ip6tables --version
echo "OUTPUT_BEFORE:"
adb -s "$dev" shell iptables -S OUTPUT | head -n 10
echo "OUTPUT6_BEFORE:"
adb -s "$dev" shell ip6tables -S OUTPUT | head -n 10
echo 'ATTEMPTING_BLOCK_BOTH_OUTPUT_CHAINS'
adb -s "$dev" shell iptables -I OUTPUT 1 -j REJECT
adb -s "$dev" shell ip6tables -I OUTPUT 1 -j REJECT
echo "OUTPUT_AFTER:"
adb -s "$dev" shell iptables -S OUTPUT | head -n 10
echo "OUTPUT6_AFTER:"
adb -s "$dev" shell ip6tables -S OUTPUT | head -n 10
echo "OUTPUT_CHAIN_POLICY:"
adb -s "$dev" shell iptables -L OUTPUT -n --line-numbers | head -n 8
echo "OUTPUT6_CHAIN_POLICY:"
adb -s "$dev" shell ip6tables -L OUTPUT -n --line-numbers | head -n 8
echo "NO APK WAS INSTALLED OR EXECUTED"
