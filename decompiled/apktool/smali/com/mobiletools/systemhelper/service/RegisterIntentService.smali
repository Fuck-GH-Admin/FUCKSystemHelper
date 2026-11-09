.class public Lcom/mobiletools/systemhelper/service/RegisterIntentService;
.super Landroid/app/IntentService;
.source ""


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mobiletools/systemhelper/service/RegisterIntentService$a;

    invoke-direct {v0}, Lcom/mobiletools/systemhelper/service/RegisterIntentService$a;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "RegisterIntentService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/service/RegisterIntentService;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    const-string v0, "RegisterIntentService"

    const-string v1, "RegisterIntentService onCreate-->"

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mobiletools/systemhelper/service/RegisterIntentService;->b:Landroid/content/Context;

    invoke-static {}, Lc/d/a/a/n;->c()V

    iget-object p0, p0, Lcom/mobiletools/systemhelper/service/RegisterIntentService;->b:Landroid/content/Context;

    invoke-static {p0}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "RegType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    iget-object p0, p0, Lcom/mobiletools/systemhelper/service/RegisterIntentService;->b:Landroid/content/Context;

    invoke-static {p0}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    return-void
.end method
