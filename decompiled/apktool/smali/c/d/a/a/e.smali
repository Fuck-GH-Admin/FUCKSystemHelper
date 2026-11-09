.class public Lc/d/a/a/e;
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
    .locals 2

    invoke-super {p0, p1, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Unsupported API:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "DeviceInfoReaderOnePlus"

    invoke-static {p1, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
