.class Lc/a/b/c/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/b/c/a;Lc/a/b/c/a;)I
    .locals 4

    invoke-virtual {p1}, Lc/a/b/c/a;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lc/a/b/c/a;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_1

    if-lez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0

    :cond_1
    invoke-virtual {p1}, Lc/a/b/c/a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lc/a/b/c/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/a/b/c/a;

    check-cast p2, Lc/a/b/c/a;

    invoke-virtual {p0, p1, p2}, Lc/a/b/c/b;->a(Lc/a/b/c/a;Lc/a/b/c/a;)I

    move-result p0

    return p0
.end method
