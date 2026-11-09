.class Lb/b/c/b/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/b/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/b/h;->a([Lb/b/c/d/b$f;I)Lb/b/c/d/b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/b/c/b/h$c<",
        "Lb/b/c/d/b$f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lb/b/c/b/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/c/d/b$f;)I
    .locals 0

    invoke-virtual {p1}, Lb/b/c/d/b$f;->d()I

    move-result p0

    return p0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb/b/c/d/b$f;

    invoke-virtual {p0, p1}, Lb/b/c/b/h$a;->a(Lb/b/c/d/b$f;)I

    move-result p0

    return p0
.end method

.method public b(Lb/b/c/d/b$f;)Z
    .locals 0

    invoke-virtual {p1}, Lb/b/c/d/b$f;->e()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb/b/c/d/b$f;

    invoke-virtual {p0, p1}, Lb/b/c/b/h$a;->b(Lb/b/c/d/b$f;)Z

    move-result p0

    return p0
.end method
