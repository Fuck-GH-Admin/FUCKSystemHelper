.class public final La/a/a/f/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/f/d$b;,
        La/a/a/f/d$c;,
        La/a/a/f/d$d;
    }
.end annotation


# static fields
.field public static g:Landroid/content/Context; = null

.field public static volatile h:La/a/a/f/d; = null

.field public static i:Ljava/lang/Object; = null

.field public static final j:Ljava/lang/String; = "http://ofloc.map.baidu.com/offline_loc"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:La/a/a/f/f;

.field public final c:La/a/a/f/b;

.field public final d:La/a/a/f/g;

.field public final e:La/a/a/f/c;

.field public f:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/a/a/f/d;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/f/d;->f:Ljava/util/concurrent/ExecutorService;

    :try_start_0
    new-instance v1, Ljava/io/File;

    sget-object v2, La/a/a/f/d;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "ofld"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    move-object v0, v1

    :catch_1
    iput-object v0, p0, La/a/a/f/d;->a:Ljava/io/File;

    new-instance v0, La/a/a/f/b;

    invoke-direct {v0, p0}, La/a/a/f/b;-><init>(La/a/a/f/d;)V

    iput-object v0, p0, La/a/a/f/d;->c:La/a/a/f/b;

    new-instance v1, La/a/a/f/f;

    invoke-virtual {v0}, La/a/a/f/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-direct {v1, v2}, La/a/a/f/f;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v1, p0, La/a/a/f/d;->b:La/a/a/f/f;

    new-instance v1, La/a/a/f/c;

    invoke-virtual {v0}, La/a/a/f/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    invoke-direct {v1, p0, v2}, La/a/a/f/c;-><init>(La/a/a/f/d;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v1, p0, La/a/a/f/d;->e:La/a/a/f/c;

    new-instance v2, La/a/a/f/g;

    invoke-virtual {v0}, La/a/a/f/b;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v1}, La/a/a/f/c;->c()I

    move-result v1

    invoke-direct {v2, p0, v0, v1}, La/a/a/f/g;-><init>(La/a/a/f/d;Landroid/database/sqlite/SQLiteDatabase;I)V

    iput-object v2, p0, La/a/a/f/d;->d:La/a/a/f/g;

    return-void
.end method

.method public static synthetic a(La/a/a/f/d;)La/a/a/f/c;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    sget-object v0, La/a/a/f/d;->g:Landroid/content/Context;

    if-nez v0, :cond_0

    sput-object p0, La/a/a/f/d;->g:Landroid/content/Context;

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object p0

    sget-object v0, La/a/a/f/d;->g:Landroid/content/Context;

    invoke-virtual {p0, v0}, La/a/a/i/b;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(La/a/a/f/d;)La/a/a/f/b;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->c:La/a/a/f/b;

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    invoke-static {p0}, La/a/a/f/d;->c(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "content://%s/"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q()Landroid/content/Context;
    .locals 1

    sget-object v0, La/a/a/f/d;->g:Landroid/content/Context;

    return-object v0
.end method

.method public static r()La/a/a/f/d;
    .locals 2

    sget-object v0, La/a/a/f/d;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/f/d;->h:La/a/a/f/d;

    if-nez v1, :cond_1

    sget-object v1, La/a/a/f/d;->g:Landroid/content/Context;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, La/a/a/f/d;->a(Landroid/content/Context;)V

    :cond_0
    new-instance v1, La/a/a/f/d;

    invoke-direct {v1}, La/a/a/f/d;-><init>()V

    sput-object v1, La/a/a/f/d;->h:La/a/a/f/d;

    :cond_1
    sget-object v1, La/a/a/f/d;->h:La/a/a/f/d;

    invoke-virtual {v1}, La/a/a/f/d;->a()V

    sget-object v1, La/a/a/f/d;->h:La/a/a/f/d;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0, p1}, La/a/a/f/c;->a(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method public a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;
    .locals 7

    sget-object v0, La/a/a/f/d$c;->b:La/a/a/f/d$c;

    if-ne p4, v0, :cond_0

    iget-object p4, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p4}, La/a/a/f/c;->d()I

    move-result p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/i/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&mixMode=1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/i/b;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move v6, p4

    move-object v4, v0

    sget-object p4, La/a/a/f/d$b;->b:La/a/a/f/d$b;

    if-ne p5, p4, :cond_1

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v1 .. v6}, La/a/a/f/e;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;Ljava/lang/String;ZI)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    array-length p3, p1

    if-lez p3, :cond_2

    invoke-virtual {p0, p1}, La/a/a/f/d;->a([Ljava/lang/String;)Lcom/baidu/location/c;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/baidu/location/c;->r()I

    :cond_2
    return-object p2
.end method

.method public final a([Ljava/lang/String;)Lcom/baidu/location/c;
    .locals 2

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    iget-object v0, p0, La/a/a/f/d;->f:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, La/a/a/f/d;->f:Ljava/util/concurrent/ExecutorService;

    :cond_0
    iget-object v0, p0, La/a/a/f/d;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, La/a/a/f/d$a;

    invoke-direct {v1, p0, p1}, La/a/a/f/d$a;-><init>(La/a/a/f/d;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/FutureTask;

    const-wide/16 v0, 0x7d0

    :try_start_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, p1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/location/c;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final a()V
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->a()V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()La/a/a/f/c;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    return-object p0
.end method

.method public d()Landroid/content/Context;
    .locals 0

    sget-object p0, La/a/a/f/d;->g:Landroid/content/Context;

    return-object p0
.end method

.method public e()La/a/a/f/f;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->b:La/a/a/f/f;

    return-object p0
.end method

.method public f()D
    .locals 5

    sget-object v0, La/a/a/f/d;->g:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    sget-object v1, La/a/a/f/d$d;->b:La/a/a/f/d$d;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    sget-object v2, La/a/a/f/d$d;->c:La/a/a/f/d$d;

    goto :goto_1

    :cond_0
    move-object v2, v1

    :goto_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    if-eq v0, v3, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x4

    if-eq v0, v3, :cond_4

    const/4 v3, 0x7

    if-eq v0, v3, :cond_4

    const/16 v3, 0xb

    if-ne v0, v3, :cond_1

    goto :goto_3

    :cond_1
    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v3, 0x6

    if-eq v0, v3, :cond_3

    const/16 v3, 0x8

    if-eq v0, v3, :cond_3

    const/16 v3, 0x9

    if-eq v0, v3, :cond_3

    const/16 v3, 0xa

    if-eq v0, v3, :cond_3

    const/16 v3, 0xc

    if-eq v0, v3, :cond_3

    const/16 v3, 0xe

    if-eq v0, v3, :cond_3

    const/16 v3, 0xf

    if-ne v0, v3, :cond_2

    goto :goto_2

    :cond_2
    const/16 v3, 0xd

    if-ne v0, v3, :cond_6

    sget-object v2, La/a/a/f/d$d;->f:La/a/a/f/d$d;

    goto :goto_4

    :cond_3
    :goto_2
    sget-object v2, La/a/a/f/d$d;->e:La/a/a/f/d$d;

    goto :goto_4

    :cond_4
    :goto_3
    sget-object v2, La/a/a/f/d$d;->d:La/a/a/f/d$d;

    goto :goto_4

    :cond_5
    move-object v2, v1

    :cond_6
    :goto_4
    const-wide/16 v3, 0x0

    if-ne v2, v1, :cond_7

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->i()D

    move-result-wide v3

    goto :goto_5

    :cond_7
    sget-object v0, La/a/a/f/d$d;->c:La/a/a/f/d$d;

    if-ne v2, v0, :cond_8

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->j()D

    move-result-wide v3

    goto :goto_5

    :cond_8
    sget-object v0, La/a/a/f/d$d;->d:La/a/a/f/d$d;

    if-ne v2, v0, :cond_9

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->f()D

    move-result-wide v3

    goto :goto_5

    :cond_9
    sget-object v0, La/a/a/f/d$d;->e:La/a/a/f/d$d;

    if-ne v2, v0, :cond_a

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->g()D

    move-result-wide v3

    goto :goto_5

    :cond_a
    sget-object v0, La/a/a/f/d$d;->f:La/a/a/f/d$d;

    if-ne v2, v0, :cond_b

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->h()D

    move-result-wide v3

    :cond_b
    :goto_5
    return-wide v3
.end method

.method public g()La/a/a/f/g;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->d:La/a/a/f/g;

    return-object p0
.end method

.method public h()Ljava/io/File;
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->a:Ljava/io/File;

    return-object p0
.end method

.method public i()Z
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->l()Z

    move-result p0

    return p0
.end method

.method public j()Z
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->m()Z

    move-result p0

    return p0
.end method

.method public k()Z
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->o()Z

    move-result p0

    return p0
.end method

.method public final l()Z
    .locals 6

    sget-object v0, La/a/a/f/d;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->k()[Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v1

    move v3, v2

    :goto_0
    array-length v5, p0

    if-ge v3, v5, :cond_1

    :try_start_0
    sget-object v4, La/a/a/f/d;->g:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    aget-object v5, p0, v3

    invoke-virtual {v4, v5, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    iget-object p0, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    const/4 v2, 0x1

    :goto_4
    return v2
.end method

.method public m()Z
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->p()Z

    move-result p0

    return p0
.end method

.method public n()Z
    .locals 0

    iget-object p0, p0, La/a/a/f/d;->e:La/a/a/f/c;

    invoke-virtual {p0}, La/a/a/f/c;->q()Z

    move-result p0

    return p0
.end method

.method public o()V
    .locals 1

    invoke-virtual {p0}, La/a/a/f/d;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, La/a/a/f/d;->c:La/a/a/f/b;

    invoke-virtual {p0}, La/a/a/f/b;->b()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, La/a/a/f/d;->b:La/a/a/f/f;

    invoke-virtual {p0}, La/a/a/f/f;->b()V

    :cond_0
    return-void
.end method
