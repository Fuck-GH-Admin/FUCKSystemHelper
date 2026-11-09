.class public Lcom/mobiletools/systemhelper/control/SIMStateReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field private static a:Landroid/content/Context;

.field private static b:Lcom/mobiletools/systemhelper/control/SIMStateReceiver;


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

    sget-object v0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->b:Lcom/mobiletools/systemhelper/control/SIMStateReceiver;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const-string v0, "SIMStateReceiver"

    const-string v1, "SimStateReceiver cancel watch-->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->b:Lcom/mobiletools/systemhelper/control/SIMStateReceiver;

    const/4 v0, 0x0

    sput-boolean v0, Lc/d/a/b/d;->j:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    sput-object p1, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    invoke-static {}, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a()V

    const/4 p1, 0x1

    sput-boolean p1, Lc/d/a/b/d;->j:Z

    sput-object p0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->b:Lcom/mobiletools/systemhelper/control/SIMStateReceiver;

    const-string p1, "SIMStateReceiver"

    const-string v0, "SimStateReceiver startWatch-->"

    invoke-static {p1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SIM_STATE_CHANGED"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    invoke-virtual {v0, p0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    sput-object p1, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onReceive-->intent action: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SIMStateReceiver"

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean p0, Lc/d/a/b/d;->j:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    sput-boolean p0, Lc/d/a/b/d;->j:Z

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    const-string p2, "android.intent.action.SIM_STATE_CHANGED"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "phone"

    invoke-virtual {p1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SIM_STATE_CHANGED, state:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    const/4 p2, 0x1

    if-eq p0, p2, :cond_2

    const/4 p2, 0x5

    if-eq p0, p2, :cond_4

    const/4 p2, 0x6

    if-eq p0, p2, :cond_3

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lc/d/a/a/a;->f(Landroid/content/Context;)V

    :cond_2
    invoke-static {p1}, Lc/d/a/a/a;->f(Landroid/content/Context;)V

    :cond_3
    invoke-static {p1}, Lc/d/a/a/a;->f(Landroid/content/Context;)V

    :cond_4
    invoke-static {p1}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    const-string p0, "wait for sim ready for 6 minutes-->"

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    const-wide/32 p1, 0x2bf20

    invoke-static {p0, p1, p2}, Lc/d/a/b/a;->c(Landroid/content/Context;J)V

    return-void

    :cond_5
    :goto_0
    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p1}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object p0

    if-eqz p0, :cond_6

    sget-object p0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a:Landroid/content/Context;

    const-string p2, "T"

    invoke-static {p0, p2}, Lcom/mobiletools/systemhelper/control/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;

    invoke-static {p1}, Lc/d/a/a/a;->f(Landroid/content/Context;)V

    :cond_6
    return-void
.end method
