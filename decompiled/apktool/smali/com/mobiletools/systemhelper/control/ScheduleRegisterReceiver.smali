.class public Lcom/mobiletools/systemhelper/control/ScheduleRegisterReceiver;
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

    sput-object p1, Lcom/mobiletools/systemhelper/control/ScheduleRegisterReceiver;->a:Landroid/content/Context;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onReceive-->intent action: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "ScheduleRegisterReceiver"

    invoke-static {p2, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    sget-object p0, Lcom/mobiletools/systemhelper/control/ScheduleRegisterReceiver;->a:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->e(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {p1}, Lc/d/a/b/l;->g(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {p0, v0, v1, v2, v3}, Lc/d/a/b/a;->b(Landroid/content/Context;JJ)V

    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p1}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/mobiletools/systemhelper/control/ScheduleRegisterReceiver;->a:Landroid/content/Context;

    const-string p1, "S"

    invoke-static {p0, p1}, Lcom/mobiletools/systemhelper/control/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;

    :cond_0
    return-void
.end method
