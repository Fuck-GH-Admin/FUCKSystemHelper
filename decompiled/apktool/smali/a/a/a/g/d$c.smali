.class public La/a/a/g/d$c;
.super Landroid/location/GnssNavigationMessage$Callback;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/d$c;->a:La/a/a/g/d;

    invoke-direct {p0}, Landroid/location/GnssNavigationMessage$Callback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/d;La/a/a/g/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/d$c;-><init>(La/a/a/g/d;)V

    return-void
.end method


# virtual methods
.method public onGnssNavigationMessageReceived(Landroid/location/GnssNavigationMessage;)V
    .locals 4

    iget-object v0, p0, La/a/a/g/d$c;->a:La/a/a/g/d;

    invoke-static {v0}, La/a/a/g/d;->b(La/a/a/g/d;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object v0

    iget-object p0, p0, La/a/a/g/d$c;->a:La/a/a/g/d;

    invoke-static {p0}, La/a/a/g/d;->b(La/a/a/g/d;)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, La/a/a/b/z;->a(Landroid/location/GnssNavigationMessage;J)V

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {p0, p1, v0, v1}, La/a/a/b/z;->a(Landroid/location/GnssNavigationMessage;J)V

    :goto_0
    return-void
.end method

.method public onStatusChanged(I)V
    .locals 0

    return-void
.end method
