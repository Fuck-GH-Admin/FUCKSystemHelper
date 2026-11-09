.class public Lcom/mobiletools/systemhelper/control/DMApplication;
.super Landroid/app/Application;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    const-string v0, "DMApplication"

    const-string v1, "onCreate--->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onTerminate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    const-string p0, "DMApplication"

    const-string v0, "onTerminate--->"

    invoke-static {p0, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
