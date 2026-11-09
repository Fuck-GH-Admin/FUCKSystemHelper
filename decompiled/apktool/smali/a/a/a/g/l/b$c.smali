.class public La/a/a/g/l/b$c;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/l/b;


# direct methods
.method public constructor <init>(La/a/a/g/l/b;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/l/b;La/a/a/g/l/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/l/b$c;-><init>(La/a/a/g/l/b;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-boolean p1, La/a/a/g/m/a;->b:Z

    if-eqz p1, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p1

    invoke-virtual {p1, p2}, La/a/a/g/e;->a(Landroid/content/Intent;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p1, La/a/a/g/l/b;->i:J

    iget-object p1, p0, La/a/a/g/l/b$c;->a:La/a/a/g/l/b;

    invoke-static {p1}, La/a/a/g/l/b;->c(La/a/a/g/l/b;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, La/a/a/g/l/b$c$a;

    invoke-direct {p2, p0}, La/a/a/g/l/b$c$a;-><init>(La/a/a/g/l/b$c;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method
