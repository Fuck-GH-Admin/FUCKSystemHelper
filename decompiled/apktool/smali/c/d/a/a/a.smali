.class public Lc/d/a/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/d/a/a/n$c;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "persist.vendor.radio.5g_mode_pref"

    const-string v1, "0"

    invoke-static {v0, v1}, Lc/d/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/d/a/a/a;->a:Ljava/lang/String;

    const-string v0, "persist.radio.vivo.fiveg"

    const-string v1, "false"

    invoke-static {v0, v1}, Lc/d/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/d/a/a/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 8

    const-string v0, "ro.product.manufacturer"

    invoke-static {v0}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "Xiaomi"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "getSubId"

    const-string v4, "android.telephony.SubscriptionManager"

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v2, :cond_2

    const-string v2, "SamSung"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "WIKO"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "ZTE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v4}, Lc/d/a/b/k;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v2, v6, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v7

    invoke-static {v0, v3, v2}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v7

    invoke-static {v0, v5, v2}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    if-eqz p0, :cond_1

    aget p0, p0, v7

    return p0

    :cond_1
    return v1

    :cond_2
    :goto_0
    invoke-static {v4}, Lc/d/a/b/k;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-gt v2, v4, :cond_4

    new-array v2, v6, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v7

    invoke-static {v0, v3, v2}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v7

    invoke-static {v0, v5, v2}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    if-eqz p0, :cond_3

    aget p0, p0, v7

    return p0

    :cond_3
    return v1

    :cond_4
    new-array v1, v6, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v7

    const-string v2, "getSubscriptionId"

    invoke-static {v0, v2, v1}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v6, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v7

    invoke-static {v0, v5, v1}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_5
    return v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-class v0, Ljava/lang/String;

    :try_start_0
    const-string v1, "android.os.SystemProperties"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v6, 0x1

    aput-object v0, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v5

    aput-object p1, v2, v6

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, p0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "DeviceInfoReaderBase"

    const-string v1, "getString failed"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-object p1
.end method

.method private c(Landroid/content/Context;I)Ljava/lang/String;
    .locals 5

    const-string v0, "telephony_subscription_service"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionManager;

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultDataSubscriptionId()I

    move-result v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Landroid/telephony/SubscriptionManager;->getSlotIndex(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DataSlot:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DeviceInfoReaderBase"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "get5GState: ----switchState:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-----slotBySubId\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "phoneId:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lc/d/a/a/a;->c(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    if-eq v0, p2, :cond_1

    const-string v1, "0"

    :cond_1
    return-object v1
.end method

.method private d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p1, "miui_version_name"

    invoke-static {p0, p1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "ro.build.version.incremental"

    invoke-static {p1}, Lc/d/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    const-string p1, "\r|\n"

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "."

    invoke-virtual {p1, p0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {v2, p0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {v2, p0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MIUI "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static declared-synchronized e(Landroid/content/Context;)V
    .locals 6

    const-class v0, Lc/d/a/a/a;

    monitor-enter v0

    :try_start_0
    const-string v1, "DeviceInfoReaderBase"

    const-string v2, "listenNetworkState---->"

    invoke-static {v1, v2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean v1, Lc/d/a/b/d;->e:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Lc/d/a/a/a;->a(I)I

    move-result v2

    const-string v3, "DeviceInfoReaderBase"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "subIdSlot1:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-lez v2, :cond_0

    sget-object v3, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    if-nez v3, :cond_0

    const-string v3, "phone"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/TelephonyManager;

    invoke-virtual {v3, v2}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v2

    sput-object v2, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    const-string v2, "DeviceInfoReaderBase"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "telephonyManagerSlot1"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    if-nez v2, :cond_0

    const-string v2, "DeviceInfoReaderBase"

    const-string v3, "registerTelephonyCallback--mDMTelephonyCallback1"

    invoke-static {v2, v3}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/mobiletools/systemhelper/control/a;

    invoke-direct {v2, p0, v1}, Lcom/mobiletools/systemhelper/control/a;-><init>(Landroid/content/Context;I)V

    sput-object v2, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    sget-object v1, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    sget-object v3, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    invoke-virtual {v1, v2, v3}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    :cond_0
    const/4 v1, 0x1

    invoke-static {v1}, Lc/d/a/a/a;->a(I)I

    move-result v2

    const-string v3, "DeviceInfoReaderBase"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "subIdSlot2:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-lez v2, :cond_1

    sget-object v3, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    if-nez v3, :cond_1

    const-string v3, "phone"

    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/TelephonyManager;

    invoke-virtual {v3, v2}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v2

    sput-object v2, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    const-string v2, "DeviceInfoReaderBase"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "telephonyManagerSlot2"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;

    if-nez v2, :cond_1

    const-string v2, "DeviceInfoReaderBase"

    const-string v3, "registerTelephonyCallback--mDMTelephonyCallback2"

    invoke-static {v2, v3}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/mobiletools/systemhelper/control/a;

    invoke-direct {v2, p0, v1}, Lcom/mobiletools/systemhelper/control/a;-><init>(Landroid/content/Context;I)V

    sput-object v2, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;

    sget-object v1, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object p0

    sget-object v2, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;

    invoke-virtual {v1, p0, v2}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized f(Landroid/content/Context;)V
    .locals 3

    const-class p0, Lc/d/a/a/a;

    monitor-enter p0

    :try_start_0
    const-string v0, "DeviceInfoReaderBase"

    const-string v1, "unlistenNetworkState-->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    const/16 v1, 0x1f

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_0

    sget-object v0, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    sget-object v2, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    invoke-virtual {v0, v2}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lc/d/a/b/d;->f:Landroid/telephony/TelephonyManager;

    sput-object v0, Lc/d/a/b/d;->h:Lcom/mobiletools/systemhelper/control/a;

    sget-object v2, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;

    if-eqz v2, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_1

    sget-object v1, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    sget-object v2, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;

    invoke-virtual {v1, v2}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V

    :cond_1
    sput-object v0, Lc/d/a/b/d;->g:Landroid/telephony/TelephonyManager;

    sput-object v0, Lc/d/a/b/d;->i:Lcom/mobiletools/systemhelper/control/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    const-string v1, "slotId"

    invoke-virtual {v0, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, v0}, Lc/d/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method protected declared-synchronized a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "-1"

    const-string v1, "telephony_ims"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/ims/ImsManager;

    invoke-static {p2}, Lc/d/a/a/a;->a(I)I

    move-result p2

    if-ltz p2, :cond_1

    invoke-virtual {p1, p2}, Landroid/telephony/ims/ImsManager;->getImsMmTelManager(I)Landroid/telephony/ims/ImsMmTelManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/telephony/ims/ImsMmTelManager;->isAdvancedCallingSettingEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string v0, "1"

    goto :goto_0

    :cond_0
    const-string v0, "0"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-class p0, Ljava/lang/String;

    const-string v0, "DeviceInfoReaderBase"

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "phone"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getITelephony"

    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    invoke-virtual {v2, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v2, "com.android.internal.telephony.VivoTelephonyApiParams"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p2, v6, v5

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p3, :cond_3

    const-string v4, "put"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Class;

    aput-object p0, v7, v5

    const-class p0, Ljava/lang/Object;

    aput-object p0, v7, v3

    invoke-virtual {v2, v4, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "slot"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "phoneId"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    :cond_1
    invoke-virtual {p3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-gez v8, :cond_2

    goto :goto_0

    :cond_2
    new-array v8, v6, [Ljava/lang/Object;

    aput-object v7, v8, v5

    invoke-virtual {p3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v8, v3

    invoke-virtual {p0, p2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p3, "vivoTelephonyApi"

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v2, v4, v5

    invoke-virtual {p0, p3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    new-array p3, v3, [Ljava/lang/Object;

    aput-object p2, p3, v5

    invoke-virtual {p0, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string p2, "getParamValues"

    new-array p3, v5, [Ljava/lang/Class;

    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array p2, v5, [Ljava/lang/Object;

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    move-object v1, p0

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "invoke method: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " error!"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_1
    return-object v1
.end method

.method protected declared-synchronized a(Landroid/content/Context;ILcom/mobiletools/systemhelper/control/b;)V
    .locals 16

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    monitor-enter p0

    :try_start_0
    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v3}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1c

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, v3}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static/range {p2 .. p2}, Lc/d/a/a/a;->a(I)I

    move-result v3

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, "1"

    const-string v9, "phone"

    invoke-virtual {v0, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v0, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v3

    const-string v9, "DeviceInfoReaderBase"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "iccid:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    :cond_1
    const-string v3, "ex01"

    :cond_2
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    const-string v9, "ex01"

    :cond_4
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v10

    const-string v11, "DeviceInfoReaderBase"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "MNCCH register network:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v11

    const-string v12, "DeviceInfoReaderBase"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "tm.getSimOperator mnc :"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_6

    :cond_5
    const-string v11, "ex01"

    :cond_6
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getServiceState()Landroid/telephony/ServiceState;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/telephony/ServiceState;->getNetworkRegistrationInfoList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/4 v13, 0x1

    if-eqz v12, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/telephony/NetworkRegistrationInfo;

    invoke-virtual {v12}, Landroid/telephony/NetworkRegistrationInfo;->getDomain()I

    move-result v14

    const/4 v15, 0x2

    if-ne v14, v15, :cond_7

    invoke-virtual {v12}, Landroid/telephony/NetworkRegistrationInfo;->getTransportType()I

    move-result v14

    if-ne v14, v13, :cond_7

    invoke-virtual {v12}, Landroid/telephony/NetworkRegistrationInfo;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12}, Landroid/telephony/NetworkRegistrationInfo;->getCellIdentity()Landroid/telephony/CellIdentity;

    move-result-object v12

    if-nez v12, :cond_8

    const-string v0, "DeviceInfoReaderBase"

    const-string v12, "cellIdentity==null!"

    invoke-static {v0, v12}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    instance-of v13, v12, Landroid/telephony/CellIdentityGsm;

    if-eqz v13, :cond_9

    check-cast v12, Landroid/telephony/CellIdentityGsm;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getCid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getLac()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "GSM"

    goto/16 :goto_1

    :cond_9
    instance-of v13, v12, Landroid/telephony/CellIdentityWcdma;

    if-eqz v13, :cond_a

    check-cast v12, Landroid/telephony/CellIdentityWcdma;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityWcdma;->getCid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityWcdma;->getLac()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "WCDMA"

    goto/16 :goto_1

    :cond_a
    instance-of v13, v12, Landroid/telephony/CellIdentityTdscdma;

    if-eqz v13, :cond_b

    check-cast v12, Landroid/telephony/CellIdentityTdscdma;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityTdscdma;->getCid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityTdscdma;->getLac()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "TD-SCDMA"

    goto/16 :goto_1

    :cond_b
    instance-of v13, v12, Landroid/telephony/CellIdentityCdma;

    if-eqz v13, :cond_d

    check-cast v12, Landroid/telephony/CellIdentityCdma;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getBasestationId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getLongitude()I

    move-result v0

    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getLatitude()I

    move-result v7

    const v12, 0x7fffffff

    if-eq v0, v12, :cond_c

    if-eq v7, v12, :cond_c

    const-string v5, "%d:%d"

    new-array v12, v15, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v12, v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v7, 0x1

    aput-object v0, v12, v7

    invoke-static {v5, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :cond_c
    const-string v7, "CDMA"

    goto :goto_1

    :cond_d
    instance-of v13, v12, Landroid/telephony/CellIdentityLte;

    if-eqz v13, :cond_f

    check-cast v12, Landroid/telephony/CellIdentityLte;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityLte;->getCi()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityLte;->getTac()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12}, Landroid/telephony/CellIdentityLte;->getPci()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const-string v0, "LTE"

    const-string v7, "isEnDcAvailable = true"

    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_e

    const-string v0, "NSA"

    :cond_e
    move-object v7, v0

    :goto_0
    const-string v8, "1"

    goto :goto_1

    :cond_f
    instance-of v13, v12, Landroid/telephony/CellIdentityNr;

    if-eqz v13, :cond_7

    check-cast v12, Landroid/telephony/CellIdentityNr;

    invoke-virtual {v12}, Landroid/telephony/CellIdentityNr;->getNci()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Landroid/telephony/CellIdentityNr;->getTac()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12}, Landroid/telephony/CellIdentityNr;->getPci()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "SA"

    const-string v0, "mVopsSupport = 1"

    invoke-virtual {v14, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_0

    :cond_10
    const-string v8, "0"

    :cond_11
    :goto_1
    if-eqz v4, :cond_12

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    :cond_12
    const-string v4, "ex01"

    :cond_13
    if-eqz v5, :cond_14

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    :cond_14
    const-string v5, "ex01"

    :cond_15
    if-eqz v6, :cond_16

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    :cond_16
    const-string v6, "ex01"

    :cond_17
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v7, "ex01"

    :cond_18
    const-string v0, "DeviceInfoReaderBase"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "getNetworkRegistrationInfo->slot:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ", tac:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", cid:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "\uff0cpci:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "\uff0cnetworkType:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", voNREnable:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v0, v12}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_1a

    const/4 v0, 0x1

    if-eq v1, v0, :cond_19

    goto :goto_2

    :cond_19
    iput-object v3, v2, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iput-object v9, v2, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iput-object v11, v2, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iput-object v10, v2, Lcom/mobiletools/systemhelper/control/b;->w:Ljava/lang/String;

    iput-object v4, v2, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iput-object v5, v2, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iput-object v6, v2, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iput-object v7, v2, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iput-object v8, v2, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    goto :goto_2

    :cond_1a
    iput-object v3, v2, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v9, v2, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v11, v2, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v10, v2, Lcom/mobiletools/systemhelper/control/b;->k:Ljava/lang/String;

    iput-object v4, v2, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v5, v2, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v6, v2, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v7, v2, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v8, v2, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-void

    :cond_1b
    :try_start_1
    const-string v0, "DeviceInfoReaderBase"

    const-string v1, "setCellLoc failed!"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_1c
    :goto_3
    :try_start_2
    const-string v0, "DeviceInfoReaderBase"

    const-string v1, "getNetworkRegistrationInfo no enough permission!"

    invoke-static {v0, v1}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 7

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    sget-object v1, Lc/d/a/a/n;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    :cond_1
    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    const-string v1, "vivo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "vivo DM isUserPermissionOpen : "

    const-string v3, "DeviceInfoReaderBase"

    if-eqz v0, :cond_2

    invoke-static {p1}, Lc/d/a/b/l;->a(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lc/d/a/b/d;->e:Z

    if-nez v0, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean p1, Lc/d/a/b/d;->e:Z

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0, p1}, Lc/d/a/a/a;->b(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lc/d/a/b/d;->e:Z

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "queryAppUsageStatsDescend  isUserPermissionOpen :"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v4, Lc/d/a/b/d;->e:Z

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GlobalSetting.isUserPermissionOpen"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v4, Lc/d/a/b/d;->e:Z

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean v0, Lc/d/a/b/d;->e:Z

    const-string v4, "Unknown"

    const-string v5, "ro.hardware.version"

    const-string v6, "Android"

    if-eqz v0, :cond_9

    iput-object v6, p2, Lcom/mobiletools/systemhelper/control/b;->e:Ljava/lang/String;

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->f:Ljava/lang/String;

    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    const-string v6, "Xiaomi"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Lc/d/a/a/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    :goto_1
    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->d:Ljava/lang/String;

    invoke-static {v5, v4}, Lc/d/a/b/l;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->c:Ljava/lang/String;

    invoke-static {p1}, Lc/d/a/b/g;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->I:Lorg/json/JSONObject;

    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Unsupported API:"

    if-eqz v0, :cond_7

    sget-object v0, Lc/d/a/b/d;->d:Landroid/content/Context;

    invoke-static {v0}, Lc/d/a/b/l;->a(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lc/d/a/b/d;->e:Z

    if-nez v0, :cond_5

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_0

    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_6

    const-string v0, "enter DeviceInfoReaderBase super.read read vivo"

    invoke-static {v3, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->c(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto :goto_3

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_8

    invoke-virtual {p0, p1, p2}, Lc/d/a/a/a;->b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    goto :goto_3

    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    sget-object p0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->b:Ljava/lang/String;

    sget-object v0, Lc/d/a/a/n;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_b

    :cond_a
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    :cond_b
    iput-object v6, p2, Lcom/mobiletools/systemhelper/control/b;->e:Ljava/lang/String;

    sget-object p0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->f:Ljava/lang/String;

    sget-object p0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->d:Ljava/lang/String;

    invoke-static {v5, v4}, Lc/d/a/b/l;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->c:Ljava/lang/String;

    invoke-static {p1}, Lc/d/a/b/g;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p0

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->I:Lorg/json/JSONObject;

    :goto_3
    return-void
.end method

.method public a()Z
    .locals 1

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "the 5G attribute:"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lc/d/a/a/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lc/d/a/a/a;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceInfoReaderBase"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lc/d/a/a/a;->a:Ljava/lang/String;

    const-string v0, "1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Lc/d/a/a/a;->b:Ljava/lang/String;

    const-string v0, "true"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public a(Landroid/content/Context;)Z
    .locals 0

    new-instance p0, Landroid/telephony/ServiceState;

    invoke-direct {p0}, Landroid/telephony/ServiceState;-><init>()V

    invoke-virtual {p0}, Landroid/telephony/ServiceState;->getRoaming()Z

    move-result p0

    return p0
.end method

.method public b(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    const-string v0, "API_TAG_getNRSwitchState"

    const-string v1, "response"

    invoke-virtual {p0, p1, v0, v1, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ret:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DeviceInfoReaderBase"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p0, :cond_0

    instance-of p1, p0, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "get5GSwitchState: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method b(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 10

    const-string v0, "getImeiForSlot"

    const-string v1, "phone"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    const-string v2, "000005"

    iput-object v2, p2, Lcom/mobiletools/systemhelper/control/b;->J:Ljava/lang/String;

    iget-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->a:Ljava/lang/String;

    const-string v4, "Xiaomi"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "DeviceInfoReaderBase"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iput-object v2, p2, Lcom/mobiletools/systemhelper/control/b;->J:Ljava/lang/String;

    const-string v1, "miui.telephony.TelephonyManager"

    invoke-static {v1}, Lc/d/a/b/k;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Class;

    const-string v3, "getDefault"

    invoke-static {v1, v3, v2}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v2, v3, v7}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :try_start_0
    new-array v3, v5, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v3, v6

    invoke-static {v1, v0, v3}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v6

    invoke-static {v3, v2, v7}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    new-array v3, v5, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v3, v6

    invoke-static {v1, v0, v3}, Lc/d/a/b/k;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v6

    invoke-static {v0, v2, v1}, Lc/d/a/b/k;->a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Exception:getImeiForSlot"

    invoke-static {v4, v0}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v6}, Landroid/telephony/TelephonyManager;->getImei(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/telephony/TelephonyManager;->getImei(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    :goto_0
    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    const-string v1, "ex00"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    :cond_2
    iget-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    :cond_4
    const-string v0, "telephony_subscription_service"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionManager;

    invoke-static {v6}, Lc/d/a/a/a;->a(I)I

    move-result v2

    invoke-static {v5}, Lc/d/a/a/a;->a(I)I

    move-result v3

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getActiveDataSubscriptionId()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "subId0:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "\uff0csubId1:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", activeDataSubId\uff1a"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-gez v2, :cond_6

    if-ltz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v7, "0"

    goto :goto_2

    :cond_6
    :goto_1
    if-ne v7, v2, :cond_7

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    :goto_2
    iput-object v7, p2, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    goto :goto_3

    :cond_7
    if-ne v7, v3, :cond_8

    const/4 v7, 0x2

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_8
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "20240524dataslot: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p2, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "getDefaultDataSubscriptionId"

    new-array v9, v6, [Ljava/lang/Class;

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    new-array v8, v6, [Ljava/lang/Object;

    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "20240524defaultDataSubId: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    const/16 v0, 0x1e

    const-string v4, "1"

    if-ltz v2, :cond_9

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v0, :cond_a

    iput-object v4, p2, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    invoke-virtual {p0, p1, v6, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;ILcom/mobiletools/systemhelper/control/b;)V

    iput-object v4, p2, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    goto :goto_5

    :cond_9
    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    :cond_a
    :goto_5
    if-ltz v3, :cond_b

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v0, :cond_c

    iput-object v4, p2, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    invoke-virtual {p0, p1, v5, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;ILcom/mobiletools/systemhelper/control/b;)V

    iput-object v4, p2, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    goto :goto_6

    :cond_b
    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    :cond_c
    :goto_6
    return-void
.end method

.method protected declared-synchronized b(Landroid/content/Context;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "device_provisioned"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move v1, v0

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "DeviceInfoReaderBase"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isBootWizardCompleted: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method c(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V
    .locals 8

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    const-string v1, "000005"

    iput-object v1, p2, Lcom/mobiletools/systemhelper/control/b;->J:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/telephony/TelephonyManager;->getImei(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    const-string v3, "ex00"

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->g:Ljava/lang/String;

    :cond_1
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/telephony/TelephonyManager;->getImei(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->s:Ljava/lang/String;

    :cond_3
    const-string v0, "telephony_subscription_service"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionManager;

    invoke-static {v1}, Lc/d/a/a/a;->a(I)I

    move-result v0

    invoke-static {v2}, Lc/d/a/a/a;->a(I)I

    move-result v4

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getActiveDataSubscriptionId()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "subId0:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "\uff0csubId1:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", activeDataSubId\uff1a"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "DeviceInfoReaderBase"

    invoke-static {v7, v6}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-gez v0, :cond_5

    if-ltz v4, :cond_4

    goto :goto_0

    :cond_4
    const-string v5, "0"

    goto :goto_1

    :cond_5
    :goto_0
    if-ne v5, v0, :cond_6

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    iput-object v5, p2, Lcom/mobiletools/systemhelper/control/b;->E:Ljava/lang/String;

    goto :goto_2

    :cond_6
    if-ne v5, v4, :cond_7

    const/4 v5, 0x2

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_7
    :goto_2
    const/16 v5, 0x1e

    if-ltz v0, :cond_9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v5, :cond_a

    invoke-virtual {p0}, Lc/d/a/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-direct {p0, p1, v1}, Lc/d/a/a/a;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    :cond_8
    invoke-virtual {p0, p1, v1, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;ILcom/mobiletools/systemhelper/control/b;)V

    invoke-virtual {p0, p1, v1}, Lc/d/a/a/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    goto :goto_3

    :cond_9
    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->h:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->i:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->j:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->l:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->m:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->n:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->o:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->r:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->p:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->q:Ljava/lang/String;

    :cond_a
    :goto_3
    if-ltz v4, :cond_c

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v5, :cond_d

    invoke-virtual {p0}, Lc/d/a/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0, p1, v2}, Lc/d/a/a/a;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    :cond_b
    invoke-virtual {p0, p1, v2, p2}, Lc/d/a/a/a;->a(Landroid/content/Context;ILcom/mobiletools/systemhelper/control/b;)V

    invoke-virtual {p0, p1, v2}, Lc/d/a/a/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    goto :goto_4

    :cond_c
    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->t:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->u:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->v:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->x:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->y:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->z:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->A:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->D:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->B:Ljava/lang/String;

    iput-object v3, p2, Lcom/mobiletools/systemhelper/control/b;->C:Ljava/lang/String;

    :cond_d
    :goto_4
    return-void
.end method

.method public c(Landroid/content/Context;)Z
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "dual_nr_support"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "API_TAG_getNrCapability"

    invoke-virtual {p0, p1, v2, v0}, Lc/d/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/HashMap;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultMap:"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DeviceInfoReaderBase"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p0, :cond_0

    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "isDualMode5G: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method
