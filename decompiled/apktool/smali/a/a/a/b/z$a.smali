.class public La/a/a/b/z$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/z;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/a/a/b/z;


# direct methods
.method public constructor <init>(La/a/a/b/z;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/z$a;->a:La/a/a/b/z;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    :try_start_0
    const-string p1, "gnss_navigation_message"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/location/GnssNavigationMessage;

    const-string v0, "gps_time"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, La/a/a/b/x;->b()La/a/a/b/x;

    move-result-object p0

    invoke-virtual {p0, p1, v0, v1}, La/a/a/b/x;->a(Landroid/location/GnssNavigationMessage;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    goto/16 :goto_2

    :pswitch_3
    invoke-static {}, La/a/a/b/y;->c()La/a/a/b/y;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/y;->a()V

    invoke-static {}, La/a/a/c/f;->d()La/a/a/c/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/c/f;->a()V

    goto/16 :goto_2

    :pswitch_4
    invoke-static {}, La/a/a/c/f;->d()La/a/a/c/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/c/f;->b()V

    goto/16 :goto_2

    :pswitch_5
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->p()Z

    move-result p1

    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-static {}, La/a/a/b/l;->f()La/a/a/b/l;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/l;->a()I

    move-result p1

    if-eq p1, v0, :cond_2

    move v1, v0

    goto :goto_0

    :cond_1
    move v1, p1

    :cond_2
    :goto_0
    if-eqz v1, :cond_4

    invoke-static {}, La/a/a/c/c;->f()La/a/a/c/c;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/c/c;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/f/d;->o()V

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/f/d;->p()V

    :cond_3
    invoke-static {}, La/a/a/c/f;->d()La/a/a/c/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/c/f;->a()V

    invoke-static {}, La/a/a/c/c;->f()La/a/a/c/c;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/c/c;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, La/a/a/b/y;->c()La/a/a/b/y;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/y;->a()V

    :cond_4
    :try_start_1
    iget-object p1, p0, La/a/a/b/z$a;->a:La/a/a/b/z;

    invoke-static {p1}, La/a/a/b/z;->a(La/a/a/b/z;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p0, p0, La/a/a/b/z$a;->a:La/a/a/b/z;

    invoke-static {p0}, La/a/a/b/z;->a(La/a/a/b/z;)Landroid/os/Handler;

    move-result-object p0

    const/4 p1, 0x4

    sget v0, La/a/a/i/i;->N:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_1
    invoke-static {}, La/a/a/b/x;->b()La/a/a/b/x;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/x;->a()V

    goto :goto_2

    :pswitch_6
    invoke-static {}, La/a/a/b/u;->d()La/a/a/g/a;

    move-result-object p0

    invoke-static {}, La/a/a/b/u;->c()Landroid/location/Location;

    move-result-object p1

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La/a/a/b/u;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, La/a/a/b/y;->a(La/a/a/g/a;La/a/a/g/k;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_7
    invoke-static {}, La/a/a/b/u;->d()La/a/a/g/a;

    move-result-object p0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object p1

    invoke-static {}, La/a/a/b/u;->c()Landroid/location/Location;

    move-result-object v0

    invoke-static {}, La/a/a/b/u;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La/a/a/b/u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, p1, v0, v1, v2}, La/a/a/b/y;->a(La/a/a/g/a;La/a/a/g/k;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    :try_start_2
    const-string p1, "loc"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    const-string v0, "satnum"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    if-eqz p1, :cond_6

    invoke-static {}, La/a/a/b/j;->k()La/a/a/b/j;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/j;->e(Landroid/location/Location;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :catch_2
    :cond_6
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
