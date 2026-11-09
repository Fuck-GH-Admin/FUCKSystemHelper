.class final Landroid/support/v7/app/f$k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "k"
.end annotation


# instance fields
.field private a:Landroid/support/v7/app/j;

.field private b:Z

.field private c:Landroid/content/BroadcastReceiver;

.field private d:Landroid/content/IntentFilter;

.field final synthetic e:Landroid/support/v7/app/f;


# direct methods
.method constructor <init>(Landroid/support/v7/app/f;Landroid/support/v7/app/j;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/f$k;->e:Landroid/support/v7/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/v7/app/f$k;->a:Landroid/support/v7/app/j;

    invoke-virtual {p2}, Landroid/support/v7/app/j;->a()Z

    move-result p1

    iput-boolean p1, p0, Landroid/support/v7/app/f$k;->b:Z

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/f$k;->c:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/app/f$k;->e:Landroid/support/v7/app/f;

    iget-object v1, v1, Landroid/support/v7/app/f;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/f$k;->c:Landroid/content/BroadcastReceiver;

    :cond_0
    return-void
.end method

.method b()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/f$k;->a:Landroid/support/v7/app/j;

    invoke-virtual {v0}, Landroid/support/v7/app/j;->a()Z

    move-result v0

    iget-boolean v1, p0, Landroid/support/v7/app/f$k;->b:Z

    if-eq v0, v1, :cond_0

    iput-boolean v0, p0, Landroid/support/v7/app/f$k;->b:Z

    iget-object p0, p0, Landroid/support/v7/app/f$k;->e:Landroid/support/v7/app/f;

    invoke-virtual {p0}, Landroid/support/v7/app/f;->a()Z

    :cond_0
    return-void
.end method

.method c()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/f$k;->a:Landroid/support/v7/app/j;

    invoke-virtual {v0}, Landroid/support/v7/app/j;->a()Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v7/app/f$k;->b:Z

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method d()V
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/app/f$k;->a()V

    iget-object v0, p0, Landroid/support/v7/app/f$k;->c:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/app/f$k$a;

    invoke-direct {v0, p0}, Landroid/support/v7/app/f$k$a;-><init>(Landroid/support/v7/app/f$k;)V

    iput-object v0, p0, Landroid/support/v7/app/f$k;->c:Landroid/content/BroadcastReceiver;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/f$k;->d:Landroid/content/IntentFilter;

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/f$k;->d:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v7/app/f$k;->d:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v7/app/f$k;->d:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/f$k;->e:Landroid/support/v7/app/f;

    iget-object v0, v0, Landroid/support/v7/app/f;->c:Landroid/content/Context;

    iget-object v1, p0, Landroid/support/v7/app/f$k;->c:Landroid/content/BroadcastReceiver;

    iget-object p0, p0, Landroid/support/v7/app/f$k;->d:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, p0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
