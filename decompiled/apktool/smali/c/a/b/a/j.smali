.class final Lc/a/b/a/j;
.super Lc/a/b/a/g;
.source ""


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Lc/a/b/a/g;-><init>()V

    const/16 v0, 0x20

    iput v0, p0, Lc/a/b/a/g;->a:I

    iput p1, p0, Lc/a/b/a/g;->b:I

    iput p2, p0, Lc/a/b/a/g;->c:I

    return-void
.end method


# virtual methods
.method public a([BII)Lc/a/b/a/b;
    .locals 0

    new-instance p0, Lc/a/b/a/k;

    invoke-direct {p0}, Lc/a/b/a/k;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lc/a/b/a/k;->a([BII)V

    invoke-virtual {p0}, Lc/a/b/a/k;->a()J

    move-result-wide p0

    const/4 p2, 0x1

    new-array p2, p2, [J

    const/4 p3, 0x0

    aput-wide p0, p2, p3

    invoke-static {p2}, Lc/a/b/a/b;->a([J)Lc/a/b/a/b;

    move-result-object p0

    return-object p0
.end method
