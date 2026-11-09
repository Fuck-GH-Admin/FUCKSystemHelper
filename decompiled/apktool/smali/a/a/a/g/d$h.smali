.class public La/a/a/g/d$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/GpsStatus$NmeaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/d$h;->a:La/a/a/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/d;La/a/a/g/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/d$h;-><init>(La/a/a/g/d;)V

    return-void
.end method


# virtual methods
.method public onNmeaReceived(JLjava/lang/String;)V
    .locals 0

    iget-object p1, p0, La/a/a/g/d$h;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/g/d$h;->a:La/a/a/g/d;

    invoke-static {p1}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p0, p0, La/a/a/g/d$h;->a:La/a/a/g/d;

    invoke-static {p0}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method
