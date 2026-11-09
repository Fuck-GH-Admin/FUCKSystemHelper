.class public Lcom/baidu/location/h$c;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/baidu/location/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/baidu/location/h;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/baidu/location/h$c;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    iget-object v0, p0, Lcom/baidu/location/h$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/h;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/16 v2, 0x1a

    if-eq v1, v2, :cond_11

    const/16 v2, 0x1b

    if-eq v1, v2, :cond_10

    const/16 v2, 0x36

    const/4 v3, 0x1

    if-eq v1, v2, :cond_f

    const/16 v2, 0x37

    const/4 v4, 0x0

    if-eq v1, v2, :cond_e

    const/16 v2, 0x2bf

    if-eq v1, v2, :cond_d

    const/16 v2, 0x2c0

    if-eq v1, v2, :cond_c

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {v0}, Lcom/baidu/location/h;->o(Lcom/baidu/location/h;)V

    goto/16 :goto_5

    :pswitch_1
    invoke-static {v0}, Lcom/baidu/location/h;->m(Lcom/baidu/location/h;)V

    goto/16 :goto_5

    :pswitch_2
    invoke-static {v0, p1}, Lcom/baidu/location/h;->h(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_3
    invoke-static {v0, p1}, Lcom/baidu/location/h;->g(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_4
    invoke-static {v0, p1}, Lcom/baidu/location/h;->b(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_5
    invoke-static {v0, p1}, Lcom/baidu/location/h;->d(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_6
    invoke-static {v0, p1}, Lcom/baidu/location/h;->c(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_7
    invoke-static {v0}, Lcom/baidu/location/h;->n(Lcom/baidu/location/h;)V

    goto/16 :goto_5

    :pswitch_8
    invoke-static {v0, p1}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :pswitch_9
    invoke-static {v0}, Lcom/baidu/location/h;->k(Lcom/baidu/location/h;)V

    goto/16 :goto_5

    :pswitch_a
    invoke-static {v0}, Lcom/baidu/location/h;->j(Lcom/baidu/location/h;)V

    goto/16 :goto_5

    :goto_0
    const/16 v2, 0x15

    if-eq v1, v2, :cond_9

    const/16 v2, 0x12f

    const-string v3, "UTF-8"

    if-eq v1, v2, :cond_8

    const/16 v2, 0x196

    if-eq v1, v2, :cond_6

    const/16 v2, 0x2bd

    if-eq v1, v2, :cond_5

    const/16 v2, 0x2c4

    if-eq v1, v2, :cond_4

    const/16 v2, 0x324

    if-eq v1, v2, :cond_3

    const/16 v2, 0x514

    if-eq v1, v2, :cond_2

    const/16 v2, 0x578

    if-eq v1, v2, :cond_1

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto/16 :goto_5

    :cond_1
    invoke-static {v0, p1}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {v0, p1}, Lcom/baidu/location/h;->e(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto/16 :goto_5

    :cond_3
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-class p1, Lcom/baidu/location/c;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string p1, "vdr_location"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Lcom/baidu/location/c;

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/b;

    invoke-virtual {v0, p0}, Lcom/baidu/location/b;->b(Lcom/baidu/location/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_4
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/baidu/location/h;->b(Lcom/baidu/location/h;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Lcom/baidu/location/c;

    invoke-static {v0, p0}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Lcom/baidu/location/c;)V

    goto/16 :goto_5

    :cond_6
    :try_start_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "mac"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    :cond_7
    const-string p1, "hotspot"

    const/4 v2, -0x1

    invoke-virtual {p0, p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/b;

    invoke-virtual {v0, v1, p0}, Lcom/baidu/location/b;->a(Ljava/lang/String;I)V

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "loctype"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    const-string v1, "diagtype"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "diagmessage"

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p0

    if-lez p1, :cond_12

    if-lez v1, :cond_12

    if-eqz p0, :cond_12

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-static {v0}, Lcom/baidu/location/h;->f(Lcom/baidu/location/h;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/location/b;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v2, p1, v1, v4}, Lcom/baidu/location/b;->a(IILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-class v1, Lcom/baidu/location/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "locStr"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Lcom/baidu/location/c;

    invoke-static {v0}, Lcom/baidu/location/h;->p(Lcom/baidu/location/h;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-static {v0}, Lcom/baidu/location/h;->q(Lcom/baidu/location/h;)Z

    move-result v1

    if-ne v1, v3, :cond_a

    invoke-virtual {p0}, Lcom/baidu/location/c;->r()I

    move-result p0

    const/16 v1, 0x42

    if-ne p0, v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-static {v0}, Lcom/baidu/location/h;->p(Lcom/baidu/location/h;)Z

    move-result p0

    if-nez p0, :cond_b

    invoke-static {v0}, Lcom/baidu/location/h;->q(Lcom/baidu/location/h;)Z

    move-result p0

    if-ne p0, v3, :cond_b

    invoke-static {v0, v3}, Lcom/baidu/location/h;->d(Lcom/baidu/location/h;Z)Z

    goto :goto_5

    :cond_b
    invoke-static {v0}, Lcom/baidu/location/h;->p(Lcom/baidu/location/h;)Z

    move-result p0

    if-nez p0, :cond_11

    invoke-static {v0, v3}, Lcom/baidu/location/h;->d(Lcom/baidu/location/h;Z)Z

    goto :goto_4

    :cond_c
    :try_start_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "removenotify"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {v0, p0}, Lcom/baidu/location/h;->e(Lcom/baidu/location/h;Z)V

    goto :goto_5

    :cond_d
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "id"

    invoke-virtual {p0, p1, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_12

    const-string v1, "notification"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Landroid/app/Notification;

    invoke-static {v0, p1, p0}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;ILandroid/app/Notification;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :cond_e
    invoke-static {v0}, Lcom/baidu/location/h;->t(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object p0

    iget-boolean p0, p0, Lcom/baidu/location/i;->h:Z

    if-eqz p0, :cond_12

    invoke-static {v0, v4}, Lcom/baidu/location/h;->c(Lcom/baidu/location/h;Z)Z

    goto :goto_5

    :cond_f
    invoke-static {v0}, Lcom/baidu/location/h;->t(Lcom/baidu/location/h;)Lcom/baidu/location/i;

    move-result-object p0

    iget-boolean p0, p0, Lcom/baidu/location/i;->h:Z

    if-eqz p0, :cond_12

    invoke-static {v0, v3}, Lcom/baidu/location/h;->c(Lcom/baidu/location/h;Z)Z

    goto :goto_5

    :cond_10
    invoke-static {v0, p1}, Lcom/baidu/location/h;->i(Lcom/baidu/location/h;Landroid/os/Message;)V

    goto :goto_5

    :cond_11
    :goto_4
    invoke-static {v0, p1, v2}, Lcom/baidu/location/h;->a(Lcom/baidu/location/h;Landroid/os/Message;I)V

    :catch_0
    :cond_12
    :goto_5
    :pswitch_b
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_b
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
