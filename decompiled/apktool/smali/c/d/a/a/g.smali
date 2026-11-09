.class public Lc/d/a/a/g;
.super Lc/d/a/a/a;
.source ""


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

    const-string v0, "ro.build.display.id"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->d:Ljava/lang/String;

    const-string v0, "ro.build.hardware.version"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->c:Ljava/lang/String;

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    const-string v1, "DeviceInfoReaderRealme"

    if-nez v0, :cond_0

    const-string p0, "isUserPermissionOpen==false, do not read!"

    invoke-static {v1, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_1

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Unsupported API:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
