.class Lb/b/c/b/h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/b/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/c/b/h;->a(Lb/b/c/a/d/c$b;I)Lb/b/c/a/d/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/b/c/b/h$c<",
        "Lb/b/c/a/d/c$c;",
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
.method public a(Lb/b/c/a/d/c$c;)I
    .locals 0

    invoke-virtual {p1}, Lb/b/c/a/d/c$c;->e()I

    move-result p0

    return p0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb/b/c/a/d/c$c;

    invoke-virtual {p0, p1}, Lb/b/c/b/h$b;->a(Lb/b/c/a/d/c$c;)I

    move-result p0

    return p0
.end method

.method public b(Lb/b/c/a/d/c$c;)Z
    .locals 0

    invoke-virtual {p1}, Lb/b/c/a/d/c$c;->f()Z

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb/b/c/a/d/c$c;

    invoke-virtual {p0, p1}, Lb/b/c/b/h$b;->b(Lb/b/c/a/d/c$c;)Z

    move-result p0

    return p0
.end method
