.class public abstract La/a/a/b/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/m$a;,
        La/a/a/b/m$c;,
        La/a/a/b/m$b;
    }
.end annotation


# static fields
.field public static l:Ljava/lang/String;


# instance fields
.field public a:La/a/a/g/k;

.field public b:La/a/a/g/a;

.field public c:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z

.field public f:Z

.field public final g:Landroid/os/Handler;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/m;->a:La/a/a/g/k;

    iput-object v0, p0, La/a/a/b/m;->b:La/a/a/g/a;

    iput-object v0, p0, La/a/a/b/m;->c:Ljava/util/HashSet;

    const/4 v1, 0x1

    iput-boolean v1, p0, La/a/a/b/m;->d:Z

    iput-boolean v1, p0, La/a/a/b/m;->e:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/b/m;->f:Z

    new-instance v2, La/a/a/b/m$b;

    invoke-direct {v2, p0}, La/a/a/b/m$b;-><init>(La/a/a/b/m;)V

    iput-object v2, p0, La/a/a/b/m;->g:Landroid/os/Handler;

    iput-object v0, p0, La/a/a/b/m;->h:Ljava/lang/String;

    iput-object v0, p0, La/a/a/b/m;->i:Ljava/lang/String;

    iput-boolean v1, p0, La/a/a/b/m;->j:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/b/m;->k:J

    return-void
.end method

.method public static synthetic a(La/a/a/b/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/b/m;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(La/a/a/b/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/b/m;->i:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 8

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/f;->p()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const-string v1, "&cn=32"

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v5

    invoke-virtual {v5}, La/a/a/g/f;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const-string v5, "&cn=%d"

    invoke-static {v1, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, La/a/a/b/m;->k:J

    sub-long/2addr v4, v6

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x12

    if-lt v6, v7, :cond_1

    const-wide/32 v6, 0xea60

    cmp-long v4, v4, v6

    if-lez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, La/a/a/b/m;->k:J

    invoke-static {}, La/a/a/i/i;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&qcip6c="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-boolean v4, p0, La/a/a/b/m;->d:Z

    if-eqz v4, :cond_2

    iput-boolean v2, p0, La/a/a/b/m;->d:Z

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, La/a/a/b/m;->f:Z

    if-nez v2, :cond_4

    invoke-static {}, La/a/a/b/y;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-boolean v3, p0, La/a/a/b/m;->f:Z

    :cond_4
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    iget-object p1, p0, La/a/a/b/m;->h:Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, La/a/a/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/m;->h:Ljava/lang/String;

    :cond_0
    iget-object p1, p0, La/a/a/b/m;->i:Ljava/lang/String;

    if-nez p1, :cond_1

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, La/a/a/a/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/m;->i:Ljava/lang/String;

    :cond_1
    iget-object p1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, La/a/a/g/a;->a()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->a()La/a/a/g/a;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    :cond_3
    iget-object p1, p0, La/a/a/b/m;->a:La/a/a/g/k;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, La/a/a/g/k;->b()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/f;->j()La/a/a/g/k;

    move-result-object p1

    iput-object p1, p0, La/a/a/b/m;->a:La/a/a/g/k;

    :cond_5
    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/d;->j()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object p1

    invoke-virtual {p1}, La/a/a/g/d;->e()Landroid/location/Location;

    move-result-object p1

    move-object v3, p1

    goto :goto_0

    :cond_6
    move-object v3, v0

    :goto_0
    iget-object p1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, La/a/a/g/a;->c()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    invoke-virtual {p1}, La/a/a/g/a;->b()Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_7
    iget-object p1, p0, La/a/a/b/m;->a:La/a/a/g/k;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, La/a/a/g/k;->c()I

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    if-nez v3, :cond_9

    return-object v0

    :cond_9
    invoke-virtual {p0}, La/a/a/b/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, La/a/a/b/l;->f()La/a/a/b/l;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/l;->a()I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&imo=1"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_a
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/i/i;->c(Landroid/content/Context;)I

    move-result v0

    if-ltz v0, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&lmd="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_b

    iget-boolean v0, p0, La/a/a/b/m;->j:Z

    if-nez v0, :cond_b

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/b/m;->j:Z

    :try_start_0
    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.wifi.rtt"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&rtt=1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_b
    :goto_1
    iget-object v0, p0, La/a/a/b/m;->a:La/a/a/g/k;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, La/a/a/g/k;->c()I

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_d
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->o()Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&wf_freq=1"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_e
    move-object v4, p1

    iget-boolean p1, p0, La/a/a/b/m;->e:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_f

    iput-boolean v0, p0, La/a/a/b/m;->e:Z

    iget-object v1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    iget-object v2, p0, La/a/a/b/m;->a:La/a/a/g/k;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, La/a/a/i/i;->a(La/a/a/g/a;La/a/a/g/k;Landroid/location/Location;Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    iget-object p1, p0, La/a/a/b/m;->b:La/a/a/g/a;

    iget-object p0, p0, La/a/a/b/m;->a:La/a/a/g/k;

    invoke-static {p1, p0, v3, v4, v0}, La/a/a/i/i;->a(La/a/a/g/a;La/a/a/g/k;Landroid/location/Location;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract a(Landroid/os/Message;)V
.end method

.method public abstract b()V
.end method
