.class public Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field private static c:Landroid/content/Context;

.field private static d:Lcom/baidu/location/b;


# instance fields
.field a:Lc/d/a/b/n;

.field public b:Lcom/baidu/location/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Lc/d/a/b/n;

    invoke-direct {v0}, Lc/d/a/b/n;-><init>()V

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a:Lc/d/a/b/n;

    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Lc/d/a/b/n;)Ljava/lang/Boolean;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "siginfo.mncCH: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GetSignalInfoReceiver"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lc/d/a/b/n;->f:Ljava/lang/String;

    const-string v0, "460"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v1
.end method

.method private a(Landroid/content/Context;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 v0, 0x0

    const-string v1, "device_provisioned"

    invoke-static {p0, v1, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBootWizardCompleted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GetSignalInfoReceiver"

    invoke-static {v3, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "operator_service_improve_plan"

    invoke-static {p0, p1, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v1, :cond_1

    move v0, v1

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "checkUserPermission:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v0
.end method

.method private b(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 p1, 0x0

    const-string v0, "device_provisioned"

    invoke-static {p0, v0, p1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    move p1, v0

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isBootWizardCompleted: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GetSignalInfoReceiver"

    invoke-static {v0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Lcom/baidu/location/b;)V
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/baidu/location/h;->b(Z)V

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->b:Lcom/baidu/location/h;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/b;)V

    new-instance p1, Lcom/baidu/location/i;

    invoke-direct {p1}, Lcom/baidu/location/i;-><init>()V

    const-string v1, "bd09ll"

    invoke-virtual {p1, v1}, Lcom/baidu/location/i;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/baidu/location/i$b;->b:Lcom/baidu/location/i$b;

    invoke-virtual {p1, v1}, Lcom/baidu/location/i;->a(Lcom/baidu/location/i$b;)V

    invoke-virtual {p1, v0}, Lcom/baidu/location/i;->c(Z)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/baidu/location/i;->a(I)V

    invoke-virtual {p1, v0}, Lcom/baidu/location/i;->a(Z)V

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->b:Lcom/baidu/location/h;

    invoke-virtual {v0, p1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/i;)V

    iget-object p0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->b:Lcom/baidu/location/h;

    invoke-virtual {p0}, Lcom/baidu/location/h;->j()V

    const-string p0, "GetSignalInfoReceiver"

    const-string p1, "mLocationClient start!"

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    sput-object p1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    const-string p2, "ro.product.manufacturer"

    invoke-static {p2}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/baidu/location/h;->b(Z)V

    invoke-static {p1}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    const-string v0, "GetSignalInfoReceiver"

    const-string v1, "enter GetSignalInfoReceiver --->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lcom/baidu/location/h;

    sget-object v1, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/baidu/location/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->b:Lcom/baidu/location/h;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    invoke-static {p1}, Lc/d/a/b/l;->j(Landroid/content/Context;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lc/d/a/b/a;->b(Landroid/content/Context;J)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "vivo"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    invoke-direct {p0, p2}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a(Landroid/content/Context;)Z

    move-result p2

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->c:Landroid/content/Context;

    invoke-direct {p0, p2}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->b(Landroid/content/Context;)Z

    move-result p2

    :goto_0
    sput-boolean p2, Lc/d/a/b/d;->e:Z

    :cond_1
    sget-boolean p2, Lc/d/a/b/d;->e:Z

    if-nez p2, :cond_2

    return-void

    :cond_2
    new-instance p2, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;

    invoke-direct {p2, p0, p1}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver$a;-><init>(Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;Landroid/content/Context;)V

    sput-object p2, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->d:Lcom/baidu/location/b;

    invoke-virtual {p0, p2}, Lcom/mobiletools/systemhelper/control/GetSignalInfoReceiver;->a(Lcom/baidu/location/b;)V

    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p1}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
