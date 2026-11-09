#!/usr/bin/env python3
"""Offline APK AXML and DEX structural inspector, without third-party dependencies.
Exports verified symbols, method instruction wordstreams, and string/call crossrefs.
Note: instruction wordstream is lossless but is not a Java source decompiler.
"""
from pathlib import Path
import struct,json,xml.etree.ElementTree as ET,collections,hashlib,re,sys
R=Path(__file__).resolve().parents[1]
RAW=(R/'extracted/classes.dex').read_bytes()
def u1(d,p):return d[p]
def u2(d,p):return struct.unpack_from('<H',d,p)[0]
def u4(d,p):return struct.unpack_from('<I',d,p)[0]
def leb(d,p):
    result=0; shift=0
    while True:
        a=d[p];p+=1;result+=(a&127)<<shift
        if not a&128:return result,p
        shift+=7
        if shift>35:raise ValueError('bad leb')
def sp_string(d,p):
    def leb8(p):
        a=d[p];p+=1
        if a&128:b=d[p];p+=1;return ((a&127)<<7)|b,p
        return a,p
    def leb16(p):
        a=u2(d,p);p+=2
        if a&32768:b=u2(d,p);p+=2;return ((a&32767)<<16)|b,p
        return a,p
    utf8=bool(AX_FLAGS & 256)
    if utf8:
        _,p=leb8(p);l,p=leb8(p);return d[p:p+l].decode('utf-8','replace')
    l,p=leb16(p);return d[p:p+l*2].decode('utf-16le','replace')

def axml(data):
    global AX_FLAGS
    pos=8;strings=[];ns={};root=None;stack=[];events=[]
    while pos<len(data):
        if pos+8>len(data):break
        typ,hsize,size=struct.unpack_from('<HHI',data,pos)
        if size<8 or pos+size>len(data):break
        if typ==0x0001:
            count,styles,AX_FLAGS,starts,style_off=struct.unpack_from('<IIIII',data,pos+8)
            offsets=[u4(data,pos+hsize+4*i) for i in range(count)]
            base=pos+starts
            strings=[sp_string(data,base+x) for x in offsets]
        elif typ==0x0100:
            prefix,uri=struct.unpack_from('<II',data,pos+16)
            if prefix< len(strings) and uri<len(strings):ns[uri]=strings[prefix]
        elif typ==0x0102:
            el_ns,el_idx=struct.unpack_from('<II',data,pos+16)
            start,size_at,count=struct.unpack_from('<HHH',data,pos+24)
            tag=strings[el_idx]
            attrs={}
            for i in range(count):
                ap=pos+16+start+size_at*i
                attr_ns,name_idx,raw_idx=struct.unpack_from('<III',data,ap)
                data_type=data[ap+15];val=u4(data,ap+16)
                aname=strings[name_idx]
                if attr_ns!=0xffffffff and attr_ns<len(strings):aname='{'+strings[attr_ns]+'}'+aname
                if raw_idx!=0xffffffff and raw_idx<len(strings):v=strings[raw_idx]
                elif data_type==3:v=strings[val] if val<len(strings) else f'@stringindex_{val}'
                elif data_type==0x12:v='true' if val else 'false'
                elif data_type in (0x10,0x11):v=str(val) if data_type==0x10 else hex(val)
                elif data_type==1:v=f'@0x{val:08x}'
                else:v=f'0x{val:08x} [type=0x{data_type:x}]'
                attrs[aname]=v
            e=ET.Element(tag,attrs)
            if stack:stack[-1].append(e)
            else:root=e
            stack.append(e)
            events.append((tag,attrs))
        elif typ==0x0103:
            if stack:stack.pop()
        pos+=size
    ET.register_namespace('android','http://schemas.android.com/apk/res/android')
    ET.indent(ET.ElementTree(root),'  ')
    return ET.tostring(root,encoding='unicode'),events

class Dex:
 def __init__(self,d):
    self.d=d
    assert d[:4]==b'dex\n'
    self.headers={}
    for name,off in [('file_size',0x20),('header_size',0x24),('string_ids_size',0x38),('string_ids_off',0x3c),('type_ids_size',0x40),('type_ids_off',0x44),('proto_ids_size',0x48),('proto_ids_off',0x4c),('field_ids_size',0x50),('field_ids_off',0x54),('method_ids_size',0x58),('method_ids_off',0x5c),('class_defs_size',0x60),('class_defs_off',0x64)]:self.headers[name]=u4(d,off)
    self.strings=[]
    for i in range(self.headers['string_ids_size']):
        ptr=u4(d,self.headers['string_ids_off']+4*i);_,p=leb(d,ptr)
        end=d.find(b'\x00',p)
        self.strings.append(d[p:end].decode('utf-8','replace'))
    self.types=[self.strings[u4(d,self.headers['type_ids_off']+4*i)] for i in range(self.headers['type_ids_size'])]
    self.protos=[]
    for i in range(self.headers['proto_ids_size']):
        _,ret,params=struct.unpack_from('<III',d,self.headers['proto_ids_off']+12*i)
        args= [] if not params else [self.types[u2(d,params+4+2*j)] for j in range(u4(d,params))]
        self.protos.append('('+','.join(args)+')'+self.types[ret])
    self.fields=[]
    for i in range(self.headers['field_ids_size']):
        cls,typ,nm=struct.unpack_from('<HHI',d,self.headers['field_ids_off']+8*i)
        self.fields.append(self.types[cls]+'->'+self.strings[nm]+':'+self.types[typ])
    self.methods=[]
    for i in range(self.headers['method_ids_size']):
        cls,proto,nm=struct.unpack_from('<HHI',d,self.headers['method_ids_off']+8*i)
        self.methods.append(self.types[cls]+'->'+self.strings[nm]+self.protos[proto])
    self.classes=[];self.code={};self.method_flags={};self.access_flags={}
    for i in range(self.headers['class_defs_size']):
        clsidx,flags,sup,int_off,src,an_off,cldata,stat=struct.unpack_from('<IIIIIIII',d,self.headers['class_defs_off']+32*i)
        cls=self.types[clsidx];sup=self.types[sup] if sup!=0xffffffff else None
        c={'class':cls,'super':sup,'flags':flags,'source_file':self.strings[src] if src!=0xffffffff else None,'interfaces':[],'fields':[],'methods':[],'annotations_offset':an_off}
        if int_off:c['interfaces']=[self.types[u2(d,int_off+4+j*2)] for j in range(u4(d,int_off))]
        if cldata:
            p=cldata;counts=[]
            for _ in range(4):x,p=leb(d,p);counts.append(x)
            for n in counts[:2]:
                idx=0
                for _ in range(n):delta,p=leb(d,p);flag,p=leb(d,p);idx+=delta;c['fields'].append({'name':self.fields[idx], 'flags':flag})
            for n in counts[2:]:
                idx=0
                for _ in range(n):
                    delta,p=leb(d,p);flag,p=leb(d,p);code,p=leb(d,p);idx+=delta
                    m={'id':idx,'name':self.methods[idx], 'flags':flag,'code_off':code}
                    c['methods'].append(m);self.method_flags[idx]=flag
                    if code:
                        regs,ins,outs,tries,debug,sz=struct.unpack_from('<HHHHII',d,code)
                        words=struct.unpack_from('<'+'H'*sz,d,code+16)
                        self.code[idx]={'regs':regs,'ins':ins,'outs':outs,'tries':tries,'debug':debug,'words':words,'offset':code}
        self.classes.append(c)
 def print_sigs(self):
    x=[]
    for c in self.classes:
        x.append('CLASS '+c['class']+' extends '+str(c['super'])+' source='+str(c['source_file']))
        x.extend('  FIELD '+z['name'] for z in c['fields'])
        x.extend('  METHOD '+z['name']+(' [code]' if z['code_off'] else ' [native/abstract]') for z in c['methods'])
    return '\n'.join(x)+'\n'

# Dalvik opcode sizes for standard opcodes, in 16-bit units. Standard opcodes are densely assigned.
# Formats: 10x, 12x, etc are used only for key reference types; all other words are preserved verbatim.
formats={}
def assign(lo,hi,width):
 for op in range(lo,hi+1):formats[op]=width
assign(0x00,0x00,1);assign(0x01,0x01,1);assign(0x02,0x02,2);assign(0x03,0x03,3)
assign(0x04,0x04,1);assign(0x05,0x05,2);assign(0x06,0x06,3)
assign(0x07,0x07,1);assign(0x08,0x08,2);assign(0x09,0x09,3)
assign(0x0a,0x12,1);assign(0x13,0x13,2);assign(0x14,0x14,3);assign(0x15,0x16,2);assign(0x17,0x17,3);assign(0x18,0x18,5);assign(0x19,0x19,2)
assign(0x1a,0x1a,2);assign(0x1b,0x1b,3);assign(0x1c,0x1c,2);assign(0x1d,0x1e,1)
assign(0x1f,0x20,2);assign(0x21,0x21,1);assign(0x22,0x23,2);assign(0x24,0x24,3);assign(0x25,0x25,3)
assign(0x26,0x26,3);assign(0x27,0x27,1);assign(0x28,0x28,1);assign(0x29,0x29,2);assign(0x2a,0x2a,3);assign(0x2b,0x2c,3)
assign(0x2d,0x31,2);assign(0x32,0x3d,2)
assign(0x44,0x51,2);assign(0x52,0x5f,2);assign(0x60,0x6d,2)
assign(0x6e,0x72,3);assign(0x74,0x78,3)
assign(0x7b,0x8f,1);assign(0x90,0xaf,2);assign(0xb0,0xcf,1);assign(0xd0,0xd7,2);assign(0xd8,0xe2,2)
assign(0xfa,0xfb,4);assign(0xfc,0xfd,3);assign(0xfe,0xff,2)
names={0x00:'nop',0x0a:'move-result',0x0b:'move-result-wide',0x0c:'move-result-object',0x0e:'return-void',0x0f:'return',0x10:'return-wide',0x11:'return-object',0x12:'const/4',0x13:'const/16',0x14:'const',0x15:'const/high16',0x16:'const-wide/16',0x17:'const-wide/32',0x18:'const-wide',0x19:'const-wide/high16',0x1a:'const-string',0x1b:'const-string/jumbo',0x1c:'const-class',0x1d:'monitor-enter',0x1e:'monitor-exit',0x1f:'check-cast',0x20:'instance-of',0x21:'array-length',0x22:'new-instance',0x23:'new-array',0x24:'filled-new-array',0x25:'filled-new-array/range',0x26:'fill-array-data',0x27:'throw',0x28:'goto',0x29:'goto/16',0x2a:'goto/32',0x2b:'packed-switch',0x2c:'sparse-switch'}
for k,n in enumerate(['eq','ne','lt','ge','gt','le']): names[0x32+k]='if-'+n;names[0x38+k]='if-'+n+'z'
for k,n in enumerate(['virtual','super','direct','static','interface']):names[0x6e+k]='invoke-'+n;names[0x74+k]='invoke-'+n+'/range'
for k,n in enumerate(['iget','iget-wide','iget-object','iget-boolean','iget-byte','iget-char','iget-short','iput','iput-wide','iput-object','iput-boolean','iput-byte','iput-char','iput-short']):names[0x52+k]=n
for k,n in enumerate(['sget','sget-wide','sget-object','sget-boolean','sget-byte','sget-char','sget-short','sput','sput-wide','sput-object','sput-boolean','sput-byte','sput-char','sput-short']):names[0x60+k]=n
for k,n in enumerate(['aget','aget-wide','aget-object','aget-boolean','aget-byte','aget-char','aget-short','aput','aput-wide','aput-object','aput-boolean','aput-byte','aput-char','aput-short']):names[0x44+k]=n
for k,n in enumerate(['add','sub','mul','div','rem','and','or','xor','shl','shr','ushr']):
 names[0x90+k]='int-'+n
# Classifier for methods and search evidence. Crucial metadata preserves instruction references.
def disasm(dex,mid):
 w=dex.code[mid]['words'];i=0;out=[];calls=[];refs=[]
 while i<len(w):
    code=w[i];op=code&255
    if op==0 and code in (0x0100,0x0200,0x0300):
       if i+4>len(w):width=1
       elif code==0x0100:width=4+2*w[i+1]
       elif code==0x0200:width=2+4*w[i+1]
       else:width=4+((w[i+1]*w[i+2]+1)//2)
       width=min(width,len(w)-i)
       out.append(f'{i:05x}  {" ".join(f"{x:04x}" for x in w[i:i+min(width,16)])} ... <payload; units={width}>');i+=width;continue
    width=formats.get(op,1);width=min(width,len(w)-i)
    suffix='';ref=None
    if op in (0x1a,0x1b):
      idx=w[i+1] if op==0x1a else w[i+1]+(w[i+2]<<16)
      if idx<len(dex.strings):ref=dex.strings[idx];suffix='  # STR '+json.dumps(ref,ensure_ascii=False)
    elif op in (0x1c,0x1f,0x20,0x22,0x23,0x24,0x25):
      idx=w[i+1] if width>1 else -1
      if 0<=idx<len(dex.types):ref=dex.types[idx];suffix='  # TYPE '+ref
    elif 0x52<=op<=0x6d:
      idx=w[i+1] if width>1 else -1
      if 0<=idx<len(dex.fields):ref=dex.fields[idx];suffix='  # FIELD '+ref
    elif op in list(range(0x6e,0x73))+list(range(0x74,0x79)):
      idx=w[i+1] if width>1 else -1
      if 0<=idx<len(dex.methods):ref=dex.methods[idx];calls.append(ref);suffix='  # CALL '+ref
    if ref:refs.append((i,'string' if op in(0x1a,0x1b) else 'method' if 0x6e<=op<=0x78 else 'field' if 0x52<=op<=0x6d else 'type',ref))
    out.append(f'{i:05x}  {" ".join(f"{x:04x}" for x in w[i:i+width]):<24} {names.get(op,"op_%02x"%op)}{suffix}')
    i+=width
 return out,refs,calls

def main():
 import zipfile
 with zipfile.ZipFile(R/'original/SystemHelper.apk') as z:
  xml,events=axml(z.read('AndroidManifest.xml'))
 (R/'decoded/AndroidManifest.xml').write_text(xml,encoding='utf-8')
 (R/'decoded/manifest-elements.json').write_text(json.dumps(events,indent=2,ensure_ascii=False),encoding='utf-8')
 dex=Dex(RAW)
 (R/'decoded/dex-header.json').write_text(json.dumps(dex.headers,indent=2))
 (R/'decoded/dex-strings.txt').write_text('\n'.join(f'{i:06d} {s}' for i,s in enumerate(dex.strings)),encoding='utf-8')
 (R/'decoded/dex-symbols.txt').write_text(dex.print_sigs(),encoding='utf-8')
 (R/'decoded/dex-classes.json').write_text(json.dumps(dex.classes,indent=2,ensure_ascii=False),encoding='utf-8')
 xrefs=[];byclass=collections.defaultdict(list);symbols={};method_meta=[]
 for c in dex.classes:
  for m in c['methods']:
   mid=m['id']
   if mid not in dex.code:continue
   inst,refs,calls=disasm(dex,mid)
   co=dex.code[mid];sym=m['name']
   byclass[c['class']].append(f'### {sym}  [access=0x{m["flags"]:x}, regs={co["regs"]}, ins={co["ins"]}, outs={co["outs"]}, code_off=0x{co["offset"]:x}]\n'+'\n'.join(inst)+'\n')
   xrefs.extend({'method':sym,'code_offset':co['offset'],'pc':at,'kind':kind,'ref':r} for at,kind,r in refs)
   method_meta.append({'method':sym,'code_offset':co['offset'],'code_units':len(co['words']),'invoke_count':len(calls),'string_ref_count':sum(kind=='string' for _,kind,_ in refs)})
 for cls,methods in byclass.items():
  p=(R/'disassembly'/cls[1:-1].replace('/','__')).with_suffix('.dalvik.txt');p.parent.mkdir(parents=True,exist_ok=True)
  p.write_text('\n'.join(methods),encoding='utf-8')
 (R/'decoded/dex-xrefs.json').write_text(json.dumps(xrefs,ensure_ascii=False,indent=2))
 (R/'decoded/dex-method-metadata.json').write_text(json.dumps(method_meta,ensure_ascii=False,indent=2))
 stat={'classes':len(dex.classes),'all_method_refs':len(dex.methods),'defined_methods':sum(len(c['methods']) for c in dex.classes),'methods_with_code':len(dex.code),'string_count':len(dex.strings),'field_count':len(dex.fields),'xref_count':len(xrefs),'instructions_units':sum(len(z['words']) for z in dex.code.values()),'disassembly_files':len(byclass)}
 (R/'decoded/dex-summary.json').write_text(json.dumps(stat,indent=2))
 print(json.dumps(stat,indent=2));print('manifest exported at decoded/AndroidManifest.xml')
if __name__=='__main__':main()
