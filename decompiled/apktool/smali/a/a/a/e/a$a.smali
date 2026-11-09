.class public La/a/a/e/a$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/e/a;


# direct methods
.method public constructor <init>(La/a/a/e/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/a$a;->a:La/a/a/e/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, La/a/a/e/a$a;->a:La/a/a/e/a;

    invoke-static {p1}, La/a/a/e/a;->a(La/a/a/e/a;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La/a/a/e/a$a;->a:La/a/a/e/a;

    invoke-static {p1}, La/a/a/e/a;->a(La/a/a/e/a;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/a/a/e/a$a;->a:La/a/a/e/a;

    invoke-static {p0}, La/a/a/e/a;->b(La/a/a/e/a;)Lcom/baidu/location/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/baidu/location/h;->i()V

    :cond_1
    :goto_0
    return-void
.end method
