.class Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;
.super Lcom/baidu/location/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;


# direct methods
.method constructor <init>(Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iput-object p2, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Lcom/baidu/location/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/location/c;)V
    .locals 8

    const-string v0, "GetSignalInfoReceiver"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v1

    const/16 v2, 0xa7

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v1

    const/16 v2, 0x43

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v1

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_2

    const-string v1, "\u5b9a\u4f4d\u6210\u529f\uff01"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lc/d/a/b/n;->B:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lc/d/a/b/n;->C:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {p1}, Lcom/baidu/location/c;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lc/d/a/b/n;->D:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p1}, Lc/d/a/a/a;->a(I)I

    move-result v1

    const-string v2, "inSigChinaNetwork"

    const-string v3, "siginfo: "

    const-string v4, "signalInfo.longitude: "

    const-string v5, ""

    if-lez v1, :cond_0

    iget-object v6, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v6, v6, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v6, v6, Lc/d/a/b/n;->B:Ljava/lang/String;

    if-eqz v6, :cond_0

    if-eq v6, v5, :cond_0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v7, v7, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v7, v7, Lc/d/a/b/n;->B:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Receiver subIdSlot1: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/mobiletools/systemhelper/control/d;

    invoke-direct {v1}, Lcom/mobiletools/systemhelper/control/d;-><init>()V

    iget-object v6, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->a:Landroid/content/Context;

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v7, v7, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {v1, v6, p1, v7}, Lcom/mobiletools/systemhelper/control/d;->b(Landroid/content/Context;ILc/d/a/b/n;)V

    iget-object p1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {p1}, Lc/d/a/b/n;->a()Lorg/json/JSONObject;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v1, v1, Lc/d/a/b/n;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-static {v1}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a(Lc/d/a/b/n;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v6, Lc/d/a/b/m;->c:Ljava/lang/String;

    sget-object v7, Lc/d/a/b/m;->b:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v1, v6, v7}, Lc/d/a/b/m;->a(Landroid/content/Context;Ljava/lang/String;I)Lc/d/a/b/m;

    move-result-object v1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lc/d/a/b/m;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lc/d/a/b/m;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v0, v2}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 p1, 0x1

    invoke-static {p1}, Lc/d/a/a/a;->a(I)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v6, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v6, v6, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v6, v6, Lc/d/a/b/n;->B:Ljava/lang/String;

    if-eqz v6, :cond_1

    if-eq v6, v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v4, v4, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v4, v4, Lc/d/a/b/n;->B:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Receiver subIdSlot2: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/mobiletools/systemhelper/control/d;

    invoke-direct {v1}, Lcom/mobiletools/systemhelper/control/d;-><init>()V

    iget-object v4, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v5, v5, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {v1, v4, p1, v5}, Lcom/mobiletools/systemhelper/control/d;->b(Landroid/content/Context;ILc/d/a/b/n;)V

    iget-object p1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-virtual {p1}, Lc/d/a/b/n;->a()Lorg/json/JSONObject;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v1, v1, Lc/d/a/b/n;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    invoke-static {v1}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a(Lc/d/a/b/n;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v3, Lc/d/a/b/m;->c:Ljava/lang/String;

    sget-object v4, Lc/d/a/b/m;->b:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v1, v3, v4}, Lc/d/a/b/m;->a(Landroid/content/Context;Ljava/lang/String;I)Lc/d/a/b/m;

    move-result-object v1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lc/d/a/b/m;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lc/d/a/b/m;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {v0, v2}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u7ecf\u7eac\u5ea6\u4fe1\u606fsignalInfo.longitude\uff1a "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v1, v1, Lc/d/a/b/n;->B:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object v2, v2, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object v2, v2, Lc/d/a/b/n;->C:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;->b:Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;

    iget-object p0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    iget-object p0, p0, Lc/d/a/b/n;->D:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string p0, "\u5b9a\u4f4d\u5931\u8d25\uff01"

    invoke-static {v0, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method
