.class public La/a/a/g/d$f;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/a/a/g/d;",
            ">;"
        }
    .end annotation
.end field

.field public b:La/a/a/g/d;


# direct methods
.method public constructor <init>(La/a/a/g/d;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/a/a/g/d$f;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    sget-boolean v0, Lcom/baidu/location/f;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/g/d$f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/g/d;

    iput-object v0, p0, La/a/a/g/d$f;->b:La/a/a/g/d;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 p0, 0x3

    if-eq v1, p0, :cond_4

    const/4 p0, 0x4

    if-eq v1, p0, :cond_3

    const/4 p0, 0x5

    if-eq v1, p0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {v0, p0}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Landroid/location/Location;

    const-string p1, "&og=2"

    goto :goto_0

    :cond_4
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Landroid/location/Location;

    const-string p1, "&og=1"

    :goto_0
    invoke-static {v0, p1, p0}, La/a/a/g/d;->a(La/a/a/g/d;Ljava/lang/String;Landroid/location/Location;)V

    goto :goto_1

    :cond_5
    const/4 v0, -0x1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/location/Location;

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v1

    iget v1, v1, La/a/a/b/d;->F:I

    if-ne v1, v2, :cond_6

    invoke-static {}, La/a/a/b/i;->d()La/a/a/b/i;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/b/i;->b(Landroid/location/Location;)I

    move-result v0

    :cond_6
    iget-object p0, p0, La/a/a/g/d$f;->b:La/a/a/g/d;

    invoke-static {p0, p1, v0}, La/a/a/g/d;->a(La/a/a/g/d;Landroid/location/Location;I)V

    :goto_1
    return-void
.end method
