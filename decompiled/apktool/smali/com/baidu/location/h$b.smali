.class public Lcom/baidu/location/h$b;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/baidu/location/h;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/baidu/location/h;


# direct methods
.method public constructor <init>(Lcom/baidu/location/h;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h$b;->b:Lcom/baidu/location/h;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/baidu/location/h$b;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/h$b;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->b(Lcom/baidu/location/h;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/i/i;->a(Landroid/content/Context;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/h$b;->b:Lcom/baidu/location/h;

    invoke-static {v0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/h;->g()V

    :cond_0
    iget-object p0, p0, Lcom/baidu/location/h$b;->b:Lcom/baidu/location/h;

    invoke-static {p0}, Lcom/baidu/location/h;->v(Lcom/baidu/location/h;)La/a/a/b/h;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/h;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
