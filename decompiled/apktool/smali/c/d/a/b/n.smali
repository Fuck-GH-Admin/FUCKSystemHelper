.class public Lc/d/a/b/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lc/d/a/b/n;->a:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->b:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->c:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->d:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->e:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->g:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->h:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->i:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->j:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->k:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->l:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->m:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->n:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->o:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->p:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->q:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->r:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->s:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->t:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->u:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->v:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->w:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->x:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->y:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->z:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->A:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->B:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->C:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->D:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->E:Ljava/lang/String;

    iput-object v0, p0, Lc/d/a/b/n;->F:Ljava/lang/String;

    invoke-static {}, Lc/d/a/b/l;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/d/a/b/n;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 4

    iget-object v0, p0, Lc/d/a/b/n;->b:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "SignalInfo"

    if-eqz v0, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->e:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->g:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->h:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->i:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->j:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->k:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->j:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "Time"

    iget-object v3, p0, Lc/d/a/b/n;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "IMEI"

    iget-object v3, p0, Lc/d/a/b/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ICCID"

    iget-object v3, p0, Lc/d/a/b/n;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ClientVersion"

    iget-object v3, p0, Lc/d/a/b/n;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "MNC"

    iget-object v3, p0, Lc/d/a/b/n;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "IMSI"

    iget-object v3, p0, Lc/d/a/b/n;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "TAC"

    iget-object v3, p0, Lc/d/a/b/n;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CID"

    iget-object v3, p0, Lc/d/a/b/n;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "PCI"

    iget-object v3, p0, Lc/d/a/b/n;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "NetworkType"

    iget-object v3, p0, Lc/d/a/b/n;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ARFCN"

    iget-object v3, p0, Lc/d/a/b/n;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Bands"

    iget-object v3, p0, Lc/d/a/b/n;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Bandwidth"

    iget-object v3, p0, Lc/d/a/b/n;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CQITableIndex"

    iget-object v3, p0, Lc/d/a/b/n;->o:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CQIIndex"

    iget-object v3, p0, Lc/d/a/b/n;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "RSRP"

    iget-object v3, p0, Lc/d/a/b/n;->q:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "RSRQ"

    iget-object v3, p0, Lc/d/a/b/n;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "SINR"

    iget-object v3, p0, Lc/d/a/b/n;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CSIRSRP"

    iget-object v3, p0, Lc/d/a/b/n;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CSIRSRQ"

    iget-object v3, p0, Lc/d/a/b/n;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CSISINR"

    iget-object v3, p0, Lc/d/a/b/n;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Uspeed"

    iget-object v3, p0, Lc/d/a/b/n;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "Dspeed"

    iget-object v3, p0, Lc/d/a/b/n;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "CallDisconnectCause"

    iget-object v3, p0, Lc/d/a/b/n;->y:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "DataFailCause"

    iget-object v3, p0, Lc/d/a/b/n;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "EPSFallback"

    iget-object v3, p0, Lc/d/a/b/n;->A:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "LONGITUDE"

    iget-object v3, p0, Lc/d/a/b/n;->B:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "LATITUDE"

    iget-object v3, p0, Lc/d/a/b/n;->C:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ALTITUDE"

    iget-object v3, p0, Lc/d/a/b/n;->D:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "SPEED"

    iget-object v3, p0, Lc/d/a/b/n;->E:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "BEARING"

    iget-object p0, p0, Lc/d/a/b/n;->F:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getJsonObject->"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "imei:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "mnc:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "imsi:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->g:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "tac:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->h:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "cid:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->i:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "pci:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "networkType:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/d/a/b/n;->k:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "mncch:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "SignalInfo->getJsonObject==null"

    :goto_2
    invoke-static {v2, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    :goto_3
    const-string p0, "imei/mnc/imsi/tac/cid/pci/networkType/mncch is null!"

    goto :goto_2
.end method
