.class public final Lcom/baidu/location/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/baidu/location/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/baidu/location/c;
    .locals 1

    new-instance p0, Lcom/baidu/location/c;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/baidu/location/c;-><init>(Landroid/os/Parcel;Lcom/baidu/location/c$a;)V

    return-object p0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/c$a;->createFromParcel(Landroid/os/Parcel;)Lcom/baidu/location/c;

    move-result-object p0

    return-object p0
.end method

.method public newArray(I)[Lcom/baidu/location/c;
    .locals 0

    new-array p0, p1, [Lcom/baidu/location/c;

    return-object p0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/c$a;->newArray(I)[Lcom/baidu/location/c;

    move-result-object p0

    return-object p0
.end method
