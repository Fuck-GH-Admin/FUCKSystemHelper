.class public Lcom/mobiletools/systemhelper/service/RegisterHelperService;
.super Landroid/app/Service;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobiletools/systemhelper/service/RegisterHelperService$a;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/service/RegisterHelperService;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/mobiletools/systemhelper/service/RegisterHelperService;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/mobiletools/systemhelper/service/RegisterHelperService;->b:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string p1, "RegisterHelperService"

    const-string v0, "registerhelper Service onBind sucessed!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/mobiletools/systemhelper/service/RegisterHelperService$a;

    invoke-direct {p1, p0}, Lcom/mobiletools/systemhelper/service/RegisterHelperService$a;-><init>(Lcom/mobiletools/systemhelper/service/RegisterHelperService;)V

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    const-string v0, "RegisterHelperService"

    const-string v1, "registerhelper Service onCreate-->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/service/RegisterHelperService;->b:Landroid/content/Context;

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p0, v1, :cond_0

    invoke-static {v0}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "RegisterHelperService"

    const-string v1, "registerhelper Service onDestroy--->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    const-string p0, "RegisterHelperService"

    const-string p1, "registerhelper Service onUnbind sucessed!"

    invoke-static {p0, p1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method
