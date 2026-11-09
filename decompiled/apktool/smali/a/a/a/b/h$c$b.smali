.class public La/a/a/b/h$c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/h$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/b/h$c;


# direct methods
.method public constructor <init>(La/a/a/b/h$c;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/h$c$b;->a:La/a/a/b/h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/b/h$c;La/a/a/b/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/b/h$c$b;-><init>(La/a/a/b/h$c;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    iget-object p1, p0, La/a/a/b/h$c$b;->a:La/a/a/b/h$c;

    invoke-static {p1}, La/a/a/b/h$c;->a(La/a/a/b/h$c;)V

    iget-object p0, p0, La/a/a/b/h$c$b;->a:La/a/a/b/h$c;

    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/b/h$c;->l:Z

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
