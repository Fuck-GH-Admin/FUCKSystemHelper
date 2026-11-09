.class Lc/a/b/c/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method constructor <init>(Lc/a/b/c/e$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/b/c/e$c$a;Lc/a/b/c/e$c$a;)I
    .locals 0

    invoke-static {p1}, Lc/a/b/c/e$c$a;->a(Lc/a/b/c/e$c$a;)I

    move-result p0

    invoke-static {p2}, Lc/a/b/c/e$c$a;->a(Lc/a/b/c/e$c$a;)I

    move-result p1

    sub-int/2addr p0, p1

    return p0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/a/b/c/e$c$a;

    check-cast p2, Lc/a/b/c/e$c$a;

    invoke-virtual {p0, p1, p2}, Lc/a/b/c/f;->a(Lc/a/b/c/e$c$a;Lc/a/b/c/e$c$a;)I

    move-result p0

    return p0
.end method
