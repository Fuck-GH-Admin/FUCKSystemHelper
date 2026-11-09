.class public La/a/a/g/l/a$e;
.super Landroid/telephony/PhoneStateListener;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/l/a;


# direct methods
.method public constructor <init>(La/a/a/g/l/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCellInfoChanged(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/telephony/CellInfo;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {p1}, La/a/a/g/l/a;->g(La/a/a/g/l/a;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, La/a/a/g/l/a$e$a;

    invoke-direct {v0, p0}, La/a/a/g/l/a$e$a;-><init>(La/a/a/g/l/a$e;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 2

    iget-object v0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object v0

    iget-char v0, v0, La/a/a/g/a;->i:C

    const/16 v1, 0x67

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getGsmSignalStrength()I

    move-result p1

    :goto_0
    iput p1, v0, La/a/a/g/a;->h:I

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object v0

    iget-char v0, v0, La/a/a/g/a;->i:C

    const/16 v1, 0x63

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getCdmaDbm()I

    move-result p1

    goto :goto_0

    :cond_1
    :goto_1
    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_2

    sget-boolean p1, La/a/a/g/m/a;->b:Z

    if-eqz p1, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cell strength===== cell singal strength changed : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {p0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;)La/a/a/g/a;

    move-result-object p0

    iget p0, p0, La/a/a/g/a;->h:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
