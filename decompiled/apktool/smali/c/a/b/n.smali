.class public Lc/a/b/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/n$a;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lc/a/b/c/c;

.field c:Lc/a/b/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc/a/b/i/a;Lc/a/b/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/n;->a:Landroid/content/Context;

    invoke-virtual {p2}, Lc/a/b/i/a;->b()Lc/a/b/i/a$a;

    move-result-object p1

    const-string v0, "bohrium"

    invoke-virtual {p1, v0}, Lc/a/b/i/a$a;->a(Ljava/lang/String;)Lc/a/b/i/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lc/a/b/i/a$a;->a()V

    iput-object p3, p0, Lc/a/b/n;->c:Lc/a/b/f;

    invoke-direct {p0, p2}, Lc/a/b/n;->a(Lc/a/b/i/a;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "context should not be null!!!"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc/a/b/n$a;
    .locals 6

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p0}, Lc/a/b/n;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x1

    new-instance v5, Lc/a/b/n$a;

    invoke-direct {v5}, Lc/a/b/n$a;-><init>()V

    invoke-static {v5, p0}, Lc/a/b/n$a;->a(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5, v0}, Lc/a/b/n$a;->b(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5, v2, v3}, Lc/a/b/n$a;->a(Lc/a/b/n$a;J)J

    invoke-static {v5, v4}, Lc/a/b/n$a;->a(Lc/a/b/n$a;I)I

    invoke-static {v5, p2}, Lc/a/b/n$a;->c(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5, p1}, Lc/a/b/n$a;->d(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    :catch_0
    move-exception p0

    invoke-static {p0}, Lc/a/b/k/c;->a(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object v1
.end method

.method private a(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    sget-object p0, Lc/a/b/n;->d:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p0, "123456"

    :cond_0
    return-object p0
.end method

.method private a(Lc/a/b/i/a;)V
    .locals 4

    new-instance v0, Lc/a/b/b;

    invoke-direct {v0}, Lc/a/b/b;-><init>()V

    new-instance v1, Lc/a/b/c/c;

    invoke-direct {v1, v0}, Lc/a/b/c/c;-><init>(Lc/a/b/c/c$a;)V

    new-instance v0, Lc/a/b/c/a$a;

    invoke-direct {v0}, Lc/a/b/c/a$a;-><init>()V

    iget-object v2, p0, Lc/a/b/n;->a:Landroid/content/Context;

    iput-object v2, v0, Lc/a/b/c/a$a;->a:Landroid/content/Context;

    iput-object p1, v0, Lc/a/b/c/a$a;->b:Lc/a/b/i/a;

    new-instance p1, Lc/a/b/c/a$c;

    invoke-direct {p1}, Lc/a/b/c/a$c;-><init>()V

    invoke-virtual {v1}, Lc/a/b/c/c;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/b/c/a;

    invoke-virtual {v3, v0}, Lc/a/b/c/a;->a(Lc/a/b/c/a$a;)V

    invoke-virtual {v3, p1}, Lc/a/b/c/a;->a(Lc/a/b/c/a$c;)V

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lc/a/b/n;->b:Lc/a/b/c/c;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lc/a/b/n$a;
    .locals 9

    const-string v0, ""

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "dik"

    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "cck"

    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "ctk"

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v4, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-string v6, "vsk"

    const/4 v7, 0x1

    invoke-virtual {v1, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    const-string v7, "ek"

    invoke-virtual {v1, v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "v270fk"

    const-string v8, "V"

    invoke-virtual {v1, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    new-instance v7, Lc/a/b/n$a;

    invoke-direct {v7}, Lc/a/b/n$a;-><init>()V

    invoke-static {v7, p0}, Lc/a/b/n$a;->a(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v7, v3}, Lc/a/b/n$a;->b(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v7, v4, v5}, Lc/a/b/n$a;->a(Lc/a/b/n$a;J)J

    invoke-static {v7, v6}, Lc/a/b/n$a;->a(Lc/a/b/n$a;I)I

    invoke-static {v7, v0}, Lc/a/b/n$a;->c(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v7, v1}, Lc/a/b/n$a;->d(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :catch_0
    move-exception p0

    invoke-static {p0}, Lc/a/b/k/c;->a(Ljava/lang/Throwable;)V

    :cond_1
    return-object v2
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lc/a/b/n;->d:Ljava/lang/String;

    return-void
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Lc/a/b/a/a;

    invoke-direct {v0}, Lc/a/b/a/a;-><init>()V

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lc/a/b/a/a;->a([B)[B

    move-result-object p0

    new-instance v0, Lc/a/b/k/a;

    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567="

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lc/a/b/k/a;-><init>(Ljava/lang/String;ZZ)V

    invoke-virtual {v0, p0}, Lc/a/b/k/a;->a([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const-string p0, ""

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a()Lc/a/b/n$a;
    .locals 6

    new-instance v0, Lc/a/b/c/a$d;

    invoke-direct {v0}, Lc/a/b/c/a$d;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc/a/b/c/a$d;->a:Z

    iget-object v1, p0, Lc/a/b/n;->b:Lc/a/b/c/c;

    invoke-virtual {v1}, Lc/a/b/c/c;->a()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lc/a/b/c/a;->e:Ljava/util/Comparator;

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v2, p0, Lc/a/b/n;->c:Lc/a/b/f;

    iget-object p0, p0, Lc/a/b/n;->a:Landroid/content/Context;

    invoke-virtual {v2, p0}, Lc/a/b/f;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/b/d;

    iget-boolean v3, v2, Lc/a/b/d;->d:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v3, v2, Lc/a/b/d;->c:Z

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/a/b/c/a;

    iget-object v5, v2, Lc/a/b/d;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4, v5, v0}, Lc/a/b/c/a;->a(Ljava/lang/String;Lc/a/b/c/a$d;)Lc/a/b/c/a$e;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lc/a/b/c/a$e;->a()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v4, v4, Lc/a/b/c/a$e;->a:Lc/a/b/n$a;

    if-eqz v4, :cond_3

    return-object v4

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public a(Lc/a/b/l;)Lc/a/b/n$a;
    .locals 7

    if-eqz p1, :cond_3

    new-instance p0, Lc/a/b/n$a;

    invoke-direct {p0}, Lc/a/b/n$a;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lc/a/b/n$a;->a(Lc/a/b/n$a;J)J

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lc/a/b/n$a;->a(Lc/a/b/n$a;I)I

    :try_start_0
    iget-object v1, p1, Lc/a/b/l;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lc/a/b/n$a;->d(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p1, Lc/a/b/l;->a:Ljava/lang/String;

    invoke-static {p0, v1}, Lc/a/b/n$a;->a(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p1, Lc/a/b/l;->a:Ljava/lang/String;

    invoke-static {v1}, Lc/a/b/n;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lc/a/b/n$a;->b(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lc/a/b/n$a;->g:[Ljava/lang/String;

    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-static {p0}, Lc/a/b/n$a;->a(Lc/a/b/n$a;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v1, p1, Lc/a/b/l;->b:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_2

    iget-object p1, p1, Lc/a/b/l;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lc/a/b/n$a;->c(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "arg non-nullable is expected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a(Ljava/lang/String;)Lc/a/b/n$a;
    .locals 3

    iget-object p1, p0, Lc/a/b/n;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lc/a/b/n;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "com.baidu"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lc/a/b/g/b;->a([BZ)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lc/a/b/n$a;

    invoke-direct {v0}, Lc/a/b/n$a;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lc/a/b/n$a;->a(Lc/a/b/n$a;J)J

    invoke-static {v0, p1}, Lc/a/b/n$a;->a(Lc/a/b/n$a;I)I

    invoke-static {v0, p0}, Lc/a/b/n$a;->a(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    const-string p1, "E"

    invoke-static {v0, p1}, Lc/a/b/n$a;->d(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p0}, Lc/a/b/n;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lc/a/b/n$a;->b(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    const-string p0, "RO"

    invoke-static {v0, p0}, Lc/a/b/n$a;->c(Lc/a/b/n$a;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method
