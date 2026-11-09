.class public La/a/a/g/l/a$d;
.super Landroid/telephony/TelephonyManager$CellInfoCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/l/a;


# direct methods
.method public constructor <init>(La/a/a/g/l/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/a$d;->a:La/a/a/g/l/a;

    invoke-direct {p0}, Landroid/telephony/TelephonyManager$CellInfoCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/l/a;La/a/a/g/l/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/l/a$d;-><init>(La/a/a/g/l/a;)V

    return-void
.end method


# virtual methods
.method public onCellInfo(Ljava/util/List;)V
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
    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/g/e;->a(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p0, p0, La/a/a/g/l/a$d;->a:La/a/a/g/l/a;

    invoke-static {p0}, La/a/a/g/l/a;->b(La/a/a/g/l/a;)V

    return-void
.end method

.method public onError(ILjava/lang/Throwable;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_1

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "cell onError = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
