.class Lc/d/a/a/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/mobiletools/systemhelper/control/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/d/a/a/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/mobiletools/systemhelper/control/b;",
            "Ljava/util/List<",
            "Lc/d/a/b/b;",
            ">;)V"
        }
    .end annotation

    invoke-static {p3}, Lc/d/a/a/n;->a(Ljava/util/List;)Ljava/util/List;

    invoke-static {}, Lc/d/a/a/n;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Lc/d/a/a/n;->a()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/d/a/b/b;

    invoke-virtual {v0}, Lc/d/a/b/b;->a()Lorg/json/JSONObject;

    move-result-object v1

    :try_start_0
    const-string v2, "pkgName"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.android"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lc/d/a/b/b;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    if-eqz p2, :cond_2

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->O:Lorg/json/JSONArray;

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result p0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "appInfolength:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p3, "DeviceManager"

    invoke-static {p3, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-boolean p0, Lc/d/a/b/d;->c:Z

    if-eqz p0, :cond_3

    sget-boolean p0, Lc/d/a/b/d;->e:Z

    if-eqz p0, :cond_3

    new-instance p0, Lcom/mobiletools/systemhelper/control/c;

    invoke-static {}, Lc/d/a/a/n;->b()Lcom/mobiletools/systemhelper/control/c$a;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/mobiletools/systemhelper/control/c;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/c$a;)V

    goto :goto_1

    :cond_3
    new-instance p0, Lcom/mobiletools/systemhelper/control/g;

    invoke-direct {p0, p1, p2}, Lcom/mobiletools/systemhelper/control/g;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method
