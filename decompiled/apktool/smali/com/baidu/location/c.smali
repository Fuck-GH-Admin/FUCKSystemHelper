.class public final Lcom/baidu/location/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/baidu/location/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:D

.field public E:Z

.field public F:I

.field public G:I

.field public H:Ljava/lang/String;

.field public I:I

.field public J:Ljava/lang/String;

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:Ljava/lang/String;

.field public P:Ljava/lang/String;

.field public Q:Ljava/lang/String;

.field public R:I

.field public S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/location/j;",
            ">;"
        }
    .end annotation
.end field

.field public T:Ljava/lang/String;

.field public U:Ljava/lang/String;

.field public V:Ljava/lang/String;

.field public W:Landroid/os/Bundle;

.field public X:I

.field public Y:I

.field public Z:J

.field public a0:Ljava/lang/String;

.field public b:I

.field public b0:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public c0:D

.field public d:D

.field public d0:D

.field public e:D

.field public e0:Z

.field public f:Z

.field public f0:Lcom/baidu/location/k;

.field public g:D

.field public g0:F

.field public h:Z

.field public h0:D

.field public i:F

.field public i0:I

.field public j:Z

.field public j0:I

.field public k:F

.field public k0:Lcom/baidu/location/c;

.field public l:Ljava/lang/String;

.field public l0:Landroid/os/Bundle;

.field public m:F

.field public m0:Ljava/lang/String;

.field public n:I

.field public n0:J

.field public o:F

.field public p:Z

.field public q:I

.field public r:F

.field public s:Ljava/lang/String;

.field public t:Z

.field public u:Ljava/lang/String;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Lcom/baidu/location/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/baidu/location/c$a;

    invoke-direct {v0}, Lcom/baidu/location/c$a;-><init>()V

    sput-object v0, Lcom/baidu/location/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/c;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    const-wide/16 v2, 0x1

    iput-wide v2, p0, Lcom/baidu/location/c;->d:D

    iput-wide v2, p0, Lcom/baidu/location/c;->e:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->f:Z

    iput-wide v2, p0, Lcom/baidu/location/c;->g:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->h:Z

    const/4 v4, 0x0

    iput v4, p0, Lcom/baidu/location/c;->i:F

    iput-boolean v0, p0, Lcom/baidu/location/c;->j:Z

    iput v4, p0, Lcom/baidu/location/c;->k:F

    iput v4, p0, Lcom/baidu/location/c;->m:F

    const/4 v5, -0x1

    iput v5, p0, Lcom/baidu/location/c;->n:I

    iput v4, p0, Lcom/baidu/location/c;->o:F

    iput-boolean v0, p0, Lcom/baidu/location/c;->p:Z

    iput v5, p0, Lcom/baidu/location/c;->q:I

    const/high16 v4, -0x40800000    # -1.0f

    iput v4, p0, Lcom/baidu/location/c;->r:F

    iput-object v1, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->t:Z

    iput-object v1, p0, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->y:Z

    new-instance v6, Lcom/baidu/location/a$a;

    invoke-direct {v6}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v6}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v6

    iput-object v6, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iput-object v1, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->E:Z

    iput v0, p0, Lcom/baidu/location/c;->F:I

    const/4 v6, 0x1

    iput v6, p0, Lcom/baidu/location/c;->G:I

    iput-object v1, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    const-string v6, ""

    iput-object v6, p0, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iput v5, p0, Lcom/baidu/location/c;->K:I

    iput v0, p0, Lcom/baidu/location/c;->L:I

    const/4 v6, 0x2

    iput v6, p0, Lcom/baidu/location/c;->M:I

    iput v0, p0, Lcom/baidu/location/c;->N:I

    iput-object v1, p0, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iput v5, p0, Lcom/baidu/location/c;->R:I

    iput-object v1, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    iput-object v1, p0, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->V:Ljava/lang/String;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    iput-object v6, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iput v0, p0, Lcom/baidu/location/c;->X:I

    iput v0, p0, Lcom/baidu/location/c;->Y:I

    const-wide/16 v6, 0x0

    iput-wide v6, p0, Lcom/baidu/location/c;->Z:J

    iput-object v1, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iput-wide v2, p0, Lcom/baidu/location/c;->c0:D

    iput-wide v2, p0, Lcom/baidu/location/c;->d0:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->e0:Z

    iput-object v1, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iput v4, p0, Lcom/baidu/location/c;->g0:F

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    iput-wide v2, p0, Lcom/baidu/location/c;->h0:D

    iput v0, p0, Lcom/baidu/location/c;->i0:I

    iput v5, p0, Lcom/baidu/location/c;->j0:I

    iput-object v1, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iput-object v1, p0, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/baidu/location/c;->n0:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput v3, v1, Lcom/baidu/location/c;->b:I

    const/4 v4, 0x0

    iput-object v4, v1, Lcom/baidu/location/c;->c:Ljava/lang/String;

    const-wide/16 v5, 0x1

    iput-wide v5, v1, Lcom/baidu/location/c;->d:D

    iput-wide v5, v1, Lcom/baidu/location/c;->e:D

    iput-boolean v3, v1, Lcom/baidu/location/c;->f:Z

    iput-wide v5, v1, Lcom/baidu/location/c;->g:D

    iput-boolean v3, v1, Lcom/baidu/location/c;->h:Z

    const/4 v0, 0x0

    iput v0, v1, Lcom/baidu/location/c;->i:F

    iput-boolean v3, v1, Lcom/baidu/location/c;->j:Z

    iput v0, v1, Lcom/baidu/location/c;->k:F

    iput v0, v1, Lcom/baidu/location/c;->m:F

    const/4 v7, -0x1

    iput v7, v1, Lcom/baidu/location/c;->n:I

    iput v0, v1, Lcom/baidu/location/c;->o:F

    iput-boolean v3, v1, Lcom/baidu/location/c;->p:Z

    iput v7, v1, Lcom/baidu/location/c;->q:I

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, v1, Lcom/baidu/location/c;->r:F

    iput-object v4, v1, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iput-boolean v3, v1, Lcom/baidu/location/c;->t:Z

    iput-object v4, v1, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iput-boolean v3, v1, Lcom/baidu/location/c;->y:Z

    new-instance v8, Lcom/baidu/location/a$a;

    invoke-direct {v8}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v8}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v8

    iput-object v8, v1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iput-object v4, v1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iput-boolean v3, v1, Lcom/baidu/location/c;->E:Z

    iput v3, v1, Lcom/baidu/location/c;->F:I

    const/4 v8, 0x1

    iput v8, v1, Lcom/baidu/location/c;->G:I

    iput-object v4, v1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    const-string v9, ""

    iput-object v9, v1, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iput v7, v1, Lcom/baidu/location/c;->K:I

    iput v3, v1, Lcom/baidu/location/c;->L:I

    const/4 v9, 0x2

    iput v9, v1, Lcom/baidu/location/c;->M:I

    iput v3, v1, Lcom/baidu/location/c;->N:I

    iput-object v4, v1, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iput v7, v1, Lcom/baidu/location/c;->R:I

    iput-object v4, v1, Lcom/baidu/location/c;->S:Ljava/util/List;

    iput-object v4, v1, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->V:Ljava/lang/String;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    iput-object v10, v1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iput v3, v1, Lcom/baidu/location/c;->X:I

    iput v3, v1, Lcom/baidu/location/c;->Y:I

    const-wide/16 v10, 0x0

    iput-wide v10, v1, Lcom/baidu/location/c;->Z:J

    iput-object v4, v1, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iput-object v4, v1, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iput-wide v5, v1, Lcom/baidu/location/c;->c0:D

    iput-wide v5, v1, Lcom/baidu/location/c;->d0:D

    iput-boolean v3, v1, Lcom/baidu/location/c;->e0:Z

    iput-object v4, v1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iput v0, v1, Lcom/baidu/location/c;->g0:F

    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    iput-wide v5, v1, Lcom/baidu/location/c;->h0:D

    iput v3, v1, Lcom/baidu/location/c;->i0:I

    iput v7, v1, Lcom/baidu/location/c;->j0:I

    iput-object v4, v1, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iput-object v4, v1, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    const-wide/16 v5, -0x1

    iput-wide v5, v1, Lcom/baidu/location/c;->n0:J

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->b:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->c:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    iput-wide v5, v1, Lcom/baidu/location/c;->n0:J

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    iput-wide v5, v1, Lcom/baidu/location/c;->d:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    iput-wide v5, v1, Lcom/baidu/location/c;->e:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    iput-wide v5, v1, Lcom/baidu/location/c;->g:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->i:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->k:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->l:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->m:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->n:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->o:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->q:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->r:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->F:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    iput-wide v5, v1, Lcom/baidu/location/c;->D:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    new-instance v9, Lcom/baidu/location/a$a;

    invoke-direct {v9}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v9, v12}, Lcom/baidu/location/a$a;->d(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v13}, Lcom/baidu/location/a$a;->e(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v0}, Lcom/baidu/location/a$a;->g(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v5}, Lcom/baidu/location/a$a;->b(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v11}, Lcom/baidu/location/a$a;->c(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v6}, Lcom/baidu/location/a$a;->f(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v7}, Lcom/baidu/location/a$a;->h(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v10}, Lcom/baidu/location/a$a;->i(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v14}, Lcom/baidu/location/a$a;->a(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9, v15}, Lcom/baidu/location/a$a;->j(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v9}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    const/16 v0, 0x8

    new-array v5, v0, [Z

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->I:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->J:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->w:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->x:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->G:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->T:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->K:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->L:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->M:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->N:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->O:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->P:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->R:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->X:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->U:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->Y:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->V:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/baidu/location/c;->Z:J

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v6

    iput-wide v6, v1, Lcom/baidu/location/c;->c0:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v6

    iput-wide v6, v1, Lcom/baidu/location/c;->d0:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->g0:F

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v6

    iput-wide v6, v1, Lcom/baidu/location/c;->h0:D

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->i0:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, v1, Lcom/baidu/location/c;->j0:I

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->s:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    :try_start_0
    const-class v0, Lcom/baidu/location/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/c;

    iput-object v0, v1, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v4, v1, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    :try_start_1
    invoke-virtual {v2, v5}, Landroid/os/Parcel;->readBooleanArray([Z)V

    aget-boolean v0, v5, v3

    iput-boolean v0, v1, Lcom/baidu/location/c;->f:Z

    aget-boolean v0, v5, v8

    iput-boolean v0, v1, Lcom/baidu/location/c;->h:Z

    const/4 v3, 0x2

    aget-boolean v0, v5, v3

    iput-boolean v0, v1, Lcom/baidu/location/c;->j:Z

    const/4 v0, 0x3

    aget-boolean v0, v5, v0

    iput-boolean v0, v1, Lcom/baidu/location/c;->p:Z

    const/4 v0, 0x4

    aget-boolean v0, v5, v0

    iput-boolean v0, v1, Lcom/baidu/location/c;->t:Z

    const/4 v0, 0x5

    aget-boolean v0, v5, v0

    iput-boolean v0, v1, Lcom/baidu/location/c;->y:Z

    const/4 v0, 0x6

    aget-boolean v0, v5, v0

    iput-boolean v0, v1, Lcom/baidu/location/c;->E:Z

    const/4 v0, 0x7

    aget-boolean v0, v5, v0

    iput-boolean v0, v1, Lcom/baidu/location/c;->e0:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :try_start_2
    const-class v0, Lcom/baidu/location/j;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iput-object v4, v1, Lcom/baidu/location/c;->S:Ljava/util/List;

    goto :goto_2

    :cond_0
    iput-object v3, v1, Lcom/baidu/location/c;->S:Ljava/util/List;

    :goto_2
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    :goto_3
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    :goto_4
    :try_start_5
    const-class v0, Lcom/baidu/location/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/location/k;

    iput-object v0, v1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v0

    iput-object v4, v1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/baidu/location/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/location/c;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/c;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/c;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    const-wide/16 v2, 0x1

    iput-wide v2, p0, Lcom/baidu/location/c;->d:D

    iput-wide v2, p0, Lcom/baidu/location/c;->e:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->f:Z

    iput-wide v2, p0, Lcom/baidu/location/c;->g:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->h:Z

    const/4 v4, 0x0

    iput v4, p0, Lcom/baidu/location/c;->i:F

    iput-boolean v0, p0, Lcom/baidu/location/c;->j:Z

    iput v4, p0, Lcom/baidu/location/c;->k:F

    iput v4, p0, Lcom/baidu/location/c;->m:F

    const/4 v5, -0x1

    iput v5, p0, Lcom/baidu/location/c;->n:I

    iput v4, p0, Lcom/baidu/location/c;->o:F

    iput-boolean v0, p0, Lcom/baidu/location/c;->p:Z

    iput v5, p0, Lcom/baidu/location/c;->q:I

    const/high16 v4, -0x40800000    # -1.0f

    iput v4, p0, Lcom/baidu/location/c;->r:F

    iput-object v1, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->t:Z

    iput-object v1, p0, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->y:Z

    new-instance v6, Lcom/baidu/location/a$a;

    invoke-direct {v6}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v6}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v6

    iput-object v6, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iput-object v1, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/baidu/location/c;->E:Z

    iput v0, p0, Lcom/baidu/location/c;->F:I

    const/4 v6, 0x1

    iput v6, p0, Lcom/baidu/location/c;->G:I

    iput-object v1, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    const-string v6, ""

    iput-object v6, p0, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iput v5, p0, Lcom/baidu/location/c;->K:I

    iput v0, p0, Lcom/baidu/location/c;->L:I

    const/4 v6, 0x2

    iput v6, p0, Lcom/baidu/location/c;->M:I

    iput v0, p0, Lcom/baidu/location/c;->N:I

    iput-object v1, p0, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iput v5, p0, Lcom/baidu/location/c;->R:I

    iput-object v1, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    iput-object v1, p0, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->V:Ljava/lang/String;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    iput-object v6, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iput v0, p0, Lcom/baidu/location/c;->X:I

    iput v0, p0, Lcom/baidu/location/c;->Y:I

    const-wide/16 v6, 0x0

    iput-wide v6, p0, Lcom/baidu/location/c;->Z:J

    iput-object v1, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iput-object v1, p0, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iput-wide v2, p0, Lcom/baidu/location/c;->c0:D

    iput-wide v2, p0, Lcom/baidu/location/c;->d0:D

    iput-boolean v0, p0, Lcom/baidu/location/c;->e0:Z

    iput-object v1, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iput v4, p0, Lcom/baidu/location/c;->g0:F

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    iput-wide v2, p0, Lcom/baidu/location/c;->h0:D

    iput v0, p0, Lcom/baidu/location/c;->i0:I

    iput v5, p0, Lcom/baidu/location/c;->j0:I

    iput-object v1, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iput-object v1, p0, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/baidu/location/c;->n0:J

    iget v2, p1, Lcom/baidu/location/c;->b:I

    iput v2, p0, Lcom/baidu/location/c;->b:I

    iget-object v2, p1, Lcom/baidu/location/c;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    iget-wide v2, p1, Lcom/baidu/location/c;->n0:J

    iput-wide v2, p0, Lcom/baidu/location/c;->n0:J

    iget-wide v2, p1, Lcom/baidu/location/c;->d:D

    iput-wide v2, p0, Lcom/baidu/location/c;->d:D

    iget-wide v2, p1, Lcom/baidu/location/c;->e:D

    iput-wide v2, p0, Lcom/baidu/location/c;->e:D

    iget-boolean v2, p1, Lcom/baidu/location/c;->f:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->f:Z

    iget-wide v2, p1, Lcom/baidu/location/c;->g:D

    iput-wide v2, p0, Lcom/baidu/location/c;->g:D

    iget-boolean v2, p1, Lcom/baidu/location/c;->h:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->h:Z

    iget v2, p1, Lcom/baidu/location/c;->i:F

    iput v2, p0, Lcom/baidu/location/c;->i:F

    iget-boolean v2, p1, Lcom/baidu/location/c;->j:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->j:Z

    iget v2, p1, Lcom/baidu/location/c;->k:F

    iput v2, p0, Lcom/baidu/location/c;->k:F

    iget-object v2, p1, Lcom/baidu/location/c;->l:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->l:Ljava/lang/String;

    iget v2, p1, Lcom/baidu/location/c;->m:F

    iput v2, p0, Lcom/baidu/location/c;->m:F

    iget v2, p1, Lcom/baidu/location/c;->n:I

    iput v2, p0, Lcom/baidu/location/c;->n:I

    iget v2, p1, Lcom/baidu/location/c;->o:F

    iput v2, p0, Lcom/baidu/location/c;->o:F

    iget-boolean v2, p1, Lcom/baidu/location/c;->p:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->p:Z

    iget v2, p1, Lcom/baidu/location/c;->q:I

    iput v2, p0, Lcom/baidu/location/c;->q:I

    iget v2, p1, Lcom/baidu/location/c;->r:F

    iput v2, p0, Lcom/baidu/location/c;->r:F

    iget-object v2, p1, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/baidu/location/c;->t:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->t:Z

    iget-object v2, p1, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/baidu/location/c;->y:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->y:Z

    new-instance v2, Lcom/baidu/location/a$a;

    invoke-direct {v2}, Lcom/baidu/location/a$a;-><init>()V

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->d(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->e(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->g(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->b(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->c(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->f(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->h(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->i(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->a(Ljava/lang/String;)Lcom/baidu/location/a$a;

    iget-object v3, p1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v3, v3, Lcom/baidu/location/a;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/baidu/location/a$a;->j(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v2}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v2

    iput-object v2, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v2, p1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iget-wide v2, p1, Lcom/baidu/location/c;->D:D

    iput-wide v2, p0, Lcom/baidu/location/c;->D:D

    iget v2, p1, Lcom/baidu/location/c;->G:I

    iput v2, p0, Lcom/baidu/location/c;->G:I

    iget v2, p1, Lcom/baidu/location/c;->F:I

    iput v2, p0, Lcom/baidu/location/c;->F:I

    iget-boolean v2, p1, Lcom/baidu/location/c;->E:Z

    iput-boolean v2, p0, Lcom/baidu/location/c;->E:Z

    iget-object v2, p1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    iget v2, p1, Lcom/baidu/location/c;->I:I

    iput v2, p0, Lcom/baidu/location/c;->I:I

    iget-object v2, p1, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iget v2, p1, Lcom/baidu/location/c;->K:I

    iput v2, p0, Lcom/baidu/location/c;->K:I

    iget v2, p1, Lcom/baidu/location/c;->L:I

    iput v2, p0, Lcom/baidu/location/c;->L:I

    iget v2, p1, Lcom/baidu/location/c;->L:I

    iput v2, p0, Lcom/baidu/location/c;->M:I

    iget v2, p1, Lcom/baidu/location/c;->N:I

    iput v2, p0, Lcom/baidu/location/c;->N:I

    iget-object v2, p1, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iget v2, p1, Lcom/baidu/location/c;->R:I

    iput v2, p0, Lcom/baidu/location/c;->R:I

    iget v2, p1, Lcom/baidu/location/c;->X:I

    iput v2, p0, Lcom/baidu/location/c;->X:I

    iget-object v2, p1, Lcom/baidu/location/c;->V:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->V:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iget-wide v2, p1, Lcom/baidu/location/c;->c0:D

    iput-wide v2, p0, Lcom/baidu/location/c;->c0:D

    iget-wide v2, p1, Lcom/baidu/location/c;->d0:D

    iput-wide v2, p0, Lcom/baidu/location/c;->d0:D

    iget-wide v2, p1, Lcom/baidu/location/c;->Z:J

    iput-wide v2, p0, Lcom/baidu/location/c;->Z:J

    iget-wide v2, p1, Lcom/baidu/location/c;->h0:D

    iput-wide v2, p0, Lcom/baidu/location/c;->h0:D

    iget v2, p1, Lcom/baidu/location/c;->i0:I

    iput v2, p0, Lcom/baidu/location/c;->i0:I

    iget v2, p1, Lcom/baidu/location/c;->j0:I

    iput v2, p0, Lcom/baidu/location/c;->j0:I

    iget-object v2, p1, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;

    iput-object v2, p0, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;

    iget-object v2, p1, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iput-object v2, p0, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iget-object v2, p1, Lcom/baidu/location/c;->S:Ljava/util/List;

    if-nez v2, :cond_1

    :cond_0
    iput-object v1, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iget-object v2, p1, Lcom/baidu/location/c;->S:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p1, Lcom/baidu/location/c;->S:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/location/j;

    new-instance v10, Lcom/baidu/location/j;

    invoke-virtual {v2}, Lcom/baidu/location/j;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/baidu/location/j;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/baidu/location/j;->d()D

    move-result-wide v6

    invoke-virtual {v2}, Lcom/baidu/location/j;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/baidu/location/j;->a()Ljava/lang/String;

    move-result-object v9

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/baidu/location/j;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :goto_1
    iget-object v0, p1, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iget v0, p1, Lcom/baidu/location/c;->Y:I

    iput v0, p0, Lcom/baidu/location/c;->Y:I

    iget-boolean v0, p1, Lcom/baidu/location/c;->e0:Z

    iput-boolean v0, p0, Lcom/baidu/location/c;->e0:Z

    iget-object v0, p1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iput-object v0, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iget v0, p1, Lcom/baidu/location/c;->g0:F

    iput v0, p0, Lcom/baidu/location/c;->g0:F

    iget-object v0, p1, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iget-object p1, p1, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    iput-object p1, p0, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "traffic_skip_prop"

    const-string v4, "is_station"

    const-string v5, "traffic_prop"

    const-string v6, "traffic"

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    iput v7, v1, Lcom/baidu/location/c;->b:I

    const/4 v8, 0x0

    iput-object v8, v1, Lcom/baidu/location/c;->c:Ljava/lang/String;

    const-wide/16 v9, 0x1

    iput-wide v9, v1, Lcom/baidu/location/c;->d:D

    iput-wide v9, v1, Lcom/baidu/location/c;->e:D

    iput-boolean v7, v1, Lcom/baidu/location/c;->f:Z

    iput-wide v9, v1, Lcom/baidu/location/c;->g:D

    iput-boolean v7, v1, Lcom/baidu/location/c;->h:Z

    const/4 v11, 0x0

    iput v11, v1, Lcom/baidu/location/c;->i:F

    iput-boolean v7, v1, Lcom/baidu/location/c;->j:Z

    iput v11, v1, Lcom/baidu/location/c;->k:F

    iput v11, v1, Lcom/baidu/location/c;->m:F

    const/4 v12, -0x1

    iput v12, v1, Lcom/baidu/location/c;->n:I

    iput v11, v1, Lcom/baidu/location/c;->o:F

    iput-boolean v7, v1, Lcom/baidu/location/c;->p:Z

    iput v12, v1, Lcom/baidu/location/c;->q:I

    const/high16 v11, -0x40800000    # -1.0f

    iput v11, v1, Lcom/baidu/location/c;->r:F

    iput-object v8, v1, Lcom/baidu/location/c;->s:Ljava/lang/String;

    iput-boolean v7, v1, Lcom/baidu/location/c;->t:Z

    iput-object v8, v1, Lcom/baidu/location/c;->u:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->w:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->x:Ljava/lang/String;

    iput-boolean v7, v1, Lcom/baidu/location/c;->y:Z

    new-instance v13, Lcom/baidu/location/a$a;

    invoke-direct {v13}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v13}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v13

    iput-object v13, v1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iput-object v8, v1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    iput-boolean v7, v1, Lcom/baidu/location/c;->E:Z

    iput v7, v1, Lcom/baidu/location/c;->F:I

    const/4 v13, 0x1

    iput v13, v1, Lcom/baidu/location/c;->G:I

    iput-object v8, v1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    const-string v14, ""

    iput-object v14, v1, Lcom/baidu/location/c;->J:Ljava/lang/String;

    iput v12, v1, Lcom/baidu/location/c;->K:I

    iput v7, v1, Lcom/baidu/location/c;->L:I

    const/4 v15, 0x2

    iput v15, v1, Lcom/baidu/location/c;->M:I

    iput v7, v1, Lcom/baidu/location/c;->N:I

    iput-object v8, v1, Lcom/baidu/location/c;->O:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->P:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    iput v12, v1, Lcom/baidu/location/c;->R:I

    iput-object v8, v1, Lcom/baidu/location/c;->S:Ljava/util/List;

    iput-object v8, v1, Lcom/baidu/location/c;->T:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->U:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->V:Ljava/lang/String;

    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    iput-object v15, v1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    iput v7, v1, Lcom/baidu/location/c;->X:I

    iput v7, v1, Lcom/baidu/location/c;->Y:I

    move-object/from16 v16, v14

    const-wide/16 v13, 0x0

    iput-wide v13, v1, Lcom/baidu/location/c;->Z:J

    iput-object v8, v1, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    iput-object v8, v1, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    iput-wide v9, v1, Lcom/baidu/location/c;->c0:D

    iput-wide v9, v1, Lcom/baidu/location/c;->d0:D

    iput-boolean v7, v1, Lcom/baidu/location/c;->e0:Z

    iput-object v8, v1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    iput v11, v1, Lcom/baidu/location/c;->g0:F

    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    iput-wide v13, v1, Lcom/baidu/location/c;->h0:D

    iput v7, v1, Lcom/baidu/location/c;->i0:I

    iput v12, v1, Lcom/baidu/location/c;->j0:I

    iput-object v8, v1, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    iput-object v8, v1, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    const-wide/16 v13, -0x1

    iput-wide v13, v1, Lcom/baidu/location/c;->n0:J

    if-eqz v2, :cond_49

    move-object/from16 v11, v16

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto/16 :goto_36

    :cond_0
    :try_start_0
    new-instance v13, Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_13
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_12

    :try_start_1
    invoke-direct {v13, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "result"

    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v14, "error"

    invoke-virtual {v2, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v1, v14}, Lcom/baidu/location/c;->h(I)V

    const-string v15, "time"

    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->n(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_11
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_12

    const/16 v2, 0x3d

    const-string v15, "gcj02"

    const-string v9, "radius"

    const-string v10, "point"

    const-string v12, "content"

    const-string v8, "in_cn"

    const-string v7, "x"

    move-object/from16 v17, v11

    const-string v11, "y"

    if-ne v14, v2, :cond_5

    :try_start_2
    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/baidu/location/c;->d(D)V

    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(F)V

    const-string v3, "s"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->c(F)V

    const-string v3, "d"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->a(F)V

    const-string v3, "n"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->m(I)V

    const-string v3, "is_mock"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "is_mock"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->k(I)V

    :cond_1
    const-string v3, "h"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_12

    if-eqz v3, :cond_2

    :try_start_3
    const-string v3, "h"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/baidu/location/c;->a(D)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_12

    :catch_0
    :cond_2
    :try_start_4
    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->i(I)V

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->i(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_12

    :catch_1
    :goto_0
    :try_start_5
    iget v2, v1, Lcom/baidu/location/c;->G:I

    if-nez v2, :cond_4

    const-string v2, "wgs84"

    :goto_1
    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto/16 :goto_36

    :cond_4
    invoke-virtual {v1, v15}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    goto/16 :goto_36

    :catch_2
    move-exception v0

    move-object v3, v0

    const/4 v2, 0x0

    goto/16 :goto_34

    :cond_5
    move-object v2, v15

    const/16 v15, 0xa1

    if-ne v14, v15, :cond_46

    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    invoke-virtual {v12, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    invoke-virtual {v1, v13, v14}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v10, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    invoke-virtual {v1, v13, v14}, Lcom/baidu/location/c;->d(D)V

    invoke-virtual {v12, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9

    invoke-virtual {v1, v9}, Lcom/baidu/location/c;->b(F)V

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/baidu/location/c;->o(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v12, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    invoke-virtual {v1, v5}, Lcom/baidu/location/c;->d(F)V

    :cond_7
    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/baidu/location/c;->g(I)V

    :cond_8
    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->e(F)V

    :cond_9
    const-string v3, "sema"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_12

    const-string v4, "addr"

    if-eqz v3, :cond_15

    :try_start_6
    const-string v3, "sema"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v5, "aptag"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    const-string v5, "aptag"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    iput-object v5, v1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    goto :goto_2

    :cond_a
    move-object/from16 v5, v17

    iput-object v5, v1, Lcom/baidu/location/c;->v:Ljava/lang/String;

    goto :goto_3

    :cond_b
    :goto_2
    move-object/from16 v5, v17

    :goto_3
    const-string v6, "aptagd"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    const-string v6, "aptagd"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v9, "pois"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    :goto_4
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v13

    if-ge v10, v13, :cond_e

    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    const-string v14, "pname"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v14, "pid"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v14, "pr"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v20

    const-string v14, "tags"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_c

    const-string v14, "tags"

    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v22, v14

    goto :goto_5

    :cond_c
    move-object/from16 v22, v5

    :goto_5
    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v23, v13

    goto :goto_6

    :cond_d
    move-object/from16 v23, v5

    :goto_6
    new-instance v13, Lcom/baidu/location/j;

    move-object/from16 v17, v13

    invoke-direct/range {v17 .. v23}, Lcom/baidu/location/j;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_e
    iput-object v9, v1, Lcom/baidu/location/c;->S:Ljava/util/List;

    :cond_f
    const-string v6, "poiregion"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_10

    const-string v6, "poiregion"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_10

    iput-object v6, v1, Lcom/baidu/location/c;->w:Ljava/lang/String;

    :cond_10
    const-string v6, "poi_regions"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_14

    const-string v6, "poi_regions"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v9, "direction_desc"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_11

    const-string v9, "direction_desc"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    :cond_11
    move-object v9, v5

    :goto_7
    const-string v10, "name"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_12

    const-string v10, "name"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_8

    :cond_12
    move-object v10, v5

    :goto_8
    const-string v13, "tag"

    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_13

    const-string v13, "tag"

    invoke-virtual {v6, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_9

    :cond_13
    move-object v6, v5

    :goto_9
    new-instance v13, Lcom/baidu/location/k;

    invoke-direct {v13, v9, v10, v6}, Lcom/baidu/location/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v13, v1, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    :cond_14
    const-string v6, "regular"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    const-string v6, "regular"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_16

    iput-object v3, v1, Lcom/baidu/location/c;->x:Ljava/lang/String;

    goto :goto_a

    :cond_15
    move-object/from16 v5, v17

    :cond_16
    :goto_a
    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_12

    const-string v6, ","

    if-eqz v3, :cond_2c

    :try_start_7
    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_12

    const/4 v15, 0x1

    goto :goto_b

    :catch_3
    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_b
    if-eqz v3, :cond_21

    :try_start_8
    const-string v4, "city"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_17

    const-string v4, "city"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_c

    :cond_17
    move-object v4, v5

    :goto_c
    const-string v9, "city_code"

    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_18

    const-string v9, "city_code"

    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_d

    :cond_18
    move-object v9, v5

    :goto_d
    const-string v10, "country"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_19

    const-string v10, "country"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_e

    :cond_19
    move-object v10, v5

    :goto_e
    const-string v13, "country_code"

    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1a

    const-string v13, "country_code"

    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_f

    :cond_1a
    move-object v13, v5

    :goto_f
    const-string v14, "province"

    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_1b

    const-string v14, "province"

    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 p1, v4

    goto :goto_10

    :cond_1b
    move-object/from16 p1, v4

    move-object v14, v5

    :goto_10
    const-string v4, "district"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1c

    const-string v4, "district"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v17, v4

    goto :goto_11

    :cond_1c
    move-object/from16 v17, v5

    :goto_11
    const-string v4, "street"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1d

    const-string v4, "street"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v18, v4

    goto :goto_12

    :cond_1d
    move-object/from16 v18, v5

    :goto_12
    const-string v4, "street_number"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1e

    const-string v4, "street_number"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v19, v4

    goto :goto_13

    :cond_1e
    move-object/from16 v19, v5

    :goto_13
    const-string v4, "adcode"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1f

    const-string v4, "adcode"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_14

    :cond_1f
    move-object v4, v5

    :goto_14
    const-string v5, "town"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    const-string v5, "town"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_12

    move-object/from16 v5, v18

    move-object/from16 v18, v7

    move-object v7, v3

    move-object v3, v13

    move-object/from16 v13, v17

    move/from16 v17, v15

    goto :goto_15

    :cond_20
    move-object v3, v13

    move-object/from16 v13, v17

    move-object/from16 v5, v18

    move-object/from16 v18, v7

    move/from16 v17, v15

    const/4 v7, 0x0

    :goto_15
    move-object v15, v14

    move-object/from16 v14, v19

    move-object/from16 v24, v4

    move-object/from16 v4, p1

    move-object/from16 p1, v11

    move-object/from16 v11, v24

    goto/16 :goto_27

    :cond_21
    :try_start_9
    invoke-virtual {v12, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    if-lez v4, :cond_22

    const/4 v5, 0x0

    aget-object v9, v3, v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_c
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_12

    const/4 v5, 0x1

    goto :goto_16

    :cond_22
    const/4 v5, 0x1

    const/4 v9, 0x0

    :goto_16
    if-le v4, v5, :cond_23

    :try_start_a
    aget-object v10, v3, v5
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_12

    const/4 v5, 0x2

    goto :goto_17

    :catch_4
    move-exception v0

    move-object v3, v0

    const/4 v5, 0x0

    goto/16 :goto_1f

    :cond_23
    const/4 v5, 0x2

    const/4 v10, 0x0

    :goto_17
    if-le v4, v5, :cond_24

    :try_start_b
    aget-object v13, v3, v5
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/Error; {:try_start_b .. :try_end_b} :catch_12

    goto :goto_18

    :catch_5
    move-exception v0

    move-object v3, v0

    const/4 v5, 0x0

    goto/16 :goto_20

    :cond_24
    const/4 v13, 0x0

    :goto_18
    const/4 v5, 0x3

    if-le v4, v5, :cond_25

    const/4 v5, 0x3

    :try_start_c
    aget-object v5, v3, v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_12

    goto :goto_19

    :catch_6
    move-exception v0

    move-object v3, v0

    const/4 v5, 0x0

    goto/16 :goto_21

    :cond_25
    const/4 v5, 0x0

    :goto_19
    const/4 v14, 0x4

    if-le v4, v14, :cond_26

    const/4 v14, 0x4

    :try_start_d
    aget-object v14, v3, v14
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/lang/Error; {:try_start_d .. :try_end_d} :catch_12

    goto :goto_1a

    :catch_7
    move-exception v0

    move-object v3, v0

    goto/16 :goto_21

    :cond_26
    const/4 v14, 0x0

    :goto_1a
    const/4 v15, 0x5

    if-le v4, v15, :cond_27

    const/4 v15, 0x5

    :try_start_e
    aget-object v15, v3, v15
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8
    .catch Ljava/lang/Error; {:try_start_e .. :try_end_e} :catch_12

    move-object/from16 p1, v5

    goto :goto_1b

    :catch_8
    move-exception v0

    move-object v3, v0

    goto :goto_22

    :cond_27
    move-object/from16 p1, v5

    const/4 v15, 0x0

    :goto_1b
    const/4 v5, 0x6

    if-le v4, v5, :cond_28

    const/4 v5, 0x6

    :try_start_f
    aget-object v5, v3, v5
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/Error; {:try_start_f .. :try_end_f} :catch_12

    move-object/from16 v17, v5

    goto :goto_1c

    :catch_9
    move-exception v0

    move-object/from16 v5, p1

    move-object v3, v0

    goto :goto_23

    :cond_28
    const/16 v17, 0x0

    :goto_1c
    const/4 v5, 0x7

    if-le v4, v5, :cond_29

    const/4 v5, 0x7

    :try_start_10
    aget-object v5, v3, v5
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/lang/Error; {:try_start_10 .. :try_end_10} :catch_12

    move-object/from16 v18, v5

    goto :goto_1d

    :catch_a
    move-exception v0

    move-object/from16 v5, p1

    move-object v3, v0

    goto :goto_24

    :cond_29
    const/16 v18, 0x0

    :goto_1d
    const/16 v5, 0x8

    if-le v4, v5, :cond_2a

    const/16 v4, 0x8

    :try_start_11
    aget-object v3, v3, v4
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b
    .catch Ljava/lang/Error; {:try_start_11 .. :try_end_11} :catch_12

    goto :goto_1e

    :catch_b
    move-exception v0

    move-object/from16 v5, p1

    move-object v3, v0

    goto :goto_25

    :cond_2a
    const/4 v3, 0x0

    :goto_1e
    move-object/from16 v5, p1

    move-object v4, v10

    move-object/from16 p1, v11

    move-object/from16 v10, v17

    const/16 v17, 0x1

    move-object v11, v3

    move-object/from16 v3, v18

    goto :goto_26

    :catch_c
    move-exception v0

    move-object v3, v0

    const/4 v5, 0x0

    const/4 v9, 0x0

    :goto_1f
    const/4 v10, 0x0

    :goto_20
    const/4 v13, 0x0

    :goto_21
    const/4 v14, 0x0

    :goto_22
    const/4 v15, 0x0

    :goto_23
    const/16 v17, 0x0

    :goto_24
    const/16 v18, 0x0

    :goto_25
    :try_start_12
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    move-object v4, v10

    move-object/from16 p1, v11

    move-object/from16 v10, v17

    move-object/from16 v3, v18

    const/4 v11, 0x0

    const/16 v17, 0x0

    :goto_26
    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v24, v15

    move-object v15, v9

    move-object/from16 v9, v24

    :goto_27
    if-eqz v17, :cond_2b

    move-object/from16 v17, v6

    new-instance v6, Lcom/baidu/location/a$a;

    invoke-direct {v6}, Lcom/baidu/location/a$a;-><init>()V

    invoke-virtual {v6, v10}, Lcom/baidu/location/a$a;->d(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v3}, Lcom/baidu/location/a$a;->e(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v15}, Lcom/baidu/location/a$a;->g(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v4}, Lcom/baidu/location/a$a;->b(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v9}, Lcom/baidu/location/a$a;->c(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v13}, Lcom/baidu/location/a$a;->f(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v5}, Lcom/baidu/location/a$a;->h(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v14}, Lcom/baidu/location/a$a;->i(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v11}, Lcom/baidu/location/a$a;->a(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6, v7}, Lcom/baidu/location/a$a;->j(Ljava/lang/String;)Lcom/baidu/location/a$a;

    invoke-virtual {v6}, Lcom/baidu/location/a$a;->a()Lcom/baidu/location/a;

    move-result-object v3

    iput-object v3, v1, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/baidu/location/c;->t:Z
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/lang/Error; {:try_start_12 .. :try_end_12} :catch_12

    goto :goto_28

    :cond_2b
    move-object/from16 v17, v6

    goto :goto_28

    :cond_2c
    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 p1, v11

    const/4 v3, 0x0

    :try_start_13
    iput-boolean v3, v1, Lcom/baidu/location/c;->t:Z
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_10
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_12

    const/4 v3, 0x0

    :try_start_14
    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(Ljava/lang/String;)V

    :goto_28
    const-string v3, "floor"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    const-string v3, "floor"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2d

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/baidu/location/c;->A:Ljava/lang/String;

    :cond_2d
    const-string v3, "indoor"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2e

    const-string v3, "indoor"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->n(I)V

    :cond_2e
    const-string v3, "loctp"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2f

    const-string v3, "loctp"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2f

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/baidu/location/c;->H:Ljava/lang/String;

    :cond_2f
    const-string v3, "bldgid"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_30

    const-string v3, "bldgid"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_30

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/baidu/location/c;->B:Ljava/lang/String;

    :cond_30
    const-string v3, "bldg"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_31

    const-string v3, "bldg"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_31

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/baidu/location/c;->C:Ljava/lang/String;

    :cond_31
    const-string v3, "acc"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_32

    const-string v3, "acc"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    iput-wide v3, v1, Lcom/baidu/location/c;->D:D

    :cond_32
    const-string v3, "ibav"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_35

    const-string v3, "ibav"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_33

    :goto_29
    const/4 v3, 0x0

    goto :goto_2a

    :cond_33
    const-string v4, "0"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2
    .catch Ljava/lang/Error; {:try_start_14 .. :try_end_14} :catch_12

    if-eqz v4, :cond_34

    goto :goto_29

    :goto_2a
    :try_start_15
    iput v3, v1, Lcom/baidu/location/c;->F:I
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_10
    .catch Ljava/lang/Error; {:try_start_15 .. :try_end_15} :catch_12

    goto :goto_2b

    :cond_34
    :try_start_16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Lcom/baidu/location/c;->F:I

    :cond_35
    :goto_2b
    const-string v3, "indoorflags"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_2
    .catch Ljava/lang/Error; {:try_start_16 .. :try_end_16} :catch_12

    if-eqz v3, :cond_40

    :try_start_17
    const-string v3, "indoorflags"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "area"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_37

    const-string v4, "area"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v4, :cond_36

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, Lcom/baidu/location/c;->e(I)V

    goto :goto_2c

    :cond_36
    const/4 v5, 0x1

    if-ne v4, v5, :cond_37

    invoke-virtual {v1, v5}, Lcom/baidu/location/c;->e(I)V

    :cond_37
    :goto_2c
    const-string v4, "support"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_38

    const-string v4, "support"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/baidu/location/c;->d(I)V

    :cond_38
    const-string v4, "inbldg"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_39

    const-string v4, "inbldg"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/baidu/location/c;->O:Ljava/lang/String;

    :cond_39
    const-string v4, "inbldgid"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3a

    const-string v4, "inbldgid"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/baidu/location/c;->P:Ljava/lang/String;

    :cond_3a
    const-string v4, "polygon"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3b

    const-string v4, "polygon"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/baidu/location/c;->h(Ljava/lang/String;)V

    :cond_3b
    const-string v4, "ret_fields"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_e
    .catch Ljava/lang/Error; {:try_start_17 .. :try_end_17} :catch_12

    if-eqz v4, :cond_3d

    :try_start_18
    const-string v4, "ret_fields"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\\|"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_2d
    if-ge v6, v5, :cond_3d

    aget-object v7, v4, v6

    const-string v9, "="

    invoke-virtual {v7, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3c

    array-length v9, v7

    const/4 v10, 0x2

    if-lt v9, v10, :cond_3c

    const/4 v9, 0x0

    aget-object v10, v7, v9

    const/4 v9, 0x1

    aget-object v7, v7, v9

    iget-object v9, v1, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    invoke-virtual {v9, v10, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_d
    .catch Ljava/lang/Error; {:try_start_18 .. :try_end_18} :catch_12

    :cond_3c
    add-int/lit8 v6, v6, 0x1

    goto :goto_2d

    :catch_d
    :cond_3d
    :try_start_19
    const-string v4, "inout_ble"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3f

    const-string v4, "inout_ble"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->c(I)V

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3e

    invoke-virtual {v1, v4}, Lcom/baidu/location/c;->b(Z)V

    goto :goto_2e

    :cond_3e
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(Z)V

    goto :goto_2e

    :cond_3f
    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->c(I)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_e
    .catch Ljava/lang/Error; {:try_start_19 .. :try_end_19} :catch_12

    goto :goto_2e

    :catch_e
    move-exception v0

    move-object v3, v0

    :try_start_1a
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :cond_40
    :goto_2e
    const-string v3, "gpscs"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_41

    const-string v3, "gpscs"

    invoke-virtual {v12, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(I)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_2
    .catch Ljava/lang/Error; {:try_start_1a .. :try_end_1a} :catch_12

    goto :goto_2f

    :cond_41
    const/4 v3, 0x0

    :try_start_1b
    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(I)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_10
    .catch Ljava/lang/Error; {:try_start_1b .. :try_end_1b} :catch_12

    :goto_2f
    :try_start_1c
    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_42

    invoke-virtual {v12, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->i(I)V

    goto :goto_30

    :cond_42
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->i(I)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_f
    .catch Ljava/lang/Error; {:try_start_1c .. :try_end_1c} :catch_12

    :catch_f
    :goto_30
    :try_start_1d
    iget v3, v1, Lcom/baidu/location/c;->G:I

    if-nez v3, :cond_43

    const-string v2, "wgs84"

    :cond_43
    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->e(Ljava/lang/String;)V

    const-string v2, "navi"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_44

    const-string v2, "navi"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    :cond_44
    const-string v2, "navi_client"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_45

    const-string v2, "navi_client"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_2
    .catch Ljava/lang/Error; {:try_start_1d .. :try_end_1d} :catch_12

    if-eqz v2, :cond_45

    move-object/from16 v3, v17

    :try_start_1e
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_45

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_45

    array-length v3, v2

    const/4 v4, 0x2

    if-lt v3, v4, :cond_45

    const/4 v3, 0x0

    aget-object v4, v2, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    if-lez v3, :cond_45

    iput-boolean v4, v1, Lcom/baidu/location/c;->e0:Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    goto :goto_31

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1f
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_45
    :goto_31
    const-string v2, "nrl_point"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_2
    .catch Ljava/lang/Error; {:try_start_1f .. :try_end_1f} :catch_12

    if-eqz v2, :cond_49

    :try_start_20
    const-string v2, "nrl_point"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_49

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_49

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    iput-wide v4, v1, Lcom/baidu/location/c;->c0:D

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, v1, Lcom/baidu/location/c;->d0:D
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1

    goto/16 :goto_36

    :catchall_1
    const-wide/16 v2, 0x1

    :try_start_21
    iput-wide v2, v1, Lcom/baidu/location/c;->c0:D

    iput-wide v2, v1, Lcom/baidu/location/c;->d0:D

    goto/16 :goto_36

    :catch_10
    move-exception v0

    move v2, v3

    goto :goto_33

    :cond_46
    move-object v3, v7

    move-object v4, v11

    const/16 v5, 0x42

    if-eq v14, v5, :cond_48

    const/16 v5, 0x44

    if-ne v14, v5, :cond_47

    goto :goto_32

    :cond_47
    const/16 v2, 0xa7

    if-ne v14, v2, :cond_49

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/baidu/location/c;->i(I)V

    goto :goto_36

    :cond_48
    :goto_32
    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/baidu/location/c;->c(D)V

    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/baidu/location/c;->d(D)V

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->b(F)V

    const-string v3, "isCellChanged"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/baidu/location/c;->a(Ljava/lang/Boolean;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_2
    .catch Ljava/lang/Error; {:try_start_21 .. :try_end_21} :catch_12

    goto/16 :goto_1

    :catch_11
    move-exception v0

    move-object v3, v0

    move v2, v7

    goto :goto_34

    :catch_12
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Error;->printStackTrace()V

    const/4 v2, 0x0

    goto :goto_35

    :catch_13
    move-exception v0

    move v2, v7

    :goto_33
    move-object v3, v0

    :goto_34
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :goto_35
    iput v2, v1, Lcom/baidu/location/c;->b:I

    iput-boolean v2, v1, Lcom/baidu/location/c;->t:Z

    :cond_49
    :goto_36
    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/location/c;->p:Z

    iget p0, p0, Lcom/baidu/location/c;->q:I

    return p0
.end method

.method public B()F
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->i:F

    return p0
.end method

.method public C()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    return-object p0
.end method

.method public D()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/c;->n0:J

    return-wide v0
.end method

.method public E()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->l:Ljava/lang/String;

    return-object p0
.end method

.method public F()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->K:I

    return p0
.end method

.method public G()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/c;->t:Z

    return p0
.end method

.method public H()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/c;->f:Z

    return p0
.end method

.method public I()Z
    .locals 0

    iget-boolean p0, p0, Lcom/baidu/location/c;->e0:Z

    return p0
.end method

.method public J()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->F:I

    return p0
.end method

.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/c;->D:D

    return-wide v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(D)V
    .locals 2

    const-wide v0, 0x40c3878000000000L    # 9999.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    iput-wide p1, p0, Lcom/baidu/location/c;->g:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/location/c;->f:Z

    :cond_0
    return-void
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->r:F

    return-void
.end method

.method public a(FFLjava/lang/String;Ljava/lang/String;)V
    .locals 9

    float-to-double v0, p1

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v0, v0, v2

    const-string v1, "%.2f"

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v0, :cond_0

    new-array v0, v6, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, v0, v5

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    float-to-double v7, p2

    cmpl-double v0, v7, v2

    if-lez v0, :cond_1

    new-array v0, v6, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v0, v5

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :cond_1
    const/4 p2, 0x0

    iget-object v0, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    const-string v1, "%s|%s"

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v5

    aput-object p1, v3, v6

    aput-object v4, v3, v2

    const-string p1, "%s|%s,%s"

    invoke-static {p2, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    if-eqz v0, :cond_2

    new-array v3, v2, [Ljava/lang/Object;

    aput-object p1, v3, v5

    aput-object v0, v3, v6

    invoke-static {p2, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, p1

    :cond_3
    :goto_1
    if-eqz p3, :cond_5

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v5

    aput-object p3, v0, v6

    invoke-static {p1, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    :cond_5
    move-object p3, p2

    :goto_2
    if-eqz p4, :cond_7

    if-nez p3, :cond_6

    goto :goto_3

    :cond_6
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p3, p2, v5

    aput-object p4, p2, v6

    invoke-static {p1, v1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    goto :goto_3

    :cond_7
    move-object p4, p3

    :goto_3
    iput-object p4, p0, Lcom/baidu/location/c;->V:Ljava/lang/String;

    return-void
.end method

.method public a(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/baidu/location/c;->X:I

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/c;->Z:J

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    return-void
.end method

.method public a(Lcom/baidu/location/a;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/location/c;->t:Z

    :cond_0
    return-void
.end method

.method public a(Lcom/baidu/location/c;)V
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/location/c;->u()I

    move-result v0

    if-lez v0, :cond_0

    iput-object p1, p0, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;

    :cond_0
    return-void
.end method

.method public a(Lcom/baidu/location/k;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    return-void
.end method

.method public final a(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/baidu/location/c;->y:Z

    return-void
.end method

.method public a(Ljava/lang/String;[D)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    :cond_0
    iget-object p0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putDoubleArray(Ljava/lang/String;[D)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/location/j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/c;->E:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object p0, p0, Lcom/baidu/location/a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public b(D)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/c;->h0:D

    return-void
.end method

.method public b(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->k:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/location/c;->j:Z

    return-void
.end method

.method public b(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/baidu/location/c;->Y:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->u:Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput-boolean p1, p0, Lcom/baidu/location/c;->t:Z

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/c;->e0:Z

    return-void
.end method

.method public c()Lcom/baidu/location/a;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    return-object p0
.end method

.method public c(D)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/c;->d:D

    return-void
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->i:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/location/c;->h:Z

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->R:I

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    return-void
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/c;->g:D

    return-wide v0
.end method

.method public d(D)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/c;->e:D

    return-void
.end method

.method public d(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->m:F

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->N:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    return-void
.end method

.method public describeContents()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public e()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    return-object p0
.end method

.method public e(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->o:F

    return-void
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->L:I

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    return-object p0
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->M:I

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object p0, p0, Lcom/baidu/location/a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->n:I

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)V
    .locals 1

    iput p1, p0, Lcom/baidu/location/c;->b:I

    const/16 v0, 0x42

    if-eq p1, v0, :cond_3

    const/16 v0, 0x43

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f9

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    const-string p1, "UnKnown!"

    goto :goto_0

    :pswitch_0
    const-string p1, "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !"

    goto :goto_0

    :pswitch_1
    const-string p1, "NetWork location successful!"

    goto :goto_0

    :pswitch_2
    const-string p1, "Coarse location successful"

    goto :goto_0

    :pswitch_3
    const-string p1, "Location failed because the location service switch is not on and the location permission is not enabled"

    goto :goto_0

    :pswitch_4
    const-string p1, "Location failed because the location permission is not enabled"

    goto :goto_0

    :pswitch_5
    const-string p1, "Location failed because the location service switch is not on"

    goto :goto_0

    :pswitch_6
    const-string p1, "Location failed beacuse we can not get any loc information!"

    :goto_0
    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->i(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_7
    const-string p1, "GPS location successful!"

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->i(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->n(I)V

    const-string p1, "system"

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->g(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string p1, "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !"

    goto :goto_0

    :cond_1
    const-string p1, "NetWork location failed because baidu location service can not caculate the location!"

    goto :goto_0

    :cond_2
    :pswitch_8
    const-string p1, "Offline location failed, please check the net (wifi/cell)!"

    goto :goto_0

    :cond_3
    const-string p1, "Offline location successful!"

    goto :goto_0

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x3d
        :pswitch_7
        :pswitch_6
        :pswitch_8
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x45
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xa0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    return-void
.end method

.method public i()F
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->r:F

    return p0
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->G:I

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->T:Ljava/lang/String;

    return-void
.end method

.method public j()Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    return-object p0
.end method

.method public j(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/baidu/location/c;->j0:I

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    return-object p0
.end method

.method public k(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/baidu/location/c;->i0:I

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->U:Ljava/lang/String;

    return-void
.end method

.method public l()F
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget p0, p0, Lcom/baidu/location/c;->g0:F

    return p0
.end method

.method public l(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->F:I

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    return-void
.end method

.method public m()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->R:I

    return p0
.end method

.method public m(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->q:I

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->P:Ljava/lang/String;

    return-object p0
.end method

.method public n(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/c;->K:I

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    invoke-static {p1}, La/a/a/i/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/baidu/location/c;->k(Ljava/lang/String;)V

    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->O:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/c;->l:Ljava/lang/String;

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    return-object p0
.end method

.method public q()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/c;->d:D

    return-wide v0
.end method

.method public r()I
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->b:I

    return p0
.end method

.method public s()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    return-object p0
.end method

.method public t()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/c;->e:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&loctype="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&lat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->q()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "&lon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->t()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "&radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "&biasprob="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->l()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "&altitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->d()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "&speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->B()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "&time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->D()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "&extrainfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/baidu/location/c;->j()Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public u()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget p0, p0, Lcom/baidu/location/c;->i0:I

    return p0
.end method

.method public v()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    return-object p0
.end method

.method public w()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget v0, p0, Lcom/baidu/location/c;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/baidu/location/c;->n0:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/baidu/location/c;->d:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/baidu/location/c;->e:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/baidu/location/c;->g:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget v0, p0, Lcom/baidu/location/c;->i:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lcom/baidu/location/c;->k:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lcom/baidu/location/c;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->m:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lcom/baidu/location/c;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->o:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lcom/baidu/location/c;->q:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->r:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lcom/baidu/location/c;->A:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->F:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->B:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->C:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/baidu/location/c;->D:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-object v0, p0, Lcom/baidu/location/c;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->z:Lcom/baidu/location/a;

    iget-object v0, v0, Lcom/baidu/location/a;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->I:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->J:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->G:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->T:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->K:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->L:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->M:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->N:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->O:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->P:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->Q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->R:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->X:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->U:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/baidu/location/c;->Y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->V:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->a0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->b0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/baidu/location/c;->Z:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/baidu/location/c;->c0:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/baidu/location/c;->d0:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget v0, p0, Lcom/baidu/location/c;->g0:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-wide v0, p0, Lcom/baidu/location/c;->h0:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget v0, p0, Lcom/baidu/location/c;->i0:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/baidu/location/c;->j0:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/baidu/location/c;->s:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->m0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/location/c;->k0:Lcom/baidu/location/c;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    const/16 v0, 0x8

    new-array v0, v0, [Z

    iget-boolean v1, p0, Lcom/baidu/location/c;->f:Z

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->h:Z

    const/4 v2, 0x1

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->j:Z

    const/4 v2, 0x2

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->p:Z

    const/4 v2, 0x3

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->t:Z

    const/4 v2, 0x4

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->y:Z

    const/4 v2, 0x5

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->E:Z

    const/4 v2, 0x6

    aput-boolean v1, v0, v2

    iget-boolean v1, p0, Lcom/baidu/location/c;->e0:Z

    const/4 v2, 0x7

    aput-boolean v1, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    iget-object v0, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/baidu/location/c;->W:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/location/c;->l0:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    iget-object p0, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public x()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/location/j;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/baidu/location/c;->S:Ljava/util/List;

    return-object p0
.end method

.method public y()Lcom/baidu/location/k;
    .locals 0

    iget-object p0, p0, Lcom/baidu/location/c;->f0:Lcom/baidu/location/k;

    return-object p0
.end method

.method public z()F
    .locals 0

    iget p0, p0, Lcom/baidu/location/c;->k:F

    return p0
.end method
