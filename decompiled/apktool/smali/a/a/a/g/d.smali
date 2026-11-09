.class public La/a/a/g/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/g/d$h;,
        La/a/a/g/d$e;,
        La/a/a/g/d$d;,
        La/a/a/g/d$b;,
        La/a/a/g/d$c;,
        La/a/a/g/d$g;,
        La/a/a/g/d$i;,
        La/a/a/g/d$f;
    }
.end annotation


# static fields
.field public static U:La/a/a/g/d; = null

.field public static V:Landroid/location/Location; = null

.field public static W:I = -0x1

.field public static X:I = 0x0

.field public static Y:I = 0x0

.field public static Z:I = 0x0

.field public static a0:I = 0x0

.field public static b0:I = 0x0

.field public static c0:I = 0x0

.field public static d0:I = 0x0

.field public static e0:I = 0x0

.field public static f0:I = 0x0

.field public static g0:I = 0x0

.field public static h0:J = 0x0L

.field public static i0:Ljava/lang/String; = null

.field public static j0:D = 100.0

.field public static k0:Ljava/lang/String; = ""

.field public static l0:Ljava/lang/String; = ""

.field public static m0:F = -1.0f


# instance fields
.field public A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public H:Ljava/lang/String;

.field public I:J

.field public J:J

.field public K:J

.field public L:Lcom/baidu/location/c;

.field public M:Z

.field public N:Z

.field public O:J

.field public P:Z

.field public Q:Z

.field public R:J

.field public S:Z

.field public T:J

.field public a:Landroid/content/Context;

.field public b:Landroid/location/LocationManager;

.field public c:Landroid/location/Location;

.field public d:La/a/a/g/d$g;

.field public e:La/a/a/g/d$i;

.field public f:Landroid/location/GpsStatus;

.field public g:La/a/a/g/d$d;

.field public h:Z

.field public i:La/a/a/g/d$e;

.field public j:Z

.field public k:Landroid/location/GpsStatus$NmeaListener;

.field public l:Landroid/location/OnNmeaMessageListener;

.field public m:J

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:J

.field public r:D

.field public s:D

.field public t:J

.field public u:J

.field public v:J

.field public w:La/a/a/g/d$f;

.field public x:J

.field public y:La/a/a/g/d$b;

.field public z:La/a/a/g/d$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    iput-object v0, p0, La/a/a/g/d;->d:La/a/a/g/d$g;

    iput-object v0, p0, La/a/a/g/d;->e:La/a/a/g/d$i;

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/g/d;->h:Z

    iput-object v0, p0, La/a/a/g/d;->i:La/a/a/g/d$e;

    iput-boolean v1, p0, La/a/a/g/d;->j:Z

    iput-object v0, p0, La/a/a/g/d;->k:Landroid/location/GpsStatus$NmeaListener;

    iput-object v0, p0, La/a/a/g/d;->l:Landroid/location/OnNmeaMessageListener;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, La/a/a/g/d;->m:J

    iput-boolean v1, p0, La/a/a/g/d;->n:Z

    iput-boolean v1, p0, La/a/a/g/d;->o:Z

    iput-boolean v1, p0, La/a/a/g/d;->p:Z

    iput-wide v2, p0, La/a/a/g/d;->q:J

    const-wide/16 v4, 0x0

    iput-wide v4, p0, La/a/a/g/d;->r:D

    iput-wide v4, p0, La/a/a/g/d;->s:D

    iput-wide v2, p0, La/a/a/g/d;->u:J

    iput-wide v2, p0, La/a/a/g/d;->v:J

    iput-object v0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    iput-wide v2, p0, La/a/a/g/d;->x:J

    iput-object v0, p0, La/a/a/g/d;->z:La/a/a/g/d$c;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->A:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->C:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->D:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->E:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->F:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, La/a/a/g/d;->G:Ljava/util/ArrayList;

    iput-object v0, p0, La/a/a/g/d;->H:Ljava/lang/String;

    iput-wide v2, p0, La/a/a/g/d;->I:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide/16 v4, -0x1

    iput-wide v4, p0, La/a/a/g/d;->J:J

    iput-wide v4, p0, La/a/a/g/d;->K:J

    iput-boolean v1, p0, La/a/a/g/d;->M:Z

    iput-boolean v1, p0, La/a/a/g/d;->N:Z

    iput-wide v2, p0, La/a/a/g/d;->O:J

    iput-boolean v1, p0, La/a/a/g/d;->P:Z

    iput-boolean v1, p0, La/a/a/g/d;->Q:Z

    iput-wide v2, p0, La/a/a/g/d;->R:J

    iput-boolean v1, p0, La/a/a/g/d;->S:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    :try_start_0
    const-string v0, "android.location.GnssStatus"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/g/d;->h:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iput-boolean v1, p0, La/a/a/g/d;->h:Z

    :cond_0
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    :try_start_1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    iput-boolean v1, p0, La/a/a/g/d;->j:Z

    return-void
.end method

.method public static synthetic a(J)J
    .locals 0

    sput-wide p0, La/a/a/g/d;->h0:J

    return-wide p0
.end method

.method public static synthetic a(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->v:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/g/d;Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    .locals 0

    iput-object p1, p0, La/a/a/g/d;->f:Landroid/location/GpsStatus;

    return-object p1
.end method

.method public static synthetic a(La/a/a/g/d;Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La/a/a/g/d;->a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/g/d;ZZZZZF)Ljava/util/ArrayList;
    .locals 0

    invoke-virtual/range {p0 .. p6}, La/a/a/g/d;->a(ZZZZZF)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/g/d;Landroid/location/Location;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/g/d;->b(Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;Landroid/location/Location;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/g/d;->a(Landroid/location/Location;I)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/g/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;Ljava/lang/String;Landroid/location/Location;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/g/d;->a(Ljava/lang/String;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;Ljava/util/ArrayList;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/g/d;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;Z)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/g/d;->b(Z)V

    return-void
.end method

.method public static synthetic a(La/a/a/g/d;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/d;->o:Z

    return p0
.end method

.method public static a(Landroid/location/Location;Landroid/location/Location;Z)Z
    .locals 8

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p0, :cond_9

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    if-eqz p2, :cond_3

    sget p2, La/a/a/i/i;->s:I

    const/4 v4, 0x3

    if-eq p2, v4, :cond_2

    invoke-static {}, La/a/a/i/f;->a()La/a/a/i/f;

    move-result-object p2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p2, v4, v5, v6, v7}, La/a/a/i/f;->a(DD)Z

    move-result p2

    if-nez p2, :cond_3

    :cond_2
    cmpg-float p2, v2, v3

    if-gez p2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p1, p0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p0

    sget p1, La/a/a/i/i;->I:F

    cmpl-float p1, v2, p1

    if-lez p1, :cond_5

    sget p1, La/a/a/i/i;->K:F

    cmpl-float p0, p0, p1

    if-lez p0, :cond_4

    move v0, v1

    :cond_4
    return v0

    :cond_5
    sget p1, La/a/a/i/i;->H:F

    cmpl-float p1, v2, p1

    if-lez p1, :cond_7

    sget p1, La/a/a/i/i;->J:F

    cmpl-float p0, p0, p1

    if-lez p0, :cond_6

    move v0, v1

    :cond_6
    return v0

    :cond_7
    cmpl-float p0, p0, v3

    if-lez p0, :cond_8

    move v0, v1

    :cond_8
    return v0

    :cond_9
    :goto_0
    return v1
.end method

.method public static synthetic b(I)I
    .locals 0

    sput p0, La/a/a/g/d;->Y:I

    return p0
.end method

.method public static synthetic b(La/a/a/g/d;)J
    .locals 2

    iget-wide v0, p0, La/a/a/g/d;->v:J

    return-wide v0
.end method

.method public static synthetic b(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->J:J

    return-wide p1
.end method

.method public static synthetic b(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, La/a/a/g/d;->A:Ljava/util/ArrayList;

    return-object p1
.end method

.method public static synthetic b(La/a/a/g/d;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/g/d;->n:Z

    return p1
.end method

.method public static synthetic c(I)I
    .locals 0

    sput p0, La/a/a/g/d;->Z:I

    return p0
.end method

.method public static synthetic c(La/a/a/g/d;)J
    .locals 2

    iget-wide v0, p0, La/a/a/g/d;->u:J

    return-wide v0
.end method

.method public static synthetic c(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->u:J

    return-wide p1
.end method

.method public static synthetic c(Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    sput-object p0, La/a/a/g/d;->V:Landroid/location/Location;

    return-object p0
.end method

.method public static synthetic c(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/g/d;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(I)I
    .locals 0

    sput p0, La/a/a/g/d;->a0:I

    return p0
.end method

.method public static synthetic d(La/a/a/g/d;)J
    .locals 2

    iget-wide v0, p0, La/a/a/g/d;->x:J

    return-wide v0
.end method

.method public static synthetic d(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->t:J

    return-wide p1
.end method

.method public static d(Landroid/location/Location;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, La/a/a/g/d;->f(Landroid/location/Location;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "&g_tp=0"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic d(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, La/a/a/g/d;->B:Ljava/util/ArrayList;

    return-object p1
.end method

.method public static synthetic e(I)I
    .locals 0

    sput p0, La/a/a/g/d;->b0:I

    return p0
.end method

.method public static synthetic e(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->x:J

    return-wide p1
.end method

.method public static synthetic e(La/a/a/g/d;)Landroid/location/LocationManager;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    return-object p0
.end method

.method public static e(Landroid/location/Location;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, La/a/a/g/d;->f(Landroid/location/Location;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, La/a/a/g/d;->i0:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic e(La/a/a/g/d;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, La/a/a/g/d;->C:Ljava/util/ArrayList;

    return-object p1
.end method

.method public static synthetic f(I)I
    .locals 0

    sput p0, La/a/a/g/d;->c0:I

    return p0
.end method

.method public static synthetic f(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->m:J

    return-wide p1
.end method

.method public static f(Landroid/location/Location;)Ljava/lang/String;
    .locals 29

    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getSpeed()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->hasSpeed()Z

    move-result v1

    const/high16 v2, -0x40800000    # -1.0f

    if-nez v1, :cond_1

    move v0, v2

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    float-to-int v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->hasAltitude()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    goto :goto_1

    :cond_3
    const-wide v3, 0x4081580000000000L    # 555.0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->hasBearing()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getBearing()F

    move-result v2

    :cond_4
    sget v5, La/a/a/g/d;->m0:F

    const v6, -0x43dc28f6    # -0.01f

    cmpg-float v5, v5, v6

    const/16 v6, 0x13

    const/16 v9, 0x10

    const/16 v10, 0xf

    const/16 v11, 0xe

    const/16 v12, 0xd

    const/16 v13, 0xc

    const/16 v14, 0xb

    const/16 v15, 0xa

    const/16 v16, 0x9

    const/16 v17, 0x8

    const/16 v18, 0x7

    const/16 v19, 0x6

    const/16 v20, 0x5

    const-wide/16 v21, 0x3e8

    const/4 v7, 0x4

    const/16 v23, 0x3

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/4 v8, 0x2

    if-gez v5, :cond_5

    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v26

    aput-object v26, v6, v25

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v26

    aput-object v26, v6, v24

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v6, v8

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v6, v23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v7

    sget v0, La/a/a/g/d;->X:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v20

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v6, v19

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    div-long v0, v0, v21

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v18

    sget v0, La/a/a/g/d;->X:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v17

    sget v0, La/a/a/g/d;->Y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v16

    sget v0, La/a/a/g/d;->Z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v15

    sget v0, La/a/a/g/d;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v14

    sget v0, La/a/a/g/d;->b0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v13

    sget v0, La/a/a/g/d;->g0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v12

    sget v0, La/a/a/g/d;->c0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v11

    sget v0, La/a/a/g/d;->d0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v10

    sget v0, La/a/a/g/d;->e0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v9

    sget v0, La/a/a/g/d;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x11

    aput-object v0, v6, v1

    sget-wide v0, La/a/a/g/d;->j0:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0x12

    aput-object v0, v6, v1

    const-string v0, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f"

    invoke-static {v5, v0, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :cond_5
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/16 v6, 0x14

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v27

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v27

    aput-object v27, v6, v25

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v27

    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v27

    aput-object v27, v6, v24

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v6, v8

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v6, v23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v7

    sget v0, La/a/a/g/d;->X:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v20

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v6, v19

    invoke-virtual/range {p0 .. p0}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    div-long v0, v0, v21

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v18

    sget v0, La/a/a/g/d;->X:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v17

    sget v0, La/a/a/g/d;->Y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v16

    sget v0, La/a/a/g/d;->Z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v15

    sget v0, La/a/a/g/d;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v14

    sget v0, La/a/a/g/d;->b0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v13

    sget v0, La/a/a/g/d;->g0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v12

    sget v0, La/a/a/g/d;->c0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v11

    sget v0, La/a/a/g/d;->d0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v10

    sget v0, La/a/a/g/d;->e0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v9

    sget v0, La/a/a/g/d;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x11

    aput-object v0, v6, v1

    sget-wide v0, La/a/a/g/d;->j0:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0x12

    aput-object v0, v6, v1

    sget v0, La/a/a/g/d;->m0:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x13

    aput-object v0, v6, v1

    const-string v0, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f"

    invoke-static {v5, v0, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :try_start_0
    sget v0, La/a/a/g/d;->W:I

    if-ne v0, v8, :cond_6

    sget-object v0, La/a/a/g/d;->V:Landroid/location/Location;

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "&ll_fake=%d|%.5f|%.5f|%d"

    :try_start_1
    new-array v4, v7, [Ljava/lang/Object;

    sget v5, La/a/a/g/d;->W:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v25

    sget-object v5, La/a/a/g/d;->V:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v4, v24

    sget-object v5, La/a/a/g/d;->V:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v4, v8

    sget-object v5, La/a/a/g/d;->V:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    div-long v5, v5, v21

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v23

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&ll_fake="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, La/a/a/g/d;->W:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    :goto_4
    return-object v0
.end method

.method public static synthetic f(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->D:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic g(I)I
    .locals 0

    sput p0, La/a/a/g/d;->d0:I

    return p0
.end method

.method public static synthetic g(La/a/a/g/d;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/g/d;->R:J

    return-wide p1
.end method

.method public static synthetic g(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->E:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic h(I)I
    .locals 0

    sput p0, La/a/a/g/d;->e0:I

    return p0
.end method

.method public static synthetic h(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->F:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic i(I)I
    .locals 0

    sput p0, La/a/a/g/d;->f0:I

    return p0
.end method

.method public static synthetic i(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->G:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic j(I)I
    .locals 0

    sput p0, La/a/a/g/d;->g0:I

    return p0
.end method

.method public static synthetic j(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->A:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic k(I)I
    .locals 0

    sput p0, La/a/a/g/d;->W:I

    return p0
.end method

.method public static synthetic k(La/a/a/g/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->C:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic l(La/a/a/g/d;)Landroid/location/GpsStatus;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->f:Landroid/location/GpsStatus;

    return-object p0
.end method

.method public static synthetic m(La/a/a/g/d;)La/a/a/g/d$f;
    .locals 0

    iget-object p0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    return-object p0
.end method

.method public static m()Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, La/a/a/g/d;->h0:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, La/a/a/g/d;->g0:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, La/a/a/g/d;->X:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "&gsvn=%d&gsfn=%d"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static declared-synchronized n()La/a/a/g/d;
    .locals 2

    const-class v0, La/a/a/g/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, La/a/a/g/d;->U:La/a/a/g/d;

    if-nez v1, :cond_0

    new-instance v1, La/a/a/g/d;

    invoke-direct {v1}, La/a/a/g/d;-><init>()V

    sput-object v1, La/a/a/g/d;->U:La/a/a/g/d;

    :cond_0
    sget-object v1, La/a/a/g/d;->U:La/a/a/g/d;
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
.method public final a(Landroid/location/Location;)I
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-le v1, v2, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->isFromMockProvider()Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p0, 0x64

    return p0

    :cond_1
    iget-wide v1, p0, La/a/a/g/d;->J:J

    iget-wide v3, p0, La/a/a/g/d;->K:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0xbb8

    cmp-long p1, v1, v3

    const-wide/16 v1, -0x1

    if-gez p1, :cond_4

    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    if-nez p1, :cond_3

    iget-boolean p1, p0, La/a/a/g/d;->M:Z

    if-nez p1, :cond_2

    const/16 p0, 0xc8

    return p0

    :cond_2
    iget-boolean p1, p0, La/a/a/g/d;->N:Z

    if-eqz p1, :cond_5

    const/16 p0, 0x12c

    return p0

    :cond_3
    iget-boolean p1, p0, La/a/a/g/d;->N:Z

    if-nez p1, :cond_5

    iget-boolean p1, p0, La/a/a/g/d;->M:Z

    if-eqz p1, :cond_5

    const/16 p0, 0x190

    return p0

    :cond_4
    iput-wide v1, p0, La/a/a/g/d;->K:J

    iput-boolean v0, p0, La/a/a/g/d;->N:Z

    iput-boolean v0, p0, La/a/a/g/d;->M:Z

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    :cond_5
    iget-wide v3, p0, La/a/a/g/d;->J:J

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-lez p1, :cond_6

    iget-wide p0, p0, La/a/a/g/d;->K:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p0, p0, v1

    if-nez p0, :cond_6

    const/16 p0, 0x1f4

    return p0

    :catch_0
    :cond_6
    return v0
.end method

.method public final a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;ZF)",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x28

    if-gt v0, v1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    if-eqz p2, :cond_2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    cmpl-float v1, p3, v1

    if-lez v1, :cond_3

    cmpg-float v1, v2, p3

    if-gez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    return-object p0
.end method

.method public final a(ZZZZZF)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZZF)",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/g/d;->D:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p5, p6}, La/a/a/g/d;->a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, La/a/a/g/d;->E:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p5, p6}, La/a/a/g/d;->a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-eqz p3, :cond_2

    iget-object p1, p0, La/a/a/g/d;->F:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p5, p6}, La/a/a/g/d;->a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-eqz p4, :cond_3

    iget-object p1, p0, La/a/a/g/d;->G:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p5, p6}, La/a/a/g/d;->a(Ljava/util/ArrayList;ZF)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v0
.end method

.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/baidu/location/f;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, La/a/a/g/d;->a:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :try_start_3
    new-instance v0, La/a/a/g/d$f;

    invoke-direct {v0, p0}, La/a/a/g/d$f;-><init>(La/a/a/g/d;)V

    iput-object v0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(I)V
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iput-boolean v0, p0, La/a/a/g/d;->Q:Z

    :goto_0
    iput-boolean v0, p0, La/a/a/g/d;->P:Z

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    iput-boolean v0, p0, La/a/a/g/d;->Q:Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    iget-boolean p1, p0, La/a/a/g/d;->P:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, La/a/a/g/d;->Q:Z

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    iget-boolean p1, p0, La/a/a/g/d;->h:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, La/a/a/g/d;->y:La/a/a/g/d$b;

    if-eqz p1, :cond_4

    iget-object p0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    if-eqz p0, :cond_4

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/location/LocationManager;->unregisterGnssMeasurementsCallback(Landroid/location/GnssMeasurementsEvent$Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    return-void
.end method

.method public final a(Landroid/location/Location;I)V
    .locals 11

    if-eqz p1, :cond_e

    sget p2, La/a/a/g/d;->X:I

    const-string v0, "satellites"

    if-nez p2, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-boolean p2, p0, La/a/a/g/d;->j:Z

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result p2

    const/4 v1, 0x0

    invoke-static {p2, v1}, La/a/a/i/i;->a(FF)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-wide v1, p0, La/a/a/g/d;->r:D

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, La/a/a/i/i;->a(DD)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-double v1, v1

    iget-wide v3, p0, La/a/a/g/d;->s:D

    sub-double/2addr v1, v3

    const-wide v3, 0x409f400000000000L    # 2000.0

    cmpg-double p2, v1, v3

    if-gez p2, :cond_1

    iget-wide v1, p0, La/a/a/g/d;->r:D

    double-to-float p2, v1

    invoke-virtual {p1, p2}, Landroid/location/Location;->setSpeed(F)V

    :cond_1
    new-instance p2, Landroid/location/Location;

    invoke-direct {p2, p1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, La/a/a/g/d;->q:J

    iput-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    sget v1, La/a/a/g/d;->X:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v7, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v7, v5, v6}, Landroid/location/Location;->setTime(J)V

    iget-object v7, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v7}, Landroid/location/Location;->getSpeed()F

    move-result v7

    float-to-double v7, v7

    const-wide v9, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v7, v9

    double-to-float v7, v7

    iget-object v8, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v8}, Landroid/location/Location;->hasSpeed()Z

    move-result v8

    if-nez v8, :cond_3

    const/high16 v7, -0x40800000    # -1.0f

    :cond_3
    if-nez v1, :cond_4

    :try_start_1
    iget-object v8, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v8}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v8

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v1, v0

    :catch_1
    :cond_4
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v8, 0x6

    new-array v8, v8, [Ljava/lang/Object;

    iget-object v9, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v8, v3

    iget-object v9, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v9}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v8, v4

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v8, v2

    iget-object v7, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v7}, Landroid/location/Location;->getBearing()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v9, 0x3

    aput-object v7, v8, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x4

    aput-object v7, v8, v9

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x5

    aput-object v5, v8, v6

    const-string v5, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d"

    invoke-static {v0, v5, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :goto_0
    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    const-string v5, "gps"

    if-eqz v0, :cond_c

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    iget-object v6, p0, La/a/a/g/d;->c:Landroid/location/Location;

    iget-object v7, p0, La/a/a/g/d;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v6, v7}, La/a/a/d/i;->a(Landroid/location/Location;Ljava/util/ArrayList;)Z

    :cond_5
    new-instance v0, Lcom/baidu/location/c;

    invoke-virtual {p0}, La/a/a/g/d;->d()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/baidu/location/c;-><init>(Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v6

    iget-object v7, p0, La/a/a/g/d;->c:Landroid/location/Location;

    const-string v8, "gcj02"

    invoke-virtual {v6, v0, v8, v7}, La/a/a/b/f;->a(Lcom/baidu/location/c;Ljava/lang/String;Landroid/location/Location;)V

    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_6

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_6
    const-string v6, "sat_num"

    invoke-virtual {p1, v6, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, p0, La/a/a/g/d;->R:J

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    const-wide/16 v8, 0xbb8

    cmp-long v1, v6, v8

    const-string v6, "is_support_beidou"

    if-ltz v1, :cond_7

    invoke-virtual {p1, v6, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_7
    invoke-virtual {p1, v6, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_1
    invoke-virtual {v0, p1}, Lcom/baidu/location/c;->a(Landroid/os/Bundle;)V

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/d/i;->g()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/d/i;->g()Z

    move-result p1

    const-string v1, "bd_beidou"

    if-nez p1, :cond_9

    iget-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    :cond_9
    iget-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    :goto_2
    invoke-virtual {v0, v1}, Lcom/baidu/location/c;->g(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p0, v0}, La/a/a/g/d;->a(Lcom/baidu/location/c;)V

    :goto_3
    sget p1, La/a/a/g/d;->X:I

    if-le p1, v2, :cond_c

    iget-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-static {p1, v4}, La/a/a/b/y;->a(Landroid/location/Location;Z)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->t()Z

    move-result p1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, La/a/a/g/a;

    invoke-direct {v1, v0}, La/a/a/g/a;-><init>(La/a/a/g/a;)V

    invoke-static {v1}, La/a/a/b/u;->a(La/a/a/g/a;)V

    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, La/a/a/b/u;->a(J)V

    new-instance v0, Landroid/location/Location;

    iget-object p0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-direct {v0, p0}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    invoke-static {v0}, La/a/a/b/u;->a(Landroid/location/Location;)V

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/a/a/b/u;->b(Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/f;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/a/a/b/u;->a(Ljava/lang/String;)V

    if-nez p1, :cond_c

    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/b/z;->d()V

    :cond_c
    invoke-virtual {p2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object p0

    sget p1, La/a/a/g/d;->X:I

    invoke-virtual {p0, p2, p1}, La/a/a/b/z;->a(Landroid/location/Location;I)V

    :cond_d
    return-void

    :cond_e
    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    return-void
.end method

.method public a(Lcom/baidu/location/c;)V
    .locals 1

    sget-boolean v0, La/a/a/i/i;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p0, v0}, La/a/a/g/d;->a(Landroid/location/Location;)I

    move-result p0

    if-lez p0, :cond_0

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Lcom/baidu/location/c;)V

    goto :goto_0

    :cond_0
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->b(Lcom/baidu/location/c;)V

    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;III)V
    .locals 10

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0, p1}, La/a/a/g/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "$GPGGA,"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x6

    if-eqz v1, :cond_1

    array-length p1, v0

    const/4 v1, 0x7

    if-ge p1, v1, :cond_2

    return-void

    :cond_1
    const-string v1, "$GPRMC,"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    array-length p1, v0

    if-ge p1, v2, :cond_2

    return-void

    :cond_2
    aget-object p1, v0, p2

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    const/4 v1, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-nez p1, :cond_4

    aget-object p1, v0, p2

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, v7, :cond_4

    :try_start_0
    aget-object p1, v0, p2

    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    aget-object p1, v0, p2

    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    div-double/2addr p1, v3

    add-double/2addr v8, p1

    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    if-nez p1, :cond_3

    new-instance p1, Lcom/baidu/location/c;

    invoke-direct {p1}, Lcom/baidu/location/c;-><init>()V

    iput-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    :cond_3
    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    invoke-virtual {p1, v8, v9}, Lcom/baidu/location/c;->c(D)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iput-boolean v5, p0, La/a/a/g/d;->N:Z

    goto :goto_0

    :cond_4
    iput-object v1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    :goto_0
    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    if-eqz p1, :cond_5

    aget-object p1, v0, p3

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    aget-object p1, v0, p3

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 p2, 0x3

    if-le p1, p2, :cond_5

    :try_start_1
    aget-object p1, v0, p3

    invoke-virtual {p1, v6, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    aget-object p1, v0, p3

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    div-double/2addr p1, v3

    add-double/2addr v8, p1

    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    invoke-virtual {p1, v8, v9}, Lcom/baidu/location/c;->d(D)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-boolean v5, p0, La/a/a/g/d;->N:Z

    goto :goto_1

    :cond_5
    iput-object v1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    :goto_1
    aget-object p1, v0, p4

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_9

    if-ne p4, v7, :cond_7

    aget-object p1, v0, p4

    const-string p2, "V"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    aget-object p1, v0, p4

    const-string p2, "A"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_7
    if-ne p4, v2, :cond_9

    aget-object p1, v0, p4

    const-string p2, "0"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_2
    iput-boolean v6, p0, La/a/a/g/d;->M:Z

    goto :goto_4

    :cond_8
    :goto_3
    iput-boolean v5, p0, La/a/a/g/d;->M:Z

    :cond_9
    :goto_4
    iget-object p1, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    if-eqz p1, :cond_a

    iput-boolean v6, p0, La/a/a/g/d;->N:Z

    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, La/a/a/g/d;->K:J

    :cond_b
    :goto_5
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/location/Location;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->t()Z

    move-result p1

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, La/a/a/g/a;

    invoke-direct {v1, v0}, La/a/a/g/a;-><init>(La/a/a/g/a;)V

    invoke-static {v1}, La/a/a/b/u;->a(La/a/a/g/a;)V

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, La/a/a/b/u;->a(J)V

    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, p2}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    invoke-static {v0}, La/a/a/b/u;->a(Landroid/location/Location;)V

    invoke-static {p0}, La/a/a/b/u;->b(Ljava/lang/String;)V

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object p2

    invoke-virtual {p2}, La/a/a/b/f;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, La/a/a/b/u;->a(Ljava/lang/String;)V

    if-nez p1, :cond_2

    invoke-static {}, La/a/a/b/u;->d()La/a/a/g/a;

    move-result-object p1

    invoke-static {}, La/a/a/b/u;->c()Landroid/location/Location;

    move-result-object p2

    invoke-static {}, La/a/a/b/u;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, p0, v0}, La/a/a/b/y;->a(La/a/a/g/a;La/a/a/g/k;Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La/a/a/g/d;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, La/a/a/i/c;->a(Ljava/util/ArrayList;)I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "|"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->b(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->c(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->h(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->d(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->e(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->f(Ljava/util/ArrayList;)I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, La/a/a/i/c;->g(Ljava/util/ArrayList;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, La/a/a/g/d;->H:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/d;->I:J

    return-void
.end method

.method public a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, La/a/a/g/d;->k()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La/a/a/g/d;->l()V

    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 7

    const-string p0, "*"

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const-string v0, "$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ne v3, v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-le v0, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-lt v0, v3, :cond_5

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v3, 0x1

    aget-byte v4, v0, v3

    const/4 v5, 0x2

    :goto_0
    array-length v6, v0

    if-ge v5, v6, :cond_3

    aget-byte v6, v0, v5

    xor-int/2addr v4, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    const-string v4, "%02x"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-ne p0, v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v4, p0, 0x3

    if-lt v1, v4, :cond_5

    add-int/2addr p0, v3

    invoke-virtual {p1, p0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    return v3

    :cond_5
    return v2
.end method

.method public final b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x6

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    const-string v4, "|"

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v3

    const-string v5, "%.1f;"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v3

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v6, 0x2

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v3

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v5, 0x3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v4, v3

    const-string v5, "%.0f;"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v6, 0x4

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v3

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v5, 0x5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v4, v3

    const-string v2, "%.0f"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public declared-synchronized b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, La/a/a/g/d;->l()V

    iget-object v0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    iput-object v0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    iget v0, v0, La/a/a/b/d;->F:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-static {}, La/a/a/b/i;->d()La/a/a/b/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/i;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, La/a/a/b/i;->d()La/a/a/b/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/i;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Landroid/location/Location;)V
    .locals 4

    iget-object v0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/g/d;->O:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p0, p0, La/a/a/g/d;->w:La/a/a/g/d$f;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, La/a/a/g/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "$GPGGA,"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    const/4 v2, 0x6

    invoke-virtual {p0, p1, v1, v0, v2}, La/a/a/g/d;->a(Ljava/lang/String;III)V

    goto :goto_0

    :cond_1
    const-string v0, "$GPRMC,"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    const/4 v2, 0x5

    invoke-virtual {p0, p1, v0, v2, v1}, La/a/a/g/d;->a(Ljava/lang/String;III)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, La/a/a/g/d;->p:Z

    const/high16 p0, -0x40800000    # -1.0f

    sput p0, La/a/a/g/d;->m0:F

    return-void
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "-2"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, La/a/a/g/d;->I:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0xbb8

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    iget-object v0, p0, La/a/a/g/d;->H:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    :try_start_2
    const-string v0, "0"

    goto :goto_0

    :cond_0
    const-string v0, "-1"

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "&gnsf="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{\"result\":{\"time\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, La/a/a/i/i;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->hasAccuracy()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    goto :goto_0

    :cond_0
    const/high16 v1, 0x41200000    # 10.0f

    :goto_0
    float-to-int v1, v1

    iget-object v2, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getSpeed()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v2, v4

    double-to-float v2, v2

    iget-object v3, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->hasSpeed()Z

    move-result v3

    if-nez v3, :cond_1

    const/high16 v2, -0x40800000    # -1.0f

    :cond_1
    const/4 v3, 0x2

    new-array v4, v3, [D

    invoke-static {}, La/a/a/i/f;->a()La/a/a/i/f;

    move-result-object v5

    iget-object v6, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    iget-object v8, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v8}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v5, v6, v7, v8, v9}, La/a/a/i/f;->a(DD)Z

    move-result v5

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v5, :cond_3

    iget-object v4, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    iget-object v10, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v10}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    const-string v12, "gps2gcj"

    invoke-static {v4, v5, v10, v11, v12}, Lcom/baidu/location/Jni;->a(DDLjava/lang/String;)[D

    move-result-object v4

    aget-wide v10, v4, v8

    cmpl-double v5, v10, v6

    if-gtz v5, :cond_2

    aget-wide v10, v4, v9

    cmpl-double v5, v10, v6

    if-gtz v5, :cond_2

    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    aput-wide v5, v4, v8

    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    aput-wide v5, v4, v9

    :cond_2
    move v5, v9

    goto :goto_1

    :cond_3
    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    aput-wide v10, v4, v8

    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v10

    aput-wide v10, v4, v9

    aget-wide v10, v4, v8

    cmpl-double v5, v10, v6

    if-gtz v5, :cond_4

    aget-wide v10, v4, v9

    cmpl-double v5, v10, v6

    if-gtz v5, :cond_4

    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    aput-wide v5, v4, v8

    iget-object v5, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    aput-wide v5, v4, v9

    :cond_4
    move v5, v8

    :goto_1
    sget-object v6, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v7, 0x6

    new-array v7, v7, [Ljava/lang/Object;

    aget-wide v10, v4, v8

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    aput-object v10, v7, v8

    aget-wide v10, v4, v9

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v7, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v3

    iget-object v1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v7, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v7, v2

    sget v1, La/a/a/g/d;->X:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v7, v2

    invoke-static {v6, v0, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v5, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",\"in_cn\":\"0\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    sget-boolean v1, La/a/a/i/i;->k:Z

    if-nez v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v2, v9, [Ljava/lang/Object;

    iget-object v3, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p0, v3}, La/a/a/g/d;->a(Landroid/location/Location;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    const-string v3, ",\"is_mock\":%d"

    invoke-static {v0, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_6
    iget-object v1, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->hasAltitude()Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v2, v9, [Ljava/lang/Object;

    iget-object p0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    aput-object p0, v2, v8

    const-string p0, ",\"h\":%.2f}}"

    invoke-static {v0, p0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}}"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_8
    const/4 p0, 0x0

    :goto_2
    return-object p0
.end method

.method public e()Landroid/location/Location;
    .locals 6

    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    return-object v1

    :cond_1
    iget-object p0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, La/a/a/g/d;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz v0, :cond_0

    invoke-static {v0}, La/a/a/g/d;->f(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ll"

    const-string v2, "idll"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "&d="

    const-string v2, "&idd="

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "&s"

    const-string v2, "&ids="

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object p0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v1, v0

    const-string p0, "%s&idgps_tp=%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public g()Lcom/baidu/location/c;
    .locals 6

    iget-object v0, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/g/d;->K:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0xbb8

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    return-object v1

    :cond_1
    iget-object p0, p0, La/a/a/g/d;->L:Lcom/baidu/location/c;

    return-object p0
.end method

.method public h()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/d;->S:Z

    return p0
.end method

.method public i()Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    sget v4, La/a/a/g/d;->X:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v4, :cond_0

    :try_start_1
    iget-object v4, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "satellites"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    :try_start_2
    iget-object v4, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    cmpl-double v4, v4, v2

    if-eqz v4, :cond_1

    iget-object v4, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    cmpl-double p0, v4, v2

    if-eqz p0, :cond_1

    return v0

    :cond_1
    return v1

    :catch_1
    iget-object v4, p0, La/a/a/g/d;->c:Landroid/location/Location;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    cmpl-double v4, v4, v2

    if-eqz v4, :cond_2

    iget-object p0, p0, La/a/a/g/d;->c:Landroid/location/Location;

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    cmpl-double p0, v4, v2

    if-eqz p0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public j()Z
    .locals 6

    invoke-virtual {p0}, La/a/a/g/d;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, La/a/a/i/i;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/g/d;->q:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2710

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    return v1

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-boolean v2, p0, La/a/a/g/d;->n:Z

    if-eqz v2, :cond_3

    iget-wide v2, p0, La/a/a/g/d;->m:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    iget-boolean p0, p0, La/a/a/g/d;->p:Z

    return p0
.end method

.method public k()V
    .locals 11

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    iget-boolean v1, p0, La/a/a/g/d;->o:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iget-boolean v3, p0, La/a/a/g/d;->h:Z

    if-nez v3, :cond_1

    new-instance v3, La/a/a/g/d$e;

    invoke-direct {v3, p0, v1}, La/a/a/g/d$e;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v3, p0, La/a/a/g/d;->i:La/a/a/g/d$e;

    iget-object v4, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v4, v3}, Landroid/location/LocationManager;->addGpsStatusListener(Landroid/location/GpsStatus$Listener;)Z

    goto :goto_0

    :cond_1
    iget-object v3, p0, La/a/a/g/d;->a:Landroid/content/Context;

    invoke-static {v3, v0}, La/a/a/i/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-ne v3, v2, :cond_2

    new-instance v3, La/a/a/g/d$d;

    invoke-direct {v3, p0, v1}, La/a/a/g/d$d;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v3, p0, La/a/a/g/d;->g:La/a/a/g/d$d;

    iget-object v4, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v4, v3}, Landroid/location/LocationManager;->registerGnssStatusCallback(Landroid/location/GnssStatus$Callback;)Z

    :cond_2
    :goto_0
    new-instance v10, La/a/a/g/d$i;

    invoke-direct {v10, p0, v1}, La/a/a/g/d$i;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v10, p0, La/a/a/g/d;->e:La/a/a/g/d$i;

    iget-object v5, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "passive"

    const-wide/16 v7, 0x2328

    const/4 v9, 0x0

    :try_start_1
    invoke-virtual/range {v5 .. v10}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    new-instance v3, La/a/a/g/d$g;

    invoke-direct {v3, p0, v1}, La/a/a/g/d$g;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v3, p0, La/a/a/g/d;->d:La/a/a/g/d$g;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    iget-object v4, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    const-string v5, "gps"

    const-string v6, "force_xtra_injection"

    invoke-virtual {v4, v5, v6, v3}, Landroid/location/LocationManager;->sendExtraCommand(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :try_start_4
    iget-object v3, p0, La/a/a/g/d;->a:Landroid/content/Context;

    invoke-static {v3, v0}, La/a/a/i/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ne v0, v2, :cond_3

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const-string v4, "gps"

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x0

    :try_start_5
    iget-object v8, p0, La/a/a/g/d;->d:La/a/a/g/d$g;

    invoke-virtual/range {v3 .. v8}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    iput-boolean v2, p0, La/a/a/g/d;->S:Z

    :cond_3
    iget-boolean v0, p0, La/a/a/g/d;->h:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, La/a/a/g/d;->z:La/a/a/g/d$c;

    if-nez v0, :cond_4

    sget v0, La/a/a/i/i;->u0:I

    if-ne v0, v2, :cond_4

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v3

    sget-wide v5, La/a/a/i/i;->t0:D

    cmpg-double v0, v3, v5

    if-gez v0, :cond_4

    new-instance v0, La/a/a/g/d$c;

    invoke-direct {v0, p0, v1}, La/a/a/g/d$c;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v0, p0, La/a/a/g/d;->z:La/a/a/g/d$c;

    :cond_4
    iget-object v0, p0, La/a/a/g/d;->z:La/a/a/g/d$c;

    if-eqz v0, :cond_5

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->registerGnssNavigationMessageCallback(Landroid/location/GnssNavigationMessage$Callback;)Z

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    sget-boolean v0, La/a/a/i/i;->k:Z

    if-nez v0, :cond_7

    sget v0, La/a/a/i/i;->N0:I

    if-ne v0, v2, :cond_7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v0, v3, :cond_6

    new-instance v0, La/a/a/g/d$a;

    invoke-direct {v0, p0}, La/a/a/g/d$a;-><init>(La/a/a/g/d;)V

    iput-object v0, p0, La/a/a/g/d;->l:Landroid/location/OnNmeaMessageListener;

    iget-object v1, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->addNmeaListener(Landroid/location/OnNmeaMessageListener;)Z

    goto :goto_1

    :cond_6
    new-instance v0, La/a/a/g/d$h;

    invoke-direct {v0, p0, v1}, La/a/a/g/d$h;-><init>(La/a/a/g/d;La/a/a/g/d$a;)V

    iput-object v0, p0, La/a/a/g/d;->k:Landroid/location/GpsStatus$NmeaListener;

    const-string v0, "android.location.LocationManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    const-string v1, "addNmeaListener"

    :try_start_6
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Landroid/location/GpsStatus$NmeaListener;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, La/a/a/g/d;->k:Landroid/location/GpsStatus$NmeaListener;

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_1
    iput-boolean v2, p0, La/a/a/g/d;->o:Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :catch_2
    return-void
.end method

.method public l()V
    .locals 7

    iget-boolean v0, p0, La/a/a/g/d;->o:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    :try_start_0
    iget-object v3, p0, La/a/a/g/d;->i:La/a/a/g/d$e;

    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V

    iput-object v1, p0, La/a/a/g/d;->i:La/a/a/g/d$e;

    :cond_1
    iget-boolean v0, p0, La/a/a/g/d;->h:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, La/a/a/g/d;->g:La/a/a/g/d$d;

    if-eqz v0, :cond_2

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->unregisterGnssStatusCallback(Landroid/location/GnssStatus$Callback;)V

    iput-object v1, p0, La/a/a/g/d;->g:La/a/a/g/d$d;

    :cond_2
    iget-object v0, p0, La/a/a/g/d;->e:La/a/a/g/d$i;

    if-eqz v0, :cond_3

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    iput-object v1, p0, La/a/a/g/d;->e:La/a/a/g/d$i;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :try_start_1
    iget-object v0, p0, La/a/a/g/d;->d:La/a/a/g/d$g;

    if-eqz v0, :cond_4

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    iput-boolean v2, p0, La/a/a/g/d;->S:Z

    :cond_4
    iget-object v0, p0, La/a/a/g/d;->l:Landroid/location/OnNmeaMessageListener;

    if-eqz v0, :cond_5

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->removeNmeaListener(Landroid/location/OnNmeaMessageListener;)V

    :cond_5
    iget-object v0, p0, La/a/a/g/d;->k:Landroid/location/GpsStatus$NmeaListener;

    if-eqz v0, :cond_6

    const-string v0, "android.location.LocationManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v3, "removeNmeaListener"

    const/4 v4, 0x1

    :try_start_2
    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Landroid/location/GpsStatus$NmeaListener;

    aput-object v6, v5, v2

    invoke-virtual {v0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, La/a/a/g/d;->k:Landroid/location/GpsStatus$NmeaListener;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v0, p0, La/a/a/g/d;->z:La/a/a/g/d$c;

    if-eqz v0, :cond_7

    iget-object v3, p0, La/a/a/g/d;->b:Landroid/location/LocationManager;

    invoke-virtual {v3, v0}, Landroid/location/LocationManager;->unregisterGnssNavigationMessageCallback(Landroid/location/GnssNavigationMessage$Callback;)V

    :cond_7
    invoke-virtual {p0, v2}, La/a/a/g/d;->a(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_8
    sput v2, La/a/a/i/i;->c:I

    sput v2, La/a/a/i/i;->s:I

    iput-object v1, p0, La/a/a/g/d;->d:La/a/a/g/d$g;

    iput-boolean v2, p0, La/a/a/g/d;->o:Z

    invoke-virtual {p0, v2}, La/a/a/g/d;->b(Z)V

    return-void
.end method
