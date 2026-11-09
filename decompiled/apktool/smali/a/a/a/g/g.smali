.class public La/a/a/g/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/g/g$b;
    }
.end annotation


# static fields
.field public static d:Z = false

.field public static e:La/a/a/g/e;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/g/g;->a:Z

    iput-boolean v0, p0, La/a/a/g/g;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/g/g;->c:Z

    return-void
.end method

.method public static g()Z
    .locals 1

    sget-boolean v0, La/a/a/g/g;->d:Z

    return v0
.end method

.method public static h()La/a/a/g/e;
    .locals 1

    sget-object v0, La/a/a/g/g;->e:La/a/a/g/e;

    return-object v0
.end method


# virtual methods
.method public a(I)La/a/a/g/a;
    .locals 2

    iget-boolean v0, p0, La/a/a/g/g;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean p0, p0, La/a/a/g/g;->a:Z

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->a(I)La/a/a/g/a;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, La/a/a/g/l/a;->a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object p0

    return-object p0
.end method

.method public a()Landroid/net/wifi/WifiInfo;
    .locals 0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/l/b;->a()Landroid/net/wifi/WifiInfo;

    move-result-object p0

    return-object p0
.end method

.method public a(IZLa/a/a/g/k;I)Ljava/lang/String;
    .locals 0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, La/a/a/g/l/b;->a(IZLa/a/a/g/k;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(La/a/a/g/a;)Ljava/lang/String;
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->b(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;
    .locals 6

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, La/a/a/g/l/b;->a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(Landroid/net/wifi/WifiInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, La/a/a/g/l/b;->a(Landroid/net/wifi/WifiInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(La/a/a/g/e;)V
    .locals 0

    sput-object p1, La/a/a/g/g;->e:La/a/a/g/e;

    return-void
.end method

.method public a(La/a/a/g/g$b;)V
    .locals 4

    sget-object v0, La/a/a/g/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iput-boolean v2, p0, La/a/a/g/g;->a:Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal this mode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iput-boolean v1, p0, La/a/a/g/g;->a:Z

    :goto_0
    iput-boolean v2, p0, La/a/a/g/g;->b:Z

    goto :goto_1

    :cond_2
    iput-boolean v2, p0, La/a/a/g/g;->a:Z

    iput-boolean v1, p0, La/a/a/g/g;->b:Z

    :goto_1
    return-void
.end method

.method public a(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, La/a/a/g/g;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/g/l/a;->a(Landroid/content/Context;)V

    :cond_0
    iget-boolean v0, p0, La/a/a/g/g;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La/a/a/g/l/b;->a(Landroid/content/Context;Ljava/util/List;)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/g/g;->c:Z

    return-void
.end method

.method public a(Z)V
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->a(Z)V

    return-void
.end method

.method public a(La/a/a/g/a;La/a/a/g/a;)Z
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, La/a/a/g/l/a;->a(La/a/a/g/a;La/a/a/g/a;)Z

    move-result p0

    return p0
.end method

.method public b(I)La/a/a/g/k;
    .locals 2

    iget-boolean v0, p0, La/a/a/g/g;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean p0, p0, La/a/a/g/g;->b:Z

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, La/a/a/g/l/b;->b(J)La/a/a/g/k;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public b()Ljava/lang/String;
    .locals 0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/l/b;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public b(La/a/a/g/a;)Ljava/lang/String;
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->c(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public b(Z)V
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->b(Z)V

    return-void
.end method

.method public c()La/a/a/g/k;
    .locals 0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/l/b;->c()La/a/a/g/k;

    move-result-object p0

    return-object p0
.end method

.method public c(La/a/a/g/a;)Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/g/a;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->d(La/a/a/g/a;)Ljava/util/HashSet;

    move-result-object p0

    return-object p0
.end method

.method public c(I)V
    .locals 0

    const/16 p0, 0x1d

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p1

    invoke-virtual {p1, p0}, La/a/a/g/l/a;->b(I)V

    return-void
.end method

.method public d()J
    .locals 2

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/l/b;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    if-ltz p1, :cond_0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->c(I)V

    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 0

    if-ltz p1, :cond_0

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/g/l/b;->a(I)V

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/l/a;->b()Z

    move-result p0

    return p0
.end method

.method public f()V
    .locals 1

    iget-boolean v0, p0, La/a/a/g/g;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/g/l/a;->i()La/a/a/g/l/a;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/l/a;->f()V

    :cond_0
    iget-boolean v0, p0, La/a/a/g/g;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/l/b;->i()La/a/a/g/l/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/l/b;->h()V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/g/g;->c:Z

    return-void
.end method
