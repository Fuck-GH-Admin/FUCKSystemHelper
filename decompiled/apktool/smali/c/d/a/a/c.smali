.class public Lc/d/a/a/c;
.super Lc/d/a/a/a;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "DefaultLocale"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/d/a/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    const-string v1, "DeviceInfoReaderNubia"

    if-nez v0, :cond_0

    const-string p0, "isUserPermissionOpen==false, do not read!"

    invoke-static {v1, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    const-string v2, "NX659J"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    const-string v2, "NX651J"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    const-string v2, "angelcare N9"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    const-string v2, "NX724J"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string p0, "DeviceInfoReaderNubia model unknow!!!"

    invoke-static {v1, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_0
    const-string v0, "model : angelcare N9"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ro.build.display.id"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->d:Ljava/lang/String;

    const-string v0, "ro.product.hardware"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    :goto_1
    return-void
.end method
