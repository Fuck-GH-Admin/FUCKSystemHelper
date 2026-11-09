.class public Lcom/mobiletools/systemhelper/control/c;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobiletools/systemhelper/control/c$a;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/mobiletools/systemhelper/control/b;

.field private d:Lcom/mobiletools/systemhelper/control/c$a;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Lcom/mobiletools/systemhelper/control/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->c:Lcom/mobiletools/systemhelper/control/b;

    const-string v0, ""

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->f:Ljava/lang/String;

    iput-object p1, p0, Lcom/mobiletools/systemhelper/control/c;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/mobiletools/systemhelper/control/c;->c:Lcom/mobiletools/systemhelper/control/b;

    iput-object p3, p0, Lcom/mobiletools/systemhelper/control/c;->d:Lcom/mobiletools/systemhelper/control/c$a;

    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 5

    const-string p0, ""

    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/NetworkInterface;

    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v4

    if-nez v4, :cond_1

    instance-of v2, v2, Ljava/net/Inet6Address;

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "address"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/SocketException;->printStackTrace()V

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getIPv6Address:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GetIPAddressThread"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private b()Ljava/lang/String;
    .locals 0

    const-string p0, ""

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/c;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->e:Ljava/lang/String;

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/control/c;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->f:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IPv4:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", IPv6:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GetIPAddressThread"

    invoke-static {v1, v0}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mobiletools/systemhelper/control/c;->d:Lcom/mobiletools/systemhelper/control/c$a;

    iget-object v1, p0, Lcom/mobiletools/systemhelper/control/c;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobiletools/systemhelper/control/c;->c:Lcom/mobiletools/systemhelper/control/b;

    iget-object v3, p0, Lcom/mobiletools/systemhelper/control/c;->e:Ljava/lang/String;

    iget-object p0, p0, Lcom/mobiletools/systemhelper/control/c;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, p0}, Lcom/mobiletools/systemhelper/control/c$a;->a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
