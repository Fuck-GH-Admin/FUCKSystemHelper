.class public Lc/d/a/a/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/d/a/a/n$c;
    }
.end annotation


# static fields
.field public static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Lc/d/a/a/n$c;

.field private static c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/d/a/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private static d:Lcom/mobiletools/systemhelper/control/f$a;

.field private static e:Lcom/mobiletools/systemhelper/control/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/d/a/a/n$a;

    invoke-direct {v0}, Lc/d/a/a/n$a;-><init>()V

    sput-object v0, Lc/d/a/a/n;->d:Lcom/mobiletools/systemhelper/control/f$a;

    new-instance v0, Lc/d/a/a/n$b;

    invoke-direct {v0}, Lc/d/a/a/n$b;-><init>()V

    sput-object v0, Lc/d/a/a/n;->e:Lcom/mobiletools/systemhelper/control/c$a;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lc/d/a/a/n$c;
    .locals 2

    invoke-static {p0}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    sget-object p0, Lc/d/a/a/n;->b:Lc/d/a/a/n$c;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lc/d/a/b/d;->d:Landroid/content/Context;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "model is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lc/d/a/b/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p0, Lc/d/a/a/n;->a:Ljava/util/Map;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_d

    const-string v0, "Xiaomi"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lc/d/a/a/l;

    invoke-direct {p0}, Lc/d/a/a/l;-><init>()V

    goto/16 :goto_0

    :cond_1
    const-string v0, "OPPO"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p0, Lc/d/a/a/d;

    invoke-direct {p0}, Lc/d/a/a/d;-><init>()V

    goto/16 :goto_0

    :cond_2
    const-string v0, "vivo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, Lc/d/a/a/j;

    invoke-direct {p0}, Lc/d/a/a/j;-><init>()V

    goto/16 :goto_0

    :cond_3
    const-string v0, "samsung"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p0, Lc/d/a/a/h;

    invoke-direct {p0}, Lc/d/a/a/h;-><init>()V

    goto/16 :goto_0

    :cond_4
    const-string v0, "realme"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p0, Lc/d/a/a/g;

    invoke-direct {p0}, Lc/d/a/a/g;-><init>()V

    goto/16 :goto_0

    :cond_5
    const-string v0, "ZTE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p0, Lc/d/a/a/m;

    invoke-direct {p0}, Lc/d/a/a/m;-><init>()V

    goto/16 :goto_0

    :cond_6
    const-string v0, "nubia"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance p0, Lc/d/a/a/c;

    invoke-direct {p0}, Lc/d/a/a/c;-><init>()V

    goto :goto_0

    :cond_7
    const-string v0, "OnePlus"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance p0, Lc/d/a/a/e;

    invoke-direct {p0}, Lc/d/a/a/e;-><init>()V

    goto :goto_0

    :cond_8
    const-string v0, "Liantong"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance p0, Lc/d/a/a/b;

    invoke-direct {p0}, Lc/d/a/a/b;-><init>()V

    goto :goto_0

    :cond_9
    const-string v0, "TDTECH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance p0, Lc/d/a/a/i;

    invoke-direct {p0}, Lc/d/a/a/i;-><init>()V

    goto :goto_0

    :cond_a
    const-string v0, "PTAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance p0, Lc/d/a/a/f;

    invoke-direct {p0}, Lc/d/a/a/f;-><init>()V

    goto :goto_0

    :cond_b
    const-string v0, "WIKO"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_c

    new-instance p0, Lc/d/a/a/k;

    invoke-direct {p0}, Lc/d/a/a/k;-><init>()V

    goto :goto_0

    :cond_c
    new-instance p0, Lc/d/a/a/a;

    invoke-direct {p0}, Lc/d/a/a/a;-><init>()V

    goto :goto_0

    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "getReader error!! manufacture==null! model="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceManager"

    invoke-static {v0, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lc/d/a/a/a;

    invoke-direct {p0}, Lc/d/a/a/a;-><init>()V

    :goto_0
    sput-object p0, Lc/d/a/a/n;->b:Lc/d/a/a/n$c;

    sget-object p0, Lc/d/a/a/n;->b:Lc/d/a/a/n$c;

    return-object p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;
    .locals 6

    const-class v0, Lc/d/a/a/n;

    monitor-enter v0

    :try_start_0
    const-string v1, "DeviceManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter getCurDeviceInfo--RegType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/mobiletools/systemhelper/control/b;

    invoke-direct {v1}, Lcom/mobiletools/systemhelper/control/b;-><init>()V

    iput-object p1, v1, Lcom/mobiletools/systemhelper/control/b;->K:Ljava/lang/String;

    invoke-static {p0, v1}, Lc/d/a/a/n;->c(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "T"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p0, v1}, Lc/d/a/a/n;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {p0, v1}, Lc/d/a/a/n;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string p0, "DeviceManager"

    const-string p1, "SIM not changed\uff0cnot post\uff01"

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {p0, v1}, Lc/d/a/a/n;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z

    invoke-static {p0, v1}, Lc/d/a/a/n;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z

    :cond_1
    invoke-static {v1}, Lc/d/a/a/n;->a(Lcom/mobiletools/systemhelper/control/b;)V

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "A"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-boolean p1, Lc/d/a/b/d;->e:Z

    if-eqz p1, :cond_2

    new-instance p1, Lcom/mobiletools/systemhelper/control/f;

    sget-object v2, Lc/d/a/a/n;->d:Lcom/mobiletools/systemhelper/control/f$a;

    invoke-direct {p1, p0, v1, v2}, Lcom/mobiletools/systemhelper/control/f;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/f$a;)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1

    :cond_2
    const-string p1, "DeviceManager"

    const-string v2, "GlobalSetting.isUserPermissionOpen is false,type A-appinfo is not post"

    invoke-static {p1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/mobiletools/systemhelper/control/g;

    invoke-direct {p1, p0, v1}, Lcom/mobiletools/systemhelper/control/g;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "R"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string p1, "DeviceManager"

    const-string v2, "regtype R"

    invoke-static {p1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lc/d/a/b/m;->c:Ljava/lang/String;

    sget-object v2, Lc/d/a/b/m;->b:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {p0, p1, v2}, Lc/d/a/b/m;->a(Landroid/content/Context;Ljava/lang/String;I)Lc/d/a/b/m;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/a/b/m;->b()Lorg/json/JSONArray;

    move-result-object v2

    const-string v3, "DeviceManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "signalJSONArray.length() : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_5

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->P:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lc/d/a/b/m;->a()V

    invoke-virtual {p1}, Lc/d/a/b/m;->close()V

    const-string p1, "DeviceManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "signalJSONArray>>>>>:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean p1, Lc/d/a/b/d;->c:Z

    if-eqz p1, :cond_4

    sget-boolean p1, Lc/d/a/b/d;->e:Z

    if-eqz p1, :cond_4

    new-instance p1, Lcom/mobiletools/systemhelper/control/c;

    sget-object v2, Lc/d/a/a/n;->e:Lcom/mobiletools/systemhelper/control/c$a;

    invoke-direct {p1, p0, v1, v2}, Lcom/mobiletools/systemhelper/control/c;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/c$a;)V

    goto/16 :goto_0

    :cond_4
    const-string p1, "DeviceManager"

    const-string v2, "GlobalSetting.isUserPermissionOpen is false,type R-appinfo is not post"

    invoke-static {p1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/mobiletools/systemhelper/control/g;

    invoke-direct {p1, p0, v1}, Lcom/mobiletools/systemhelper/control/g;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto/16 :goto_0

    :cond_5
    const-string p0, "DeviceManager"

    const-string p1, "deviceinfo.siginfo \u4e3a\u7a7a\uff01 "

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "B"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "F"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "S"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v2, "T"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_7
    sget-boolean p1, Lc/d/a/b/d;->c:Z

    if-eqz p1, :cond_8

    sget-boolean p1, Lc/d/a/b/d;->e:Z

    if-eqz p1, :cond_8

    new-instance p1, Lcom/mobiletools/systemhelper/control/c;

    sget-object v2, Lc/d/a/a/n;->e:Lcom/mobiletools/systemhelper/control/c$a;

    invoke-direct {p1, p0, v1, v2}, Lcom/mobiletools/systemhelper/control/c;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/c$a;)V

    goto/16 :goto_0

    :cond_8
    const-string p1, "DeviceManager"

    const-string v2, "GlobalSetting.isUserPermissionOpen is false,B/F/S/Tdeviceinfo is not post"

    invoke-static {p1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/mobiletools/systemhelper/control/g;

    invoke-direct {p1, p0, v1}, Lcom/mobiletools/systemhelper/control/g;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    :cond_9
    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Lc/d/a/a/n;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    sput-object p0, Lc/d/a/a/n;->c:Ljava/util/List;

    return-object p0
.end method

.method private static declared-synchronized a(Lcom/mobiletools/systemhelper/control/b;)V
    .locals 14

    const-class v0, Lc/d/a/a/n;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_1

    new-instance v1, Lcom/mobiletools/systemhelper/control/b;

    invoke-direct {v1}, Lcom/mobiletools/systemhelper/control/b;-><init>()V

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->k:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->k:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    iput-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    iget-object v3, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iput-object v3, v1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iget-object v4, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iput-object v4, v1, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iget-object v5, p0, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iput-object v5, v1, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iget-object v6, p0, Lcom/mobiletools/systemhelper/control/b;->w:Ljava/lang/String;

    iput-object v6, v1, Lcom/mobiletools/systemhelper/control/b;->w:Ljava/lang/String;

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iput-object v7, v1, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iget-object v8, p0, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iput-object v8, v1, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iget-object v9, p0, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iput-object v9, v1, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iget-object v10, p0, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iput-object v10, v1, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iget-object v11, p0, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    iput-object v11, v1, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    iget-object v12, p0, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    iput-object v12, v1, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    iget-object v13, p0, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    iput-object v13, v1, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    iput-object v3, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v4, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v5, p0, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v6, p0, Lcom/mobiletools/systemhelper/control/b;->k:Ljava/lang/String;

    iput-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v8, p0, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v9, p0, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v10, p0, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v11, p0, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iput-object v12, p0, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iput-object v13, p0, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->k:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->w:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    iget-object v2, v1, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iput-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    iget-object v1, v1, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "2"

    :goto_0
    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    const-string v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "1"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    :goto_1
    :try_start_1
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    const/4 v2, 0x6

    const/4 v3, 0x5

    const/16 v4, 0xa

    const/4 v5, 0x0

    const/16 v6, 0xb

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v3, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v2, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/l;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_2

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v7, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "**********"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-virtual {v7, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "*****"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v7, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "**********"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    invoke-virtual {v7, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "*****"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    :goto_3
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    :cond_5
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v3, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v2, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/l;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_6

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "**********"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "*****"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_4
    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "**********"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    goto :goto_5

    :cond_7
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "*****"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_8
    :goto_5
    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    invoke-static {v1}, Lc/d/a/b/i;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :catch_0
    move-exception p0

    :try_start_2
    const-string v1, "DeviceManager"

    const-string v2, "exception === sortAndAnonymousSubscriber"

    invoke-static {v1, v2}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_9
    :goto_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z
    .locals 6

    const-class v0, Lc/d/a/a/n;

    monitor-enter v0

    :try_start_0
    const-string v1, "iccid1"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Lc/d/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "DeviceManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SIM1 Changed,old iccid:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", new iccid:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "iccid1"

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-static {p0, v1, p1}, Lc/d/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "DeviceManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SIM1 Changed,old iccid:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", new iccid:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "iccid1"

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    invoke-static {p0, v1, p1}, Lc/d/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :cond_1
    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic b()Lcom/mobiletools/systemhelper/control/c$a;
    .locals 1

    sget-object v0, Lc/d/a/a/n;->e:Lcom/mobiletools/systemhelper/control/c$a;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-static {p0}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-interface {v1, p0}, Lc/d/a/a/n$c;->a(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static declared-synchronized b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)Z
    .locals 6

    const-class v0, Lc/d/a/a/n;

    monitor-enter v0

    :try_start_0
    const-string v1, "iccid2"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Lc/d/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "DeviceManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SIM2 Changed,old iccid:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", new iccid:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "iccid2"

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-static {p0, v1, p1}, Lc/d/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "DeviceManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SIM2 Changed,old iccid:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", new iccid:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "iccid2"

    iget-object p1, p1, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    invoke-static {p0, v1, p1}, Lc/d/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :cond_1
    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p0}, Lc/d/a/a/n;->b(Landroid/content/Context;)Z

    move-result p0

    goto :goto_0
.end method

.method public static c()V
    .locals 4

    sget-object v0, Lc/d/a/a/n;->a:Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lc/d/a/a/n;->a:Ljava/util/Map;

    const-string v0, "ro.product.manufacturer"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "manufacturer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DeviceManager"

    invoke-static {v2, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "vivo"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "samsung"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "realme"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Xiaomi"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "OPPO"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Liantong"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "OnePlus"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "TDTECH"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "nubia"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "PTAC"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ZTE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v3, "WIKO"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "model: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lc/d/a/a/n;->a:Ljava/util/Map;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private static declared-synchronized c(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 4

    const-class v0, Lc/d/a/a/n;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, p1, Lcom/mobiletools/systemhelper/control/b;->M:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    :goto_0
    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p0}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1, p0, p1}, Lc/d/a/a/n$c;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v1}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p0}, Lc/d/a/b/l;->k(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Lc/d/a/b/l;->l(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "Mobile"

    :goto_1
    iput-object p0, p1, Lcom/mobiletools/systemhelper/control/b;->F:Ljava/lang/String;

    goto :goto_2

    :cond_0
    const-string p0, "WiFi"

    goto :goto_1

    :cond_1
    const-string p0, "Disconnected"

    goto :goto_1

    :cond_2
    :goto_2
    invoke-static {}, Lc/d/a/b/l;->a()Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Lcom/mobiletools/systemhelper/control/b;->N:Ljava/lang/String;

    const-string p0, "DeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDeviceInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mobiletools/systemhelper/control/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :cond_3
    :try_start_2
    const-string p0, "DeviceManager"

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "manuf==null,model="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw p0
.end method
