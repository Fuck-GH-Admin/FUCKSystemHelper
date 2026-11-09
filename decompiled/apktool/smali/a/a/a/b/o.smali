.class public La/a/a/b/o;
.super La/a/a/b/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/o$b;,
        La/a/a/b/o$c;
    }
.end annotation


# static fields
.field public static Z:La/a/a/b/o; = null

.field public static a0:Z = false


# instance fields
.field public A:J

.field public B:Lcom/baidu/location/a;

.field public C:Ljava/lang/String;

.field public D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/location/j;",
            ">;"
        }
    .end annotation
.end field

.field public E:Lcom/baidu/location/k;

.field public F:D

.field public G:D

.field public H:Z

.field public I:J

.field public J:La/a/a/b/o$b;

.field public K:Z

.field public L:Z

.field public M:Z

.field public final N:Landroid/os/Handler;

.field public O:Z

.field public P:Z

.field public Q:La/a/a/b/o$c;

.field public R:Z

.field public S:I

.field public T:J

.field public U:Z

.field public V:Z

.field public W:J

.field public X:Lcom/baidu/location/a;

.field public Y:Z

.field public m:Z

.field public n:La/a/a/b/m$c;

.field public o:Ljava/lang/String;

.field public p:Lcom/baidu/location/c;

.field public q:Lcom/baidu/location/c;

.field public r:Landroid/location/Location;

.field public s:La/a/a/g/k;

.field public t:La/a/a/g/a;

.field public u:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public v:La/a/a/g/a;

.field public w:Z

.field public volatile x:Z

.field public y:Z

.field public z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, La/a/a/b/m;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/b/o;->m:Z

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/b/o;->n:La/a/a/b/m$c;

    iput-object v1, p0, La/a/a/b/o;->o:Ljava/lang/String;

    iput-object v1, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    iput-object v1, p0, La/a/a/b/o;->q:Lcom/baidu/location/c;

    iput-object v1, p0, La/a/a/b/o;->r:Landroid/location/Location;

    iput-object v1, p0, La/a/a/b/o;->s:La/a/a/g/k;

    iput-object v1, p0, La/a/a/b/o;->t:La/a/a/g/a;

    iput-object v1, p0, La/a/a/b/o;->u:Ljava/util/HashSet;

    iput-object v1, p0, La/a/a/b/o;->v:La/a/a/g/a;

    iput-boolean v0, p0, La/a/a/b/o;->w:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, La/a/a/b/o;->x:Z

    iput-boolean v2, p0, La/a/a/b/o;->y:Z

    const-wide/16 v3, 0x0

    iput-wide v3, p0, La/a/a/b/o;->z:J

    iput-wide v3, p0, La/a/a/b/o;->A:J

    iput-object v1, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iput-object v1, p0, La/a/a/b/o;->C:Ljava/lang/String;

    iput-object v1, p0, La/a/a/b/o;->D:Ljava/util/List;

    iput-object v1, p0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    iput-boolean v2, p0, La/a/a/b/o;->H:Z

    iput-wide v3, p0, La/a/a/b/o;->I:J

    iput-object v1, p0, La/a/a/b/o;->J:La/a/a/b/o$b;

    iput-boolean v2, p0, La/a/a/b/o;->K:Z

    iput-boolean v2, p0, La/a/a/b/o;->L:Z

    iput-boolean v0, p0, La/a/a/b/o;->M:Z

    new-instance v5, La/a/a/b/m$b;

    invoke-direct {v5, p0}, La/a/a/b/m$b;-><init>(La/a/a/b/m;)V

    iput-object v5, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    iput-boolean v2, p0, La/a/a/b/o;->O:Z

    iput-boolean v2, p0, La/a/a/b/o;->P:Z

    iput-object v1, p0, La/a/a/b/o;->Q:La/a/a/b/o$c;

    iput-boolean v2, p0, La/a/a/b/o;->R:Z

    iput v2, p0, La/a/a/b/o;->S:I

    iput-wide v3, p0, La/a/a/b/o;->T:J

    iput-boolean v2, p0, La/a/a/b/o;->U:Z

    iput-boolean v2, p0, La/a/a/b/o;->V:Z

    iput-wide v3, p0, La/a/a/b/o;->W:J

    iput-object v1, p0, La/a/a/b/o;->X:Lcom/baidu/location/a;

    iput-boolean v0, p0, La/a/a/b/o;->Y:Z

    new-instance v0, La/a/a/b/m$c;

    invoke-direct {v0, p0}, La/a/a/b/m$c;-><init>(La/a/a/b/m;)V

    iput-object v0, p0, La/a/a/b/o;->n:La/a/a/b/m$c;

    new-instance p0, La/a/a/b/m$a;

    invoke-direct {p0}, La/a/a/b/m$a;-><init>()V

    return-void
.end method

.method public static synthetic a(La/a/a/b/o;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/o;->d(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic a(La/a/a/b/o;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->R:Z

    return p0
.end method

.method public static synthetic a(La/a/a/b/o;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/b/o;->R:Z

    return p1
.end method

.method public static synthetic b(La/a/a/b/o;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/b/o;->g(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic b(La/a/a/b/o;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->y:Z

    return p0
.end method

.method public static synthetic b(La/a/a/b/o;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/b/o;->y:Z

    return p1
.end method

.method public static synthetic c(La/a/a/b/o;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->K:Z

    return p0
.end method

.method public static synthetic c(La/a/a/b/o;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/b/o;->K:Z

    return p1
.end method

.method public static synthetic d(La/a/a/b/o;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->L:Z

    return p0
.end method

.method public static declared-synchronized q()La/a/a/b/o;
    .locals 2

    const-class v0, La/a/a/b/o;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/b/o;->Z:La/a/a/b/o;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/b/o;

    invoke-direct {v1}, La/a/a/b/o;-><init>()V

    sput-object v1, La/a/a/b/o;->Z:La/a/a/b/o;

    :cond_0
    sget-object v1, La/a/a/b/o;->Z:La/a/a/b/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a(Lcom/baidu/location/c;)Lcom/baidu/location/a;
    .locals 11

    sget-object v0, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v1, "all"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-boolean v0, La/a/a/i/i;->f:Z

    if-nez v0, :cond_0

    sget-boolean v0, La/a/a/i/i;->h:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    iget-wide v2, p0, La/a/a/b/o;->G:D

    iget-wide v4, p0, La/a/a/b/o;->F:D

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v6

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v8

    move-object v10, v0

    invoke-static/range {v2 .. v10}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const-wide v2, 0x408f400000000000L    # 1000.0

    const/4 p1, 0x0

    aget v4, v0, p1

    float-to-double v4, v4

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    cmpg-double v4, v4, v6

    if-gez v4, :cond_2

    iget-object p0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    iget-object v4, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-nez v4, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/b/o;->W:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xbb8

    cmp-long p1, v2, v4

    if-gez p1, :cond_4

    iget-object p1, p0, La/a/a/b/o;->X:Lcom/baidu/location/a;

    goto :goto_0

    :cond_3
    aget p1, v0, p1

    float-to-double v4, p1

    cmpg-double p1, v4, v2

    if-gez p1, :cond_4

    new-instance p1, Lcom/baidu/location/a$a;

    invoke-direct {p1}, Lcom/baidu/location/a$a;-><init>()V

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->d(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->e(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->g(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->b(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->c(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->f(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->a(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/baidu/location/a$a;->j(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {p1}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object p1

    goto :goto_0

    :cond_4
    move-object p1, v1

    :goto_0
    iput-object v1, p0, La/a/a/b/o;->C:Ljava/lang/String;

    iput-object v1, p0, La/a/a/b/o;->D:Ljava/util/List;

    iput-object v1, p0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/b/o;->H:Z

    iget-object v0, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    new-instance v1, La/a/a/b/o$a;

    invoke-direct {v1, p0}, La/a/a/b/o$a;-><init>(La/a/a/b/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method public a(Landroid/os/Message;)V
    .locals 5

    iget-object v0, p0, La/a/a/b/o;->J:La/a/a/b/o$b;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, La/a/a/b/o;->K:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/b/o;->K:Z

    iget-object v1, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/baidu/location/c;

    iget p1, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    const/16 v2, 0xa1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v3

    if-ne v3, v2, :cond_1

    invoke-virtual {v0}, Lcom/baidu/location/c;->E()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, La/a/a/b/o;->b(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, La/a/a/b/o;->e(Lcom/baidu/location/c;)V

    if-ne p1, v1, :cond_1

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object p1

    const/4 v3, 0x0

    const-string v4, "gcj02"

    invoke-virtual {p1, v0, v4, v3}, La/a/a/b/f;->a(Lcom/baidu/location/c;Ljava/lang/String;Landroid/location/Location;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v3, 0xa7

    if-ne p1, v3, :cond_2

    iget-boolean p1, p0, La/a/a/b/o;->P:Z

    if-eqz p1, :cond_2

    const/16 p1, 0x3e

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->h(I)V

    :cond_2
    iget-boolean p1, p0, La/a/a/b/o;->U:Z

    if-nez p1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result p1

    if-ne p1, v2, :cond_3

    invoke-virtual {v0}, Lcom/baidu/location/c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v2

    const-string v3, "mapcity"

    invoke-virtual {v2, v3, p1}, La/a/a/b/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v2

    invoke-virtual {v2, p1}, La/a/a/b/d;->c(Ljava/lang/String;)V

    iput-boolean v1, p0, La/a/a/b/o;->U:Z

    :cond_3
    invoke-virtual {p0, v0}, La/a/a/b/o;->c(Lcom/baidu/location/c;)V

    return-void
.end method

.method public a(ZZ)V
    .locals 7

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/f/d;->j()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/f/d;->i()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v3

    sget-object v5, La/a/a/f/d$c;->c:La/a/a/f/d$c;

    sget-object v6, La/a/a/f/d$b;->b:La/a/a/f/d$b;

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, La/a/a/f/d;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/baidu/location/c;->r()I

    move-result v1

    const/16 v2, 0x43

    if-ne v1, v2, :cond_3

    :cond_0
    if-eqz p1, :cond_3

    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object p1

    iget-boolean p1, p1, La/a/a/f/a;->k:Z

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object p0

    iget-boolean p0, p0, La/a/a/f/a;->k:Z

    if-eqz p0, :cond_2

    :goto_0
    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object p0

    invoke-virtual {p0, v0}, La/a/a/f/a;->b(Z)Lcom/baidu/location/c;

    move-result-object p0

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :cond_3
    :goto_1
    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/baidu/location/c;->r()I

    move-result p1

    const/16 v1, 0x42

    if-ne p1, v1, :cond_8

    const/4 p1, 0x1

    sget-object v1, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v2, "all"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    move p1, v0

    :cond_4
    sget-boolean v1, La/a/a/i/i;->f:Z

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move p1, v0

    :cond_5
    sget-boolean v1, La/a/a/i/i;->h:Z

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    move v0, p1

    :goto_2
    if-nez v0, :cond_7

    if-eqz p2, :cond_8

    :cond_7
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p1

    invoke-virtual {p1, p0}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    :cond_8
    return-void
.end method

.method public final a(La/a/a/g/a;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-object p0, p0, La/a/a/b/o;->v:La/a/a/g/a;

    const/4 v0, 0x1

    if-nez p0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1, p0}, La/a/a/g/a;->a(La/a/a/g/a;)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public final a(La/a/a/g/a;La/a/a/g/a;)Z
    .locals 0

    if-ne p2, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    if-eqz p2, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, La/a/a/g/a;->a(La/a/a/g/a;)Z

    move-result p1

    xor-int/2addr p0, p1

    :cond_2
    :goto_0
    return p0
.end method

.method public final a(La/a/a/g/a;Ljava/util/HashSet;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/g/a;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {p0, p1, v0}, La/a/a/b/o;->a(La/a/a/g/a;La/a/a/g/a;)Z

    move-result v0

    sget v1, La/a/a/i/i;->y0:I

    if-nez v1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    iget-object v3, p0, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {v0, p1, v3}, La/a/a/g/f;->a(La/a/a/g/a;La/a/a/g/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v2

    :goto_1
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    iget-object v3, p0, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {v0, v3}, La/a/a/g/f;->c(La/a/a/g/a;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/m;->c:Ljava/util/HashSet;

    if-nez p1, :cond_3

    invoke-virtual {p0, p2, v0}, La/a/a/b/o;->a(Ljava/util/HashSet;Ljava/util/HashSet;)Z

    move-result p0

    if-eqz p0, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    return v1
.end method

.method public final a(La/a/a/g/k;)Z
    .locals 3

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/m;->a:La/a/a/g/k;

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    iget-object p0, p0, La/a/a/b/m;->a:La/a/a/g/k;

    sget v2, La/a/a/i/i;->s0:F

    invoke-virtual {v0, p0, p1, v2}, La/a/a/g/f;->a(La/a/a/g/k;La/a/a/g/k;F)Z

    move-result p0

    xor-int/2addr p0, v1

    return p0

    :cond_2
    :goto_0
    return v1
.end method

.method public final a(Ljava/util/HashSet;Ljava/util/HashSet;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v2, p0

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    int-to-float p1, v2

    int-to-float p2, v1

    sget v1, La/a/a/i/i;->z0:F

    mul-float/2addr p2, v1

    cmpg-float p1, p1, p2

    if-gez p1, :cond_5

    move p0, v0

    :cond_5
    return p0

    :cond_6
    :goto_1
    return v0

    :cond_7
    :goto_2
    return p0
.end method

.method public b()V
    .locals 13

    iget-object v0, p0, La/a/a/b/o;->J:La/a/a/b/o$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v2, p0, La/a/a/b/o;->K:Z

    if-eqz v2, :cond_0

    iput-boolean v1, p0, La/a/a/b/o;->K:Z

    iget-object v2, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->j()Z

    move-result v0

    const-string v2, "all"

    if-eqz v0, :cond_8

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/baidu/location/c;

    invoke-direct {v3, v0}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->e()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v4

    const-string v5, "bd_beidou"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v5}, Lcom/baidu/location/c;->g(Ljava/lang/String;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/baidu/location/c;->a(Landroid/os/Bundle;)V

    :cond_2
    sget-object v0, La/a/a/i/i;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-boolean v0, La/a/a/i/i;->f:Z

    if-nez v0, :cond_3

    sget-boolean v0, La/a/a/i/i;->h:Z

    if-eqz v0, :cond_7

    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [F

    iget-wide v4, p0, La/a/a/b/o;->G:D

    iget-wide v6, p0, La/a/a/b/o;->F:D

    invoke-virtual {v3}, Lcom/baidu/location/c;->q()D

    move-result-wide v8

    invoke-virtual {v3}, Lcom/baidu/location/c;->t()D

    move-result-wide v10

    move-object v12, v0

    invoke-static/range {v4 .. v12}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v0, v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    iget-object v0, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-eqz v0, :cond_4

    invoke-virtual {v3, v0}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    :cond_4
    iget-object v0, p0, La/a/a/b/o;->C:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v3, v0}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, La/a/a/b/o;->D:Ljava/util/List;

    if-eqz v0, :cond_6

    invoke-virtual {v3, v0}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    :cond_6
    iget-object v0, p0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    if-eqz v0, :cond_7

    invoke-virtual {v3, v0}, Lcom/baidu/location/c;->a(Lcom/baidu/location/k;)V

    :cond_7
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0, v3}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    :goto_0
    invoke-virtual {p0}, La/a/a/b/o;->d()V

    return-void

    :cond_8
    iget-boolean v0, p0, La/a/a/b/o;->L:Z

    if-eqz v0, :cond_9

    invoke-virtual {p0}, La/a/a/b/o;->d()V

    return-void

    :cond_9
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->j()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_a

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->n()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v4

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v5

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v6

    sget-object v8, La/a/a/f/d$c;->c:La/a/a/f/d$c;

    sget-object v9, La/a/a/f/d$b;->b:La/a/a/f/d$b;

    const/4 v7, 0x0

    invoke-virtual/range {v4 .. v9}, La/a/a/f/d;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v4

    const/16 v5, 0x42

    if-ne v4, v5, :cond_b

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v4

    invoke-virtual {v4, v0}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    goto :goto_1

    :cond_a
    move-object v0, v3

    :cond_b
    :goto_1
    const/16 v4, 0x43

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-ne v5, v4, :cond_15

    :cond_c
    iget-boolean v5, p0, La/a/a/b/o;->m:Z

    if-nez v5, :cond_e

    iget-object v5, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-nez v5, :cond_d

    goto :goto_2

    :cond_d
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    iget-object v1, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0, v1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    goto :goto_5

    :cond_e
    :goto_2
    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object v5

    iget-boolean v5, v5, La/a/a/f/a;->k:Z

    if-eqz v5, :cond_f

    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object v0

    invoke-virtual {v0, v1}, La/a/a/f/a;->b(Z)Lcom/baidu/location/c;

    move-result-object v0

    goto :goto_3

    :cond_f
    if-nez v0, :cond_10

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0}, Lcom/baidu/location/c;-><init>()V

    invoke-virtual {v0, v4}, Lcom/baidu/location/c;->h(I)V

    :cond_10
    :goto_3
    if-eqz v0, :cond_15

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v5

    invoke-virtual {v5, v0}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v5

    if-ne v5, v4, :cond_11

    iget-boolean v5, p0, La/a/a/b/o;->P:Z

    if-nez v5, :cond_11

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v5

    const/4 v6, 0x3

    const-string v7, "Offline location failed, please check the net (wifi/cell)!"

    invoke-virtual {v5, v4, v6, v7}, La/a/a/b/g;->a(IILjava/lang/String;)V

    :cond_11
    const/4 v5, 0x1

    sget-object v6, La/a/a/i/i;->d:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {v0}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_12

    move v5, v1

    :cond_12
    sget-boolean v2, La/a/a/i/i;->f:Z

    if-eqz v2, :cond_13

    invoke-virtual {v0}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_13

    move v5, v1

    :cond_13
    sget-boolean v2, La/a/a/i/i;->h:Z

    if-eqz v2, :cond_14

    invoke-virtual {v0}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_14

    goto :goto_4

    :cond_14
    move v1, v5

    :goto_4
    if-nez v1, :cond_15

    invoke-virtual {v0, v4}, Lcom/baidu/location/c;->h(I)V

    :cond_15
    :goto_5
    iput-object v3, p0, La/a/a/b/o;->q:Lcom/baidu/location/c;

    goto/16 :goto_0
.end method

.method public final b(Landroid/os/Message;)V
    .locals 11

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/d;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/d;->e()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bd_beidou"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Lcom/baidu/location/c;->g(Ljava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(Landroid/os/Bundle;)V

    :cond_1
    sget-object p1, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v1, "all"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    sget-boolean p1, La/a/a/i/i;->f:Z

    if-nez p1, :cond_2

    sget-boolean p1, La/a/a/i/i;->h:Z

    if-eqz p1, :cond_7

    :cond_2
    const/4 p1, 0x2

    new-array p1, p1, [F

    iget-wide v2, p0, La/a/a/b/o;->G:D

    iget-wide v4, p0, La/a/a/b/o;->F:D

    invoke-virtual {v0}, Lcom/baidu/location/c;->q()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/baidu/location/c;->t()D

    move-result-wide v8

    move-object v10, p1

    invoke-static/range {v2 .. v10}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v2, 0x0

    aget p1, p1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    cmpg-float p1, p1, v2

    if-gez p1, :cond_6

    iget-object p1, p0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-eqz p1, :cond_3

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    :cond_3
    iget-object p1, p0, La/a/a/b/o;->C:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    :cond_4
    iget-object p1, p0, La/a/a/b/o;->D:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    :cond_5
    iget-object p1, p0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    if-eqz p1, :cond_7

    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(Lcom/baidu/location/k;)V

    goto :goto_0

    :cond_6
    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/b/o;->H:Z

    invoke-virtual {p0, v1}, La/a/a/b/o;->d(Landroid/os/Message;)V

    :cond_7
    :goto_0
    iput-object v0, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    iput-object v1, p0, La/a/a/b/o;->q:Lcom/baidu/location/c;

    invoke-virtual {p0, v0}, La/a/a/b/o;->b(Lcom/baidu/location/c;)V

    return-void
.end method

.method public final b(Lcom/baidu/location/c;)V
    .locals 0

    sget-boolean p0, La/a/a/i/i;->k:Z

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->u()I

    move-result p0

    if-lez p0, :cond_0

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string p1, "subway"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    return-void
.end method

.method public final c(Landroid/os/Message;)V
    .locals 1

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, La/a/a/b/o;->b(Landroid/os/Message;)V

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/t;->d()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/b/o;->d(Landroid/os/Message;)V

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/t;->c()V

    :goto_0
    return-void
.end method

.method public c(Lcom/baidu/location/c;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v8, Lcom/baidu/location/c;

    invoke-direct {v8, v1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->G()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->c()Lcom/baidu/location/a;

    move-result-object v2

    iput-object v2, v0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lcom/baidu/location/a;->e:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->F:D

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->G:D

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, La/a/a/b/o;->C:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->F:D

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->G:D

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object v2

    iput-object v2, v0, La/a/a/b/o;->D:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->F:D

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->G:D

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->y()Lcom/baidu/location/k;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->y()Lcom/baidu/location/k;

    move-result-object v2

    iput-object v2, v0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->F:D

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v2

    iput-wide v2, v0, La/a/a/b/o;->G:D

    :cond_4
    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/d;->j()Z

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_c

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/d;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/baidu/location/c;

    invoke-direct {v2, v1}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/d;->e()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v6

    const-string v7, "bd_beidou"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v2, v7}, Lcom/baidu/location/c;->g(Ljava/lang/String;)V

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(Landroid/os/Bundle;)V

    :cond_6
    sget-object v1, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v6, "all"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    sget-boolean v1, La/a/a/i/i;->f:Z

    if-nez v1, :cond_7

    sget-boolean v1, La/a/a/i/i;->h:Z

    if-eqz v1, :cond_b

    :cond_7
    new-array v1, v4, [F

    iget-wide v6, v0, La/a/a/b/o;->G:D

    iget-wide v8, v0, La/a/a/b/o;->F:D

    invoke-virtual {v2}, Lcom/baidu/location/c;->q()D

    move-result-wide v10

    invoke-virtual {v2}, Lcom/baidu/location/c;->t()D

    move-result-wide v12

    move-object v14, v1

    invoke-static/range {v6 .. v14}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v1, v1, v5

    cmpg-float v1, v1, v3

    if-gez v1, :cond_b

    iget-object v1, v0, La/a/a/b/o;->B:Lcom/baidu/location/a;

    if-eqz v1, :cond_8

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    :cond_8
    iget-object v1, v0, La/a/a/b/o;->C:Ljava/lang/String;

    if-eqz v1, :cond_9

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    :cond_9
    iget-object v1, v0, La/a/a/b/o;->D:Ljava/util/List;

    if-eqz v1, :cond_a

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    :cond_a
    iget-object v1, v0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    if-eqz v1, :cond_b

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(Lcom/baidu/location/k;)V

    :cond_b
    invoke-virtual {v0, v2}, La/a/a/b/o;->b(Lcom/baidu/location/c;)V

    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->d()V

    return-void

    :cond_c
    iget-boolean v2, v0, La/a/a/b/o;->L:Z

    if-eqz v2, :cond_10

    new-array v2, v4, [F

    iget-object v3, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/baidu/location/c;->q()D

    move-result-wide v9

    iget-object v3, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v3}, Lcom/baidu/location/c;->t()D

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v13

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v15

    move-object/from16 v17, v2

    invoke-static/range {v9 .. v17}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    :cond_d
    aget v2, v2, v5

    const/high16 v3, 0x41200000    # 10.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_e

    iput-object v1, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    iget-boolean v2, v0, La/a/a/b/o;->M:Z

    if-nez v2, :cond_f

    iput-boolean v5, v0, La/a/a/b/o;->M:Z

    goto :goto_0

    :cond_e
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->F()I

    move-result v2

    const/4 v3, -0x1

    if-le v2, v3, :cond_f

    iput-object v1, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    :goto_0
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v2

    invoke-virtual {v2, v1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    :cond_f
    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->d()V

    return-void

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    const/16 v6, 0xa7

    const/4 v7, 0x1

    const-string v9, "cl"

    const/16 v10, 0xa1

    if-ne v2, v6, :cond_11

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const/16 v3, 0x8

    const-string v4, "NetWork location failed because baidu location service can not caculate the location!"

    invoke-virtual {v2, v6, v3, v4}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto/16 :goto_3

    :cond_11
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v10, :cond_15

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x13

    if-lt v2, v6, :cond_13

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v2

    if-eqz v2, :cond_12

    if-ne v2, v4, :cond_13

    :cond_12
    move v2, v7

    goto :goto_1

    :cond_13
    move v2, v5

    :goto_1
    if-eqz v2, :cond_14

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const-string v3, "NetWork location successful, open gps will be better!"

    invoke-virtual {v2, v10, v7, v3}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_14
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->z()F

    move-result v2

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_17

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/f;->l()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_17

    const-string v3, "&wifio=1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const-string v3, "NetWork location successful, open wifi will be better!"

    invoke-virtual {v2, v10, v4, v3}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_15
    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    const/16 v3, 0xa0

    if-ne v2, v3, :cond_16

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const/16 v4, 0xa

    const-string v6, "Coarse location successful, open Accurately locate permission will be better!"

    :goto_2
    invoke-virtual {v2, v3, v4, v6}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_16
    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    const/16 v3, 0x3e

    if-ne v2, v3, :cond_17

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const/16 v4, 0xb

    const-string v6, "Coarse location failed because we can not get any loc result"

    goto :goto_2

    :cond_17
    :goto_3
    const/4 v2, 0x0

    iput-object v2, v0, La/a/a/b/o;->q:Lcom/baidu/location/c;

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v3

    const-string v11, "wf"

    if-ne v3, v10, :cond_18

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    iget-object v3, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Lcom/baidu/location/c;->r()I

    move-result v3

    if-ne v3, v10, :cond_18

    iget-object v3, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v3}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v12, v0, La/a/a/b/o;->A:J

    sub-long/2addr v3, v12

    const-wide/16 v12, 0x7530

    cmp-long v3, v3, v12

    if-gez v3, :cond_18

    iput-object v1, v0, La/a/a/b/o;->q:Lcom/baidu/location/c;

    move v5, v7

    :cond_18
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v3

    if-eqz v5, :cond_19

    iget-object v4, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v3, v4}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    goto :goto_4

    :cond_19
    invoke-virtual {v3, v1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, La/a/a/b/o;->A:J

    :goto_4
    invoke-static/range {p1 .. p1}, La/a/a/i/i;->a(Lcom/baidu/location/c;)Z

    move-result v3

    if-eqz v3, :cond_1a

    if-nez v5, :cond_1b

    iput-object v1, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    goto :goto_5

    :cond_1a
    iput-object v2, v0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    :cond_1b
    :goto_5
    sget-object v3, La/a/a/b/m;->l:Ljava/lang/String;

    const-string v4, "ssid\":\""

    const-string v5, "\""

    invoke-static {v3, v4, v5}, La/a/a/i/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    const/high16 v4, -0x80000000

    if-eq v3, v4, :cond_1c

    iget-object v4, v0, La/a/a/b/o;->s:La/a/a/g/k;

    if-eqz v4, :cond_1c

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    iget-object v4, v0, La/a/a/b/o;->s:La/a/a/g/k;

    invoke-virtual {v2, v3, v4}, La/a/a/g/f;->a(ILa/a/a/g/k;)Ljava/lang/String;

    move-result-object v2

    :cond_1c
    iput-object v2, v0, La/a/a/b/o;->o:Ljava/lang/String;

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/f/d;->j()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v10, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-object v2, v0, La/a/a/b/o;->t:La/a/a/g/a;

    invoke-virtual {v0, v2}, La/a/a/b/o;->a(La/a/a/g/a;)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v2

    iget-object v3, v0, La/a/a/b/o;->t:La/a/a/g/a;

    sget-object v6, La/a/a/f/d$c;->c:La/a/a/f/d$c;

    sget-object v7, La/a/a/f/d$b;->c:La/a/a/f/d$b;

    const/4 v4, 0x0

    move-object v5, v8

    invoke-virtual/range {v2 .. v7}, La/a/a/f/d;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;

    iget-object v2, v0, La/a/a/b/o;->t:La/a/a/g/a;

    iput-object v2, v0, La/a/a/b/o;->v:La/a/a/g/a;

    :cond_1d
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/f/d;->j()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->r()I

    move-result v2

    if-ne v2, v10, :cond_1e

    invoke-virtual/range {p1 .. p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v1

    iget-object v3, v0, La/a/a/b/o;->s:La/a/a/g/k;

    sget-object v5, La/a/a/f/d$c;->c:La/a/a/f/d$c;

    sget-object v6, La/a/a/f/d$b;->c:La/a/a/f/d$b;

    const/4 v2, 0x0

    move-object v4, v8

    invoke-virtual/range {v1 .. v6}, La/a/a/f/d;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;

    :cond_1e
    iget-object v1, v0, La/a/a/b/o;->t:La/a/a/g/a;

    if-eqz v1, :cond_1f

    iget-object v1, v0, La/a/a/b/o;->s:La/a/a/g/k;

    if-eqz v1, :cond_1f

    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object v1

    sget-object v2, La/a/a/b/m;->l:Ljava/lang/String;

    iget-object v3, v0, La/a/a/b/o;->t:La/a/a/g/a;

    iget-object v4, v0, La/a/a/b/o;->s:La/a/a/g/k;

    invoke-virtual {v1, v2, v3, v4, v8}, La/a/a/f/a;->a(Ljava/lang/String;La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;)V

    :cond_1f
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/f;->p()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/f/d;->p()V

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/f/d;->o()V

    :cond_20
    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->d()V

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/b/o;->x:Z

    iput-boolean v0, p0, La/a/a/b/o;->L:Z

    iput-boolean v0, p0, La/a/a/b/o;->M:Z

    iput-boolean v0, p0, La/a/a/b/o;->H:Z

    invoke-virtual {p0}, La/a/a/b/o;->p()V

    iget-boolean v1, p0, La/a/a/b/o;->Y:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, La/a/a/b/o;->Y:Z

    :cond_0
    return-void
.end method

.method public final d(Landroid/os/Message;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, La/a/a/b/o;->S:I

    iget-boolean v0, p0, La/a/a/b/o;->w:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput v0, p0, La/a/a/b/o;->S:I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    sget v1, La/a/a/i/i;->a0:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, La/a/a/g/f;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, La/a/a/b/o;->h(Landroid/os/Message;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/b/o;->g(Landroid/os/Message;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, La/a/a/b/o;->h(Landroid/os/Message;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    :goto_0
    return-void
.end method

.method public d(Lcom/baidu/location/c;)V
    .locals 1

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, p1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    iput-object v0, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    return-void
.end method

.method public final e(Landroid/os/Message;)V
    .locals 4

    sget-boolean v0, La/a/a/i/i;->p0:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/i/i;->g(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p0, Lcom/baidu/location/c;

    invoke-direct {p0}, Lcom/baidu/location/c;-><init>()V

    const/16 p1, 0x3e

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->h(I)V

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p1

    invoke-virtual {p1, p0}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    return-void

    :cond_0
    invoke-static {}, La/a/a/i/i;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "baidu_location_service"

    const-string v1, "isInforbiddenTime on request location ..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "isWaitingLocTag"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    sput-boolean v2, La/a/a/b/o;->a0:Z

    :cond_2
    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-static {}, La/a/a/g/c;->e()La/a/a/g/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/c;->b()V

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/b/c;->b(Landroid/os/Message;)I

    move-result v0

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x4

    if-ne v0, v3, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p1, v1

    const-string v0, "this type %d is illegal"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, La/a/a/b/o;->d(Landroid/os/Message;)V

    goto :goto_1

    :cond_6
    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->j()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0, p1}, La/a/a/b/o;->b(Landroid/os/Message;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p1}, La/a/a/b/o;->c(Landroid/os/Message;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public final e(Lcom/baidu/location/c;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/location/c;->I()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, La/a/a/b/o;->V:Z

    return-void
.end method

.method public e()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->m:Z

    return p0
.end method

.method public f(Landroid/os/Message;)V
    .locals 1

    iget-boolean v0, p0, La/a/a/b/o;->O:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, La/a/a/b/o;->e(Landroid/os/Message;)V

    return-void
.end method

.method public final f()[Ljava/lang/String;
    .locals 14

    const-string p0, "Location failed beacuse we can not get any loc information!"

    const-string v0, ""

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "&apl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/i/i;->b(Landroid/content/Context;)I

    move-result v2

    const-string v3, "Location failed beacuse we can not get any loc information in airplane mode, you can turn it off and try again!!"

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    aput-object v3, v0, v4

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, La/a/a/i/i;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "per=0|0|"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    const-string v8, "Location failed beacuse we can not get any loc information without any location permission!"

    if-eqz v7, :cond_1

    aput-object v8, v0, v4

    :cond_1
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x17

    const-string v10, "Location failed beacuse we can not get any loc information with the phone loc mode is off, you can turn it on and try again!"

    const/4 v11, 0x0

    if-lt v7, v9, :cond_3

    const-string v9, "&loc="

    invoke-virtual {v1, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v9

    if-nez v9, :cond_2

    aput-object v10, v0, v4

    move v12, v4

    goto :goto_0

    :cond_2
    move v12, v11

    :goto_0
    invoke-virtual {v1, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_3
    move v12, v11

    :goto_1
    const/16 v9, 0x13

    if-lt v7, v9, :cond_4

    const-string v7, "&lmd="

    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v7

    if-ltz v7, :cond_4

    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_4
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v7

    invoke-virtual {v7}, La/a/a/g/f;->h()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v9

    invoke-virtual {v9}, La/a/a/g/f;->l()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13}, La/a/a/i/i;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v13, 0x3e

    if-ne v2, v4, :cond_5

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object p0

    const/4 v2, 0x7

    :goto_2
    invoke-virtual {p0, v13, v2, v3}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object p0

    const/4 v2, 0x4

    invoke-virtual {p0, v13, v2, v8}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_6
    if-eqz v12, :cond_7

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object p0

    const/4 v2, 0x5

    invoke-virtual {p0, v13, v2, v10}, La/a/a/b/g;->a(IILjava/lang/String;)V

    goto :goto_3

    :cond_7
    if-eqz v7, :cond_8

    if-eqz v9, :cond_8

    const-string v2, "&sim=1"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "&wifio=1"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object p0

    const/4 v2, 0x6

    const-string v3, "Location failed beacuse we can not get any loc information , you can insert a sim card or open wifi and try again!"

    goto :goto_2

    :cond_8
    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v2

    const/16 v3, 0x9

    invoke-virtual {v2, v13, v3, p0}, La/a/a/b/g;->a(IILjava/lang/String;)V

    :cond_9
    :goto_3
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v11

    return-object v0
.end method

.method public final g()V
    .locals 6

    :try_start_0
    invoke-static {}, La/a/a/b/r;->a()La/a/a/b/r;

    move-result-object v0

    const-string v1, "FirstLocAddr"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, La/a/a/b/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_0

    aget-object v1, v0, v3

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, La/a/a/b/o;->W:J

    aget-object v2, v0, v4

    :cond_0
    if-eqz v2, :cond_1

    const-string v0, ";"

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    new-instance v1, Lcom/baidu/location/a$a;

    invoke-direct {v1}, Lcom/baidu/location/a$a;-><init>()V

    aget-object v2, v0, v3

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->d(Ljava/lang/String;)Lcom/baidu/location/a$a;

    aget-object v2, v0, v4

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->e(Ljava/lang/String;)Lcom/baidu/location/a$a;

    aget-object v2, v0, v5

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->g(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/4 v2, 0x3

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->b(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/4 v2, 0x4

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->c(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/4 v2, 0x5

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->f(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/4 v2, 0x6

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->h(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/4 v2, 0x7

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->i(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/16 v2, 0x8

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/a$a;->a(Ljava/lang/String;)Lcom/baidu/location/a$a;

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Lcom/baidu/location/a$a;->j(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v1}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v0

    iput-object v0, p0, La/a/a/b/o;->X:Lcom/baidu/location/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final g(Landroid/os/Message;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, La/a/a/b/o;->z:J

    sub-long/2addr v3, v5

    iget-boolean v0, v1, La/a/a/b/o;->x:Z

    if-eqz v0, :cond_0

    const-wide/16 v5, 0x2ee0

    cmp-long v0, v3, v5

    if-gtz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, La/a/a/b/o;->z:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v7, v1, La/a/a/b/o;->z:J

    sub-long/2addr v3, v7

    const-wide/16 v7, 0x3e8

    cmp-long v0, v3, v7

    if-gez v0, :cond_2

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    iget-object v2, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0, v2}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->d()V

    return-void

    :cond_2
    const/4 v3, 0x1

    iput-boolean v3, v1, La/a/a/b/o;->x:Z

    iget-object v0, v1, La/a/a/b/o;->t:La/a/a/g/a;

    iget-object v4, v1, La/a/a/b/o;->u:Ljava/util/HashSet;

    invoke-virtual {v1, v0, v4}, La/a/a/b/o;->a(La/a/a/g/a;Ljava/util/HashSet;)Z

    move-result v0

    iput-boolean v0, v1, La/a/a/b/o;->m:Z

    iget-object v0, v1, La/a/a/b/o;->s:La/a/a/g/k;

    invoke-virtual {v1, v0}, La/a/a/b/o;->a(La/a/a/g/k;)Z

    move-result v0

    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    invoke-static {}, La/a/a/g/c;->e()La/a/a/g/c;

    move-result-object v9

    invoke-virtual {v9}, La/a/a/g/c;->a()Landroid/location/Location;

    move-result-object v9

    invoke-static {}, La/a/a/g/c;->e()La/a/a/g/c;

    move-result-object v10

    iget-object v11, v1, La/a/a/b/o;->r:Landroid/location/Location;

    invoke-virtual {v10, v11, v9}, La/a/a/g/c;->a(Landroid/location/Location;Landroid/location/Location;)Z

    move-result v10

    goto :goto_0

    :cond_3
    move-object v9, v7

    move v10, v8

    :goto_0
    if-nez v0, :cond_9

    iget-boolean v0, v1, La/a/a/b/o;->m:Z

    if-nez v0, :cond_9

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-eqz v0, :cond_9

    iget-boolean v0, v1, La/a/a/b/o;->H:Z

    if-nez v0, :cond_9

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->o()Z

    move-result v0

    if-nez v0, :cond_9

    if-nez v10, :cond_9

    iget-object v0, v1, La/a/a/b/o;->q:Lcom/baidu/location/c;

    if-eqz v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iget-wide v12, v1, La/a/a/b/o;->A:J

    sub-long/2addr v10, v12

    const-wide/16 v12, 0x7530

    cmp-long v0, v10, v12

    if-lez v0, :cond_4

    iget-object v0, v1, La/a/a/b/o;->q:Lcom/baidu/location/c;

    iput-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    iput-object v7, v1, La/a/a/b/o;->q:Lcom/baidu/location/c;

    :cond_4
    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/t;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v10

    invoke-virtual {v10}, La/a/a/b/t;->a()F

    move-result v10

    invoke-virtual {v0, v10}, Lcom/baidu/location/c;->a(F)V

    :cond_5
    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v10, 0x3e

    if-ne v0, v10, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget-wide v13, v1, La/a/a/b/o;->T:J

    sub-long/2addr v11, v13

    cmp-long v0, v11, v5

    if-gtz v0, :cond_7

    :cond_6
    move-wide v11, v5

    :cond_7
    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v13, 0x3d

    if-eq v0, v13, :cond_8

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v13, 0xa1

    if-eq v0, v13, :cond_8

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v13, 0xa0

    if-eq v0, v13, :cond_8

    iget-object v0, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0}, Lcom/baidu/location/c;->r()I

    move-result v0

    if-ne v0, v10, :cond_9

    const-wide/16 v13, 0x3a98

    cmp-long v0, v11, v13

    if-gez v0, :cond_9

    :cond_8
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    iget-object v2, v1, La/a/a/b/o;->p:Lcom/baidu/location/c;

    invoke-virtual {v0, v2}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->d()V

    return-void

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iput-wide v10, v1, La/a/a/b/o;->z:J

    invoke-virtual {v1, v7}, La/a/a/b/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-boolean v8, v1, La/a/a/b/o;->P:Z

    const/4 v10, 0x2

    if-nez v0, :cond_d

    iput-boolean v3, v1, La/a/a/b/o;->P:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iput-wide v11, v1, La/a/a/b/o;->T:J

    new-array v11, v10, [Ljava/lang/String;

    :try_start_0
    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->f()[Ljava/lang/String;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v12, v0

    invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    iget-wide v14, v1, La/a/a/b/o;->I:J

    sub-long v14, v12, v14

    const-wide/32 v16, 0xea60

    cmp-long v0, v14, v16

    if-lez v0, :cond_a

    iput-wide v12, v1, La/a/a/b/o;->I:J

    :cond_a
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, La/a/a/b/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v11, v8

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, ""

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, La/a/a/b/m;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v11, v11, v8

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    iget-object v11, v1, La/a/a/b/m;->b:La/a/a/g/a;

    if-eqz v11, :cond_c

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v11

    iget-object v12, v1, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {v11, v12}, La/a/a/g/f;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_c

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v12

    iget-object v13, v1, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {v12, v13}, La/a/a/g/f;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_c
    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    move-result-object v11

    invoke-virtual {v11, v3}, La/a/a/i/b;->a(Z)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_e

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_d
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/i/i;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_e
    :goto_3
    if-eqz v4, :cond_10

    invoke-static {}, La/a/a/g/c;->e()La/a/a/g/c;

    move-result-object v4

    invoke-virtual {v4, v9}, La/a/a/g/c;->a(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_f

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&per_c=1"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_f
    iput-object v9, v1, La/a/a/b/o;->r:Landroid/location/Location;

    :cond_10
    iget-object v4, v1, La/a/a/b/o;->o:Ljava/lang/String;

    if-eqz v4, :cond_11

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v1, La/a/a/b/o;->o:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v7, v1, La/a/a/b/o;->o:Ljava/lang/String;

    :cond_11
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, La/a/a/b/m;->a:La/a/a/g/k;

    if-eqz v4, :cond_12

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v4

    iget-object v5, v1, La/a/a/b/m;->a:La/a/a/g/k;

    invoke-virtual {v4, v5}, La/a/a/g/f;->c(La/a/a/g/k;)J

    move-result-wide v5

    :cond_12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sget v9, La/a/a/i/i;->F0:I

    if-le v4, v9, :cond_14

    const-string v4, "&cl_list="

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v9, v4

    if-ne v9, v10, :cond_14

    aget-object v0, v4, v3

    const-string v9, "&"

    invoke-virtual {v0, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v9, v0

    if-ne v9, v10, :cond_13

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v4, v8

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&cl_list=null&"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v3

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v4, v8

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&cl_list=null"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_14
    :goto_4
    iget-object v4, v1, La/a/a/b/o;->n:La/a/a/b/m$c;

    invoke-virtual {v4, v0, v5, v6}, La/a/a/b/m$c;->a(Ljava/lang/String;J)V

    iget-object v0, v1, La/a/a/b/m;->b:La/a/a/g/a;

    iput-object v0, v1, La/a/a/b/o;->t:La/a/a/g/a;

    iget-object v0, v1, La/a/a/b/m;->c:Ljava/util/HashSet;

    iput-object v0, v1, La/a/a/b/o;->u:Ljava/util/HashSet;

    iget-object v0, v1, La/a/a/b/m;->a:La/a/a/g/k;

    iput-object v0, v1, La/a/a/b/o;->s:La/a/a/g/k;

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->j()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual/range {p0 .. p0}, La/a/a/b/o;->l()Z

    :cond_15
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->k()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, v1, La/a/a/b/o;->J:La/a/a/b/o$b;

    if-nez v0, :cond_16

    new-instance v0, La/a/a/b/o$b;

    invoke-direct {v0, v1, v7}, La/a/a/b/o$b;-><init>(La/a/a/b/o;La/a/a/b/o$a;)V

    iput-object v0, v1, La/a/a/b/o;->J:La/a/a/b/o$b;

    :cond_16
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/g/f;->f()I

    move-result v4

    invoke-static {v4}, La/a/a/g/b;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, La/a/a/f/d;->a(Ljava/lang/String;)J

    move-result-wide v4

    iget-object v0, v1, La/a/a/b/o;->N:Landroid/os/Handler;

    iget-object v6, v1, La/a/a/b/o;->J:La/a/a/b/o$b;

    invoke-virtual {v0, v6, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v3, v1, La/a/a/b/o;->K:Z

    :cond_17
    iget-boolean v0, v1, La/a/a/b/o;->w:Z

    if-ne v0, v3, :cond_19

    iput-boolean v8, v1, La/a/a/b/o;->w:Z

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->p()Z

    move-result v0

    if-eqz v0, :cond_18

    if-eqz v2, :cond_18

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0, v2}, La/a/a/b/c;->c(Landroid/os/Message;)I

    move-result v0

    const/16 v2, 0x3e8

    if-ge v0, v2, :cond_18

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->j()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->p()V

    :cond_18
    invoke-static {}, La/a/a/c/b;->g()La/a/a/c/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/b;->e()V

    :cond_19
    iget v0, v1, La/a/a/b/o;->S:I

    if-lez v0, :cond_1b

    if-ne v0, v10, :cond_1a

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->s()Z

    :cond_1a
    iput v8, v1, La/a/a/b/o;->S:I

    :cond_1b
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/b/o;->C:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Landroid/os/Message;)V
    .locals 4

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/b/o;->y:Z

    iget-object v0, p0, La/a/a/b/o;->Q:La/a/a/b/o$c;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/b/o$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/a/a/b/o$c;-><init>(La/a/a/b/o;La/a/a/b/o$a;)V

    iput-object v0, p0, La/a/a/b/o;->Q:La/a/a/b/o$c;

    :cond_0
    iget-boolean v0, p0, La/a/a/b/o;->R:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, La/a/a/b/o;->Q:La/a/a/b/o$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    iget-object v0, p0, La/a/a/b/o;->N:Landroid/os/Handler;

    iget-object v1, p0, La/a/a/b/o;->Q:La/a/a/b/o$c;

    const-wide/16 v2, 0xdac

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean p1, p0, La/a/a/b/o;->R:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, La/a/a/b/o;->g(Landroid/os/Message;)V

    :goto_0
    return-void
.end method

.method public i()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/location/j;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/a/a/b/o;->D:Ljava/util/List;

    return-object p0
.end method

.method public j()Lcom/baidu/location/k;
    .locals 0

    iget-object p0, p0, La/a/a/b/o;->E:Lcom/baidu/location/k;

    return-object p0
.end method

.method public k()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/b/o;->V:Z

    return p0
.end method

.method public final l()Z
    .locals 15

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, La/a/a/g/k;->c()I

    move-result v4

    if-lez v4, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v4

    invoke-virtual {v4, v3}, La/a/a/g/f;->a(La/a/a/g/k;)J

    move-result-wide v4

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x0

    :goto_0
    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, La/a/a/g/a;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_1

    invoke-virtual {v3}, La/a/a/g/k;->c()I

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move v2, v6

    goto :goto_1

    :cond_2
    move v2, v7

    :goto_1
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/f/d;->j()Z

    move-result v3

    const/4 v8, 0x0

    if-eqz v3, :cond_9

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/f/d;->m()Z

    move-result v3

    if-eqz v3, :cond_9

    const-wide/16 v9, 0x3c

    cmp-long v3, v4, v9

    if-gez v3, :cond_9

    if-nez v2, :cond_3

    const-wide/16 v2, 0x0

    cmpg-double v2, v2, v0

    if-gez v2, :cond_9

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v2

    invoke-virtual {v2}, La/a/a/f/d;->f()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_9

    :cond_3
    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v9

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v10

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object v11

    sget-object v13, La/a/a/f/d$c;->b:La/a/a/f/d$c;

    sget-object v14, La/a/a/f/d$b;->b:La/a/a/f/d$b;

    const/4 v12, 0x0

    invoke-virtual/range {v9 .. v14}, La/a/a/f/d;->a(La/a/a/g/a;La/a/a/g/k;Lcom/baidu/location/c;La/a/a/f/d$c;La/a/a/f/d$b;)Lcom/baidu/location/c;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    sget-object v1, La/a/a/i/i;->d:Ljava/lang/String;

    const-string v2, "all"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    move v1, v7

    goto :goto_2

    :cond_5
    move v1, v6

    :goto_2
    sget-boolean v2, La/a/a/i/i;->f:Z

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    move v1, v7

    :cond_6
    sget-boolean v2, La/a/a/i/i;->h:Z

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_7

    :goto_3
    move v1, v7

    :cond_7
    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    move-object v8, v0

    :cond_9
    :goto_4
    if-eqz v8, :cond_a

    invoke-virtual {v8}, Lcom/baidu/location/c;->r()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_a

    iget-boolean v0, p0, La/a/a/b/o;->x:Z

    if-eqz v0, :cond_a

    new-instance v0, Lcom/baidu/location/c;

    invoke-direct {v0, v8}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    const/16 v1, 0xa1

    invoke-virtual {v0, v1}, Lcom/baidu/location/c;->h(I)V

    iget-boolean v1, p0, La/a/a/b/o;->x:Z

    if-eqz v1, :cond_a

    iput-boolean v6, p0, La/a/a/b/o;->L:Z

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v1

    invoke-virtual {v1, v0}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    iput-object v0, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    goto :goto_5

    :cond_a
    move v6, v7

    :goto_5
    return v6
.end method

.method public m()V
    .locals 1

    iget-boolean v0, p0, La/a/a/b/o;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/a/a/b/o;->g(Landroid/os/Message;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/b/o;->y:Z

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/c/b;->g()La/a/a/c/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/c/b;->c()V

    :goto_0
    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/b/o;->w:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/b/o;->x:Z

    iput-boolean v0, p0, La/a/a/b/o;->O:Z

    invoke-virtual {p0}, La/a/a/b/o;->g()V

    return-void
.end method

.method public o()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/b/o;->x:Z

    iput-boolean v0, p0, La/a/a/b/o;->y:Z

    iput-boolean v0, p0, La/a/a/b/o;->L:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, La/a/a/b/o;->M:Z

    invoke-virtual {p0}, La/a/a/b/o;->c()V

    iput-boolean v0, p0, La/a/a/b/o;->O:Z

    return-void
.end method

.method public final p()V
    .locals 0

    iget-object p0, p0, La/a/a/b/o;->p:Lcom/baidu/location/c;

    if-eqz p0, :cond_0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/g/f;->p()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/z;->c()V

    :cond_0
    return-void
.end method
