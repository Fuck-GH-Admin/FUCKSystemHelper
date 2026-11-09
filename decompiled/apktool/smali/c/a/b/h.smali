.class Lc/a/b/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>(Lc/a/b/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/b/d;Lc/a/b/d;)I
    .locals 1

    iget p0, p2, Lc/a/b/d;->b:I

    iget v0, p1, Lc/a/b/d;->b:I

    sub-int/2addr p0, v0

    if-nez p0, :cond_2

    iget-boolean v0, p1, Lc/a/b/d;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Lc/a/b/d;->d:Z

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-boolean p1, p1, Lc/a/b/d;->d:Z

    if-eqz p1, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    iget-boolean p1, p2, Lc/a/b/d;->d:Z

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    :cond_2
    return p0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/a/b/d;

    check-cast p2, Lc/a/b/d;

    invoke-virtual {p0, p1, p2}, Lc/a/b/h;->a(Lc/a/b/d;Lc/a/b/d;)I

    move-result p0

    return p0
.end method
