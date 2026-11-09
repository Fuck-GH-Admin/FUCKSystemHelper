.class public Lc/a/b/c/a$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:Lc/a/b/n$a;

.field public b:I


# direct methods
.method public constructor <init>(ILc/a/b/n$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc/a/b/c/a$e;->b:I

    iput-object p2, p0, Lc/a/b/c/a$e;->a:Lc/a/b/n$a;

    return-void
.end method

.method public static a(I)Lc/a/b/c/a$e;
    .locals 2

    new-instance v0, Lc/a/b/c/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Lc/a/b/c/a$e;-><init>(ILc/a/b/n$a;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static a(Lc/a/b/n$a;)Lc/a/b/c/a$e;
    .locals 3

    new-instance v0, Lc/a/b/c/a$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lc/a/b/c/a$e;-><init>(ILc/a/b/n$a;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static b()Lc/a/b/c/a$e;
    .locals 3

    new-instance v0, Lc/a/b/c/a$e;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1, v1}, Lc/a/b/c/a$e;-><init>(ILc/a/b/n$a;Ljava/lang/Exception;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 0

    iget p0, p0, Lc/a/b/c/a$e;->b:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
