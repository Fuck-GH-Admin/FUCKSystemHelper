.class Lc/a/b/c/e$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:[B

.field b:B

.field c:[B


# direct methods
.method public constructor <init>([BB[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/b/c/e$d;->a:[B

    iput-byte p2, p0, Lc/a/b/c/e$d;->b:B

    iput-object p3, p0, Lc/a/b/c/e$d;->c:[B

    return-void
.end method


# virtual methods
.method public a()Lc/a/b/n$a;
    .locals 7

    const-string v0, "UTF-8"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lc/a/b/c/e$d;->a:[B

    const-string v3, ""

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lc/a/b/g/b;->a([BLjava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/String;

    new-array v4, v4, [B

    const/4 v5, 0x0

    iget-byte v6, p0, Lc/a/b/c/e$d;->b:B

    aput-byte v6, v4, v5

    invoke-direct {v3, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iget-object v4, p0, Lc/a/b/c/e$d;->c:[B

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/String;

    iget-object p0, p0, Lc/a/b/c/e$d;->c:[B

    invoke-direct {v4, p0, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-static {v2, v3, v4}, Lc/a/b/n;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v1
.end method
