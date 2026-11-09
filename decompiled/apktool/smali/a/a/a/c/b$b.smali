.class public La/a/a/c/b$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/c/b;


# direct methods
.method public constructor <init>(La/a/a/c/b;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/b$b;->a:La/a/a/c/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/c/b;La/a/a/c/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/c/b$b;-><init>(La/a/a/c/b;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, La/a/a/c/b$b;->a:La/a/a/c/b;

    invoke-static {p1}, La/a/a/c/b;->c(La/a/a/c/b;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.baidu.location.autonotifyloc_9.5.2.1"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La/a/a/c/b$b;->a:La/a/a/c/b;

    invoke-static {p1}, La/a/a/c/b;->d(La/a/a/c/b;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La/a/a/c/b$b;->a:La/a/a/c/b;

    const/4 p2, 0x0

    invoke-static {p1, p2}, La/a/a/c/b;->a(La/a/a/c/b;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;

    iget-object p0, p0, La/a/a/c/b$b;->a:La/a/a/c/b;

    invoke-static {p0}, La/a/a/c/b;->d(La/a/a/c/b;)Landroid/os/Handler;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method
