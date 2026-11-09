.class public La/a/a/d/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/i$e;,
        La/a/a/d/i$h;,
        La/a/a/d/i$f;,
        La/a/a/d/i$j;,
        La/a/a/d/i$l;,
        La/a/a/d/i$m;,
        La/a/a/d/i$k;,
        La/a/a/d/i$g;,
        La/a/a/d/i$i;
    }
.end annotation


# instance fields
.field public A:D

.field public B:D

.field public C:Z

.field public D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/a/a/d/i$l;",
            ">;"
        }
    .end annotation
.end field

.field public E:I

.field public F:I

.field public G:I

.field public H:La/a/a/d/a;

.field public I:Ljava/lang/String;

.field public J:La/a/a/d/g;

.field public K:Z

.field public L:Z

.field public M:La/a/a/d/l;

.field public N:Ljava/text/SimpleDateFormat;

.field public O:I

.field public P:Lcom/baidu/location/c;

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:La/a/a/d/i$f;

.field public U:La/a/a/d/i$h;

.field public V:La/a/a/d/i$j;

.field public W:La/a/a/d/i$e;

.field public a:I

.field public b:Z

.field public c:I

.field public d:J

.field public volatile e:Z

.field public f:La/a/a/d/i$g;

.field public g:La/a/a/d/i$k;

.field public h:La/a/a/d/i$m;

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:I

.field public n:La/a/a/d/k$c;

.field public o:I

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:La/a/a/d/j;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:I

.field public v:I

.field public w:La/a/a/d/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/d/f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public x:I

.field public y:La/a/a/d/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/d/f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public z:D


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/d/i;->a:I

    iput-boolean v0, p0, La/a/a/d/i;->b:Z

    const/16 v1, 0x20

    iput v1, p0, La/a/a/d/i;->c:I

    const-wide/16 v1, 0xbb8

    iput-wide v1, p0, La/a/a/d/i;->d:J

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/d/i;->f:La/a/a/d/i$g;

    iput-object v1, p0, La/a/a/d/i;->g:La/a/a/d/i$k;

    iput-object v1, p0, La/a/a/d/i;->h:La/a/a/d/i$m;

    iput-boolean v0, p0, La/a/a/d/i;->i:Z

    iput-boolean v0, p0, La/a/a/d/i;->j:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/i;->l:J

    iput v0, p0, La/a/a/d/i;->m:I

    iput v0, p0, La/a/a/d/i;->o:I

    iput-object v1, p0, La/a/a/d/i;->p:Ljava/lang/String;

    iput-object v1, p0, La/a/a/d/i;->q:Ljava/lang/String;

    iput-object v1, p0, La/a/a/d/i;->r:La/a/a/d/j;

    iput-object v1, p0, La/a/a/d/i;->s:Ljava/lang/String;

    iput v0, p0, La/a/a/d/i;->u:I

    const/4 v2, 0x5

    iput v2, p0, La/a/a/d/i;->v:I

    iput-object v1, p0, La/a/a/d/i;->w:La/a/a/d/f;

    const/16 v2, 0x14

    iput v2, p0, La/a/a/d/i;->x:I

    iput-object v1, p0, La/a/a/d/i;->y:La/a/a/d/f;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/d/i;->z:D

    iput-wide v2, p0, La/a/a/d/i;->A:D

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    const/4 v2, -0x1

    iput v2, p0, La/a/a/d/i;->E:I

    iput v0, p0, La/a/a/d/i;->F:I

    iput v0, p0, La/a/a/d/i;->G:I

    iput-object v1, p0, La/a/a/d/i;->I:Ljava/lang/String;

    iput-object v1, p0, La/a/a/d/i;->J:La/a/a/d/g;

    iput-boolean v0, p0, La/a/a/d/i;->K:Z

    iput-boolean v0, p0, La/a/a/d/i;->L:Z

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, La/a/a/d/i;->N:Ljava/text/SimpleDateFormat;

    const/4 v2, 0x2

    iput v2, p0, La/a/a/d/i;->O:I

    iput-object v1, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    iput-boolean v0, p0, La/a/a/d/i;->Q:Z

    iput-boolean v0, p0, La/a/a/d/i;->S:Z

    iput-object v1, p0, La/a/a/d/i;->T:La/a/a/d/i$f;

    iput-object v1, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    iput-object v1, p0, La/a/a/d/i;->V:La/a/a/d/i$j;

    iput-object v1, p0, La/a/a/d/i;->W:La/a/a/d/i$e;

    new-instance v0, La/a/a/d/i$g;

    invoke-direct {v0, p0}, La/a/a/d/i$g;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->f:La/a/a/d/i$g;

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/d/m/c/a;->a(Landroid/content/Context;)La/a/a/d/m/c/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/d/m/c/b;->a(Landroid/content/Context;)La/a/a/d/m/c/b;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v0, La/a/a/d/l;

    invoke-direct {v0}, La/a/a/d/l;-><init>()V

    iput-object v0, p0, La/a/a/d/i;->M:La/a/a/d/l;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, La/a/a/d/l;->a(J)V

    new-instance v0, La/a/a/d/i$b;

    invoke-direct {v0, p0}, La/a/a/d/i$b;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->n:La/a/a/d/k$c;

    new-instance v0, La/a/a/d/i$m;

    invoke-direct {v0, p0}, La/a/a/d/i$m;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->h:La/a/a/d/i$m;

    new-instance v0, La/a/a/d/f;

    iget v1, p0, La/a/a/d/i;->v:I

    invoke-direct {v0, v1}, La/a/a/d/f;-><init>(I)V

    iput-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    new-instance v0, La/a/a/d/f;

    iget v1, p0, La/a/a/d/i;->x:I

    invoke-direct {v0, v1}, La/a/a/d/f;-><init>(I)V

    iput-object v0, p0, La/a/a/d/i;->y:La/a/a/d/f;

    new-instance v0, La/a/a/d/a;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/d/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, La/a/a/d/i;->H:La/a/a/d/a;

    new-instance v0, La/a/a/d/i$f;

    invoke-direct {v0, p0}, La/a/a/d/i$f;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->T:La/a/a/d/i$f;

    new-instance v0, La/a/a/d/i$h;

    invoke-direct {v0, p0}, La/a/a/d/i$h;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    new-instance v0, La/a/a/d/i$j;

    invoke-direct {v0, p0}, La/a/a/d/i$j;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->V:La/a/a/d/i$j;

    new-instance v0, La/a/a/d/i$e;

    invoke-direct {v0, p0}, La/a/a/d/i$e;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->W:La/a/a/d/i$e;

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/d/i$a;)V
    .locals 0

    invoke-direct {p0}, La/a/a/d/i;-><init>()V

    return-void
.end method

.method public static synthetic A(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->m:I

    return p0
.end method

.method public static synthetic B(La/a/a/d/i;)I
    .locals 2

    iget v0, p0, La/a/a/d/i;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/d/i;->m:I

    return v0
.end method

.method public static synthetic C(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->c:I

    return p0
.end method

.method public static synthetic D(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->F:I

    return p0
.end method

.method public static synthetic a(La/a/a/d/i;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/d/i;->A:D

    return-wide p1
.end method

.method public static synthetic a(La/a/a/d/i;)I
    .locals 2

    iget v0, p0, La/a/a/d/i;->F:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/d/i;->F:I

    return v0
.end method

.method public static synthetic a(La/a/a/d/i;I)I
    .locals 0

    iput p1, p0, La/a/a/d/i;->o:I

    return p1
.end method

.method public static synthetic a(La/a/a/d/i;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/d/i;->d:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/d/i;La/a/a/g/k;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/d/i;->a(La/a/a/g/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/d/i;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La/a/a/d/i;->I:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(La/a/a/d/i;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/d/i;->a(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/i;Lcom/baidu/location/c;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/d/i;->a(Lcom/baidu/location/c;)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/i;Lcom/baidu/location/c;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/d/i;->a(Lcom/baidu/location/c;I)V

    return-void
.end method

.method public static synthetic a(La/a/a/d/i;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i;->Q:Z

    return p1
.end method

.method public static synthetic b(La/a/a/d/i;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/d/i;->z:D

    return-wide p1
.end method

.method public static synthetic b(La/a/a/d/i;)I
    .locals 2

    iget v0, p0, La/a/a/d/i;->G:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/d/i;->G:I

    return v0
.end method

.method public static synthetic b(La/a/a/d/i;I)I
    .locals 0

    iput p1, p0, La/a/a/d/i;->O:I

    return p1
.end method

.method public static synthetic b(La/a/a/d/i;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/d/i;->k:J

    return-wide p1
.end method

.method public static synthetic b(La/a/a/d/i;Lcom/baidu/location/c;)Lcom/baidu/location/c;
    .locals 0

    iput-object p1, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    return-object p1
.end method

.method public static synthetic b(La/a/a/d/i;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La/a/a/d/i;->t:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(La/a/a/d/i;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i;->R:Z

    return p1
.end method

.method public static synthetic c(La/a/a/d/i;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/d/i;->B:D

    return-wide p1
.end method

.method public static synthetic c(La/a/a/d/i;)La/a/a/d/i$j;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->V:La/a/a/d/i$j;

    return-object p0
.end method

.method public static synthetic c(La/a/a/d/i;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/d/i;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(La/a/a/d/i;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i;->b:Z

    return p1
.end method

.method public static synthetic d(La/a/a/d/i;I)I
    .locals 0

    iput p1, p0, La/a/a/d/i;->E:I

    return p1
.end method

.method public static synthetic d(La/a/a/d/i;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/i;->i:Z

    return p0
.end method

.method public static synthetic d(La/a/a/d/i;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i;->e:Z

    return p1
.end method

.method public static synthetic e(La/a/a/d/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->p:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic e(La/a/a/d/i;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i;->C:Z

    return p1
.end method

.method public static synthetic f(La/a/a/d/i;)D
    .locals 2

    iget-wide v0, p0, La/a/a/d/i;->A:D

    return-wide v0
.end method

.method public static synthetic g(La/a/a/d/i;)D
    .locals 2

    iget-wide v0, p0, La/a/a/d/i;->z:D

    return-wide v0
.end method

.method public static synthetic h(La/a/a/d/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->D:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic i(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->o:I

    return p0
.end method

.method public static synthetic j(La/a/a/d/i;)I
    .locals 2

    iget v0, p0, La/a/a/d/i;->o:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, La/a/a/d/i;->o:I

    return v0
.end method

.method public static synthetic k(La/a/a/d/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->q:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(La/a/a/d/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->s:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic m(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->u:I

    return p0
.end method

.method public static m()La/a/a/d/i;
    .locals 1

    invoke-static {}, La/a/a/d/i$i;->a()La/a/a/d/i;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(La/a/a/d/i;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/i;->K:Z

    return p0
.end method

.method public static synthetic o(La/a/a/d/i;)La/a/a/d/l;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->M:La/a/a/d/l;

    return-object p0
.end method

.method public static synthetic p(La/a/a/d/i;)La/a/a/d/i$h;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    return-object p0
.end method

.method public static synthetic q(La/a/a/d/i;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/d/i;->h()V

    return-void
.end method

.method public static synthetic r(La/a/a/d/i;)I
    .locals 0

    iget p0, p0, La/a/a/d/i;->a:I

    return p0
.end method

.method public static synthetic s(La/a/a/d/i;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/i;->b:Z

    return p0
.end method

.method public static synthetic t(La/a/a/d/i;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/i;->d:J

    return-wide v0
.end method

.method public static synthetic u(La/a/a/d/i;)J
    .locals 2

    iget-wide v0, p0, La/a/a/d/i;->l:J

    return-wide v0
.end method

.method public static synthetic v(La/a/a/d/i;)La/a/a/d/j;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->r:La/a/a/d/j;

    return-object p0
.end method

.method public static synthetic w(La/a/a/d/i;)La/a/a/d/a;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->H:La/a/a/d/a;

    return-object p0
.end method

.method public static synthetic x(La/a/a/d/i;)La/a/a/d/g;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->J:La/a/a/d/g;

    return-object p0
.end method

.method public static synthetic y(La/a/a/d/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->I:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic z(La/a/a/d/i;)La/a/a/d/f;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    return-object p0
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "&dr=0:0"

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&dr="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/i$l;

    const/4 v4, 0x1

    iput v4, v2, La/a/a/d/i$l;->d:I

    iget-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/i$l;

    invoke-virtual {v2}, La/a/a/d/i$l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/i$l;

    iget v2, v2, La/a/a/d/i$l;->a:I

    :goto_0
    iget-object v3, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v4, v3, :cond_1

    if-gt v4, p1, :cond_1

    iget-object v3, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/d/i$l;

    iget-object v5, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/a/a/d/i$l;

    iget v5, v5, La/a/a/d/i$l;->a:I

    sub-int/2addr v5, v2

    iput v5, v3, La/a/a/d/i$l;->d:I

    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/i$l;

    invoke-virtual {v2}, La/a/a/d/i$l;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/i$l;

    iget v2, v2, La/a/a/d/i$l;->a:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v1
.end method

.method public final a(La/a/a/g/k;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p1}, La/a/a/g/k;->c()I

    move-result v0

    iget v1, p0, La/a/a/d/i;->c:I

    const/4 v2, 0x1

    if-gt v0, v1, :cond_1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    iget p0, p0, La/a/a/d/i;->c:I

    sget v1, La/a/a/i/i;->q0:I

    invoke-virtual {v0, p0, v2, p1, v1}, La/a/a/g/f;->a(IZLa/a/a/g/k;I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "&aprk=0"

    if-eqz p0, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :goto_0
    const-string v5, ""

    if-ge v4, v0, :cond_3

    iget-object v6, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/net/wifi/ScanResult;

    iget-object v6, v6, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    const-string v7, ":"

    invoke-virtual {v6, v7, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, La/a/a/d/i;->H:La/a/a/d/a;

    if-eqz v6, :cond_2

    invoke-virtual {v6, v5}, La/a/a/d/a;->d(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v5, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    const-string v0, "&aprk=3"

    goto :goto_2

    :cond_4
    move-object v0, v5

    :goto_2
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v0, p0, La/a/a/d/i;->H:La/a/a/d/a;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, La/a/a/d/a;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "&aprk=2"

    goto :goto_3

    :cond_5
    const-string v0, "&aprk=1"

    :cond_6
    :goto_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v1, p1, La/a/a/g/k;->a:Ljava/util/List;

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    iget p0, p0, La/a/a/d/i;->c:I

    sget v3, La/a/a/i/i;->q0:I

    invoke-virtual {v1, p0, v2, p1, v3}, La/a/a/g/f;->a(IZLa/a/a/g/k;I)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/d/i;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    invoke-virtual {v0}, La/a/a/d/f;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Landroid/os/Message;)V
    .locals 25

    move-object/from16 v0, p0

    iget-boolean v1, v0, La/a/a/d/i;->i:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, v0, La/a/a/d/i;->j:Z

    move-object/from16 v2, p1

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/baidu/location/c;

    invoke-virtual {v2}, Lcom/baidu/location/c;->r()I

    move-result v3

    const/16 v4, 0xa1

    const/4 v5, 0x1

    if-ne v3, v4, :cond_12

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->i()V

    invoke-virtual {v2}, Lcom/baidu/location/c;->p()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lcom/baidu/location/c;->n()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, v0, La/a/a/d/i;->r:La/a/a/d/j;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, La/a/a/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/baidu/location/c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_1
    invoke-virtual {v2}, Lcom/baidu/location/c;->p()Ljava/lang/String;

    move-result-object v3

    const-string v6, "\\|"

    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v6, v3

    new-array v6, v6, [Landroid/location/Location;

    move v7, v1

    :goto_0
    array-length v8, v3

    if-ge v7, v8, :cond_2

    aget-object v8, v3, v7

    const-string v9, ","

    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    new-instance v9, Landroid/location/Location;

    const-string v10, "gps"

    invoke-direct {v9, v10}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    aget-object v10, v8, v5

    invoke-static {v10}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Landroid/location/Location;->setLatitude(D)V

    aget-object v8, v8, v1

    invoke-static {v8}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Landroid/location/Location;->setLongitude(D)V

    aput-object v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    new-instance v3, La/a/a/d/j;

    invoke-virtual {v2}, Lcom/baidu/location/c;->n()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v7, v6}, La/a/a/d/j;-><init>(Ljava/lang/String;[Landroid/location/Location;)V

    iput-object v3, v0, La/a/a/d/i;->r:La/a/a/d/j;

    :cond_3
    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->e()Z

    move-result v3

    const-string v6, "ble"

    if-eqz v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/baidu/location/c;->r()I

    move-result v3

    if-ne v3, v4, :cond_5

    invoke-virtual {v2}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lcom/baidu/location/c;->t()D

    move-result-wide v7

    invoke-virtual {v2}, Lcom/baidu/location/c;->q()D

    move-result-wide v9

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/baidu/location/c;->m()I

    move-result v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {}, La/a/a/d/e;->k()La/a/a/d/e;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/d/e;->d()I

    move-result v15

    invoke-static/range {v7 .. v15}, La/a/a/d/h;->a(DDLjava/lang/String;IJI)V

    iput-boolean v5, v0, La/a/a/d/i;->L:Z

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Lcom/baidu/location/c;->m()I

    move-result v21

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v22

    invoke-static {}, La/a/a/d/e;->k()La/a/a/d/e;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/d/e;->d()I

    move-result v24

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v24}, La/a/a/d/h;->a(DDLjava/lang/String;IJI)V

    iput-boolean v1, v0, La/a/a/d/i;->L:Z

    :cond_5
    :goto_1
    iput v1, v0, La/a/a/d/i;->m:I

    invoke-virtual {v2}, Lcom/baidu/location/c;->e()Ljava/lang/String;

    move-result-object v3

    const-string v4, "wifi"

    const-string v9, "res"

    const-wide/16 v13, 0x0

    const/4 v15, 0x5

    if-eqz v3, :cond_e

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    iput-boolean v5, v0, La/a/a/d/i;->j:Z

    invoke-virtual {v2, v5}, Lcom/baidu/location/c;->a(Z)V

    const-string v3, "tp"

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_6

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x41000000    # 8.0f

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->b(F)V

    invoke-virtual {v2, v6}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    iput-boolean v5, v0, La/a/a/d/i;->K:Z

    goto :goto_2

    :cond_6
    iput-boolean v1, v0, La/a/a/d/i;->K:Z

    :goto_2
    invoke-virtual {v2}, Lcom/baidu/location/c;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, La/a/a/d/i;->q:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/baidu/location/c;->f()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, La/a/a/d/i;->s:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    invoke-virtual {v2}, Lcom/baidu/location/c;->J()I

    move-result v3

    iput v3, v0, La/a/a/d/i;->u:I

    iget-object v3, v0, La/a/a/d/i;->W:La/a/a/d/i$e;

    invoke-static {v3, v2}, La/a/a/d/i$e;->a(La/a/a/d/i$e;Lcom/baidu/location/c;)I

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_7

    if-eqz v6, :cond_7

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_7

    return-void

    :cond_7
    iget-object v7, v0, La/a/a/d/i;->p:Ljava/lang/String;

    if-nez v7, :cond_8

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, La/a/a/d/i;->p:Ljava/lang/String;

    :cond_8
    invoke-static {}, La/a/a/d/m/c/a;->d()La/a/a/d/m/c/a;

    move-result-object v7

    move-object/from16 v17, v9

    invoke-virtual {v2}, Lcom/baidu/location/c;->t()D

    move-result-wide v8

    invoke-virtual {v2}, Lcom/baidu/location/c;->q()D

    move-result-wide v10

    invoke-virtual {v7, v8, v9, v10, v11}, La/a/a/d/m/c/a;->a(DD)V

    invoke-virtual {v2}, Lcom/baidu/location/c;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, La/a/a/d/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_9

    if-eqz v6, :cond_9

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    return-void

    :cond_9
    iget-object v6, v0, La/a/a/d/i;->p:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_a

    iget-boolean v3, v0, La/a/a/d/i;->Q:Z

    if-eqz v3, :cond_a

    iget-object v3, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    invoke-static {v3}, La/a/a/d/i$h;->b(La/a/a/d/i$h;)V

    invoke-static {}, La/a/a/d/m/b/a;->c()V

    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, La/a/a/d/m/b/a;->a(Ljava/lang/String;)Z

    :cond_a
    invoke-virtual {v2}, Lcom/baidu/location/c;->k()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, La/a/a/d/i;->p:Ljava/lang/String;

    invoke-static {}, La/a/a/d/k;->e()La/a/a/d/k;

    move-result-object v3

    invoke-virtual {v3}, La/a/a/d/k;->a()D

    move-result-wide v6

    cmpl-double v3, v6, v13

    if-ltz v3, :cond_b

    invoke-virtual {v2}, Lcom/baidu/location/c;->i()F

    move-result v3

    const/4 v8, 0x0

    cmpg-float v3, v3, v8

    if-gtz v3, :cond_b

    double-to-float v3, v6

    invoke-virtual {v2, v3}, Lcom/baidu/location/c;->a(F)V

    :cond_b
    iget-boolean v3, v0, La/a/a/d/i;->L:Z

    invoke-static {v3, v2}, La/a/a/d/m/b/a;->a(ZLcom/baidu/location/c;)[D

    move-result-object v3

    if-nez v3, :cond_c

    goto/16 :goto_3

    :cond_c
    aget-wide v6, v3, v1

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    cmpl-double v6, v6, v8

    if-nez v6, :cond_d

    goto/16 :goto_3

    :cond_d
    aget-wide v6, v3, v1

    cmpl-double v1, v6, v13

    if-nez v1, :cond_11

    aget-wide v5, v3, v5

    invoke-virtual {v2, v5, v6}, Lcom/baidu/location/c;->d(D)V

    const/4 v1, 0x2

    aget-wide v5, v3, v1

    invoke-virtual {v2, v5, v6}, Lcom/baidu/location/c;->c(D)V

    move-object/from16 v6, v17

    invoke-virtual {v2, v6, v3}, Lcom/baidu/location/c;->a(Ljava/lang/String;[D)V

    aget-wide v5, v3, v15

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->b(F)V

    const/4 v1, 0x6

    aget-wide v5, v3, v1

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(F)V

    const/16 v1, 0x8

    aget-wide v5, v3, v1

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->c(F)V

    iget-object v1, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    aget-wide v5, v3, v15

    invoke-static {v1, v2, v5, v6, v4}, La/a/a/d/i$h;->a(La/a/a/d/i$h;Lcom/baidu/location/c;DLjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->l()V

    return-void

    :cond_e
    move-object v6, v9

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->e()Z

    move-result v3

    if-eqz v3, :cond_15

    iget-boolean v3, v0, La/a/a/d/i;->L:Z

    if-eqz v3, :cond_15

    invoke-static {v3, v2}, La/a/a/d/m/b/a;->a(ZLcom/baidu/location/c;)[D

    move-result-object v3

    if-nez v3, :cond_f

    goto :goto_3

    :cond_f
    aget-wide v7, v3, v1

    const-wide/high16 v9, -0x4010000000000000L    # -1.0

    cmpl-double v7, v7, v9

    if-nez v7, :cond_10

    goto :goto_3

    :cond_10
    aget-wide v7, v3, v1

    cmpl-double v1, v7, v13

    if-nez v1, :cond_11

    aget-wide v7, v3, v5

    invoke-virtual {v2, v7, v8}, Lcom/baidu/location/c;->d(D)V

    const/4 v1, 0x2

    aget-wide v7, v3, v1

    invoke-virtual {v2, v7, v8}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v2, v6, v3}, Lcom/baidu/location/c;->a(Ljava/lang/String;[D)V

    aget-wide v5, v3, v15

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->b(F)V

    const/4 v1, 0x6

    aget-wide v5, v3, v1

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->a(F)V

    const/16 v1, 0x8

    aget-wide v5, v3, v1

    double-to-float v1, v5

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->c(F)V

    iget-object v1, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    aget-wide v5, v3, v15

    invoke-static {v1, v2, v5, v6, v4}, La/a/a/d/i$h;->a(La/a/a/d/i$h;Lcom/baidu/location/c;DLjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->l()V

    return-void

    :cond_11
    :goto_3
    invoke-virtual {v2}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    iput-wide v3, v0, La/a/a/d/i;->A:D

    invoke-virtual {v2}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    iput-wide v3, v0, La/a/a/d/i;->z:D

    goto :goto_4

    :cond_12
    invoke-virtual {v2}, Lcom/baidu/location/c;->r()I

    move-result v3

    const/16 v4, 0x3f

    if-ne v3, v4, :cond_14

    iget v1, v0, La/a/a/d/i;->m:I

    add-int/2addr v1, v5

    iput v1, v0, La/a/a/d/i;->m:I

    const/16 v3, 0xa

    if-le v1, v3, :cond_13

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->l()V

    goto :goto_4

    :cond_13
    return-void

    :cond_14
    iput v1, v0, La/a/a/d/i;->m:I

    :cond_15
    :goto_4
    iget-boolean v1, v0, La/a/a/d/i;->j:Z

    if-eqz v1, :cond_18

    invoke-virtual {v2}, Lcom/baidu/location/c;->C()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_16

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    iget-object v3, v0, La/a/a/d/i;->N:Ljava/text/SimpleDateFormat;

    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    :cond_16
    new-instance v1, Lcom/baidu/location/c;

    invoke-direct {v1, v2}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    invoke-virtual {v1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "2"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    iget-object v2, v0, La/a/a/d/i;->M:La/a/a/d/l;

    if-eqz v2, :cond_17

    invoke-virtual {v2}, La/a/a/d/l;->a()Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v2, v0, La/a/a/d/i;->M:La/a/a/d/l;

    invoke-virtual {v2, v1}, La/a/a/d/l;->a(Lcom/baidu/location/c;)V

    goto :goto_5

    :cond_17
    const/16 v2, 0x15

    invoke-virtual {v0, v1, v2}, La/a/a/d/i;->a(Lcom/baidu/location/c;I)V

    :cond_18
    :goto_5
    iget-object v0, v0, La/a/a/d/i;->h:La/a/a/d/i$m;

    invoke-virtual {v0}, La/a/a/d/i$m;->b()V

    return-void
.end method

.method public final a(Lcom/baidu/location/c;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/baidu/location/c;I)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, La/a/a/d/i;->e()Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_7

    const/4 p2, 0x2

    invoke-static {p2}, La/a/a/d/h;->b(I)I

    move-result v3

    if-eq v3, v2, :cond_2

    if-ne v3, p2, :cond_1

    goto :goto_0

    :cond_1
    if-nez v3, :cond_4

    invoke-virtual {p1, v1}, Lcom/baidu/location/c;->f(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/baidu/location/c;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p2}, La/a/a/d/h;->a(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "_"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v0

    if-eqz v4, :cond_3

    const-string v5, ""

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/baidu/location/c;->f(Ljava/lang/String;)V

    :cond_3
    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object v4

    invoke-virtual {v4}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_4
    :goto_1
    if-eq v3, p2, :cond_5

    if-nez v3, :cond_7

    :cond_5
    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p2

    invoke-virtual {p2}, La/a/a/g/d;->j()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p2

    invoke-virtual {p2}, La/a/a/g/d;->e()Landroid/location/Location;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    const-string p2, "gps2gcj"

    invoke-static {v3, v4, v5, v6, p2}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object p2

    aget-wide v3, p2, v0

    invoke-virtual {p1, v3, v4}, Lcom/baidu/location/c;->d(D)V

    aget-wide v3, p2, v2

    invoke-virtual {p1, v3, v4}, Lcom/baidu/location/c;->c(D)V

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, La/a/a/d/b;->e()I

    throw v1

    :cond_7
    :goto_2
    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object p2

    const-string v3, "vps"

    invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lcom/baidu/location/c;->t()D

    move-result-wide v3

    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    cmpl-double p2, v3, v5

    if-nez p2, :cond_8

    invoke-virtual {p1}, Lcom/baidu/location/c;->q()D

    move-result-wide v3

    cmpl-double p2, v3, v5

    if-nez p2, :cond_8

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->n(I)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1, v2}, Lcom/baidu/location/c;->n(I)V

    :goto_3
    iget p0, p0, La/a/a/d/i;->O:I

    invoke-virtual {p1, p0}, Lcom/baidu/location/c;->f(I)V

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object p0

    if-nez p0, :cond_9

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    return-void

    :cond_9
    invoke-virtual {p0}, La/a/a/d/b;->d()I

    throw v1

    :cond_a
    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_b

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_b

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->c()Lcom/baidu/location/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->a(Lcom/baidu/location/a;)V

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->b(Ljava/lang/String;)V

    :cond_b
    invoke-virtual {p1}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_c

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_c

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->x()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->a(Ljava/util/List;)V

    :cond_c
    invoke-virtual {p1}, Lcom/baidu/location/c;->y()Lcom/baidu/location/k;

    move-result-object p2

    if-nez p2, :cond_d

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->y()Lcom/baidu/location/k;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance p2, Lcom/baidu/location/k;

    iget-object v3, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {v3}, Lcom/baidu/location/c;->y()Lcom/baidu/location/k;

    move-result-object v3

    invoke-direct {p2, v3}, Lcom/baidu/location/k;-><init>(Lcom/baidu/location/k;)V

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->a(Lcom/baidu/location/k;)V

    :cond_d
    invoke-virtual {p1}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_e

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_e

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->s()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->j(Ljava/lang/String;)V

    :cond_e
    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->w()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->m(Ljava/lang/String;)V

    iget-object p2, p0, La/a/a/d/i;->P:Lcom/baidu/location/c;

    invoke-virtual {p2}, Lcom/baidu/location/c;->I()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->b(Z)V

    :cond_f
    if-nez p1, :cond_10

    return-void

    :cond_10
    new-instance p2, Ljava/text/SimpleDateFormat;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {p2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object p2

    const-string v3, "2"

    invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_13

    invoke-virtual {p1}, Lcom/baidu/location/c;->v()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {p2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->l(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/baidu/location/c;->n(I)V

    iget p2, p0, La/a/a/d/i;->O:I

    invoke-virtual {p1, p2}, Lcom/baidu/location/c;->f(I)V

    invoke-static {}, La/a/a/d/d;->b()La/a/a/d/d;

    move-result-object p2

    invoke-virtual {p2}, La/a/a/d/d;->a()La/a/a/d/b;

    move-result-object p2

    if-nez p2, :cond_12

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p2

    invoke-virtual {p2, p1}, La/a/a/b/c;->c(Lcom/baidu/location/c;)V

    new-instance p2, Lcom/baidu/location/c;

    invoke-direct {p2, p1}, Lcom/baidu/location/c;-><init>(Lcom/baidu/location/c;)V

    iget-boolean p1, p0, La/a/a/d/i;->K:Z

    if-eqz p1, :cond_11

    const/high16 p1, 0x41000000    # 8.0f

    goto :goto_4

    :cond_11
    const/high16 p1, 0x41700000    # 15.0f

    :goto_4
    invoke-virtual {p2, p1}, Lcom/baidu/location/c;->b(F)V

    iget-object p0, p0, La/a/a/d/i;->f:La/a/a/d/i$g;

    const/16 p1, 0x321

    invoke-virtual {p0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p0

    iput-object p2, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_5

    :cond_12
    invoke-virtual {p2}, La/a/a/d/b;->d()I

    throw v1

    :cond_13
    :goto_5
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, La/a/a/d/i;->s:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, La/a/a/d/i;->Q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, La/a/a/d/m/c/a;->d()La/a/a/d/m/c/a;

    move-result-object v0

    const-string v1, "gcj02"

    invoke-virtual {v0, v1}, La/a/a/d/m/c/a;->k(Ljava/lang/String;)V

    new-instance v1, La/a/a/d/i$c;

    invoke-direct {v1, p0, p1, p2}, La/a/a/d/i$c;-><init>(La/a/a/d/i;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, La/a/a/d/m/c/a;->a(Ljava/lang/String;La/a/a/d/m/c/a$d;)V

    return-void
.end method

.method public a(DD)Z
    .locals 6

    invoke-static {}, La/a/a/d/m/c/b;->d()La/a/a/d/m/c/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/m/c/b;->c()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-static {}, La/a/a/d/m/c/b;->d()La/a/a/d/m/c/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/m/c/b;->b()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, La/a/a/d/m/c/b;->d()La/a/a/d/m/c/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/d/m/c/b;->a()Ljava/util/Map;

    move-result-object p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/d/m/c/b$a;

    iget-wide v4, v3, La/a/a/d/m/c/b$a;->f:D

    cmpl-double v4, p1, v4

    if-lez v4, :cond_2

    iget-wide v4, v3, La/a/a/d/m/c/b$a;->d:D

    cmpg-double v4, p1, v4

    if-gez v4, :cond_2

    iget-wide v4, v3, La/a/a/d/m/c/b$a;->g:D

    cmpl-double v4, p3, v4

    if-lez v4, :cond_2

    iget-wide v4, v3, La/a/a/d/m/c/b$a;->e:D

    cmpg-double v4, p3, v4

    if-gez v4, :cond_2

    iget-object p0, v3, La/a/a/d/m/c/b$a;->c:Ljava/lang/String;

    iget-object v1, v3, La/a/a/d/m/c/b$a;->b:Ljava/lang/String;

    iget-object p0, v3, La/a/a/d/m/c/b$a;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/util/ConcurrentModificationException;->printStackTrace()V

    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    return v0
.end method

.method public a(Landroid/location/Location;Ljava/util/ArrayList;)Z
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->e()Z

    move-result v1

    const-string v14, "gps2gcj"

    const/4 v15, 0x1

    const/16 v16, 0x0

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4, v14}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v1

    aget-wide v2, v1, v16

    aget-wide v4, v1, v15

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAccuracy()F

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getBearing()F

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-wide v1, v2

    move-wide v3, v4

    move v5, v6

    move v6, v7

    move v7, v8

    move-wide v8, v9

    move v10, v13

    invoke-static/range {v1 .. v12}, La/a/a/d/h;->a(DDFFFDIJ)V

    :cond_0
    if-eqz v13, :cond_9

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/d;->j()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-boolean v1, v0, La/a/a/d/i;->i:Z

    if-nez v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    return v16

    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4, v14}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v1

    aget-wide v9, v1, v16

    aget-wide v11, v1, v15

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v13, v1

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getBearing()F

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v17

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    invoke-virtual {v0, v9, v10, v11, v12}, La/a/a/d/i;->a(DD)Z

    move-result v1

    if-nez v1, :cond_4

    iget v1, v0, La/a/a/d/i;->a:I

    if-ne v1, v15, :cond_3

    goto :goto_0

    :cond_3
    move/from16 v1, v16

    goto :goto_1

    :cond_4
    :goto_0
    move v1, v15

    :goto_1
    iget-boolean v2, v0, La/a/a/d/i;->i:Z

    if-nez v2, :cond_5

    if-nez v1, :cond_5

    return v16

    :cond_5
    :try_start_0
    iget-object v2, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    move-object/from16 v3, p1

    invoke-static {v2, v3, v1}, La/a/a/d/i$h;->a(La/a/a/d/i$h;Landroid/location/Location;Z)V

    iget-object v1, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    invoke-static {v1}, La/a/a/d/i$h;->a(La/a/a/d/i$h;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->k()V

    return v15

    :cond_6
    invoke-virtual/range {p0 .. p0}, La/a/a/d/i;->f()Z

    move-result v1

    if-nez v1, :cond_7

    return v16

    :cond_7
    iget-object v2, v0, La/a/a/d/i;->U:La/a/a/d/i$h;

    move-wide v3, v9

    move-wide v5, v11

    move-wide v7, v13

    invoke-static/range {v2 .. v8}, La/a/a/d/i$h;->a(La/a/a/d/i$h;DDD)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, La/a/a/d/m/b/a;->c()V

    :cond_8
    iget-object v2, v0, La/a/a/d/i;->T:La/a/a/d/i$f;

    move-wide v3, v13

    move-wide v5, v9

    move-wide v7, v11

    move-wide/from16 v9, v17

    invoke-virtual/range {v2 .. v10}, La/a/a/d/i$f;->a(DDDD)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_9
    :goto_2
    return v16
.end method

.method public a(Landroid/os/Bundle;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "mode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, La/a/a/d/i;->a:I

    const/4 p0, 0x1

    return p0
.end method

.method public final b()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, La/a/a/d/i;->W:La/a/a/d/i$e;

    iget v1, v0, La/a/a/d/i$e;->f:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, v0, La/a/a/d/i$e;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v0}, La/a/a/d/i$e;->a(La/a/a/d/i$e;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, La/a/a/d/i;->w:La/a/a/d/f;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const-string v6, ""

    :goto_0
    if-ge v5, v1, :cond_2

    :try_start_0
    iget-object v7, p0, La/a/a/d/i;->w:La/a/a/d/f;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "|"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_1
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-le v7, v4, :cond_3

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v4, v3

    move-object v3, v6

    goto :goto_2

    :cond_4
    if-eqz v3, :cond_6

    iget-object v0, p0, La/a/a/d/i;->p:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v4, p0, La/a/a/d/i;->v:I

    if-ne v0, v4, :cond_6

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    add-int/lit8 v4, v1, -0x3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    add-int/lit8 v4, v1, -0x2

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    iget-object v3, p0, La/a/a/d/i;->p:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    iget-object v3, p0, La/a/a/d/i;->p:Ljava/lang/String;

    :cond_6
    :goto_3
    return-object v3
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->q:Ljava/lang/String;

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/i;->p:Ljava/lang/String;

    return-object p0
.end method

.method public e()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/i;->S:Z

    return p0
.end method

.method public f()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/d/i;->i:Z

    return p0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, La/a/a/d/i;->i:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    invoke-static {p0}, La/a/a/d/i$h;->c(La/a/a/d/i$h;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, La/a/a/d/i;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    invoke-static {v0}, La/a/a/d/i$h;->d(La/a/a/d/i$h;)V

    iget-object p0, p0, La/a/a/d/i;->h:La/a/a/d/i$m;

    invoke-virtual {p0}, La/a/a/d/i$m;->c()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 3

    iget v0, p0, La/a/a/d/i;->E:I

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, La/a/a/d/i;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, La/a/a/d/i;->D:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, La/a/a/d/i;->E:I

    return-void
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, La/a/a/d/i;->w:La/a/a/d/f;

    invoke-virtual {v0}, La/a/a/d/f;->clear()V

    iget-object v0, p0, La/a/a/d/i;->y:La/a/a/d/f;

    invoke-virtual {v0}, La/a/a/d/f;->clear()V

    const/4 v0, 0x0

    iput v0, p0, La/a/a/d/i;->m:I

    iput v0, p0, La/a/a/d/i;->u:I

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/d/i;->p:Ljava/lang/String;

    iput-object v1, p0, La/a/a/d/i;->q:Ljava/lang/String;

    iput-object v1, p0, La/a/a/d/i;->s:Ljava/lang/String;

    iput-boolean v0, p0, La/a/a/d/i;->K:Z

    iput-boolean v0, p0, La/a/a/d/i;->L:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La/a/a/d/i;->z:D

    iput-wide v1, p0, La/a/a/d/i;->A:D

    iput v0, p0, La/a/a/d/i;->F:I

    iput v0, p0, La/a/a/d/i;->o:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La/a/a/d/i;->l:J

    iget-object v1, p0, La/a/a/d/i;->U:La/a/a/d/i$h;

    invoke-static {v1}, La/a/a/d/i$h;->b(La/a/a/d/i$h;)V

    invoke-static {}, La/a/a/d/m/b/a;->c()V

    iget-boolean v1, p0, La/a/a/d/i;->Q:Z

    if-eqz v1, :cond_0

    invoke-static {}, La/a/a/d/m/c/a;->d()La/a/a/d/m/c/a;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/d/m/c/a;->a()V

    :cond_0
    iput-boolean v0, p0, La/a/a/d/i;->Q:Z

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v1

    invoke-virtual {v1, v0}, La/a/a/b/t;->a(Z)V

    iget-object p0, p0, La/a/a/d/i;->J:La/a/a/d/g;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, La/a/a/d/g;->i()V

    :cond_1
    return-void
.end method

.method public declared-synchronized k()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/d/i;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, La/a/a/d/m/b/a;->b()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/i;->l:J

    invoke-static {}, La/a/a/d/k;->e()La/a/a/d/k;

    move-result-object v0

    iget-object v1, p0, La/a/a/d/i;->n:La/a/a/d/k$c;

    invoke-virtual {v0, v1}, La/a/a/d/k;->a(La/a/a/d/k$c;)V

    new-instance v0, La/a/a/d/i$k;

    invoke-direct {v0, p0}, La/a/a/d/i$k;-><init>(La/a/a/d/i;)V

    iput-object v0, p0, La/a/a/d/i;->g:La/a/a/d/i$k;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/i;->j:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, La/a/a/d/i;->i:Z

    iget-object v2, p0, La/a/a/d/i;->J:La/a/a/d/g;

    if-nez v2, :cond_1

    new-instance v2, La/a/a/d/g;

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, La/a/a/d/g;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, La/a/a/d/i;->J:La/a/a/d/g;

    :cond_1
    iput v0, p0, La/a/a/d/i;->F:I

    iput v0, p0, La/a/a/d/i;->o:I

    invoke-static {}, La/a/a/b/t;->e()La/a/a/b/t;

    move-result-object v0

    invoke-virtual {v0, v1}, La/a/a/b/t;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized l()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/d/i;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, La/a/a/d/i;->i:Z

    invoke-static {}, La/a/a/d/k;->e()La/a/a/d/k;

    move-result-object v1

    iget-object v2, p0, La/a/a/d/i;->n:La/a/a/d/k$c;

    invoke-virtual {v1, v2}, La/a/a/d/k;->b(La/a/a/d/k$c;)V

    iget-object v1, p0, La/a/a/d/i;->M:La/a/a/d/l;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La/a/a/d/l;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La/a/a/d/i;->M:La/a/a/d/l;

    invoke-virtual {v1}, La/a/a/d/l;->c()V

    :cond_1
    iget-object v1, p0, La/a/a/d/i;->H:La/a/a/d/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, La/a/a/d/a;->b()V

    :cond_2
    iget-object v1, p0, La/a/a/d/i;->J:La/a/a/d/g;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, La/a/a/d/g;->l()V

    :cond_3
    iget-object v1, p0, La/a/a/d/i;->g:La/a/a/d/i$k;

    if-eqz v1, :cond_4

    invoke-static {v1, v0}, La/a/a/d/i$k;->a(La/a/a/d/i$k;Z)Z

    iget-object v1, p0, La/a/a/d/i;->g:La/a/a/d/i$k;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/d/i;->g:La/a/a/d/i$k;

    :cond_4
    invoke-virtual {p0}, La/a/a/d/i;->j()V

    iput-boolean v0, p0, La/a/a/d/i;->j:Z

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/c;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    invoke-virtual {p0}, La/a/a/d/i;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, La/a/a/d/i;->f:La/a/a/d/i$g;

    new-instance v1, La/a/a/d/i$d;

    invoke-direct {v1, p0, p1}, La/a/a/d/i$d;-><init>(La/a/a/d/i;[F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
