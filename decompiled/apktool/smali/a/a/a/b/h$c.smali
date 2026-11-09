.class public La/a/a/b/h$c;
.super La/a/a/i/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/h$c$b;
    }
.end annotation


# instance fields
.field public i:Ljava/lang/String;

.field public j:Landroid/location/LocationManager;

.field public k:La/a/a/b/h$c$b;

.field public l:Z

.field public final synthetic m:La/a/a/b/h;


# direct methods
.method public constructor <init>(La/a/a/b/h;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-direct {p0}, La/a/a/i/g;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/b/h$c;->l:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La/a/a/i/g;->d:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(La/a/a/b/h$c;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/b/h$c;->c()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v0}, La/a/a/b/h;->a(La/a/a/b/h;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v0}, La/a/a/b/h;->b(La/a/a/b/h;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v5}, La/a/a/b/h;->a(La/a/a/b/h;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    iget-object v5, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v5}, La/a/a/b/h;->b(La/a/a/b/h;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    const-string v5, "&ki=%s&sn=%s"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "&enc=2"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/baidu/location/Jni;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    iput-object v3, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    iget-object v3, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v4, "bloc"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "%d"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    const-string v1, "trtm"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Lcom/baidu/location/c;)V
    .locals 4

    const-string v0, ";"

    :try_start_0
    invoke-virtual {p1}, Lcom/baidu/location/c;->G()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->c()Lcom/baidu/location/a;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v2, p1, Lcom/baidu/location/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, Lcom/baidu/location/a;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p1, Lcom/baidu/location/a;->k:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p0}, La/a/a/b/h;->f(La/a/a/b/h;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, La/a/a/b/r;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "FirstLocAddr"

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 5

    const-string v0, ";"

    const-string v1, "enc"

    const/16 v2, 0x3f

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    if-eqz p1, :cond_5

    :try_start_0
    const-string v3, "\"enc\""

    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v3, :cond_0

    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La/a/a/b/n;->b()La/a/a/b/n;

    move-result-object v3

    invoke-virtual {v3, v1}, La/a/a/b/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :cond_0
    :goto_0
    :try_start_3
    new-instance v1, Lcom/baidu/location/c;

    invoke-direct {v1, p1}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v3, p1}, La/a/a/b/h;->a(La/a/a/b/h;Ljava/lang/String;)V

    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1}, La/a/a/b/h;->c(La/a/a/b/h;)Lcom/baidu/location/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/location/i;->i()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, v1}, La/a/a/b/h$c;->a(Lcom/baidu/location/c;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    :try_start_4
    new-instance v1, Lcom/baidu/location/c;

    invoke-direct {v1}, Lcom/baidu/location/c;-><init>()V

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->h(I)V

    :cond_1
    :goto_1
    invoke-virtual {v1}, Lcom/baidu/location/c;->r()I

    move-result p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const/16 v3, 0xa1

    if-ne p1, v3, :cond_4

    const-string p1, "wgs84"

    :try_start_5
    invoke-virtual {v1}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1}, La/a/a/b/h;->c(La/a/a/b/h;)Lcom/baidu/location/i;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v3, "bd09"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "wgs84mc"

    :goto_2
    invoke-virtual {v1, p1}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1}, La/a/a/b/h;->c(La/a/a/b/h;)Lcom/baidu/location/i;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    goto :goto_2

    :cond_3
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    iget-object v3, v3, La/a/a/b/h;->l:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    iget-object v3, v3, La/a/a/b/h;->m:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/baidu/location/c;->C()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/baidu/location/Jni;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/baidu/location/c;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v0, p1, p1}, Lcom/baidu/location/c;->a(FFLjava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a/a/b/h;->a(La/a/a/b/h;Z)Z

    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1}, La/a/a/b/h;->d(La/a/a/b/h;)La/a/a/b/h$b;

    move-result-object p1

    invoke-interface {p1, v1}, La/a/a/b/h$b;->a(Lcom/baidu/location/c;)V

    goto :goto_4

    :cond_4
    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-virtual {v1}, Lcom/baidu/location/c;->r()I

    move-result v0

    invoke-static {p1, v0}, La/a/a/b/h;->a(La/a/a/b/h;I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_4

    :catch_2
    move-exception p1

    iget-object v0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v0, v2}, La/a/a/b/h;->a(La/a/a/b/h;I)V

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_4

    :cond_5
    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1, v2}, La/a/a/b/h;->a(La/a/a/b/h;I)V

    :goto_4
    iget-object p0, p0, La/a/a/i/g;->d:Ljava/util/Map;

    if-eqz p0, :cond_6

    invoke-interface {p0}, Ljava/util/Map;->clear()V

    :cond_6
    return-void
.end method

.method public final b()V
    .locals 8

    :try_start_0
    iget-object v0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {v0}, La/a/a/b/h;->f(La/a/a/b/h;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/location/LocationManager;

    iput-object v1, p0, La/a/a/b/h$c;->j:Landroid/location/LocationManager;

    new-instance v6, La/a/a/b/h$c$b;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v0}, La/a/a/b/h$c$b;-><init>(La/a/a/b/h$c;La/a/a/b/h$a;)V

    iput-object v6, p0, La/a/a/b/h$c;->k:La/a/a/b/h$c$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const-string v2, "network"

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    :try_start_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/SecurityException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :cond_0
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, La/a/a/b/h$c;->k:La/a/a/b/h$c$b;

    if-eqz v0, :cond_0

    iget-object p0, p0, La/a/a/b/h$c;->j:Landroid/location/LocationManager;

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, La/a/a/b/h$c;->i:Ljava/lang/String;

    sget-object p1, La/a/a/i/d;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Ljava/lang/String;)V

    iget-object p1, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p1}, La/a/a/b/h;->e(La/a/a/b/h;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, La/a/a/b/h$c;->b()V

    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    new-instance v0, La/a/a/b/h$c$a;

    invoke-direct {v0, p0, p1}, La/a/a/b/h$c$a;-><init>(La/a/a/b/h$c;Ljava/util/Timer;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    iget-object p0, p0, La/a/a/b/h$c;->m:La/a/a/b/h;

    invoke-static {p0}, La/a/a/b/h;->f(La/a/a/b/h;)Landroid/content/Context;

    move-result-object p0

    const/4 p1, 0x0

    const-string v0, "cuidRelate"

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string p1, "reqtime"

    invoke-interface {p0, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method
