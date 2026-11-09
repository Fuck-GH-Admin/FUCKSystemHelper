.class Lcom/mobiletools/systemhelper/service/RegisterIntentService$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mobiletools/systemhelper/service/RegisterIntentService;
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
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    const-string p0, "RegisterIntentService"

    const-string p1, "onServiceConnected-->"

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lc/c/a/a$a;->a(Landroid/os/IBinder;)Lc/c/a/a;

    move-result-object p0

    sput-object p0, Lc/d/a/b/d;->w:Lc/c/a/a;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    const-string p0, "RegisterIntentService"

    const-string p1, "onServiceDisconnected-->"

    invoke-static {p0, p1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    sput-object p0, Lc/d/a/b/d;->w:Lc/c/a/a;

    return-void
.end method
