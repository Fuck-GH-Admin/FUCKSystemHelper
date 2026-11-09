.class public La/a/a/h/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/h/a;->onDestroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(La/a/a/h/a;Ljava/lang/ref/WeakReference;)V
    .locals 0

    iput-object p2, p0, La/a/a/h/a$a;->b:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object p0, p0, La/a/a/h/a$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/a/a/h/a;

    if-eqz p0, :cond_0

    invoke-static {p0}, La/a/a/h/a;->a(La/a/a/h/a;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string v0, "baidu_location_service"

    const-string v1, "baidu location service force stopped ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/a/a/h/a;->a(La/a/a/h/a;Z)Z

    invoke-static {p0}, La/a/a/h/a;->b(La/a/a/h/a;)V

    :cond_0
    return-void
.end method
