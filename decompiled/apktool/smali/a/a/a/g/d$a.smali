.class public La/a/a/g/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/OnNmeaMessageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/g/d;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/d$a;->a:La/a/a/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNmeaMessage(Ljava/lang/String;J)V
    .locals 0

    iget-object p2, p0, La/a/a/g/d$a;->a:La/a/a/g/d;

    invoke-static {p2}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, La/a/a/g/d$a;->a:La/a/a/g/d;

    invoke-static {p2}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p2

    const/4 p3, 0x5

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p0, p0, La/a/a/g/d$a;->a:La/a/a/g/d;

    invoke-static {p0}, La/a/a/g/d;->m(La/a/a/g/d;)La/a/a/g/d$f;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method
