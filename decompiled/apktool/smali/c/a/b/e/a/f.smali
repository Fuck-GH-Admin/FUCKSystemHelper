.class abstract Lc/a/b/e/a/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Lc/a/b/e/a/b;

.field final b:I

.field c:[B


# direct methods
.method constructor <init>(Lc/a/b/e/a/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/b/e/a/f;->a:Lc/a/b/e/a/b;

    invoke-virtual {p1}, Lc/a/b/e/a/b;->a()I

    move-result p1

    iput p1, p0, Lc/a/b/e/a/f;->b:I

    return-void
.end method


# virtual methods
.method abstract a()V
.end method

.method abstract a(ZLjava/lang/String;[B[B)V
.end method

.method abstract a([BII[BI)V
.end method

.method abstract b()V
.end method

.method abstract b([BII[BI)V
.end method

.method abstract c()V
.end method

.method c([BII[BI)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lc/a/b/e/a/f;->a([BII[BI)V

    return-void
.end method

.method d([BII[BI)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lc/a/b/e/a/f;->b([BII[BI)V

    return-void
.end method
