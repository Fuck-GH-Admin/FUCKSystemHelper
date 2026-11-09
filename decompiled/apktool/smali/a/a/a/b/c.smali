.class public La/a/a/b/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/c$b;,
        La/a/a/b/c$c;
    }
.end annotation


# static fields
.field public static i:J


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/a/a/b/c$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Z

.field public d:Lcom/baidu/location/c;

.field public e:Lcom/baidu/location/c;

.field public f:Ljava/lang/Object;

.field public g:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/b/c;->b:Z

    iput-boolean v1, p0, La/a/a/b/c;->c:Z

    iput-object v0, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    iput-object v0, p0, La/a/a/b/c;->e:Lcom/baidu/location/c;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    iput-boolean v1, p0, La/a/a/b/c;->h:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    new-instance v0, Landroid/util/LruCache;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, La/a/a/b/c;->g:Landroid/util/LruCache;

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v0

    const-string v2, ""

    const-string v3, "sp_loc_map_end_str"

    invoke-virtual {v0, v3, v2}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v0

    const-string v3, "sp_loc_navi_end_str"

    invoke-virtual {v0, v3, v2}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v0

    const-string v3, "sp_loc_last_navi_end_str"

    invoke-virtual {v0, v3, v2}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v0

    const-string v3, "sp_bluetooth_info"

    invoke-virtual {v0, v3, v2}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v3, p0, La/a/a/b/c;->g:Landroid/util/LruCache;

    const-string v4, "mac"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(La/a/a/b/c$a;)V
    .locals 0

    invoke-direct {p0}, La/a/a/b/c;-><init>()V

    return-void
.end method

.method public static h()La/a/a/b/c;
    .locals 1

    invoke-static {}, La/a/a/b/c$c;->a()La/a/a/b/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Messenger;)La/a/a/b/c$b;
    .locals 4

    iget-object v0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/b/c$b;

    iget-object v3, v2, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    invoke-virtual {v3, p1}, Landroid/os/Messenger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v0

    return-object v2

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object v1
.end method

.method public final a()V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v2, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x1

    move v4, v0

    :cond_0
    :goto_0
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/a/a/b/c$b;

    iget-object v5, v5, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v6, v5, Lcom/baidu/location/i;->c:Z

    if-eqz v6, :cond_1

    move v0, v3

    :cond_1
    iget-boolean v5, v5, Lcom/baidu/location/i;->h:Z

    if-eqz v5, :cond_0

    move v4, v3

    goto :goto_0

    :cond_2
    monitor-exit v1

    goto :goto_3

    :catchall_0
    move-exception v2

    move v4, v0

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v1

    move v4, v0

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    sput-boolean v4, La/a/a/i/i;->a:Z

    iget-boolean v1, p0, La/a/a/b/c;->b:Z

    if-ne v1, v0, :cond_3

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/d;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, p0, La/a/a/b/c;->b:Z

    if-eqz v1, :cond_4

    :cond_3
    iput-boolean v0, p0, La/a/a/b/c;->b:Z

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    iget-boolean p0, p0, La/a/a/b/c;->b:Z

    invoke-virtual {v0, p0}, La/a/a/g/d;->a(Z)V

    :cond_4
    return-void
.end method

.method public final a(La/a/a/b/c$b;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    invoke-virtual {p0, v1}, La/a/a/b/c;->a(Landroid/os/Messenger;)La/a/a/b/c$b;

    move-result-object v1

    if-eqz v1, :cond_1

    const/16 p0, 0xe

    invoke-static {p1, p0}, La/a/a/b/c$b;->a(La/a/a/b/c$b;I)V

    goto :goto_0

    :cond_1
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 p0, 0xd

    invoke-static {p1, p0}, La/a/a/b/c$b;->a(La/a/a/b/c$b;I)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public a(Landroid/os/Bundle;I)V
    .locals 3

    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/b/c$b;

    invoke-static {v1, p2, p1}, La/a/a/b/c$b;->a(La/a/a/b/c$b;ILandroid/os/Bundle;)V

    iget v1, v1, La/a/a/b/c$b;->d:I

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :cond_1
    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public a(Lcom/baidu/location/c;)V
    .locals 4

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/b/o;->a(Lcom/baidu/location/c;)Lcom/baidu/location/a;

    move-result-object v0

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/b/o;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/o;->i()Ljava/util/List;

    move-result-object v2

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/b/o;->j()Lcom/baidu/location/k;

    move-result-object v3

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {p1, v2}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {p1, v3}, Lcom/baidu/location/c;->a(Lcom/baidu/location/k;)V

    :cond_3
    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/location/c;->f(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/baidu/location/c;->a(Z)V

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baidu/location/c;->c(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0, p1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/o;->d(Lcom/baidu/location/c;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    new-instance p0, Landroid/content/Intent;

    const-string v0, "com.baidu.location.flp.log"

    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.baidu.baidulocationdemo"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "data"

    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object p1, La/a/a/i/b;->f:Ljava/lang/String;

    const-string v0, "pack"

    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "tag"

    const-string v0, "state"

    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    return-void
.end method

.method public a(Landroid/os/Message;)Z
    .locals 8

    iget-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {p0, v0}, La/a/a/b/c;->a(Landroid/os/Messenger;)La/a/a/b/c$b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v3, v2, Lcom/baidu/location/i;->d:I

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    iget-object v5, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v5, v5, Lcom/baidu/location/i;->d:I

    const-string v6, "scanSpan"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v2, Lcom/baidu/location/i;->d:I

    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v2, v2, Lcom/baidu/location/i;->d:I

    const/16 v4, 0x3e8

    if-ge v2, v4, :cond_1

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/t;->d()V

    :cond_1
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v5, v2, Lcom/baidu/location/i;->d:I

    const/16 v6, 0x3e7

    const/4 v7, 0x1

    if-le v5, v6, :cond_6

    if-ge v3, v4, :cond_6

    iget-boolean v3, v2, Lcom/baidu/location/i;->n:Z

    if-nez v3, :cond_2

    iget-boolean v2, v2, Lcom/baidu/location/i;->s:Z

    if-eqz v2, :cond_3

    :cond_2
    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v2

    iget-object v3, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v3, v3, Lcom/baidu/location/i;->n:Z

    invoke-virtual {v2, v3}, La/a/a/b/t;->b(Z)V

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/t;->c()V

    :cond_3
    iget-boolean v2, p0, La/a/a/b/c;->c:Z

    if-nez v2, :cond_4

    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v2, v2, Lcom/baidu/location/i;->s:Z

    if-eqz v2, :cond_5

    :cond_4
    move v1, v7

    :cond_5
    iput-boolean v1, p0, La/a/a/b/c;->c:Z

    move v1, v7

    :cond_6
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v4, v4, Lcom/baidu/location/i;->c:Z

    const-string v5, "openGPS"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/baidu/location/i;->c:Z

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "coorType"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    const-string v4, ""

    if-eqz v2, :cond_7

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->a:Ljava/lang/String;

    :goto_0
    iput-object v2, v3, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "addrType"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    if-eqz v2, :cond_8

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_1

    :cond_8
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->b:Ljava/lang/String;

    :goto_1
    iput-object v2, v3, Lcom/baidu/location/i;->b:Ljava/lang/String;

    sget-object v2, La/a/a/i/i;->d:Ljava/lang/String;

    iget-object v3, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v3, v3, Lcom/baidu/location/i;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/o;->c()V

    :cond_9
    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v4, v4, Lcom/baidu/location/i;->e:I

    const-string v5, "timeOut"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v2, Lcom/baidu/location/i;->e:I

    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v4, v4, Lcom/baidu/location/i;->h:Z

    const-string v5, "location_change_notify"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/baidu/location/i;->h:Z

    iget-object v2, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v4, v4, Lcom/baidu/location/i;->g:I

    const-string v5, "priority"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v2, Lcom/baidu/location/i;->g:I

    iget-object v0, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v0, v0, Lcom/baidu/location/i;->g:I

    sput v0, La/a/a/i/i;->e:I

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const v0, 0x7fffffff

    const-string v2, "wifitimeout"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    sget v0, La/a/a/i/i;->a0:I

    if-ge p1, v0, :cond_a

    sput p1, La/a/a/i/i;->a0:I

    :cond_a
    invoke-virtual {p0}, La/a/a/b/c;->b()V

    return v1
.end method

.method public b(Landroid/os/Message;)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Landroid/os/Messenger;)La/a/a/b/c$b;

    move-result-object p0

    if-eqz p0, :cond_2

    iget-object p0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget p0, La/a/a/i/i;->e:I

    return p0

    :cond_2
    :goto_0
    return v0
.end method

.method public final b()V
    .locals 0

    invoke-virtual {p0}, La/a/a/b/c;->a()V

    invoke-virtual {p0}, La/a/a/b/c;->e()V

    invoke-virtual {p0}, La/a/a/b/c;->g()V

    return-void
.end method

.method public b(Lcom/baidu/location/c;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Lcom/baidu/location/c;)V

    return-void
.end method

.method public c(Landroid/os/Message;)I
    .locals 1

    const/16 v0, 0x3e8

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Landroid/os/Messenger;)La/a/a/b/c$b;

    move-result-object p0

    if-eqz p0, :cond_2

    iget-object p0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    iget p0, p0, Lcom/baidu/location/i;->d:I

    return p0

    :cond_2
    :goto_0
    return v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    invoke-virtual {p0}, La/a/a/b/c;->b()V

    return-void

    :catchall_1
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public c(Lcom/baidu/location/c;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/c;->d(Lcom/baidu/location/c;)V

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-object v1, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-string v2, ":"

    const-string v3, "&prod="

    if-eqz v1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/a/a/b/c$b;

    iget-object v4, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v4, v4, Lcom/baidu/location/i;->f:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    iget-object v4, p0, La/a/a/b/c$b;->a:Ljava/lang/String;

    if-eqz v4, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p0, p0, La/a/a/b/c$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, "|"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    if-eqz v1, :cond_3

    const-string p0, ""

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, La/a/a/i/b;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public d(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, La/a/a/b/c;->i:J

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->r()V

    new-instance v0, La/a/a/b/c$b;

    invoke-direct {v0, p0, p1}, La/a/a/b/c$b;-><init>(La/a/a/b/c;Landroid/os/Message;)V

    invoke-virtual {p0, v0}, La/a/a/b/c;->a(La/a/a/b/c$b;)V

    invoke-virtual {p0}, La/a/a/b/c;->b()V

    iget-boolean p1, p0, La/a/a/b/c;->h:Z

    if-eqz p1, :cond_1

    const-string p1, "start"

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Lcom/baidu/location/c;)V
    .locals 13

    const/4 v0, 0x4

    const/16 v1, 0x42

    const/4 v2, 0x0

    const/16 v3, 0x3d

    const/16 v4, 0xa1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-ne v5, v4, :cond_3

    invoke-static {}, La/a/a/a/a;->b()La/a/a/a/a;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/a/a;->a()Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, p0, La/a/a/b/c;->e:Lcom/baidu/location/c;

    if-nez v5, :cond_0

    new-instance v5, Lcom/baidu/location/c;

    invoke-direct {v5}, Lcom/baidu/location/c;-><init>()V

    iput-object v5, p0, La/a/a/b/c;->e:Lcom/baidu/location/c;

    const/16 v6, 0x1f9

    invoke-virtual {v5, v6}, Lcom/baidu/location/c;->h(I)V

    :cond_0
    iget-object v5, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    iget-object v6, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    :try_start_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/a/a/b/c$b;

    iget-object v8, p0, La/a/a/b/c;->e:Lcom/baidu/location/c;

    invoke-virtual {v7, v8}, La/a/a/b/c$b;->a(Lcom/baidu/location/c;)V

    iget v7, v7, La/a/a/b/c$b;->d:I

    if-le v7, v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :cond_2
    :try_start_2
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception p0

    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_3
    invoke-virtual {p1}, Lcom/baidu/location/c;->H()Z

    move-result v5

    if-nez v5, :cond_5

    iget-boolean v5, p0, La/a/a/b/c;->c:Z

    if-eqz v5, :cond_5

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-eq v5, v4, :cond_4

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-ne v5, v1, :cond_5

    :cond_4
    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    move-result-object v5

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v6

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, La/a/a/c/a;->a(DD)[D

    move-result-object v5

    aget-wide v5, v5, v2

    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    const-wide v7, 0x40c3878000000000L    # 9999.0

    cmpg-double v7, v5, v7

    if-gez v7, :cond_5

    invoke-virtual {p1, v5, v6}, Lcom/baidu/location/c;->a(D)V

    :cond_5
    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-ne v5, v3, :cond_6

    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    move-result-object v5

    invoke-virtual {v5, p1}, La/a/a/c/a;->a(Lcom/baidu/location/c;)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/baidu/location/c;->a(I)V

    :cond_6
    iget-object v5, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v5

    :try_start_3
    iget-object v6, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :goto_1
    :try_start_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La/a/a/b/c$b;

    invoke-virtual {v7, p1}, La/a/a/b/c$b;->a(Lcom/baidu/location/c;)V

    iget v7, v7, La/a/a/b/c$b;->d:I

    if-le v7, v0, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catch_1
    :cond_8
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_2
    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    if-eq v0, v3, :cond_9

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    if-eq v0, v4, :cond_9

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    if-ne v0, v1, :cond_a

    :cond_9
    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-virtual {v0, v5, v6, v7, v8}, La/a/a/b/d;->a(DD)V

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/baidu/location/c;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, La/a/a/b/d;->c(Ljava/lang/String;)V

    :cond_a
    sget-boolean v0, La/a/a/b/o;->a0:Z

    if-eqz v0, :cond_b

    sput-boolean v2, La/a/a/b/o;->a0:Z

    :cond_b
    sget v5, La/a/a/i/i;->T:I

    const/16 v6, 0x2710

    if-lt v5, v6, :cond_f

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-eq v5, v3, :cond_c

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v3

    if-eq v3, v4, :cond_c

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v3

    if-ne v3, v1, :cond_f

    :cond_c
    iget-object v1, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    if-eqz v1, :cond_e

    const/4 v3, 0x1

    new-array v3, v3, [F

    invoke-virtual {v1}, Lcom/baidu/location/c;->q()D

    move-result-wide v4

    iget-object v1, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    invoke-virtual {v1}, Lcom/baidu/location/c;->t()D

    move-result-wide v6

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v10

    move-object v12, v3

    invoke-static/range {v4 .. v12}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v1, v3, v2

    sget v2, La/a/a/i/i;->V:I

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_d

    if-nez v0, :cond_d

    return-void

    :cond_d
    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    goto :goto_3

    :cond_e
    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    :goto_3
    iput-object v0, p0, La/a/a/b/c;->d:Lcom/baidu/location/c;

    :cond_f
    return-void

    :catchall_1
    move-exception p0

    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p0
.end method

.method public e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/b/c$b;

    invoke-virtual {v1}, La/a/a/b/c$b;->a()V

    goto :goto_0

    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public e(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Landroid/os/Messenger;)La/a/a/b/c$b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/t;->d()V

    invoke-virtual {p0}, La/a/a/b/c;->b()V

    iget-boolean p1, p0, La/a/a/b/c;->h:Z

    if-eqz p1, :cond_1

    const-string p1, "stop"

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Ljava/lang/String;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, La/a/a/b/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/b/c$b;

    invoke-virtual {v1}, La/a/a/b/c$b;->b()V

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final g()V
    .locals 2

    :try_start_0
    iget-object p0, p0, La/a/a/b/c;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/b/c$b;

    sget v1, La/a/a/i/i;->e:I

    iget-object v0, v0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget v0, v0, Lcom/baidu/location/i;->g:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, La/a/a/i/i;->e:I

    goto :goto_0

    :cond_0
    sget-boolean p0, Lcom/baidu/location/f;->f:Z

    if-nez p0, :cond_1

    const/4 p0, 0x4

    sput p0, La/a/a/i/i;->e:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method
