.class public Lcom/mobiletools/systemhelper/control/g;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/mobiletools/systemhelper/control/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->c:Lcom/mobiletools/systemhelper/control/b;

    iput-object p1, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/mobiletools/systemhelper/control/g;->c:Lcom/mobiletools/systemhelper/control/b;

    return-void
.end method

.method private a(Z)V
    .locals 0

    return-void
.end method

.method private declared-synchronized a(Lcom/mobiletools/systemhelper/control/b;)Z
    .locals 7

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lc/d/a/b/d;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RegisterThread"

    const-string v0, "isUserPermissionOpen is false!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/mobiletools/systemhelper/control/b;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "RegisterThread"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "register postString\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v0}, Lc/d/a/b/c;->a(Ljava/lang/String;)[B

    move-result-object v2

    iget-object v3, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-static {v3, v2}, Lc/d/a/b/c;->a(Landroid/content/Context;[B)[B

    move-result-object v3

    invoke-static {v3}, Lc/d/a/b/c;->a([B)Ljava/lang/String;

    move-result-object v3

    const-string v4, "utf-8"

    invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p1, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    const-string v5, "utf-8"

    invoke-static {v4, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    const-string v5, "utf-8"

    invoke-static {p1, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-static {v6}, Lc/d/a/b/l;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "?ver="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "5.0"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "&model="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&manuf="

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&sign="

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2}, Lc/d/a/b/c;->a(Ljava/lang/String;[B)[B

    move-result-object v0

    const-string v3, "RegisterThread"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RSA\u52a0\u5bc6\u5bc6\u6587\uff1a "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "RegisterThread"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AES\u52a0\u5bc6\u5bc6\u6587\uff1a "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v3, Lc/d/a/b/f;

    invoke-direct {v3}, Lc/d/a/b/f;-><init>()V

    invoke-virtual {v3, p1, v0, v2}, Lc/d/a/b/f;->a(Ljava/lang/String;[B[B)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v3}, Lc/d/a/b/f;->a()I

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v1, 0x1a0

    if-ne v0, v1, :cond_1

    const/4 p1, 0x1

    :cond_1
    move v1, p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_4
    const-string v0, "RegisterThread"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendPOSTRequest exception--->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    monitor-exit p0

    return v1

    :catch_1
    move-exception p1

    :try_start_5
    const-string v0, "RegisterThread"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doEncrpytPost catch exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Lcom/mobiletools/systemhelper/control/b;)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lc/d/a/b/d;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RegisterThread"

    const-string v0, "isUserPermissionOpen is false!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_0
    if-nez p1, :cond_1

    :try_start_1
    const-string p1, "RegisterThread"

    const-string v0, "deviceInfo is null! "

    invoke-static {p1, v0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :cond_1
    :try_start_2
    invoke-static {p1}, Lc/d/a/b/l;->a(Lcom/mobiletools/systemhelper/control/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "RegisterThread"

    const-string v0, "mnc is not in china!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v1

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lc/d/a/b/l;->k(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "RegisterThread"

    const-string v2, "network connected!"

    invoke-static {v0, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lc/d/a/b/l;->l(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lc/d/a/b/l;->a(Lcom/mobiletools/systemhelper/control/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lc/d/a/a/n;->c(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Lc/d/a/b/l;->b(Lcom/mobiletools/systemhelper/control/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const-string v0, "RegisterThread"

    const-string v2, "is unicomnetwork || is wifi connected!"

    invoke-static {v0, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/mobiletools/systemhelper/control/g;->a(Lcom/mobiletools/systemhelper/control/b;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance p1, Lcom/mobiletools/systemhelper/control/e;

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/mobiletools/systemhelper/control/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :cond_5
    :try_start_4
    invoke-static {p1}, Lc/d/a/b/l;->a(Lcom/mobiletools/systemhelper/control/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v0, :cond_7

    monitor-exit p0

    return v1

    :cond_6
    :try_start_5
    invoke-static {p1}, Lc/d/a/b/l;->a(Lcom/mobiletools/systemhelper/control/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v0, :cond_7

    monitor-exit p0

    return v1

    :cond_7
    :try_start_6
    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->b:Landroid/content/Context;

    sget-object v2, Lc/d/a/b/e;->c:Ljava/lang/String;

    sget-object v3, Lc/d/a/b/e;->b:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v0, v2, v3}, Lc/d/a/b/e;->a(Landroid/content/Context;Ljava/lang/String;I)Lc/d/a/b/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mobiletools/systemhelper/control/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/d/a/b/e;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc/d/a/b/e;->close()V

    const-string p1, "RegisterThread"

    const-string v0, "sava to database!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "RegisterThread"

    const-string v0, "Not post!"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public run()V
    .locals 1

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/g;->c:Lcom/mobiletools/systemhelper/control/b;

    invoke-direct {p0, v0}, Lcom/mobiletools/systemhelper/control/g;->b(Lcom/mobiletools/systemhelper/control/b;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/mobiletools/systemhelper/control/g;->a(Z)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "GlobalSetting.isUserPermissionOpen is "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "RegisterThread"

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
