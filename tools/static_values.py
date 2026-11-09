#!/usr/bin/env python3
"""Parse Dalvik class_def static_values_off encoded arrays. Basic scalar types plus refs."""
from pathlib import Path
import struct,json
from apk_inspect import Dex,RAW,leb,R,u4
D=Dex(RAW)
def encoded(d,p):
 t=d[p]&31;size=1+(d[p]>>5);p+=1
 if t==0x1e:return None,p
 if t==0x1f:return bool(size-1),p
 if t==0x1c:
  n,p=leb(d,p);vals=[]
  for _ in range(n):v,p=encoded(d,p);vals.append(v)
  return vals,p
 if t==0x1d:
  n,p=leb(d,p);pairs=[]
  for _ in range(n):name,p=leb(d,p);v,p=encoded(d,p);pairs.append([name,v])
  return pairs,p
 v=int.from_bytes(d[p:p+size],'little');p+=size
 if t==0x17:return D.strings[v] if v<len(D.strings) else v,p
 if t==0x18:return D.types[v] if v<len(D.types) else v,p
 if t==0x19:return D.fields[v] if v<len(D.fields) else v,p
 if t==0x1a:return D.methods[v] if v<len(D.methods) else v,p
 if t in(0x00,0x02,0x04,0x06):return v,p
 return {'type':t,'value':v},p
results={}
for i,c in enumerate(D.classes):
 off= u4(RAW,D.headers['class_defs_off']+32*i+28)
 if not off:continue
 n,p=leb(RAW,off);v=[]
 for _ in range(n):
  val,p=encoded(RAW,p);v.append(val)
 results[c['class']]={f['name']: val for f,val in zip(c['fields'],v)}
(R/'decoded/static-values.json').write_text(json.dumps(results,indent=2,ensure_ascii=False))
print('class initializations',len(results))
for k,v in results.items():
 for field,val in v.items():
  if any(x in str(val) for x in ['dm.wo','http://','register','serverAddress','com.mobiletools']):print(k,field,repr(val))
