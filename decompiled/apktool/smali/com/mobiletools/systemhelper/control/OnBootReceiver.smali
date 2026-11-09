.class public Lcom/mobiletools/systemhelper/control/OnBootReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field private static a:Landroid/content/Context;


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


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    sput-object p1, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    sget-boolean p0, Lc/d/a/b/d;->b:Z

    if-nez p0, :cond_0

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "preference_enable_log"

    invoke-static {p1, v0, p0}, Lc/d/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    sput-boolean p0, Lc/d/a/b/d;->a:Z

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onReceive-->intent action: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "OnBootReceiver"

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string p2, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "android.intent.action.QUICKBOOT_POWERON"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const-string p0, " boot delayed for 4 minutes-->"

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    const-wide/32 v0, 0x3a980

    invoke-static {p0, v0, v1}, Lc/d/a/b/a;->a(Landroid/content/Context;J)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->j(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lc/d/a/b/a;->b(Landroid/content/Context;J)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->f(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {p1}, Lc/d/a/b/l;->i(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {p0, v0, v1, v2, v3}, Lc/d/a/b/a;->c(Landroid/content/Context;JJ)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->e(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {p1}, Lc/d/a/b/l;->g(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {p0, v0, v1, v2, v3}, Lc/d/a/b/a;->b(Landroid/content/Context;JJ)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->d(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {p1}, Lc/d/a/b/l;->c(Landroid/content/Context;)J

    move-result-wide p1

    invoke-static {p0, v0, v1, p1, p2}, Lc/d/a/b/a;->a(Landroid/content/Context;JJ)V

    return-void

    :cond_2
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

    move-result-object p0

    invoke-static {v0, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;-><init>()V

    sget-object p2, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/mobiletools/systemhelper/control/SIMStateReceiver;->a(Landroid/content/Context;)V

    new-instance p0, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;-><init>()V

    sget-object p2, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/mobiletools/systemhelper/control/ConnectStateReceiver;->a(Landroid/content/Context;)V

    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p1}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object p0

    if-eqz p0, :cond_5

    const-string p0, "firstPowerOn"

    const-string p2, ""

    invoke-static {p1, p0, p2}, Lc/d/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    const-string p1, "B"

    invoke-static {p0, p1}, Lcom/mobiletools/systemhelper/control/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;

    goto :goto_1

    :cond_4
    :goto_0
    sget-object p2, Lcom/mobiletools/systemhelper/control/OnBootReceiver;->a:Landroid/content/Context;

    const-string v0, "F"

    invoke-static {p2, v0}, Lcom/mobiletools/systemhelper/control/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;

    invoke-static {p1, p0, p0}, Lc/d/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method
