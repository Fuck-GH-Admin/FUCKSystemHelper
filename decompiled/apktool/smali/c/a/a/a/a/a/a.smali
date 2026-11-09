.class public final Lc/a/a/a/a/a/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile h:Lc/a/a/a/a/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lc/a/b/n;

.field private c:Lc/a/b/m;

.field private d:Lc/a/b/f;

.field private e:Lc/a/b/n$a;

.field private f:Lc/a/b/n$a;

.field private g:J


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/a/a/a/a;->a:Landroid/content/Context;

    new-instance p1, Lc/a/b/f;

    invoke-direct {p1}, Lc/a/b/f;-><init>()V

    iput-object p1, p0, Lc/a/a/a/a/a/a;->d:Lc/a/b/f;

    new-instance p1, Lc/a/b/i/a;

    iget-object v0, p0, Lc/a/a/a/a/a/a;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, Lc/a/b/i/a;-><init>(Landroid/content/Context;)V

    new-instance v0, Lc/a/b/n;

    iget-object v1, p0, Lc/a/a/a/a/a/a;->a:Landroid/content/Context;

    iget-object v2, p0, Lc/a/a/a/a/a/a;->d:Lc/a/b/f;

    invoke-direct {v0, v1, p1, v2}, Lc/a/b/n;-><init>(Landroid/content/Context;Lc/a/b/i/a;Lc/a/b/f;)V

    iput-object v0, p0, Lc/a/a/a/a/a/a;->b:Lc/a/b/n;

    new-instance p1, Lc/a/b/m;

    iget-object v0, p0, Lc/a/a/a/a/a/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lc/a/a/a/a/a/a;->d:Lc/a/b/f;

    invoke-direct {p1, v0, v1}, Lc/a/b/m;-><init>(Landroid/content/Context;Lc/a/b/f;)V

    iput-object p1, p0, Lc/a/a/a/a/a/a;->c:Lc/a/b/m;

    return-void
.end method

.method private a()Lc/a/b/n$a;
    .locals 6

    iget-object v0, p0, Lc/a/a/a/a/a/a;->f:Lc/a/b/n$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lc/a/a/a/a/a/a;->g:J

    sub-long v2, v0, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v4, 0x36ee80

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    invoke-direct {p0}, Lc/a/a/a/a/a/a;->b()Lc/a/b/n$a;

    move-result-object v2

    iput-object v2, p0, Lc/a/a/a/a/a/a;->f:Lc/a/b/n$a;

    iput-wide v0, p0, Lc/a/a/a/a/a/a;->g:J

    :cond_1
    iget-object v0, p0, Lc/a/a/a/a/a/a;->f:Lc/a/b/n$a;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, Lc/a/a/a/a/a/a;->e:Lc/a/b/n$a;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc/a/a/a/a/a/a;->d(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/a/a/a/a;->f:Lc/a/b/n$a;

    :cond_3
    iget-object p0, p0, Lc/a/a/a/a/a/a;->f:Lc/a/b/n$a;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-class v0, Lc/a/a/a/a/a/a;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lc/a/a/a/a/a/a;->b(Landroid/content/Context;)Lc/a/a/a/a/a/a;

    move-result-object p0

    invoke-direct {p0}, Lc/a/a/a/a/a/a;->a()Lc/a/b/n$a;

    move-result-object p0

    invoke-virtual {p0}, Lc/a/b/n$a;->b()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lc/a/b/n;->c(Ljava/lang/String;)V

    return-void
.end method

.method static b(Landroid/content/Context;)Lc/a/a/a/a/a/a;
    .locals 2

    const-class v0, Lc/a/b/l;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc/a/a/a/a/a/a;->h:Lc/a/a/a/a/a/a;

    if-nez v1, :cond_0

    new-instance v1, Lc/a/a/a/a/a/a;

    invoke-direct {v1, p0}, Lc/a/a/a/a/a/a;-><init>(Landroid/content/Context;)V

    sput-object v1, Lc/a/a/a/a/a/a;->h:Lc/a/a/a/a/a/a;

    :cond_0
    sget-object p0, Lc/a/a/a/a/a/a;->h:Lc/a/a/a/a/a/a;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private b()Lc/a/b/n$a;
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lc/a/a/a/a/a/a;->b(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    throw p0
.end method

.method private b(Ljava/lang/String;)Lc/a/b/n$a;
    .locals 1

    iget-object v0, p0, Lc/a/a/a/a/a/a;->b:Lc/a/b/n;

    invoke-virtual {v0}, Lc/a/b/n;->a()Lc/a/b/n$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lc/a/a/a/a/a/a;->c(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private c(Ljava/lang/String;)Lc/a/b/n$a;
    .locals 1

    iget-object v0, p0, Lc/a/a/a/a/a/a;->c:Lc/a/b/m;

    invoke-virtual {v0, p1}, Lc/a/b/m;->a(Ljava/lang/String;)Lc/a/b/l;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lc/a/a/a/a/a/a;->b:Lc/a/b/n;

    invoke-virtual {p0, p1}, Lc/a/b/n;->a(Lc/a/b/l;)Lc/a/b/n$a;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private d(Ljava/lang/String;)Lc/a/b/n$a;
    .locals 0

    iget-object p0, p0, Lc/a/a/a/a/a/a;->b:Lc/a/b/n;

    invoke-virtual {p0, p1}, Lc/a/b/n;->a(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object p0

    return-object p0
.end method
