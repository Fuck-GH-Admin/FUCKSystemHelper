.class Lc/a/b/a/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:I = 0x5

.field public static c:I = 0x28


# instance fields
.field private a:Lc/a/b/a/b;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/a/b/a/b;

    sget v1, Lc/a/b/a/f;->c:I

    invoke-direct {v0, v1}, Lc/a/b/a/b;-><init>(I)V

    iput-object v0, p0, Lc/a/b/a/f;->a:Lc/a/b/a/b;

    sget p0, Lc/a/b/a/f;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lc/a/b/a/b;->a(IIZ)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/b/a/b;III)V
    .locals 3

    iget-object v0, p0, Lc/a/b/a/f;->a:Lc/a/b/a/b;

    add-int v1, p2, p3

    invoke-virtual {v0, p2, v1}, Lc/a/b/a/b;->c(II)Lc/a/b/a/b;

    move-result-object v0

    if-eqz p4, :cond_2

    const/4 v1, 0x2

    if-eq p4, v1, :cond_1

    const/4 v1, 0x3

    if-eq p4, v1, :cond_0

    invoke-virtual {v0, p1}, Lc/a/b/a/b;->c(Lc/a/b/a/b;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lc/a/b/a/b;->b(Lc/a/b/a/b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lc/a/b/a/b;->d(Lc/a/b/a/b;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Lc/a/b/a/b;->a(Lc/a/b/a/b;)V

    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-ge p1, p3, :cond_3

    iget-object p4, p0, Lc/a/b/a/f;->a:Lc/a/b/a/b;

    add-int v1, p2, p1

    invoke-virtual {v0, p1}, Lc/a/b/a/b;->c(I)Z

    move-result v2

    invoke-virtual {p4, v1, v2}, Lc/a/b/a/b;->a(IZ)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public a()[B
    .locals 0

    iget-object p0, p0, Lc/a/b/a/f;->a:Lc/a/b/a/b;

    invoke-virtual {p0}, Lc/a/b/a/b;->a()[B

    move-result-object p0

    return-object p0
.end method
