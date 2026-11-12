#!/usr/bin/env python3
"""Static syntax guard for the offline nativebridge runner (no APK run)."""
import ast
import re
import subprocess
from pathlib import Path

root = Path(__file__).resolve().parent.parent
script = root / "tools/nativebridge_offline_original_ci.sh"
text = script.read_text(encoding="utf-8")
subprocess.run(["bash", "-n", str(script)], check=True)
matches = re.findall(r"python3 - <<'PY'\r?\n(.*?)\r?\nPY", text, re.S)
assert len(matches) == 1, f"Expected exactly one Python receipt block, got {len(matches)}"
ast.parse(matches[0], filename="nativebridge_receipt.py")
assert "PROBE=" in text and "offline_arm64_probe.sh" in text
assert "PROBE_HOST_NETWORK_ISOLATED=YES" in text
assert "guest_isolated=1" in text
assert "cleanup()" in text
print("PASS: shell + embedded Python receipt syntax and critical fail-closed anchors")
