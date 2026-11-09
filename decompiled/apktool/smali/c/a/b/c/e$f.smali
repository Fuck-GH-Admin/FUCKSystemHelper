.class Lc/a/b/c/e$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field private a:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/net/Uri;III)I
    .locals 2

    :try_start_0
    iget-object p0, p0, Lc/a/b/c/e$f;->a:Ljava/lang/reflect/Method;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, p2

    const/4 p2, 0x2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, p2

    const/4 p2, 0x3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v0, p2

    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/b/a/e$a;

    invoke-direct {p1, p0}, Lc/a/b/a/e$a;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method a()V
    .locals 8

    :try_start_0
    invoke-static {}, Lc/a/b/a/d;->d()[B

    move-result-object v0

    invoke-static {v0}, Lc/a/b/a/e;->a([B)Ljava/lang/String;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/net/Uri;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x2

    aput-object v3, v2, v6

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x3

    aput-object v3, v2, v7

    invoke-static {v1, v0, v2}, Lc/a/b/a/e;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/c/e$f;->a:Ljava/lang/reflect/Method;

    invoke-static {}, Lc/a/b/a/d;->e()[B

    move-result-object p0

    invoke-static {p0}, Lc/a/b/a/e;->a([B)Ljava/lang/String;

    move-result-object p0

    const-class v0, Landroid/content/Context;

    new-array v1, v7, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v4

    const-class v2, Landroid/net/Uri;

    aput-object v2, v1, v5

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v6

    invoke-static {v0, p0, v1}, Lc/a/b/a/e;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, Lc/a/b/a/d;->f()[B

    move-result-object p0

    invoke-static {p0}, Lc/a/b/a/e;->a([B)Ljava/lang/String;

    move-result-object p0

    const-class v0, Landroid/content/ContentResolver;

    new-array v1, v6, [Ljava/lang/Class;

    const-class v2, Landroid/net/Uri;

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v5

    invoke-static {v0, p0, v1}, Lc/a/b/a/e;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, Lc/a/b/a/d;->g()[B

    move-result-object p0

    invoke-static {p0}, Lc/a/b/a/e;->a([B)Ljava/lang/String;

    move-result-object p0

    const-class v0, Landroid/content/Context;

    new-array v1, v6, [Ljava/lang/Class;

    const-class v2, Landroid/net/Uri;

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v5

    invoke-static {v0, p0, v1}, Lc/a/b/a/e;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, Lc/a/b/a/d;->h()[B

    move-result-object p0

    invoke-static {p0}, Lc/a/b/a/e;->a([B)Ljava/lang/String;

    move-result-object p0

    const-class v0, Landroid/content/ContentResolver;

    new-array v1, v6, [Ljava/lang/Class;

    const-class v2, Landroid/net/Uri;

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v5

    invoke-static {v0, p0, v1}, Lc/a/b/a/e;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
