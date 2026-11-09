.class abstract Lb/b/b/a/i$f;
.super Lb/b/b/a/i$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation


# instance fields
.field protected a:[Lb/b/c/b/b$b;

.field b:Ljava/lang/String;

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/b/b/a/i$e;-><init>(Lb/b/b/a/i$a;)V

    iput-object v0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    return-void
.end method

.method public constructor <init>(Lb/b/b/a/i$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/b/b/a/i$e;-><init>(Lb/b/b/a/i$a;)V

    iput-object v0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    iget-object v0, p1, Lb/b/b/a/i$f;->b:Ljava/lang/String;

    iput-object v0, p0, Lb/b/b/a/i$f;->b:Ljava/lang/String;

    iget v0, p1, Lb/b/b/a/i$f;->c:I

    iput v0, p0, Lb/b/b/a/i$f;->c:I

    iget-object p1, p1, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    invoke-static {p1}, Lb/b/c/b/b;->a([Lb/b/c/b/b$b;)[Lb/b/c/b/b$b;

    move-result-object p1

    iput-object p1, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Path;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object p0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lb/b/c/b/b$b;->a([Lb/b/c/b/b$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public getPathData()[Lb/b/c/b/b$b;
    .locals 0

    iget-object p0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    return-object p0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lb/b/b/a/i$f;->b:Ljava/lang/String;

    return-object p0
.end method

.method public setPathData([Lb/b/c/b/b$b;)V
    .locals 1

    iget-object v0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    invoke-static {v0, p1}, Lb/b/c/b/b;->a([Lb/b/c/b/b$b;[Lb/b/c/b/b$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lb/b/c/b/b;->a([Lb/b/c/b/b$b;)[Lb/b/c/b/b$b;

    move-result-object p1

    iput-object p1, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lb/b/b/a/i$f;->a:[Lb/b/c/b/b$b;

    invoke-static {p0, p1}, Lb/b/c/b/b;->b([Lb/b/c/b/b$b;[Lb/b/c/b/b$b;)V

    :goto_0
    return-void
.end method
