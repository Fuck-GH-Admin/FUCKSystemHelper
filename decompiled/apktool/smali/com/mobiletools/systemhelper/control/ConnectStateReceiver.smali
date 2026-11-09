.class public Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field private static a:Landroid/content/Context;

.field private static b:Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 2

    sget-object v0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->b:Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const-string v0, "ConnectStateReceiver"

    const-string v1, "ConnectStateReceiver cancel watch-->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->b:Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;

    const/4 v0, 0x0

    sput-boolean v0, Lc/d/a/b/d;->k:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    sput-object p1, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a:Landroid/content/Context;

    invoke-static {}, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a()V

    const/4 p1, 0x1

    sput-boolean p1, Lc/d/a/b/d;->k:Z

    sput-object p0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->b:Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;

    const-string p1, "ConnectStateReceiver"

    const-string v0, "ConnectStateReceiver startWatch-->"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a:Landroid/content/Context;

    invoke-virtual {v0, p0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    sput-object p1, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a:Landroid/content/Context;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "onReceive-->intent action: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ConnectStateReceiver"

    invoke-static {p1, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean p0, Lc/d/a/b/d;->k:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    sput-boolean p0, Lc/d/a/b/d;->k:Z

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a:Landroid/content/Context;

    invoke-static {p0}, Lc/d/a/b/l;->k(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "NetWork disconnected"

    goto :goto_0

    :cond_1
    const-string p0, "NetWork connected"

    :goto_0
    invoke-static {p1, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
