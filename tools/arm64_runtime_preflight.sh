#!/usr/bin/env bash
# Read-only ARM64 Android target preflight for the SystemHelper audit.
# This script does NOT install/start the APK, grant permissions, request root,
# change networking, remount partitions, or modify device settings.
set -eo pipefail

PKG="com.mobiletools.systemhelper"
ANDROID_SERIAL="${ANDROID_SERIAL-}"
OUT="${OUT-}"

if [ -n "$ANDROID_SERIAL" ]; then
  :
fi
if [ -z "$OUT" ]; then
  OUT="arm64-preflight-$(date +%Y%m%d-%H%M%S)"
fi

if ! command -v adb >/dev/null 2>&1; then
  echo "ERROR: adb not found on PATH" >&2
  exit 2
fi

adb_cmd() {
  if [ -n "$ANDROID_SERIAL" ]; then
    adb -s "$ANDROID_SERIAL" "$@"
  else
    adb "$@"
  fi
}

if [ -n "$ANDROID_SERIAL" ]; then
  if ! adb_cmd get-state >/dev/null 2>&1; then
    echo "ERROR: selected device is not ready" >&2
    exit 3
  fi
else
  DEVICE_COUNT="$(adb devices | awk 'NR > 1 && $2 == "device" { n++ } END { print n + 0 }')"
  if [ "$DEVICE_COUNT" -ne 1 ]; then
    echo "ERROR: expected exactly one authorized adb device; found $DEVICE_COUNT" >&2
    echo "Set ANDROID_SERIAL in the script before use if multiple devices are connected." >&2
    exit 4
  fi
fi

mkdir -p "$OUT"
OUT="$(cd "$OUT" && pwd)"
printf 'SystemHelper ARM64 target preflight\n' > "$OUT/README.txt"
printf 'Collected at (host local time): %s\n' "$(date -Is)" >> "$OUT/README.txt"
printf 'Package under inspection: %s\n' "$PKG" >> "$OUT/README.txt"
printf 'Mode: read-only; no install/start/grant/root/network changes\n' >> "$OUT/README.txt"

capture() {
  NAME="$1"
  shift
  {
    printf '# command: adb shell'
    printf ' %s' "$@"
    printf '\n'
    adb_cmd shell "$@" 2>&1 || printf '\n[command returned non-zero: %s]\n' "$?"
  } > "$OUT/$NAME"
}

capture "device-properties.txt" sh -c '
echo "== architecture ==";
uname -m;
getprop ro.product.cpu.abi;
getprop ro.product.cpu.abilist;
getprop ro.product.cpu.abilist64;
getprop ro.dalvik.vm.native.bridge;
echo "== Android ==";
getprop ro.build.version.release;
getprop ro.build.version.sdk;
getprop ro.build.version.security_patch;
echo "== vendor ==";
getprop ro.product.manufacturer;
getprop ro.product.model;
getprop ro.build.fingerprint;
echo "== security ==";
getenforce 2>&1;
id
'

capture "package-path.txt" pm path "$PKG"
capture "package-dump.txt" dumpsys package "$PKG"
capture "appops.txt" cmd appops get "$PKG"
capture "process.txt" sh -c "pidof $PKG 2>&1; ps -A -o PID,UID,NAME 2>&1 | grep -E 'systemhelper|baidu' || true"

{
  echo "# Presence and readable hashes of native dependencies"
  for LIB in libapp_BaiduVIlib.so libmml_framework.so; do
    for DIR in /system/lib64 /system_ext/lib64 /vendor/lib64 /product/lib64 /odm/lib64; do
      adb_cmd shell "if [ -e '$DIR/$LIB' ]; then echo PRESENT:$DIR/$LIB; toybox sha256sum '$DIR/$LIB' 2>/dev/null || sha256sum '$DIR/$LIB' 2>/dev/null || true; fi" 2>&1 || true
    done
  done
  adb_cmd shell "for DIR in /apex/*/lib64; do for LIB in libapp_BaiduVIlib.so libmml_framework.so; do if [ -e \"\$DIR/\$LIB\" ]; then echo PRESENT:\$DIR/\$LIB; toybox sha256sum \"\$DIR/\$LIB\" 2>/dev/null || true; fi; done; done" 2>&1 || true
} > "$OUT/native-dependencies.txt"

PID="$(adb_cmd shell pidof "$PKG" 2>/dev/null | tr -d '\r' | awk '{print $1}' || true)"
if [ -n "$PID" ]; then
  adb_cmd shell "cat /proc/$PID/maps 2>&1 | grep -E 'lib(indoor|locSDK8b|app_BaiduVIlib|mml_framework)\.so' || true" > "$OUT/native-maps.txt" 2>&1 || true
else
  printf 'NOT_RUNNING: package process was not running during read-only preflight\n' > "$OUT/native-maps.txt"
fi

{
  echo "# Local classification (derived from captured outputs)"
  if grep -qi 'arm64-v8a' "$OUT/device-properties.txt" || grep -qi 'aarch64' "$OUT/device-properties.txt"; then
    echo "ARM64_ABI_HINT=PRESENT"
  else
    echo "ARM64_ABI_HINT=NOT_CONFIRMED"
  fi
  if grep -q 'package:' "$OUT/package-path.txt"; then
    echo "PACKAGE_INSTALLED=YES"
  else
    echo "PACKAGE_INSTALLED=NO_OR_NOT_VISIBLE"
  fi
  if grep -Eqi '/(system|system_ext|product|vendor|odm)/priv-app/' "$OUT/package-path.txt"; then
    echo "PRIV_APP_PATH_HINT=PRESENT"
  else
    echo "PRIV_APP_PATH_HINT=NOT_CONFIRMED"
  fi
  for LIB in libapp_BaiduVIlib.so libmml_framework.so; do
    if grep -q "PRESENT:.*$LIB" "$OUT/native-dependencies.txt"; then
      echo "$LIB=PRESENT"
    else
      echo "$LIB=NOT_FOUND_OR_NOT_READABLE"
    fi
  done
  echo "NOTE=Hints only; inspect raw files and package signer/privapp allowlist before drawing conclusions."
} > "$OUT/summary.txt"

echo "Preflight complete: $OUT"
echo "No APK was installed or started. No device settings were changed."
echo "Review and redact device fingerprint/model before publishing the output."
