.class public final Lcom/baidu/location/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/b/h$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/location/h$c;,
        Lcom/baidu/location/h$d;,
        Lcom/baidu/location/h$e;
    }
.end annotation


# static fields
.field public static J:Ljava/lang/String; = null

.field public static K:Z = false


# instance fields
.field public A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;

.field public C:Z

.field public D:La/a/a/b/h;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Ljava/lang/String;

.field public I:Landroid/content/ServiceConnection;

.field public a:Ljava/lang/String;

.field public b:Lcom/baidu/location/i;

.field public c:Lcom/baidu/location/i;

.field public d:Z

.field public e:Landroid/content/Context;

.field public f:Landroid/os/Messenger;

.field public g:Lcom/baidu/location/h$c;

.field public final h:Landroid/os/Messenger;

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/location/d;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/location/b;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lcom/baidu/location/c;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Lcom/baidu/location/h$d;

.field public q:Z

.field public final r:Ljava/lang/Object;

.field public s:J

.field public t:J

.field public u:J

.field public v:La/a/a/e/a;

.field public w:Lcom/baidu/location/d;

.field public x:Z

.field public y:Z

.field public z:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/location/h;->a:Ljava/lang/String;

    new-instance v1, Lcom/baidu/location/i;

    invoke-direct {v1}, Lcom/baidu/location/i;-><init>()V

    iput-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    new-instance v1, Lcom/baidu/location/i;

    invoke-direct {v1}, Lcom/baidu/location/i;-><init>()V

    iput-object v1, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/baidu/location/h;->d:Z

    iput-object v0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    iput-object v0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    iput-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    iput-boolean v1, p0, Lcom/baidu/location/h;->l:Z

    iput-boolean v1, p0, Lcom/baidu/location/h;->m:Z

    iput-boolean v1, p0, Lcom/baidu/location/h;->n:Z

    iput-boolean v1, p0, Lcom/baidu/location/h;->o:Z

    iput-object v0, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/baidu/location/h;->r:Ljava/lang/Object;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/baidu/location/h;->s:J

    iput-wide v2, p0, Lcom/baidu/location/h;->t:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/baidu/location/h;->u:J

    iput-object v0, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    iput-object v0, p0, Lcom/baidu/location/h;->w:Lcom/baidu/location/d;

    iput-boolean v1, p0, Lcom/baidu/location/h;->x:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/baidu/location/h;->y:Z

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/baidu/location/h;->z:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/baidu/location/h;->A:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/baidu/location/h;->B:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/baidu/location/h;->D:La/a/a/b/h;

    iput-boolean v1, p0, Lcom/baidu/location/h;->E:Z

    iput-boolean v1, p0, Lcom/baidu/location/h;->F:Z

    iput-boolean v1, p0, Lcom/baidu/location/h;->G:Z

    iput-object v0, p0, Lcom/baidu/location/h;->H:Ljava/lang/String;

    new-instance v0, Lcom/baidu/location/h$a;

    invoke-direct {v0, p0}, Lcom/baidu/location/h$a;-><init>(Lcom/baidu/location/h;)V

    iput-object v0, p0, Lcom/baidu/location/h;->I:Landroid/content/ServiceConnection;

    invoke-virtual {p0}, Lcom/baidu/location/h;->a()V

    iput-object p1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    new-instance p1, Lcom/baidu/location/i;

    invoke-direct {p1}, Lcom/baidu/location/i;-><init>()V

    iput-object p1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    new-instance p1, Lcom/baidu/location/h$c;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Lcom/baidu/location/h$c;-><init>(Landroid/os/Looper;Lcom/baidu/location/h;)V

    iput-object p1, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    new-instance p1, Landroid/os/Messenger;

    iget-object v0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    invoke-direct {p1, v0}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    return-void
.end method

.method public static synthetic a(Lcom/baidu/location/h;La/a/a/b/h;)La/a/a/b/h;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h;->D:La/a/a/b/h;

    return-object p1
.end method

.method public static synthetic a(Lcom/baidu/location/h;)Landroid/os/Messenger;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    return-object p0
.end method

.method public static synthetic a(Lcom/baidu/location/h;Landroid/os/Messenger;)Landroid/os/Messenger;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    return-object p1
.end method

.method public static synthetic a(Lcom/baidu/location/h;Lcom/baidu/location/h$d;)Lcom/baidu/location/h$d;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    return-object p1
.end method

.method public static synthetic a(Lcom/baidu/location/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/h;->H:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lcom/baidu/location/h;ILandroid/app/Notification;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/baidu/location/h;->a(ILandroid/app/Notification;)V

    return-void
.end method

.method public static synthetic a(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->g(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic a(Lcom/baidu/location/h;Landroid/os/Message;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/baidu/location/h;->a(Landroid/os/Message;I)V

    return-void
.end method

.method public static synthetic a(Lcom/baidu/location/h;Lcom/baidu/location/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->b(Lcom/baidu/location/c;)V

    return-void
.end method

.method public static synthetic a(Lcom/baidu/location/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/h;->d:Z

    return p1
.end method

.method public static synthetic b(Lcom/baidu/location/h;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->e(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic b(Lcom/baidu/location/h;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Z)V
    .locals 0

    sput-boolean p0, Lcom/baidu/location/h;->K:Z

    return-void
.end method

.method public static synthetic b(Lcom/baidu/location/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/h;->o:Z

    return p1
.end method

.method public static synthetic c(Lcom/baidu/location/h;)Lcom/baidu/location/i;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    return-object p0
.end method

.method public static synthetic c(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->b(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic c(Lcom/baidu/location/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/h;->q:Z

    return p1
.end method

.method public static synthetic d(Lcom/baidu/location/h;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->r:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic d(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->h(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic d(Lcom/baidu/location/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/h;->F:Z

    return p1
.end method

.method public static synthetic e(Lcom/baidu/location/h;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic e(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->c(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic e(Lcom/baidu/location/h;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->a(Z)V

    return-void
.end method

.method public static synthetic f(Lcom/baidu/location/h;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic f(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->i(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic g(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->d(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic g(Lcom/baidu/location/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/h;->m:Z

    return p0
.end method

.method public static synthetic h(Lcom/baidu/location/h;)Lcom/baidu/location/h$d;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    return-object p0
.end method

.method public static synthetic h(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->f(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic i(Lcom/baidu/location/h;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baidu/location/h;->a(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic i(Lcom/baidu/location/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/h;->y:Z

    return p0
.end method

.method public static synthetic j(Lcom/baidu/location/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->f()V

    return-void
.end method

.method public static synthetic k(Lcom/baidu/location/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->g()V

    return-void
.end method

.method public static synthetic l(Lcom/baidu/location/h;)Lcom/baidu/location/h$c;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    return-object p0
.end method

.method public static synthetic m(Lcom/baidu/location/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->d()V

    return-void
.end method

.method public static synthetic n(Lcom/baidu/location/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->c()V

    return-void
.end method

.method public static synthetic o(Lcom/baidu/location/h;)V
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->e()V

    return-void
.end method

.method public static synthetic p(Lcom/baidu/location/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/h;->F:Z

    return p0
.end method

.method public static synthetic q(Lcom/baidu/location/h;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/h;->E:Z

    return p0
.end method

.method public static synthetic r(Lcom/baidu/location/h;)Landroid/os/Messenger;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    return-object p0
.end method

.method public static synthetic s(Lcom/baidu/location/h;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual {p0}, Lcom/baidu/location/h;->b()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/baidu/location/h;)Lcom/baidu/location/i;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    return-object p0
.end method

.method public static synthetic u(Lcom/baidu/location/h;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->B:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic v(Lcom/baidu/location/h;)La/a/a/b/h;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->D:La/a/a/b/h;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    sget-boolean p0, Lcom/baidu/location/h;->K:Z

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const-string p0, "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface"

    const-string v0, "baidu_location_Client"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(I)V
    .locals 7

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    iget-object v0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-object v0, v0, Lcom/baidu/location/i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    :cond_0
    iget-boolean p1, p0, Lcom/baidu/location/h;->l:Z

    const/16 v0, 0x43

    const/16 v1, 0x42

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    iget-object p1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean p1, p1, Lcom/baidu/location/i;->h:Z

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v2, 0x3d

    if-eq p1, v2, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-eq p1, v1, :cond_2

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-eq p1, v0, :cond_2

    iget-boolean p1, p0, Lcom/baidu/location/h;->x:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v2, 0xa1

    if-ne p1, v2, :cond_8

    :cond_2
    iget-boolean p1, p0, Lcom/baidu/location/h;->n:Z

    const/4 v2, 0x0

    if-nez p1, :cond_3

    iget-wide v3, p0, Lcom/baidu/location/h;->u:J

    const-wide/16 v5, -0x1

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/baidu/location/h;->u:J

    sub-long/2addr v3, v5

    invoke-virtual {p0}, Lcom/baidu/location/h;->h()Lcom/baidu/location/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/location/i;->g()I

    move-result p1

    add-int/lit16 p1, p1, -0x12c

    int-to-long v5, p1

    cmp-long p1, v3, v5

    if-ltz p1, :cond_6

    :cond_3
    iget-object p1, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/location/d;

    iget-object v4, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-interface {v3, v4}, Lcom/baidu/location/d;->a(Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/location/b;

    iget-object v4, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {v3, v4}, Lcom/baidu/location/b;->a(Lcom/baidu/location/c;)V

    goto :goto_1

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/baidu/location/h;->u:J

    iget-boolean p1, p0, Lcom/baidu/location/h;->n:Z

    if-eqz p1, :cond_6

    iput-boolean v2, p0, Lcom/baidu/location/h;->n:Z

    :cond_6
    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-eq p1, v1, :cond_8

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    iput-boolean v2, p0, Lcom/baidu/location/h;->l:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/baidu/location/h;->t:J

    :cond_8
    :goto_2
    return-void
.end method

.method public final a(ILandroid/app/Notification;)V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    const-class v2, Lcom/baidu/location/f;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "notification"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p2, "id"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "command"

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p1, v1, :cond_0

    iget-object p1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    iput-boolean p2, p0, Lcom/baidu/location/h;->G:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final a(Landroid/os/Message;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Lcom/baidu/location/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "locStr"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/baidu/location/c;

    iget-object v0, p0, Lcom/baidu/location/h;->w:Lcom/baidu/location/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/location/i;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v1, 0x41

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, Lcom/baidu/location/h;->w:Lcom/baidu/location/d;

    invoke-interface {p0, p1}, Lcom/baidu/location/d;->a(Lcom/baidu/location/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final a(Landroid/os/Message;I)V
    .locals 7

    iget-boolean v0, p0, Lcom/baidu/location/h;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Lcom/baidu/location/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "locStr"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/baidu/location/c;

    iput-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v0, 0x3d

    if-ne p1, v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/baidu/location/h;->s:J

    :cond_1
    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v0, 0xa1

    if-ne p1, v0, :cond_3

    :cond_2
    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v4

    iget-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    invoke-virtual {p1}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, La/a/a/b/a;->a(DDLjava/lang/String;)V

    :cond_3
    invoke-virtual {p0, p2}, Lcom/baidu/location/h;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(Lcom/baidu/location/b;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    const/16 v0, 0x514

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    iput-object p1, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "please set a non-null listener"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a(Lcom/baidu/location/c;)V
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/location/h;->F:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/h;->E:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    const/16 v0, 0x2bd

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    iput-object p1, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public a(Lcom/baidu/location/d;)V
    .locals 1

    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    iput-object p1, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public a(Lcom/baidu/location/i;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lcom/baidu/location/i;

    invoke-direct {p1}, Lcom/baidu/location/i;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lcom/baidu/location/i;->b()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/baidu/location/i;->a(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/baidu/location/i;->b(Z)V

    :cond_1
    new-instance v0, Lcom/baidu/location/i;

    invoke-direct {v0, p1}, Lcom/baidu/location/i;-><init>(Lcom/baidu/location/i;)V

    iput-object v0, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    iput-object p1, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/b;

    invoke-virtual {v0, p1}, Lcom/baidu/location/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    const-class v2, Lcom/baidu/location/f;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "removenotify"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "command"

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/location/h;->G:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final b()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/baidu/location/h;->a:Ljava/lang/String;

    const-string v2, "packName"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-object v1, v1, Lcom/baidu/location/i;->f:Ljava/lang/String;

    const-string v2, "prodName"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-object v1, v1, Lcom/baidu/location/i;->a:Ljava/lang/String;

    const-string v2, "coorType"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-object v1, v1, Lcom/baidu/location/i;->b:Ljava/lang/String;

    const-string v2, "addrType"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->c:Z

    const-string v2, "openGPS"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->h:Z

    const-string v2, "location_change_notify"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget v1, v1, Lcom/baidu/location/i;->d:I

    const-string v2, "scanSpan"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->j:Z

    const-string v2, "enableSimulateGps"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget v1, v1, Lcom/baidu/location/i;->e:I

    const-string v2, "timeOut"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget v1, v1, Lcom/baidu/location/i;->g:I

    const-string v2, "priority"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->z:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "map"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->A:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "import"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->n:Z

    const-string v2, "needDirect"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->o:Z

    const-string v2, "isneedaptag"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->q:Z

    const-string v2, "isneedpoiregion"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->r:Z

    const-string v2, "isneedregular"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->p:Z

    const-string v2, "isneedaptagd"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->s:Z

    const-string v2, "isneedaltitude"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->t:Z

    const-string v2, "isneednewrgc"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    invoke-virtual {v1}, Lcom/baidu/location/i;->b()I

    move-result v1

    const-string v2, "autoNotifyMaxInterval"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    invoke-virtual {v1}, Lcom/baidu/location/i;->e()I

    move-result v1

    const-string v2, "autoNotifyMinTimeInterval"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    invoke-virtual {v1}, Lcom/baidu/location/i;->d()I

    move-result v1

    const-string v2, "autoNotifyMinDistance"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    invoke-virtual {v1}, Lcom/baidu/location/i;->a()F

    move-result v1

    const-string v2, "autoNotifyLocSensitivity"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget v1, v1, Lcom/baidu/location/i;->A:I

    const-string v2, "wifitimeout"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->c:I

    const-string v2, "wfnum"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget-boolean v1, v1, La/a/a/b/a;->b:Z

    const-string v2, "ischeckper"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget-wide v1, v1, La/a/a/b/a;->e:D

    double-to-float v1, v1

    const-string v2, "wfsm"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget-wide v1, v1, La/a/a/b/a;->h:D

    const-string v3, "gnmcrm"

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->i:I

    const-string v2, "gnmcon"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->j:I

    const-string v2, "iupl"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->g:I

    const-string v2, "lpcs"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->l:I

    const-string v2, "hpdts"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->m:I

    const-string v2, "oldts"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v1, v1, Lcom/baidu/location/i;->C:Z

    const-string v2, "isEnableBeidouMode"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->n:I

    const-string v2, "onic"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->o:I

    const-string v2, "nlcs"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->p:F

    const-string v2, "ncsr"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    iget v1, v1, La/a/a/b/a;->q:F

    const-string v2, "cscr"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object p0, p0, Lcom/baidu/location/h;->H:Ljava/lang/String;

    const-string v1, "connectBssid"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object p0

    iget p0, p0, La/a/a/b/a;->r:I

    const-string v1, "cls"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object p0

    iget-object p0, p0, La/a/a/b/a;->s:[I

    const-string v1, "ocs"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object p0

    iget p0, p0, La/a/a/b/a;->t:I

    const-string v1, "topCellNumber"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object p0

    iget p0, p0, La/a/a/b/a;->u:I

    const-string v1, "locStrLength"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public final b(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/d;

    iget-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Lcom/baidu/location/c;)V
    .locals 7

    iget-boolean v0, p0, Lcom/baidu/location/h;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/baidu/location/h;->k:Lcom/baidu/location/c;

    iget-boolean v0, p0, Lcom/baidu/location/h;->F:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v1, 0xa1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/h;->E:Z

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/baidu/location/c;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, La/a/a/b/a;->a(DDLjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/location/d;

    invoke-interface {v1, p1}, Lcom/baidu/location/d;->a(Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_2
    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/b;

    invoke-virtual {v0, p1}, Lcom/baidu/location/b;->a(Lcom/baidu/location/c;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final c()V
    .locals 7

    iget-object v0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-static {v0}, La/a/a/i/i;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/baidu/location/h;->s:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xbb8

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gtz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    if-eqz v1, :cond_1

    iget-boolean v1, v1, Lcom/baidu/location/i;->h:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-boolean v1, p0, Lcom/baidu/location/h;->m:Z

    if-eqz v1, :cond_5

    :cond_2
    if-ne v0, v3, :cond_5

    iget-boolean v0, p0, Lcom/baidu/location/h;->x:Z

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/baidu/location/h;->t:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x4e20

    cmp-long v0, v0, v4

    if-gtz v0, :cond_3

    iget-boolean v0, p0, Lcom/baidu/location/h;->m:Z

    if-eqz v0, :cond_9

    :cond_3
    const/16 v0, 0x16

    invoke-static {v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-boolean v1, p0, Lcom/baidu/location/h;->m:Z

    if-eqz v1, :cond_4

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-boolean v4, p0, Lcom/baidu/location/h;->m:Z

    const-string v5, "isWaitingLocTag"

    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v4, 0x0

    iput-boolean v4, p0, Lcom/baidu/location/h;->m:Z

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    :cond_4
    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object v1, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iput-boolean v3, p0, Lcom/baidu/location/h;->l:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :cond_5
    if-ge v0, v3, :cond_9

    new-instance v1, Lcom/baidu/location/c;

    invoke-direct {v1}, Lcom/baidu/location/c;-><init>()V

    const/4 v4, -0x1

    if-ne v0, v4, :cond_6

    const/16 v0, 0x45

    :goto_0
    invoke-virtual {v1, v0}, Lcom/baidu/location/c;->h(I)V

    goto :goto_1

    :cond_6
    const/4 v4, -0x2

    if-ne v0, v4, :cond_7

    const/16 v0, 0x46

    goto :goto_0

    :cond_7
    if-nez v0, :cond_8

    const/16 v0, 0x47

    goto :goto_0

    :cond_8
    :goto_1
    invoke-virtual {p0, v1}, Lcom/baidu/location/h;->c(Lcom/baidu/location/c;)V

    :cond_9
    :goto_2
    iget-object v0, p0, Lcom/baidu/location/h;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    if-eqz v1, :cond_b

    iget v1, v1, Lcom/baidu/location/i;->d:I

    const/16 v4, 0x3e8

    if-lt v1, v4, :cond_b

    iget-boolean v4, p0, Lcom/baidu/location/h;->o:Z

    if-nez v4, :cond_b

    iget-object v4, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    if-nez v4, :cond_a

    new-instance v4, Lcom/baidu/location/h$d;

    invoke-direct {v4, p0, v2}, Lcom/baidu/location/h$d;-><init>(Lcom/baidu/location/h;Lcom/baidu/location/h$a;)V

    iput-object v4, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    :cond_a
    iget-object v2, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    iget-object v4, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    int-to-long v5, v1

    invoke-virtual {v2, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v3, p0, Lcom/baidu/location/h;->o:Z

    :cond_b
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public final c(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/b;

    iget-object v0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final c(Lcom/baidu/location/c;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/location/d;

    invoke-interface {v1, p1}, Lcom/baidu/location/d;->a(Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/b;

    invoke-virtual {v0, p1}, Lcom/baidu/location/b;->a(Lcom/baidu/location/c;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x16

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object p0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final d(Landroid/os/Message;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/e;

    iget-object v0, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    if-nez v0, :cond_1

    new-instance v0, La/a/a/e/a;

    iget-object v1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, La/a/a/e/a;-><init>(Landroid/content/Context;Lcom/baidu/location/h;)V

    iput-object v0, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    :cond_1
    iget-object p0, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    invoke-virtual {p0, p1}, La/a/a/e/a;->a(Lcom/baidu/location/e;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x1c

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object p0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final e(Landroid/os/Message;)V
    .locals 0

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/d;

    iput-object p1, p0, Lcom/baidu/location/h;->w:Lcom/baidu/location/d;

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 4

    iget-boolean v0, p0, Lcom/baidu/location/h;->d:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/h;->B:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-static {v0}, La/a/a/i/i;->g(Landroid/content/Context;)Z

    move-result v0

    iget-object v2, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    invoke-virtual {v2}, Lcom/baidu/location/i;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    if-eqz v0, :cond_2

    :try_start_0
    new-instance v0, Lcom/baidu/location/h$b;

    invoke-direct {v0, p0}, Lcom/baidu/location/h$b;-><init>(Lcom/baidu/location/h;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    iget-object v0, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    invoke-virtual {v0}, Lcom/baidu/location/i;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/baidu/location/h;->B:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/location/h;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/baidu/location/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_bdls_v2.9"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    const-class v3, Lcom/baidu/location/f;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "debug_dev"

    :try_start_1
    iget-boolean v3, p0, Lcom/baidu/location/h;->C:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    iget-object v2, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    if-nez v2, :cond_4

    new-instance v2, Lcom/baidu/location/i;

    invoke-direct {v2}, Lcom/baidu/location/i;-><init>()V

    iput-object v2, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    :cond_4
    iget-object v2, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v2, v2, Lcom/baidu/location/i;->l:Z

    const-string v3, "cache_exception"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v2, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-boolean v2, v2, Lcom/baidu/location/i;->m:Z

    const-string v3, "kill_process"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    sget-object v2, Lcom/baidu/location/h;->J:Ljava/lang/String;

    const-string v3, "auth_key"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :try_start_2
    iget-object v2, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/baidu/location/h;->I:Landroid/content/ServiceConnection;

    invoke-virtual {v2, v0, v3, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/h;->d:Z

    :goto_0
    return-void
.end method

.method public final f(Landroid/os/Message;)V
    .locals 0

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/e;

    iget-object p0, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, La/a/a/e/a;->b(Lcom/baidu/location/e;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final g()V
    .locals 5

    iget-boolean v0, p0, Lcom/baidu/location/h;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    iput-object v2, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    :try_start_0
    iget-object v2, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    invoke-virtual {v2, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/4 v0, 0x0

    :try_start_1
    iget-object v2, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/baidu/location/h;->I:Landroid/content/ServiceConnection;

    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-boolean v2, p0, Lcom/baidu/location/h;->G:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v2, :cond_1

    :try_start_2
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    const-class v4, Lcom/baidu/location/f;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v3, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :try_start_3
    iput-boolean v0, p0, Lcom/baidu/location/h;->G:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_1
    iget-object v2, p0, Lcom/baidu/location/h;->r:Ljava/lang/Object;

    monitor-enter v2

    :try_start_4
    iget-boolean v3, p0, Lcom/baidu/location/h;->o:Z

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    iget-object v3, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    iget-object v4, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-boolean v0, p0, Lcom/baidu/location/h;->o:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_3
    :cond_2
    :goto_1
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v2, p0, Lcom/baidu/location/h;->v:La/a/a/e/a;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, La/a/a/e/a;->c()V

    :cond_3
    iput-object v1, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    iput-boolean v0, p0, Lcom/baidu/location/h;->m:Z

    iput-boolean v0, p0, Lcom/baidu/location/h;->x:Z

    iput-boolean v0, p0, Lcom/baidu/location/h;->d:Z

    iput-boolean v0, p0, Lcom/baidu/location/h;->E:Z

    iput-boolean v0, p0, Lcom/baidu/location/h;->F:Z

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lcom/baidu/location/h;->u:J

    iput-boolean v0, p0, Lcom/baidu/location/h;->n:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/baidu/location/h;->B:Ljava/lang/Boolean;

    return-void

    :goto_2
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p0

    :cond_4
    :goto_3
    return-void
.end method

.method public final g(Landroid/os/Message;)V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/h;->m:Z

    if-eqz p1, :cond_7

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    check-cast p1, Lcom/baidu/location/i;

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    invoke-virtual {v1, p1}, Lcom/baidu/location/i;->a(Lcom/baidu/location/i;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget v1, v1, Lcom/baidu/location/i;->d:I

    iget v2, p1, Lcom/baidu/location/i;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    :try_start_0
    iget-object v1, p0, Lcom/baidu/location/h;->r:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v2, p0, Lcom/baidu/location/h;->o:Z

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    iget-object v5, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    invoke-virtual {v2, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-boolean v0, p0, Lcom/baidu/location/h;->o:Z

    :cond_1
    iget v0, p1, Lcom/baidu/location/i;->d:I

    const/16 v2, 0x3e8

    if-lt v0, v2, :cond_3

    iget-boolean v2, p0, Lcom/baidu/location/h;->o:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    if-nez v2, :cond_2

    new-instance v2, Lcom/baidu/location/h$d;

    invoke-direct {v2, p0, v3}, Lcom/baidu/location/h$d;-><init>(Lcom/baidu/location/h;Lcom/baidu/location/h$a;)V

    iput-object v2, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    :cond_2
    iget-object v2, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    iget-object v5, p0, Lcom/baidu/location/h;->p:Lcom/baidu/location/h$d;

    int-to-long v6, v0

    invoke-virtual {v2, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v4, p0, Lcom/baidu/location/h;->o:Z

    :cond_3
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_4
    :goto_0
    new-instance v0, Lcom/baidu/location/i;

    invoke-direct {v0, p1}, Lcom/baidu/location/i;-><init>(Lcom/baidu/location/i;)V

    iput-object v0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    iget-object p1, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    if-nez p1, :cond_5

    return-void

    :cond_5
    iget-object p1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-static {p1}, La/a/a/i/i;->a(Landroid/content/Context;)I

    move-result p1

    if-ge p1, v4, :cond_6

    return-void

    :cond_6
    const/16 p1, 0xf

    :try_start_3
    invoke-static {v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/location/h;->h:Landroid/os/Messenger;

    iput-object v0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {p0}, Lcom/baidu/location/h;->b()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iget-object p0, p0, Lcom/baidu/location/h;->f:Landroid/os/Messenger;

    invoke-virtual {p0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_1
    return-void
.end method

.method public h()Lcom/baidu/location/i;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/h;->b:Lcom/baidu/location/i;

    return-object p0
.end method

.method public final h(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/d;

    iget-object v0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/baidu/location/h;->i:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public i()V
    .locals 1

    iget-object p0, p0, Lcom/baidu/location/h;->g:Lcom/baidu/location/h$c;

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final i(Landroid/os/Message;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/baidu/location/b;

    iget-object v0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/baidu/location/h;->j:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public j()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/location/h;->y:Z

    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object v0

    sget-boolean v1, Lcom/baidu/location/h;->K:Z

    invoke-virtual {v0, v1}, Lc/a/c/a/b;->a(Z)V

    invoke-static {}, La/a/a/b/a;->c()La/a/a/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/location/h;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/baidu/location/h;->c:Lcom/baidu/location/i;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, La/a/a/b/a;->a(Landroid/content/Context;Lcom/baidu/location/i;Ljava/lang/String;)V

    new-instance v0, Lcom/baidu/location/h$e;

    invoke-direct {v0, p0, v3}, Lcom/baidu/location/h$e;-><init>(Lcom/baidu/location/h;Lcom/baidu/location/h$a;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
