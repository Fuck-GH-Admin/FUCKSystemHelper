.class public Lc/a/b/e/b/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lc/a/b/e/b/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/a/b/e/b/b;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lc/a/b/e/b/b;-><init>(I)V

    iput-object v0, p0, Lc/a/b/e/b/c;->a:Lc/a/b/e/b/b;

    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 0

    iget-object p0, p0, Lc/a/b/e/b/c;->a:Lc/a/b/e/b/b;

    invoke-virtual {p0, p1}, Lc/a/b/e/b/b;->a([B)[B

    move-result-object p0

    return-object p0
.end method

.method public b([B)[B
    .locals 0

    iget-object p0, p0, Lc/a/b/e/b/c;->a:Lc/a/b/e/b/b;

    invoke-virtual {p0, p1}, Lc/a/b/e/b/b;->b([B)[B

    move-result-object p0

    return-object p0
.end method
