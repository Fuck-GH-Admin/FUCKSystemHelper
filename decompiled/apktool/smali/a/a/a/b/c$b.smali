.class public La/a/a/b/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/os/Messenger;

.field public c:Lcom/baidu/location/i;

.field public d:I


# direct methods
.method public constructor <init>(La/a/a/b/c;Landroid/os/Message;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/c$b;->a:Ljava/lang/String;

    iput-object v0, p0, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    new-instance v1, Lcom/baidu/location/i;

    invoke-direct {v1}, Lcom/baidu/location/i;-><init>()V

    iput-object v1, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    const/4 v1, 0x0

    iput v1, p0, La/a/a/b/c$b;->d:I

    iget-object v2, p2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iput-object v2, p0, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "packName"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, La/a/a/b/c$b;->a:Ljava/lang/String;

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "prodName"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/baidu/location/i;->f:Ljava/lang/String;

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v2

    iget-object v3, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v3, v3, Lcom/baidu/location/i;->f:Ljava/lang/String;

    iget-object v4, p0, La/a/a/b/c$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, La/a/a/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "coorType"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/baidu/location/i;->a:Ljava/lang/String;

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "addrType"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/baidu/location/i;->b:Ljava/lang/String;

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "enableSimulateGps"

    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/baidu/location/i;->j:Z

    sget-boolean v2, La/a/a/i/i;->k:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v2, v2, Lcom/baidu/location/i;->j:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    :goto_1
    sput-boolean v2, La/a/a/i/i;->k:Z

    sget-object v2, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v4, "all"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v2, v2, Lcom/baidu/location/i;->b:Ljava/lang/String;

    sput-object v2, La/a/a/i/i;->d:Ljava/lang/String;

    :cond_2
    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "openGPS"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v2, Lcom/baidu/location/i;->c:Z

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "scanSpan"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v2, Lcom/baidu/location/i;->d:I

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "timeOut"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v2, Lcom/baidu/location/i;->e:I

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "priority"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v2, Lcom/baidu/location/i;->g:I

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "location_change_notify"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v2, Lcom/baidu/location/i;->h:Z

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "needDirect"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, v2, Lcom/baidu/location/i;->n:Z

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "isneedaltitude"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, v2, Lcom/baidu/location/i;->s:Z

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "isneednewrgc"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, v2, Lcom/baidu/location/i;->t:Z

    sget-boolean v2, La/a/a/i/i;->g:Z

    if-nez v2, :cond_4

    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v2, v2, Lcom/baidu/location/i;->t:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move v2, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v2, v3

    :goto_3
    sput-boolean v2, La/a/a/i/i;->g:Z

    sget-boolean v2, La/a/a/i/i;->f:Z

    if-nez v2, :cond_6

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "isneedaptag"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    move v2, v1

    goto :goto_5

    :cond_6
    :goto_4
    move v2, v3

    :goto_5
    sput-boolean v2, La/a/a/i/i;->f:Z

    sget-boolean v2, La/a/a/i/i;->h:Z

    if-nez v2, :cond_8

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "isneedaptagd"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_6

    :cond_7
    move v2, v1

    goto :goto_7

    :cond_8
    :goto_6
    move v2, v3

    :goto_7
    sput-boolean v2, La/a/a/i/i;->h:Z

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const/high16 v4, 0x3f000000    # 0.5f

    const-string v5, "autoNotifyLocSensitivity"

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    sput v2, La/a/a/i/i;->O:F

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    sget v4, La/a/a/i/i;->q0:I

    const-string v5, "wfnum"

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    sget v5, La/a/a/i/i;->s0:F

    const-string v6, "wfsm"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v4

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    sget v6, La/a/a/i/i;->u0:I

    const-string v7, "gnmcon"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    sget-wide v7, La/a/a/i/i;->t0:D

    const-string v9, "gnmcrm"

    invoke-virtual {v6, v9, v7, v8}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;D)D

    move-result-wide v6

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v8

    const-string v9, "iupl"

    invoke-virtual {v8, v9, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const/16 v10, 0xa

    const-string v11, "ct"

    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    sput v9, La/a/a/i/i;->H0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const/4 v10, 0x3

    const-string v11, "suci"

    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    sput v9, La/a/a/i/i;->I0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "cgs"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getDoubleArray(Ljava/lang/String;)[D

    move-result-object v9

    sput-object v9, La/a/a/i/i;->K0:[D

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const-string v10, "ums"

    invoke-virtual {v9, v10, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    sput v9, La/a/a/i/i;->L0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v9

    const/16 v10, 0x28

    const-string v11, "smn"

    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    sput v9, La/a/a/i/i;->J0:I

    if-gtz v8, :cond_9

    sput v1, La/a/a/i/i;->G0:I

    goto :goto_8

    :cond_9
    sget v8, La/a/a/i/i;->G0:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_a

    sput v3, La/a/a/i/i;->G0:I

    :cond_a
    :goto_8
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v8

    const-string v9, "opetco"

    invoke-virtual {v8, v9, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    if-nez v8, :cond_b

    sput v1, La/a/a/i/i;->M0:I

    :cond_b
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v8

    sget v9, La/a/a/i/i;->N0:I

    const-string v10, "lpcs"

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    if-nez v8, :cond_c

    sput v1, La/a/a/i/i;->N0:I

    :cond_c
    if-ne v5, v3, :cond_d

    sput v3, La/a/a/i/i;->u0:I

    :cond_d
    sget-wide v8, La/a/a/i/i;->t0:D

    cmpl-double v5, v6, v8

    if-lez v5, :cond_e

    sput-wide v6, La/a/a/i/i;->t0:D

    :cond_e
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "ischeckper"

    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    sget-boolean v6, La/a/a/i/i;->p0:Z

    if-nez v6, :cond_10

    if-eqz v5, :cond_f

    goto :goto_9

    :cond_f
    move v5, v1

    goto :goto_a

    :cond_10
    :goto_9
    move v5, v3

    :goto_a
    sput-boolean v5, La/a/a/i/i;->p0:Z

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "isEnableBeidouMode"

    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1c

    if-lt v6, v7, :cond_13

    sget-boolean v6, La/a/a/i/i;->P0:Z

    if-nez v6, :cond_12

    if-eqz v5, :cond_11

    goto :goto_b

    :cond_11
    move v5, v1

    goto :goto_c

    :cond_12
    :goto_b
    move v5, v3

    :goto_c
    sput-boolean v5, La/a/a/i/i;->P0:Z

    :cond_13
    sget v5, La/a/a/i/i;->q0:I

    if-le v2, v5, :cond_14

    sput v2, La/a/a/i/i;->q0:I

    :cond_14
    sget v2, La/a/a/i/i;->s0:F

    cmpl-float v2, v4, v2

    if-lez v2, :cond_15

    sput v4, La/a/a/i/i;->s0:F

    :cond_15
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const v4, 0x7fffffff

    const-string v5, "wifitimeout"

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget v4, La/a/a/i/i;->a0:I

    if-ge v2, v4, :cond_16

    sput v2, La/a/a/i/i;->a0:I

    :cond_16
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "autoNotifyMaxInterval"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget v4, La/a/a/i/i;->T:I

    if-lt v2, v4, :cond_17

    sput v2, La/a/a/i/i;->T:I

    :cond_17
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "autoNotifyMinDistance"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget v4, La/a/a/i/i;->V:I

    if-lt v2, v4, :cond_18

    sput v2, La/a/a/i/i;->V:I

    :cond_18
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string v4, "autoNotifyMinTimeInterval"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget v4, La/a/a/i/i;->U:I

    if-lt v2, v4, :cond_19

    sput v2, La/a/a/i/i;->U:I

    :cond_19
    iget-object v2, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v4, v2, Lcom/baidu/location/i;->n:Z

    if-nez v4, :cond_1a

    iget-boolean v2, v2, Lcom/baidu/location/i;->s:Z

    if-eqz v2, :cond_1b

    :cond_1a
    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v2

    iget-object v4, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v4, v4, Lcom/baidu/location/i;->n:Z

    invoke-virtual {v2, v4}, La/a/a/b/t;->b(Z)V

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/b/t;->c()V

    :cond_1b
    iget-boolean v2, p1, La/a/a/b/c;->c:Z

    if-nez v2, :cond_1d

    iget-object p0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean p0, p0, Lcom/baidu/location/i;->s:Z

    if-eqz p0, :cond_1c

    goto :goto_d

    :cond_1c
    move p0, v1

    goto :goto_e

    :cond_1d
    :goto_d
    move p0, v3

    :goto_e
    iput-boolean p0, p1, La/a/a/b/c;->c:Z

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->v0:I

    const-string v2, "hpdts"

    invoke-virtual {p0, v2, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v3, :cond_1e

    sput v3, La/a/a/i/i;->v0:I

    goto :goto_f

    :cond_1e
    sput v1, La/a/a/i/i;->v0:I

    :goto_f
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->w0:I

    const-string v2, "oldts"

    invoke-virtual {p0, v2, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v3, :cond_1f

    sput v3, La/a/a/i/i;->w0:I

    goto :goto_10

    :cond_1f
    sput v1, La/a/a/i/i;->w0:I

    :goto_10
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->x0:I

    const-string v1, "onic"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-nez p0, :cond_20

    sput p0, La/a/a/i/i;->x0:I

    :cond_20
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->y0:I

    const-string v1, "nlcs"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v3, :cond_21

    sput p0, La/a/a/i/i;->y0:I

    :cond_21
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->z0:F

    const-string v1, "ncsr"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    sput p0, La/a/a/i/i;->z0:F

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->A0:F

    const-string v1, "cscr"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    sput p0, La/a/a/i/i;->A0:F

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    sget p1, La/a/a/i/i;->B0:I

    const-string v1, "cls"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    sput p0, La/a/a/i/i;->B0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "ocs"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p0

    sput-object p0, La/a/a/i/i;->C0:[I

    invoke-static {p0}, La/a/a/i/i;->a([I)Z

    move-result p0

    sput-boolean p0, La/a/a/i/i;->D0:Z

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "topCellNumber"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    sput p0, La/a/a/i/i;->E0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "locStrLength"

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    sput p0, La/a/a/i/i;->F0:I

    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "connectBssid"

    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1, v0, p0}, La/a/a/g/f;->a(Landroid/net/wifi/WifiInfo;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(La/a/a/b/c$b;I)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/c$b;->a(I)V

    return-void
.end method

.method public static synthetic a(La/a/a/b/c$b;ILandroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/b/c$b;->a(ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final a(ZLcom/baidu/location/c;Lcom/baidu/location/c;)D
    .locals 11

    const-string p0, "gcj2wgs"

    const-string v0, "wgs84"

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_4

    invoke-virtual {p3}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    const-string v3, "bd09"

    const-string v4, "bd092gcj"

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p3}, Lcom/baidu/location/c;->t()D

    move-result-wide p0

    invoke-virtual {p3}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-static {p0, p1, v5, v6, v4}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p0

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v5

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8, v4}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p1

    aget-wide v3, p0, v2

    aget-wide v5, p0, v1

    aget-wide v7, p1, v2

    aget-wide v9, p1, v1

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v5, 0x2

    if-nez p1, :cond_3

    invoke-virtual {p2}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v5

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8, v4}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    const-string v3, "bd09ll"

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    const-string p1, "bd09ll2gcj"

    invoke-static {v3, v4, v5, v6, p1}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p1

    goto :goto_0

    :cond_2
    new-array p1, v5, [D

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    aput-wide v3, p1, v1

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    aput-wide v3, p1, v2

    :goto_0
    aget-wide v3, p1, v1

    aget-wide v5, p1, v2

    invoke-static {v3, v4, v5, v6, p0}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p0

    goto :goto_1

    :cond_3
    new-array p0, v5, [D

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    aput-wide v3, p0, v1

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    aput-wide v3, p0, v2

    :goto_1
    aget-wide v2, p0, v2

    invoke-virtual {p2, v2, v3}, Lcom/baidu/location/c;->c(D)V

    aget-wide p0, p0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {p3}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    invoke-virtual {p3}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    invoke-virtual {p3}, Lcom/baidu/location/c;->t()D

    move-result-wide v5

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v9

    :goto_2
    invoke-static/range {v3 .. v10}, La/a/a/i/i;->a(DDDD)D

    move-result-wide p0

    :goto_3
    invoke-virtual {p3, p0, p1}, Lcom/baidu/location/c;->b(D)V

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6, p0}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p0

    aget-wide v2, p0, v2

    invoke-virtual {p2, v2, v3}, Lcom/baidu/location/c;->c(D)V

    aget-wide p0, p0, v1

    :goto_4
    invoke-virtual {p2, p0, p1}, Lcom/baidu/location/c;->d(D)V

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual {p3}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    invoke-virtual {p2}, Lcom/baidu/location/c;->q()D

    move-result-wide v5

    invoke-virtual {p2}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-static/range {v1 .. v8}, La/a/a/i/i;->a(DDDD)D

    move-result-wide p0

    goto :goto_3

    :goto_5
    if-eqz p2, :cond_7

    invoke-virtual {p3, p2}, Lcom/baidu/location/c;->a(Lcom/baidu/location/c;)V

    :cond_7
    return-wide p0
.end method

.method public final a(D)I
    .locals 2

    const-wide/16 v0, 0x0

    cmpl-double p0, p1, v0

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    if-ltz p0, :cond_0

    cmpg-double p0, p1, v0

    if-gtz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    cmpl-double p0, p1, v0

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    if-lez p0, :cond_1

    cmpg-double p0, p1, v0

    if-gtz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    cmpl-double p0, p1, v0

    if-lez p0, :cond_2

    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    cmpg-double p0, p1, v0

    if-gtz p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const/4 p0, 0x3

    return p0
.end method

.method public a(IZLcom/baidu/location/c;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x64

    if-ne p1, v2, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, La/a/a/b/c$b;->c()Lcom/baidu/location/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v1, p1, p3}, La/a/a/b/c$b;->a(ZLcom/baidu/location/c;Lcom/baidu/location/c;)D

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La/a/a/b/c$b;->d()Lcom/baidu/location/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0, p1, p3}, La/a/a/b/c$b;->a(ZLcom/baidu/location/c;Lcom/baidu/location/c;)D

    :cond_1
    :goto_0
    const/4 p0, 0x3

    return p0

    :cond_2
    const/16 v2, 0xc8

    if-ne p1, v2, :cond_3

    return v1

    :cond_3
    const/16 v2, 0x12c

    if-ne p1, v2, :cond_4

    return v1

    :cond_4
    const/16 v2, 0x190

    if-ne p1, v2, :cond_7

    if-eqz p2, :cond_5

    invoke-virtual {p0}, La/a/a/b/c$b;->c()Lcom/baidu/location/c;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v1, p1, p3}, La/a/a/b/c$b;->a(ZLcom/baidu/location/c;Lcom/baidu/location/c;)D

    move-result-wide p1

    :goto_1
    invoke-virtual {p0, p1, p2}, La/a/a/b/c$b;->a(D)I

    move-result p0

    return p0

    :cond_5
    invoke-virtual {p0}, La/a/a/b/c$b;->d()Lcom/baidu/location/c;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v0, p1, p3}, La/a/a/b/c$b;->a(ZLcom/baidu/location/c;Lcom/baidu/location/c;)D

    move-result-wide p1

    goto :goto_1

    :cond_6
    const/4 p0, -0x1

    return p0

    :cond_7
    const/16 p0, 0x1f4

    if-ne p1, p0, :cond_8

    return v1

    :cond_8
    return v0
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-boolean v0, v0, Lcom/baidu/location/i;->h:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-boolean v0, La/a/a/i/i;->b:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x36

    goto :goto_0

    :cond_0
    const/16 v0, 0x37

    :goto_0
    invoke-virtual {p0, v0}, La/a/a/b/c$b;->a(I)V

    :cond_1
    return-void
.end method

.method public final a(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, La/a/a/b/c$b;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    instance-of p1, p1, Landroid/os/DeadObjectException;

    if-eqz p1, :cond_1

    iget p1, p0, La/a/a/b/c$b;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/a/a/b/c$b;->d:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    :try_start_0
    iget-object p2, p0, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, La/a/a/b/c$b;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    instance-of p2, p1, Landroid/os/DeadObjectException;

    if-eqz p2, :cond_1

    iget p2, p0, La/a/a/b/c$b;->d:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, La/a/a/b/c$b;->d:I

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final a(ILjava/lang/String;Lcom/baidu/location/c;)V
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, p2, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-class p2, Lcom/baidu/location/c;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 p2, 0x0

    invoke-static {p2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    :try_start_0
    iget-object p2, p0, La/a/a/b/c$b;->b:Landroid/os/Messenger;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, La/a/a/b/c$b;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    instance-of p1, p1, Landroid/os/DeadObjectException;

    if-eqz p1, :cond_1

    iget p1, p0, La/a/a/b/c$b;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/a/a/b/c$b;->d:I

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/baidu/location/c;)V
    .locals 1

    const/16 v0, 0x15

    invoke-virtual {p0, p1, v0}, La/a/a/b/c$b;->a(Lcom/baidu/location/c;I)V

    return-void
.end method

.method public a(Lcom/baidu/location/c;I)V
    .locals 11

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/d/i;->f()Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/baidu/location/c;->a(Z)V

    :cond_0
    const/16 p1, 0x15

    const-string v2, "locStr"

    if-ne p2, p1, :cond_1

    const/16 p1, 0x1b

    invoke-virtual {p0, p1, v2, v0}, La/a/a/b/c$b;->a(ILjava/lang/String;Lcom/baidu/location/c;)V

    :cond_1
    iget-object p1, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    const-string v4, "gcj02"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v5

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v7

    const-wide/16 v9, 0x1

    cmpl-double p1, v5, v9

    if-eqz p1, :cond_5

    cmpl-double p1, v7, v9

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    invoke-virtual {v0}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-static {v5, v6, v7, v8, p1}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p1

    aget-wide v3, p1, v3

    invoke-virtual {v0, v3, v4}, Lcom/baidu/location/c;->d(D)V

    aget-wide v3, p1, v1

    invoke-virtual {v0, v3, v4}, Lcom/baidu/location/c;->c(D)V

    iget-object p1, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    const-string v4, "wgs84"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object p1, p1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v4, "bd09ll"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "wgs842mc"

    invoke-static {v5, v6, v7, v8, p1}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p1

    aget-wide v3, p1, v3

    invoke-virtual {v0, v3, v4}, Lcom/baidu/location/c;->d(D)V

    aget-wide v3, p1, v1

    invoke-virtual {v0, v3, v4}, Lcom/baidu/location/c;->c(D)V

    const-string p1, "wgs84mc"

    goto :goto_0

    :cond_5
    :goto_1
    sget-boolean p1, La/a/a/i/i;->k:Z

    if-nez p1, :cond_7

    invoke-virtual {v0}, Lcom/baidu/location/c;->u()I

    move-result p1

    if-lez p1, :cond_7

    invoke-virtual {v0}, Lcom/baidu/location/c;->u()I

    move-result p1

    invoke-virtual {p0, p1, v1, v0}, La/a/a/b/c$b;->a(IZLcom/baidu/location/c;)I

    move-result p1

    goto :goto_2

    :cond_6
    sget-boolean p1, La/a/a/i/i;->k:Z

    if-nez p1, :cond_7

    invoke-virtual {v0}, Lcom/baidu/location/c;->u()I

    move-result p1

    if-lez p1, :cond_7

    invoke-virtual {v0}, Lcom/baidu/location/c;->u()I

    move-result p1

    invoke-virtual {p0, p1, v3, v0}, La/a/a/b/c$b;->a(IZLcom/baidu/location/c;)I

    move-result p1

    :goto_2
    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->j(I)V

    :cond_7
    invoke-virtual {p0, p2, v2, v0}, La/a/a/b/c$b;->a(ILjava/lang/String;Lcom/baidu/location/c;)V

    return-void
.end method

.method public b()V
    .locals 1

    const/16 v0, 0x6f

    invoke-virtual {p0, v0}, La/a/a/b/c$b;->a(I)V

    return-void
.end method

.method public final c()Lcom/baidu/location/c;
    .locals 7

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->g()Lcom/baidu/location/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v1

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    const-string v0, "gps2gcj"

    invoke-static {v1, v2, v3, v4, v0}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v0

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    const/4 v4, 0x1

    aget-wide v5, v0, v4

    iget-object v0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object v0, v0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-static {v2, v3, v5, v6, v0}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v0

    new-instance v2, Lcom/baidu/location/c;

    invoke-direct {v2}, Lcom/baidu/location/c;-><init>()V

    aget-wide v5, v0, v1

    invoke-virtual {v2, v5, v6}, Lcom/baidu/location/c;->d(D)V

    aget-wide v0, v0, v4

    invoke-virtual {v2, v0, v1}, Lcom/baidu/location/c;->c(D)V

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    const/16 v0, 0x3d

    invoke-virtual {v2, v0}, Lcom/baidu/location/c;->h(I)V

    iget-object p0, p0, La/a/a/b/c$b;->c:Lcom/baidu/location/i;

    iget-object p0, p0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-virtual {v2, p0}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return-object v2
.end method

.method public final d()Lcom/baidu/location/c;
    .locals 4

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/d;->g()Lcom/baidu/location/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/c;->t()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    const-string p0, "gps2gcj"

    invoke-static {v0, v1, v2, v3, p0}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p0

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    const/4 v1, 0x0

    aget-wide v1, p0, v1

    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/c;->d(D)V

    const/4 v1, 0x1

    aget-wide v1, p0, v1

    invoke-virtual {v0, v1, v2}, Lcom/baidu/location/c;->c(D)V

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    const/16 p0, 0x3d

    invoke-virtual {v0, p0}, Lcom/baidu/location/c;->h(I)V

    const-string p0, "gcj02"

    invoke-virtual {v0, p0}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
