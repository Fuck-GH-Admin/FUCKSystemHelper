.class public abstract Lc/b/a/a/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(Lc/b/a/a/b;)V
.end method

.method public a([BII)V
    .locals 0

    :try_start_0
    invoke-static {p1, p2, p3}, Lc/b/a/a/b;->b([BII)Lc/b/a/a/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/a/a/c;->a(Lc/b/a/a/b;)V

    invoke-virtual {p1}, Lc/b/a/a/b;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public abstract b()I
.end method

.method public c()[B
    .locals 3

    invoke-virtual {p0}, Lc/b/a/a/c;->b()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lc/b/a/a/c;->a([BII)V

    return-object v1
.end method
