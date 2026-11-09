.class public La/a/a/g/l/a$b;
.super Landroid/telephony/TelephonyManager$CellInfoCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/l/a;


# direct methods
.method public constructor <init>(La/a/a/g/l/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-direct {p0}, Landroid/telephony/TelephonyManager$CellInfoCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/l/a;La/a/a/g/l/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/l/a$b;-><init>(La/a/a/g/l/a;)V

    return-void
.end method


# virtual methods
.method public onCellInfo(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/telephony/CellInfo;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    const-string v2, "onCellInfo"

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v2

    invoke-virtual {v2, p1}, La/a/a/g/e;->a(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p1

    const-string v0, "request sim1 cellInfo"

    invoke-virtual {p1, v0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-static {p1}, La/a/a/g/l/a;->c(La/a/a/g/l/a;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-static {p1}, La/a/a/g/l/a;->d(La/a/a/g/l/a;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, La/a/a/g/l/a;->a(La/a/a/g/l/a;Z)Z

    :cond_4
    iget-object p1, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-static {p1}, La/a/a/g/l/a;->c(La/a/a/g/l/a;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-static {p1}, La/a/a/g/l/a;->d(La/a/a/g/l/a;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    iget-object p0, p0, La/a/a/g/l/a$b;->a:La/a/a/g/l/a;

    invoke-static {p0}, La/a/a/g/l/a;->b(La/a/a/g/l/a;)V

    :cond_6
    return-void
.end method
