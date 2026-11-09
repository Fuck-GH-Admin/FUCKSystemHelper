.class public La/a/a/b/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/h$d;,
        La/a/a/b/h$c;,
        La/a/a/b/h$b;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/telephony/TelephonyManager;

.field public c:La/a/a/g/a;

.field public d:Landroid/net/wifi/WifiManager;

.field public e:La/a/a/g/k;

.field public f:Ljava/lang/String;

.field public g:Lcom/baidu/location/i;

.field public h:La/a/a/b/h$b;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Z

.field public o:La/a/a/b/h$c;

.field public p:Ljava/lang/String;

.field public q:J

.field public r:Z

.field public s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_."

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/baidu/location/i;La/a/a/b/h$b;Ljava/lang/String;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, 0x0

    iput-object p4, p0, La/a/a/b/h;->a:Landroid/content/Context;

    iput-object p4, p0, La/a/a/b/h;->b:Landroid/telephony/TelephonyManager;

    new-instance v0, La/a/a/g/a;

    invoke-direct {v0}, La/a/a/g/a;-><init>()V

    iput-object v0, p0, La/a/a/b/h;->c:La/a/a/g/a;

    iput-object p4, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    iput-object p4, p0, La/a/a/b/h;->e:La/a/a/g/k;

    iput-object p4, p0, La/a/a/b/h;->f:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->i:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->j:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->k:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->l:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->m:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/b/h;->n:Z

    new-instance v1, La/a/a/b/h$c;

    invoke-direct {v1, p0}, La/a/a/b/h$c;-><init>(La/a/a/b/h;)V

    iput-object v1, p0, La/a/a/b/h;->o:La/a/a/b/h$c;

    iput-object p4, p0, La/a/a/b/h;->p:Ljava/lang/String;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La/a/a/b/h;->q:J

    iput-boolean v0, p0, La/a/a/b/h;->r:Z

    iput-boolean v0, p0, La/a/a/b/h;->s:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->a:Landroid/content/Context;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, La/a/a/i/i;->o0:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/b/h;->n:Z

    new-instance v0, Lcom/baidu/location/i;

    invoke-direct {v0, p2}, Lcom/baidu/location/i;-><init>(Lcom/baidu/location/i;)V

    iput-object v0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iput-object p3, p0, La/a/a/b/h;->h:La/a/a/b/h$b;

    iget-object p3, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, La/a/a/b/h;->l:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->m:Ljava/lang/String;

    :try_start_1
    iget-object p3, p0, La/a/a/b/h;->a:Landroid/content/Context;

    const-string v0, "phone"

    invoke-virtual {p3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/telephony/TelephonyManager;

    iput-object p3, p0, La/a/a/b/h;->b:Landroid/telephony/TelephonyManager;

    iget-object p3, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    const-string v0, "wifi"

    invoke-virtual {p3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/net/wifi/WifiManager;

    iput-object p3, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iget-object p3, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object p3, p3, Lcom/baidu/location/i;->D:Lcom/baidu/location/i$a;

    sget-object v0, Lcom/baidu/location/i$a;->c:Lcom/baidu/location/i$a;

    if-ne p3, v0, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p3

    iget-object v0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-virtual {p3, v0}, La/a/a/g/f;->a(Landroid/content/Context;)V

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "&"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/a/a/b/h;->l:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :try_start_2
    iget-object p3, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-static {p3}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p3

    invoke-virtual {p3}, Lc/a/c/a/b;->a()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, La/a/a/b/h;->m:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    iput-object p4, p0, La/a/a/b/h;->m:Ljava/lang/String;

    iput-object p4, p0, La/a/a/b/h;->b:Landroid/telephony/TelephonyManager;

    iput-object p4, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    :goto_0
    iget-object p3, p0, La/a/a/b/h;->m:Ljava/lang/String;

    const-string v0, "&coor="

    const-string v1, ":"

    const-string v2, "&prod="

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, ""

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, La/a/a/b/h;->m:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    sput-object p3, La/a/a/i/i;->l:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object p4, p4, Lcom/baidu/location/i;->f:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, La/a/a/b/h;->l:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "|&cu="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, La/a/a/b/h;->m:Ljava/lang/String;

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->f:Ljava/lang/String;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/a/a/b/h;->l:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "|&im="

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/baidu/location/i;->f()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, La/a/a/b/h;->f:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuffer;

    const/16 p4, 0x100

    invoke-direct {p3, p4}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string p4, "&fw="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p4, "9.521"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "&sdk="

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p4, "&lt=1"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p4, "&mb="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object p4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p4, "&resid="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p4, "12"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Lcom/baidu/location/i;->c()Ljava/lang/String;

    invoke-virtual {p2}, Lcom/baidu/location/i;->c()Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p2}, Lcom/baidu/location/i;->c()Ljava/lang/String;

    move-result-object p4

    const-string v0, "all"

    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&addr=allj2"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, La/a/a/b/h;->f:Ljava/lang/String;

    iget-boolean p4, p2, Lcom/baidu/location/i;->t:Z

    if-eqz p4, :cond_2

    const-string p4, "&adtp=n2"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    iget-boolean p4, p2, Lcom/baidu/location/i;->o:Z

    if-eq p4, p1, :cond_3

    iget-boolean p4, p2, Lcom/baidu/location/i;->p:Z

    if-ne p4, p1, :cond_6

    :cond_3
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&sema="

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, La/a/a/b/h;->f:Ljava/lang/String;

    iget-boolean p4, p2, Lcom/baidu/location/i;->o:Z

    if-ne p4, p1, :cond_4

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "aptag|"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, La/a/a/b/h;->f:Ljava/lang/String;

    :cond_4
    iget-boolean p2, p2, Lcom/baidu/location/i;->p:Z

    if-ne p2, p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "aptagd2|"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->f:Ljava/lang/String;

    :cond_5
    iget-object p1, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-static {p1}, La/a/a/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->j:Ljava/lang/String;

    iget-object p1, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-static {p1}, La/a/a/a/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->k:Ljava/lang/String;

    :cond_6
    const-string p1, "&first=1"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p5, :cond_7

    const-string p1, "&state=fore"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_7
    const-string p1, "&os=A"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object p1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->f:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(La/a/a/b/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/b/h;->j:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(La/a/a/b/h;I)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/h;->b(I)V

    return-void
.end method

.method public static synthetic a(La/a/a/b/h;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/h;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(La/a/a/b/h;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/b/h;->s:Z

    return p1
.end method

.method public static a(Landroid/net/wifi/WifiManager;)Z
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    goto :goto_1

    :catchall_0
    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static synthetic b(La/a/a/b/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/b/h;->k:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(La/a/a/b/h;)Lcom/baidu/location/i;
    .locals 0

    iget-object p0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    return-object p0
.end method

.method public static synthetic d(La/a/a/b/h;)La/a/a/b/h$b;
    .locals 0

    iget-object p0, p0, La/a/a/b/h;->h:La/a/a/b/h$b;

    return-object p0
.end method

.method public static synthetic e(La/a/a/b/h;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/h;->r:Z

    return p0
.end method

.method public static synthetic f(La/a/a/b/h;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 12

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    iget-object v2, p0, La/a/a/b/h;->c:La/a/a/g/a;

    iget-object v3, p0, La/a/a/b/h;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1, v2, v3}, La/a/a/g/f;->a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object v1

    iput-object v1, p0, La/a/a/b/h;->c:La/a/a/g/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La/a/a/g/a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    iget-object v2, p0, La/a/a/b/h;->c:La/a/a/g/a;

    invoke-virtual {v1, v2}, La/a/a/g/f;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    :try_start_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, La/a/a/b/h;->c:La/a/a/g/a;

    if-eqz v2, :cond_1

    iget-object v2, v2, La/a/a/g/a;->m:Ljava/lang/String;

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/b/h;->c:La/a/a/g/a;

    iget-object v3, v3, La/a/a/g/a;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_0
    move-object v1, v0

    :catchall_1
    :cond_1
    :goto_1
    :try_start_2
    iput-object v0, p0, La/a/a/b/h;->e:La/a/a/g/k;

    iget-object v2, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-static {v2}, La/a/a/b/h;->a(Landroid/net/wifi/WifiManager;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget v2, v2, Lcom/baidu/location/i;->g:I

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    new-instance v2, La/a/a/g/k;

    iget-object v3, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-direct {v2, v3, v4, v5}, La/a/a/g/k;-><init>(Ljava/util/List;J)V

    iput-object v2, p0, La/a/a/b/h;->e:La/a/a/g/k;

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v6

    iget-object v7, p0, La/a/a/b/h;->e:La/a/a/g/k;

    invoke-virtual {p0}, La/a/a/b/h;->c()Ljava/lang/String;

    move-result-object v9

    iget-boolean v10, p0, La/a/a/b/h;->r:Z

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v2

    iget v11, v2, La/a/a/b/a;->c:I

    move v8, p1

    invoke-virtual/range {v6 .. v11}, La/a/a/g/f;->a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/baidu/location/i;->i()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->startScan()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_0
    :cond_2
    move-object p1, v0

    :catch_1
    :cond_3
    :goto_2
    if-nez v1, :cond_4

    if-nez p1, :cond_4

    iput-object v0, p0, La/a/a/b/h;->i:Ljava/lang/String;

    return-object v0

    :cond_4
    if-eqz p1, :cond_6

    if-nez v1, :cond_5

    move-object v1, p1

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_6
    :goto_3
    if-nez v1, :cond_7

    return-object v0

    :cond_7
    iput-object v1, p0, La/a/a/b/h;->i:Ljava/lang/String;

    iget-object p1, p0, La/a/a/b/h;->f:Ljava/lang/String;

    if-eqz p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, La/a/a/b/h;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/h;->i:Ljava/lang/String;

    :cond_8
    invoke-virtual {p0}, La/a/a/b/h;->h()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/a/a/b/h;->f:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final a(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/wifi/WifiConfiguration;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/wifi/WifiConfiguration;

    iget-object v4, v3, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    :try_start_0
    const-string v5, "numAssociation"

    invoke-virtual {p0, v3, v5}, La/a/a/b/h;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move v3, v0

    :goto_1
    if-lez v3, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v5, La/a/a/b/h$d;

    invoke-direct {v5, p0, v4, v3}, La/a/a/b/h$d;-><init>(La/a/a/b/h;Ljava/lang/String;I)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v2, v1

    :cond_2
    if-eqz v2, :cond_7

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_3

    new-instance p1, La/a/a/b/h$a;

    invoke-direct {p1, p0}, La/a/a/b/h$a;-><init>(La/a/a/b/h;)V

    invoke-static {v2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3
    new-instance p0, Ljava/lang/StringBuffer;

    const/16 p1, 0xc8

    invoke-direct {p0, p1}, Ljava/lang/StringBuffer;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, ","

    const/4 v5, 0x4

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/b/h$d;

    iget-object v6, v3, La/a/a/b/h$d;->a:Ljava/lang/String;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v3, v3, La/a/a/b/h$d;->b:I

    invoke-virtual {p0, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v3, "|"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/2addr v0, v1

    if-ne v0, v5, :cond_4

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_6

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/a/a/b/h$d;

    iget-object p1, p1, La/a/a/b/h$d;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/a/a/b/h$d;

    iget p1, p1, La/a/a/b/h$d;->b:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_6
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v1
.end method

.method public a()V
    .locals 13

    iget-object v0, p0, La/a/a/b/h;->i:Ljava/lang/String;

    if-nez v0, :cond_3

    const/16 v0, 0x3e

    iget-object v1, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-static {v1}, La/a/a/i/i;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/16 v0, 0x45

    goto :goto_0

    :cond_0
    const/4 v2, -0x2

    if-ne v1, v2, :cond_1

    const/16 v0, 0x46

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    const/16 v0, 0x47

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, La/a/a/b/h;->b(I)V

    return-void

    :cond_3
    iget-boolean v0, p0, La/a/a/b/h;->n:Z

    if-nez v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    if-eqz v0, :cond_5

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v0

    iget-object v1, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, La/a/a/b/f;->a(Landroid/content/Context;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/a/a/b/h;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/b/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/h;->i:Ljava/lang/String;

    :cond_5
    iget-object v0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    iget-object v0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    if-eqz v0, :cond_f

    iget v2, v0, Lcom/baidu/location/i;->d:I

    const/16 v3, 0x3e8

    if-lt v2, v3, :cond_f

    invoke-virtual {v0}, Lcom/baidu/location/i;->c()Ljava/lang/String;

    move-result-object v0

    const-string v2, "all"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-boolean v2, v0, Lcom/baidu/location/i;->o:Z

    if-nez v2, :cond_f

    iget-boolean v2, v0, Lcom/baidu/location/i;->p:Z

    if-nez v2, :cond_f

    invoke-virtual {v0}, Lcom/baidu/location/i;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    :try_start_0
    iget-object v0, p0, La/a/a/b/h;->c:La/a/a/g/a;

    if-eqz v0, :cond_7

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    iget-object v2, p0, La/a/a/b/h;->c:La/a/a/g/a;

    invoke-virtual {v0, v2}, La/a/a/g/f;->d(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_7
    move-object v0, v1

    :goto_1
    iget-object v2, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    const/4 v3, 0x0

    const/16 v4, 0x42

    const-wide v5, 0x3fb99999a0000000L    # 0.10000000149011612

    if-eqz v2, :cond_9

    iget-object v7, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget v7, v7, Lcom/baidu/location/i;->g:I

    const/4 v8, 0x4

    if-eq v7, v8, :cond_8

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_8
    move-object v2, v1

    :goto_2
    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object v7

    invoke-virtual {v7, v0, v2, v3}, La/a/a/f/a;->a(Ljava/lang/String;Ljava/util/List;Z)Lcom/baidu/location/c;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v4, :cond_a

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    cmpg-double v2, v7, v5

    if-gez v2, :cond_a

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    cmpg-double v2, v7, v5

    if-gez v2, :cond_a

    const/16 v2, 0x43

    invoke-virtual {v0, v2}, Lcom/baidu/location/c;->h(I)V

    goto :goto_3

    :cond_9
    move-object v0, v1

    :cond_a
    :goto_3
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    :cond_b
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    :cond_c
    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v7, "gcj02"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v4, :cond_d

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v9

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    cmpl-double v2, v11, v5

    if-lez v2, :cond_d

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    cmpl-double v2, v11, v5

    if-lez v2, :cond_d

    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-static {v7, v8, v9, v10, v2}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v2

    aget-wide v7, v2, v3

    invoke-virtual {v0, v7, v8}, Lcom/baidu/location/c;->d(D)V

    const/4 v3, 0x1

    aget-wide v2, v2, v3

    invoke-virtual {v0, v2, v3}, Lcom/baidu/location/c;->c(D)V

    iget-object v2, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    :cond_d
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v4, :cond_f

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v2, v2, v5

    if-lez v2, :cond_f

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v2, v2, v5

    if-lez v2, :cond_f

    iget-boolean v2, p0, La/a/a/b/h;->s:Z

    if-nez v2, :cond_e

    iget-object v2, p0, La/a/a/b/h;->h:La/a/a/b/h$b;

    invoke-interface {v2, v0}, La/a/a/b/h$b;->a(Lcom/baidu/location/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_e
    move-object v1, v0

    :catch_0
    :cond_f
    :goto_4
    if-nez v1, :cond_10

    iget-object v0, p0, La/a/a/b/h;->o:La/a/a/b/h$c;

    iget-object p0, p0, La/a/a/b/h;->i:Ljava/lang/String;

    invoke-virtual {v0, p0}, La/a/a/b/h$c;->c(Ljava/lang/String;)V

    :cond_10
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "ideocfre"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "content"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "|"

    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\\|"

    invoke-virtual {v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    iget-object p0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    const-string p1, "cuidRelate"

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string p1, "cuidoc"

    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string p1, "cuidfreq"

    invoke-interface {p0, p1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/b/h;->q:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, La/a/a/b/h;->p:Ljava/lang/String;

    iput-wide v0, p0, La/a/a/b/h;->q:J

    :cond_1
    iget-object p0, p0, La/a/a/b/h;->p:Ljava/lang/String;

    return-object p0
.end method

.method public final b(I)V
    .locals 4

    iget-object v0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/location/i;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->h(I)V

    new-instance p1, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {p1, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, La/a/a/b/h;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/b/h;->m:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/baidu/location/Jni;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->k(Ljava/lang/String;)V

    iget-object p0, p0, La/a/a/b/h;->h:La/a/a/b/h$b;

    if-eqz p0, :cond_0

    invoke-interface {p0, v0}, La/a/a/b/h$b;->a(Lcom/baidu/location/c;)V

    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, La/a/a/b/h;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, ":"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const/16 v0, 0xf

    :try_start_0
    invoke-virtual {p0, v0}, La/a/a/b/h;->a(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/net/wifi/WifiConfiguration;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object p0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final f()Z
    .locals 8

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v0

    iget v0, v0, La/a/a/b/a;->f:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "cuidRelate"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "isInstalled"

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_2

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iget-object v5, p0, La/a/a/b/h;->a:Landroid/content/Context;

    const-string v6, "com.baidu.map.location"

    invoke-static {v5, v6}, La/a/a/i/i;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_1
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    return v1

    :cond_2
    const/4 v3, -0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    :goto_0
    const-string v2, "cuidoc"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v5, 0x0

    const-string v7, "reqtime"

    invoke-interface {v0, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    sub-long/2addr v2, v5

    const-wide/16 v5, 0x3e8

    div-long/2addr v2, v5

    const-wide/16 v5, 0x3c

    const-string v7, "cuidfreq"

    invoke-interface {v0, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    cmp-long v0, v2, v5

    if-gez v0, :cond_5

    return v1

    :cond_5
    iget-object v0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    invoke-static {v0}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_6

    return v1

    :cond_6
    iget-object v0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-static {v0}, La/a/a/b/h;->a(Landroid/net/wifi/WifiManager;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p0, p0, La/a/a/b/h;->e:La/a/a/g/k;

    invoke-virtual {p0}, La/a/a/g/k;->c()I

    move-result p0

    const/4 v0, 0x3

    if-gt p0, v0, :cond_7

    goto :goto_1

    :cond_7
    return v4

    :cond_8
    :goto_1
    return v1
.end method

.method public g()V
    .locals 0

    invoke-virtual {p0}, La/a/a/b/h;->d()Ljava/lang/String;

    return-void
.end method

.method public final h()V
    .locals 11

    invoke-virtual {p0}, La/a/a/b/h;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/b/h;->r:Z

    iget-object v2, p0, La/a/a/b/h;->e:La/a/a/g/k;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, La/a/a/g/k;->c()I

    move-result v2

    const/16 v4, 0xa

    if-lt v2, v4, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v5

    iget-object v6, p0, La/a/a/b/h;->e:La/a/a/g/k;

    invoke-virtual {p0}, La/a/a/b/h;->c()Ljava/lang/String;

    move-result-object v8

    iget-boolean v9, p0, La/a/a/b/h;->r:Z

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v2

    iget v10, v2, La/a/a/b/a;->c:I

    const/16 v7, 0x9

    invoke-virtual/range {v5 .. v10}, La/a/a/g/f;->a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2, v1}, La/a/a/i/i;->a([BZ)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v4

    iget-object v5, p0, La/a/a/b/h;->e:La/a/a/g/k;

    invoke-virtual {v5}, La/a/a/g/k;->c()I

    move-result v6

    invoke-virtual {p0}, La/a/a/b/h;->c()Ljava/lang/String;

    move-result-object v7

    iget-boolean v8, p0, La/a/a/b/h;->r:Z

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v2

    iget v9, v2, La/a/a/b/a;->c:I

    invoke-virtual/range {v4 .. v9}, La/a/a/g/f;->a(La/a/a/g/k;ILjava/lang/String;ZI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2, v1}, La/a/a/i/i;->a([BZ)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual {p0}, La/a/a/b/h;->e()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v4}, La/a/a/b/h;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v3, v1}, La/a/a/i/i;->a([BZ)Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, La/a/a/b/h;->i:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&swf5="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/b/h;->i:Ljava/lang/String;

    iput-boolean v0, p0, La/a/a/b/h;->r:Z

    goto :goto_1

    :cond_3
    iput-boolean v1, p0, La/a/a/b/h;->r:Z

    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, La/a/a/b/h;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&hwf5="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/b/h;->i:Ljava/lang/String;

    iput-boolean v0, p0, La/a/a/b/h;->r:Z

    goto :goto_2

    :cond_4
    iput-boolean v1, p0, La/a/a/b/h;->r:Z

    :cond_5
    :goto_2
    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/b/h;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, La/a/a/b/h;->g:Lcom/baidu/location/i;

    iget v0, v0, Lcom/baidu/location/i;->g:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/a/a/g/f;->a(I)La/a/a/g/k;

    :cond_1
    iget-object p0, p0, La/a/a/b/h;->a:Landroid/content/Context;

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, La/a/a/i/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/f;->a()La/a/a/g/a;

    :cond_2
    return-void
.end method

.method public j()V
    .locals 0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/f;->v()V

    return-void
.end method
