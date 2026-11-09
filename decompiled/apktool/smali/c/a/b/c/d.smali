.class public Lc/a/b/c/d;
.super Lc/a/b/c/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/c/d$b;,
        Lc/a/b/c/d$a;
    }
.end annotation


# instance fields
.field f:Lc/a/b/i/a$a;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "isc"

    const-wide/32 v1, 0x7a1200

    invoke-direct {p0, v0, v1, v2}, Lc/a/b/c/a;-><init>(Ljava/lang/String;J)V

    new-instance v0, Lc/a/b/c/d$a;

    invoke-direct {v0, p0}, Lc/a/b/c/d$a;-><init>(Lc/a/b/c/d;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/a/b/c/a$d;)Lc/a/b/c/a$e;
    .locals 7

    iget-object v0, p0, Lc/a/b/c/a;->a:Lc/a/b/c/a$a;

    iget-object v0, v0, Lc/a/b/c/a$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v2

    :goto_0
    const/4 v1, -0x2

    if-nez v0, :cond_0

    invoke-static {v1}, Lc/a/b/c/a$e;->a(I)Lc/a/b/c/a$e;

    move-result-object p0

    return-object p0

    :cond_0
    iget-boolean v3, p2, Lc/a/b/c/a$d;->a:Z

    if-eqz v3, :cond_1

    new-instance v2, Lc/a/b/c/d$b;

    invoke-direct {v2, p0, p1}, Lc/a/b/c/d$b;-><init>(Lc/a/b/c/d;Ljava/lang/String;)V

    invoke-virtual {v2}, Lc/a/b/c/a$b;->a()Z

    invoke-virtual {v2}, Lc/a/b/c/d$b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-wide v3, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v2}, Lc/a/b/c/d$b;->e()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lc/a/b/c/d$b;->d()Lc/a/b/n$a;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lc/a/b/c/a$e;->a(Lc/a/b/n$a;)Lc/a/b/c/a$e;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v3, Lc/a/b/c/d$a;

    invoke-direct {v3, p0}, Lc/a/b/c/d$a;-><init>(Lc/a/b/c/d;)V

    invoke-virtual {v3, v0}, Lc/a/b/c/d$a;->a(Landroid/content/pm/PackageInfo;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {v1}, Lc/a/b/c/a$e;->a(I)Lc/a/b/c/a$e;

    move-result-object p0

    return-object p0

    :cond_2
    iget-boolean p0, p2, Lc/a/b/c/a$d;->a:Z

    if-eqz p0, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v2, v3}, Lc/a/b/c/d$b;->a(Lc/a/b/c/d$a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lc/a/b/c/d$b;->a(J)Z

    iget-wide v0, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v2, v0, v1}, Lc/a/b/c/d$b;->c(J)Z

    invoke-virtual {v2, p1}, Lc/a/b/c/d$b;->a(Ljava/lang/String;)Z

    invoke-virtual {v2}, Lc/a/b/c/a$b;->b()Z

    :cond_3
    invoke-virtual {v3}, Lc/a/b/c/d$a;->b()Lc/a/b/n$a;

    move-result-object p0

    goto :goto_1
.end method

.method public a(Lc/a/b/c/a$c;)V
    .locals 1

    iget-object p1, p0, Lc/a/b/c/a;->b:Lc/a/b/i/a$a;

    const-string v0, "isc"

    invoke-virtual {p1, v0}, Lc/a/b/i/a$a;->a(Ljava/lang/String;)Lc/a/b/i/a$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/c/d;->f:Lc/a/b/i/a$a;

    return-void
.end method
