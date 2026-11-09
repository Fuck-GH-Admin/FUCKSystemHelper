.class Lb/b/d/c/a/a$d;
.super Lb/b/d/c/a/a$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/d/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Lb/b/b/a/c;


# direct methods
.method constructor <init>(Lb/b/b/a/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb/b/d/c/a/a$g;-><init>(Lb/b/d/c/a/a$a;)V

    iput-object p1, p0, Lb/b/d/c/a/a$d;->a:Lb/b/b/a/c;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    iget-object p0, p0, Lb/b/d/c/a/a$d;->a:Lb/b/b/a/c;

    invoke-virtual {p0}, Lb/b/b/a/c;->start()V

    return-void
.end method

.method public d()V
    .locals 0

    iget-object p0, p0, Lb/b/d/c/a/a$d;->a:Lb/b/b/a/c;

    invoke-virtual {p0}, Lb/b/b/a/c;->stop()V

    return-void
.end method
