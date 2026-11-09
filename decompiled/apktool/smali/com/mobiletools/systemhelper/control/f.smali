.class public Lcom/mobiletools/systemhelper/control/f;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobiletools/systemhelper/control/f$b;,
        Lcom/mobiletools/systemhelper/control/f$a;
    }
.end annotation


# instance fields
.field private b:J

.field private c:J

.field private d:Landroid/content/pm/PackageManager;

.field private e:Landroid/content/Context;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/d/a/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/mobiletools/systemhelper/control/f$a;

.field private h:Lcom/mobiletools/systemhelper/control/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/f$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    iput-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->f:Ljava/util/List;

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iput-object p1, p0, Lcom/mobiletools/systemhelper/control/f;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iput-object p3, p0, Lcom/mobiletools/systemhelper/control/f;->g:Lcom/mobiletools/systemhelper/control/f$a;

    return-void
.end method

.method private a(Ljava/util/List;Landroid/app/usage/UsageStats;)Lc/d/a/b/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/pm/ApplicationInfo;",
            ">;",
            "Landroid/app/usage/UsageStats;",
            ")",
            "Lc/d/a/b/b;"
        }
    .end annotation

    new-instance v0, Lc/d/a/b/b;

    invoke-direct {v0}, Lc/d/a/b/b;-><init>()V

    invoke-virtual {p2}, Landroid/app/usage/UsageStats;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/d/a/b/b;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/app/usage/UsageStats;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget p1, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-virtual {v0, p1}, Lc/d/a/b/b;->a(I)V

    iget-object p1, p0, Lcom/mobiletools/systemhelper/control/f;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, p1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lc/d/a/b/b;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p2}, Landroid/app/usage/UsageStats;->getTotalTimeInForeground()J

    move-result-wide p1

    const-wide/32 v1, 0xea60

    div-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Lc/d/a/b/b;->a(J)V

    invoke-direct {p0, v0}, Lcom/mobiletools/systemhelper/control/f;->a(Lc/d/a/b/b;)V

    return-object v0
.end method

.method private a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/usage/UsageStats;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->e:Landroid/content/Context;

    const-string v1, "usagestats"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/usage/UsageStatsManager;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-wide v2, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    iget-wide v4, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/app/usage/UsageStatsManager;->queryAndAggregateUsageStats(JJ)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/usage/UsageStats;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private a(Lc/d/a/b/b;)V
    .locals 14

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->e:Landroid/content/Context;

    const-string v1, "netstats"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/usage/NetworkStatsManager;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    const-wide/16 v8, 0x400

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v13, Landroid/app/usage/NetworkStats$Bucket;

    invoke-direct {v13}, Landroid/app/usage/NetworkStats$Bucket;-><init>()V

    const/4 v2, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iget-object v3, v1, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iget-wide v4, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    iget-wide v6, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Landroid/app/usage/NetworkStatsManager;->querySummary(ILjava/lang/String;JJ)Landroid/app/usage/NetworkStats;

    move-result-object v12
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    move-wide v1, v10

    move-wide v3, v1

    :cond_0
    :try_start_1
    invoke-virtual {v12, v13}, Landroid/app/usage/NetworkStats;->getNextBucket(Landroid/app/usage/NetworkStats$Bucket;)Z

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getUid()I

    move-result v5

    invoke-virtual {p1}, Lc/d/a/b/b;->b()I

    move-result v6

    if-ne v6, v5, :cond_1

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getRxBytes()J

    move-result-wide v5

    add-long/2addr v1, v5

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getTxBytes()J

    move-result-wide v5

    add-long/2addr v3, v5

    :cond_1
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->hasNextBucket()Z

    move-result v5
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v5, :cond_0

    goto :goto_1

    :catch_0
    move-exception v5

    goto :goto_0

    :catch_1
    move-exception v5

    move-wide v1, v10

    move-wide v3, v1

    :goto_0
    invoke-virtual {v5}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_1
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->close()V

    div-long v5, v3, v8

    invoke-virtual {p1, v5, v6}, Lc/d/a/b/b;->h(J)V

    div-long v5, v1, v8

    invoke-virtual {p1, v5, v6}, Lc/d/a/b/b;->b(J)V

    add-long/2addr v3, v1

    div-long/2addr v3, v8

    invoke-virtual {p1, v3, v4}, Lc/d/a/b/b;->e(J)V

    :cond_2
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v13, Landroid/app/usage/NetworkStats$Bucket;

    invoke-direct {v13}, Landroid/app/usage/NetworkStats$Bucket;-><init>()V

    const/4 v2, 0x0

    :try_start_2
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iget-object v3, v1, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iget-wide v4, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    iget-wide v6, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Landroid/app/usage/NetworkStatsManager;->querySummary(ILjava/lang/String;JJ)Landroid/app/usage/NetworkStats;

    move-result-object v12
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_3

    move-wide v1, v10

    move-wide v3, v1

    :cond_3
    :try_start_3
    invoke-virtual {v12, v13}, Landroid/app/usage/NetworkStats;->getNextBucket(Landroid/app/usage/NetworkStats$Bucket;)Z

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getUid()I

    move-result v5

    invoke-virtual {p1}, Lc/d/a/b/b;->b()I

    move-result v6

    if-ne v6, v5, :cond_4

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getRxBytes()J

    move-result-wide v5

    add-long/2addr v1, v5

    invoke-virtual {v13}, Landroid/app/usage/NetworkStats$Bucket;->getTxBytes()J

    move-result-wide v5

    add-long/2addr v3, v5

    :cond_4
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->hasNextBucket()Z

    move-result v5
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    if-nez v5, :cond_3

    goto :goto_3

    :catch_2
    move-exception v5

    goto :goto_2

    :catch_3
    move-exception v5

    move-wide v1, v10

    move-wide v3, v1

    :goto_2
    invoke-virtual {v5}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_3
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->close()V

    div-long v5, v3, v8

    invoke-virtual {p1, v5, v6}, Lc/d/a/b/b;->i(J)V

    div-long v5, v1, v8

    invoke-virtual {p1, v5, v6}, Lc/d/a/b/b;->c(J)V

    add-long/2addr v3, v1

    div-long/2addr v3, v8

    invoke-virtual {p1, v3, v4}, Lc/d/a/b/b;->f(J)V

    :cond_5
    new-instance v8, Landroid/app/usage/NetworkStats$Bucket;

    invoke-direct {v8}, Landroid/app/usage/NetworkStats$Bucket;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_4
    iget-wide v4, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    iget-wide v6, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Landroid/app/usage/NetworkStatsManager;->querySummary(ILjava/lang/String;JJ)Landroid/app/usage/NetworkStats;

    move-result-object v12
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_5

    move-wide v0, v10

    :cond_6
    :try_start_5
    invoke-virtual {v12, v8}, Landroid/app/usage/NetworkStats;->getNextBucket(Landroid/app/usage/NetworkStats$Bucket;)Z

    invoke-virtual {v8}, Landroid/app/usage/NetworkStats$Bucket;->getUid()I

    move-result p0

    invoke-virtual {p1}, Lc/d/a/b/b;->b()I

    move-result v2

    if-ne v2, p0, :cond_7

    invoke-virtual {v8}, Landroid/app/usage/NetworkStats$Bucket;->getRxBytes()J

    move-result-wide v2

    add-long/2addr v10, v2

    invoke-virtual {v8}, Landroid/app/usage/NetworkStats$Bucket;->getTxBytes()J

    move-result-wide v2

    add-long/2addr v0, v2

    :cond_7
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->hasNextBucket()Z

    move-result p0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_4

    if-nez p0, :cond_6

    goto :goto_5

    :catch_4
    move-exception p0

    goto :goto_4

    :catch_5
    move-exception p0

    move-wide v0, v10

    :goto_4
    invoke-virtual {p0}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_5
    invoke-virtual {v12}, Landroid/app/usage/NetworkStats;->close()V

    const-wide/32 v2, 0x100000

    div-long v4, v0, v2

    invoke-virtual {p1, v4, v5}, Lc/d/a/b/b;->j(J)V

    div-long v4, v10, v2

    invoke-virtual {p1, v4, v5}, Lc/d/a/b/b;->d(J)V

    add-long/2addr v0, v10

    div-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lc/d/a/b/b;->g(J)V

    return-void
.end method

.method private b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/d/a/b/b;",
            ">;"
        }
    .end annotation

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAppUsageStatsDescend  isUserPermissionOpen :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lc/d/a/b/d;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "QueryAppInfoThread"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->d:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/f;->a()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/mobiletools/systemhelper/control/f$b;

    invoke-direct {v2, p0}, Lcom/mobiletools/systemhelper/control/f$b;-><init>(Lcom/mobiletools/systemhelper/control/f;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/usage/UsageStats;

    invoke-direct {p0, v0, v3}, Lcom/mobiletools/systemhelper/control/f;->a(Ljava/util/List;Landroid/app/usage/UsageStats;)Lc/d/a/b/b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->b:J

    sget-wide v2, Lc/d/a/b/d;->t:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/mobiletools/systemhelper/control/f;->c:J

    :cond_0
    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/f;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->f:Ljava/util/List;

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAppUsageStatsDescend  isUserPermissionOpen :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lc/d/a/b/d;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "QueryAppInfoThread"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/f;->g:Lcom/mobiletools/systemhelper/control/f$a;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/f;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/f;->h:Lcom/mobiletools/systemhelper/control/b;

    iget-object p0, p0, Lcom/mobiletools/systemhelper/control/f;->f:Ljava/util/List;

    invoke-interface {v0, v1, v2, p0}, Lcom/mobiletools/systemhelper/control/f$a;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Ljava/util/List;)V

    :cond_1
    return-void
.end method
