.class public La/a/a/g/l/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/g/m/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/g/l/a$e;,
        La/a/a/g/l/a$c;,
        La/a/a/g/l/a$b;,
        La/a/a/g/l/a$d;,
        La/a/a/g/l/a$f;
    }
.end annotation


# static fields
.field public static G:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static H:I


# instance fields
.field public A:Z

.field public B:Z

.field public C:Landroid/os/Handler;

.field public D:I

.field public E:I

.field public final F:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:F

.field public f:Z

.field public g:Z

.field public h:Landroid/telephony/TelephonyManager;

.field public i:Landroid/telephony/TelephonyManager;

.field public j:Landroid/telephony/TelephonyManager;

.field public k:Landroid/telephony/SubscriptionManager;

.field public l:La/a/a/g/a;

.field public m:La/a/a/g/a;

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/a/a/g/a;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/util/concurrent/Executor;

.field public p:La/a/a/g/l/a$e;

.field public q:La/a/a/g/l/a$d;

.field public r:La/a/a/g/l/a$b;

.field public s:La/a/a/g/l/a$c;

.field public t:Landroid/content/Context;

.field public u:Z

.field public v:I

.field public w:Z

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1e

    iput v0, p0, La/a/a/g/l/a;->c:I

    const/16 v0, 0x64

    iput v0, p0, La/a/a/g/l/a;->d:I

    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, La/a/a/g/l/a;->e:F

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/g/l/a;->f:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, La/a/a/g/l/a;->g:Z

    const/4 v2, 0x0

    iput-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    iput-object v2, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    iput-object v2, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    iput-object v2, p0, La/a/a/g/l/a;->k:Landroid/telephony/SubscriptionManager;

    new-instance v3, La/a/a/g/a;

    invoke-direct {v3}, La/a/a/g/a;-><init>()V

    iput-object v3, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iput-object v2, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    iput-object v2, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    iput-object v2, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    iput-object v2, p0, La/a/a/g/l/a;->p:La/a/a/g/l/a$e;

    iput-boolean v1, p0, La/a/a/g/l/a;->u:Z

    iput v1, p0, La/a/a/g/l/a;->v:I

    iput-boolean v1, p0, La/a/a/g/l/a;->w:Z

    const-wide/16 v3, 0x0

    iput-wide v3, p0, La/a/a/g/l/a;->x:J

    iput-wide v3, p0, La/a/a/g/l/a;->y:J

    iput-boolean v1, p0, La/a/a/g/l/a;->z:Z

    iput-boolean v0, p0, La/a/a/g/l/a;->A:Z

    iput-boolean v1, p0, La/a/a/g/l/a;->B:Z

    iput-object v2, p0, La/a/a/g/l/a;->C:Landroid/os/Handler;

    const/4 v0, -0x1

    iput v0, p0, La/a/a/g/l/a;->D:I

    iput v0, p0, La/a/a/g/l/a;->E:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/a/a/g/l/a;->F:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/telephony/CellIdentityNr;)I
    .locals 3

    :try_start_0
    const-string v0, "getHwTac"

    invoke-static {p0, v0}, La/a/a/g/m/b;->a(Ljava/lang/Object;Ljava/lang/String;)I

    move-result p0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " get hw tac = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " get hw tac exception !"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    const/4 p0, -0x1

    :cond_1
    :goto_0
    return p0
.end method

.method public static synthetic a(La/a/a/g/l/a;)La/a/a/g/a;
    .locals 0

    iget-object p0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    return-object p0
.end method

.method public static synthetic a(La/a/a/g/l/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/g/l/a;->A:Z

    return p1
.end method

.method public static b(Ljava/lang/String;)I
    .locals 5

    const/4 v0, -0x1

    if-eqz p0, :cond_4

    const-string v1, "mNrTac"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "mNrTac=(.+?)\\}"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    :cond_0
    :goto_0
    move v1, v0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_1

    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_2

    sget-boolean v2, La/a/a/g/m/a;->b:Z

    if-eqz v2, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " pasrse mnrtac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_2
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_3
    move v0, v1

    :cond_4
    return v0
.end method

.method public static synthetic b(La/a/a/g/l/a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/g/l/a;->a()V

    return-void
.end method

.method public static synthetic c(La/a/a/g/l/a;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/l/a;->z:Z

    return p0
.end method

.method public static d(I)I
    .locals 1

    const v0, 0x7fffffff

    if-ne p0, v0, :cond_0

    const/4 p0, -0x1

    :cond_0
    return p0
.end method

.method public static synthetic d(La/a/a/g/l/a;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/l/a;->A:Z

    return p0
.end method

.method public static synthetic e(La/a/a/g/l/a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/g/l/a;->g()V

    return-void
.end method

.method public static synthetic f(La/a/a/g/l/a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, La/a/a/g/l/a;->F:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic g(La/a/a/g/l/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La/a/a/g/l/a;->C:Landroid/os/Handler;

    return-object p0
.end method

.method public static i()La/a/a/g/l/a;
    .locals 1

    invoke-static {}, La/a/a/g/l/a$f;->a()La/a/a/g/l/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    if-eqz p1, :cond_0

    const-string p0, "cl_s2"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    :try_start_0
    const-string p0, "cl_s2=[0-9]{1,}"

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object p0

    const-string p1, "cl_s2="

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    add-int/lit8 p1, p1, 0x6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public a(I)La/a/a/g/a;
    .locals 7

    iget-object v0, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_4

    :try_start_0
    invoke-virtual {p0}, La/a/a/g/l/a;->g()V

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " lastDiffTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, La/a/a/g/l/a;->y:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", diffTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_4

    iget-boolean v1, p0, La/a/a/g/l/a;->w:Z

    if-eqz v1, :cond_4

    const v1, 0x7fffffff

    if-ge p1, v1, :cond_3

    int-to-long v1, p1

    iget-wide v3, p0, La/a/a/g/l/a;->y:J

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, La/a/a/g/l/a;->x:J

    sub-long/2addr v3, v5

    cmp-long v1, v3, v1

    if-lez v1, :cond_3

    if-eqz v0, :cond_2

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v1, " over diff time"

    :goto_0
    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v1, "diff time is changed"

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p0}, La/a/a/g/l/a;->e()V

    :cond_3
    int-to-long v0, p1

    iput-wide v0, p0, La/a/a/g/l/a;->y:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_2
    iget-object p1, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, La/a/a/g/a;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    new-instance p1, La/a/a/g/a;

    iget-object v0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    invoke-direct {p1, v0}, La/a/a/g/a;-><init>(La/a/a/g/a;)V

    iput-object p1, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    :cond_5
    iget-object p1, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, La/a/a/g/a;->c()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    if-eqz p1, :cond_6

    iget-object v0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget-char v1, v0, La/a/a/g/a;->i:C

    const/16 v2, 0x67

    if-ne v1, v2, :cond_6

    iget v1, p1, La/a/a/g/a;->d:I

    iput v1, v0, La/a/a/g/a;->d:I

    iget p1, p1, La/a/a/g/a;->c:I

    iput p1, v0, La/a/a/g/a;->c:I

    :cond_6
    iget-object p0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    return-object p0
.end method

.method public a(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;
    .locals 2

    invoke-virtual {p0, p1, p2}, La/a/a/g/l/a;->b(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/a/a/g/a;->e()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, La/a/a/g/l/a;->a(Landroid/telephony/CellLocation;)La/a/a/g/a;

    move-result-object p1

    :cond_1
    sget-boolean p2, La/a/a/g/m/a;->a:Z

    if-eqz p2, :cond_2

    sget-boolean p2, La/a/a/g/m/a;->b:Z

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "main process: old cell api = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_2
    return-object p1
.end method

.method public final a(Landroid/telephony/CellInfo;La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x11

    if-ge v3, v5, :cond_0

    return-object v4

    :cond_0
    new-instance v5, La/a/a/g/a;

    invoke-direct {v5}, La/a/a/g/a;-><init>()V

    instance-of v6, v1, Landroid/telephony/CellInfoGsm;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/16 v12, 0x67

    const/16 v13, 0x1c

    if-eqz v6, :cond_2

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoGsm;

    invoke-virtual {v0}, Landroid/telephony/CellInfoGsm;->getCellIdentity()Landroid/telephony/CellIdentityGsm;

    move-result-object v6

    sget-boolean v14, La/a/a/g/m/a;->a:Z

    if-eqz v14, :cond_1

    sget-boolean v14, La/a/a/g/m/a;->b:Z

    if-eqz v14, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v14

    const-string v15, "CellInfoGsm"

    invoke-virtual {v14, v15}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v6}, Landroid/telephony/CellIdentityGsm;->getMcc()I

    move-result v14

    invoke-static {v14}, La/a/a/g/l/a;->d(I)I

    move-result v14

    iput v14, v5, La/a/a/g/a;->c:I

    invoke-virtual {v6}, Landroid/telephony/CellIdentityGsm;->getMnc()I

    move-result v14

    invoke-static {v14}, La/a/a/g/l/a;->d(I)I

    move-result v14

    iput v14, v5, La/a/a/g/a;->d:I

    invoke-virtual {v6}, Landroid/telephony/CellIdentityGsm;->getLac()I

    move-result v14

    invoke-static {v14}, La/a/a/g/l/a;->d(I)I

    move-result v14

    iput v14, v5, La/a/a/g/a;->a:I

    invoke-virtual {v6}, Landroid/telephony/CellIdentityGsm;->getCid()I

    move-result v6

    invoke-static {v6}, La/a/a/g/l/a;->d(I)I

    move-result v6

    int-to-long v14, v6

    iput-wide v14, v5, La/a/a/g/a;->b:J

    iput-char v12, v5, La/a/a/g/a;->i:C

    invoke-virtual {v0}, Landroid/telephony/CellInfoGsm;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthGsm;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/CellSignalStrengthGsm;->getAsuLevel()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->h:I

    iput v7, v5, La/a/a/g/a;->k:I

    if-lt v2, v13, :cond_a

    goto/16 :goto_2

    :cond_2
    instance-of v6, v1, Landroid/telephony/CellInfoCdma;

    if-eqz v6, :cond_8

    move-object v6, v1

    check-cast v6, Landroid/telephony/CellInfoCdma;

    invoke-virtual {v6}, Landroid/telephony/CellInfoCdma;->getCellIdentity()Landroid/telephony/CellIdentityCdma;

    move-result-object v14

    sget-boolean v15, La/a/a/g/m/a;->a:Z

    if-eqz v15, :cond_3

    sget-boolean v16, La/a/a/g/m/a;->b:Z

    if-eqz v16, :cond_3

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    const-string v7, "CellInfoCdma"

    invoke-virtual {v4, v7}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "lat = "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getLatitude()I

    move-result v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "lon = "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getLongitude()I

    move-result v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getLatitude()I

    move-result v4

    iput v4, v5, La/a/a/g/a;->e:I

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getLongitude()I

    move-result v4

    iput v4, v5, La/a/a/g/a;->f:I

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getSystemId()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    iput v4, v5, La/a/a/g/a;->d:I

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getNetworkId()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    iput v4, v5, La/a/a/g/a;->a:I

    invoke-virtual {v14}, Landroid/telephony/CellIdentityCdma;->getBasestationId()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    int-to-long v9, v4

    iput-wide v9, v5, La/a/a/g/a;->b:J

    const/16 v4, 0x63

    iput-char v4, v5, La/a/a/g/a;->i:C

    invoke-virtual {v6}, Landroid/telephony/CellInfoCdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthCdma;

    move-result-object v4

    invoke-virtual {v4}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaDbm()I

    move-result v4

    iput v4, v5, La/a/a/g/a;->h:I

    iput v8, v5, La/a/a/g/a;->k:I

    if-lt v2, v13, :cond_4

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v2

    iput v2, v5, La/a/a/g/a;->j:I

    :cond_4
    if-eqz v0, :cond_5

    iget v0, v0, La/a/a/g/a;->c:I

    if-lez v0, :cond_5

    iput v0, v5, La/a/a/g/a;->c:I

    if-eqz v15, :cond_a

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_a

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cdma set old cellinfo mcc = "

    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v5, La/a/a/g/a;->c:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_5
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-lt v2, v4, :cond_6

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v0, :cond_7

    goto :goto_1

    :catch_0
    move-exception v0

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_1
    const/4 v0, -0x1

    :cond_7
    if-lez v0, :cond_a

    iput v0, v5, La/a/a/g/a;->c:I

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_a

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_a

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cdma set old mcc = "

    goto :goto_0

    :cond_8
    instance-of v0, v1, Landroid/telephony/CellInfoLte;

    if-eqz v0, :cond_b

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoLte;

    invoke-virtual {v0}, Landroid/telephony/CellInfoLte;->getCellIdentity()Landroid/telephony/CellIdentityLte;

    move-result-object v4

    sget-boolean v6, La/a/a/g/m/a;->a:Z

    if-eqz v6, :cond_9

    sget-boolean v6, La/a/a/g/m/a;->b:Z

    if-eqz v6, :cond_9

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    const-string v9, "CellInfoLte"

    invoke-virtual {v6, v9}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_9
    invoke-virtual {v4}, Landroid/telephony/CellIdentityLte;->getMcc()I

    move-result v6

    invoke-static {v6}, La/a/a/g/l/a;->d(I)I

    move-result v6

    iput v6, v5, La/a/a/g/a;->c:I

    invoke-virtual {v4}, Landroid/telephony/CellIdentityLte;->getMnc()I

    move-result v6

    invoke-static {v6}, La/a/a/g/l/a;->d(I)I

    move-result v6

    iput v6, v5, La/a/a/g/a;->d:I

    invoke-virtual {v4}, Landroid/telephony/CellIdentityLte;->getTac()I

    move-result v6

    invoke-static {v6}, La/a/a/g/l/a;->d(I)I

    move-result v6

    iput v6, v5, La/a/a/g/a;->a:I

    invoke-virtual {v4}, Landroid/telephony/CellIdentityLte;->getCi()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    int-to-long v9, v4

    iput-wide v9, v5, La/a/a/g/a;->b:J

    iput-char v12, v5, La/a/a/g/a;->i:C

    invoke-virtual {v0}, Landroid/telephony/CellInfoLte;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthLte;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/CellSignalStrengthLte;->getAsuLevel()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->h:I

    const/4 v4, 0x3

    iput v4, v5, La/a/a/g/a;->k:I

    if-lt v2, v13, :cond_a

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->j:I

    :cond_a
    :goto_3
    move v2, v8

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    :goto_4
    const/16 v0, 0x12

    if-lt v3, v0, :cond_1d

    if-nez v2, :cond_1d

    :try_start_1
    instance-of v0, v1, Landroid/telephony/CellInfoWcdma;

    const/4 v2, 0x4

    if-eqz v0, :cond_d

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoWcdma;

    invoke-virtual {v0}, Landroid/telephony/CellInfoWcdma;->getCellIdentity()Landroid/telephony/CellIdentityWcdma;

    move-result-object v0

    sget-boolean v4, La/a/a/g/m/a;->a:Z

    if-eqz v4, :cond_c

    sget-boolean v4, La/a/a/g/m/a;->b:Z

    if-eqz v4, :cond_c

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    const-string v6, "CellInfoWcdma"

    invoke-virtual {v4, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    iput v4, v5, La/a/a/g/a;->c:I

    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    iput v4, v5, La/a/a/g/a;->d:I

    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getLac()I

    move-result v4

    invoke-static {v4}, La/a/a/g/l/a;->d(I)I

    move-result v4

    iput v4, v5, La/a/a/g/a;->a:I

    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getCid()I

    move-result v0

    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    int-to-long v6, v0

    iput-wide v6, v5, La/a/a/g/a;->b:J

    iput-char v12, v5, La/a/a/g/a;->i:C

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoWcdma;

    invoke-virtual {v0}, Landroid/telephony/CellInfoWcdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthWcdma;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/CellSignalStrengthWcdma;->getAsuLevel()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->h:I

    iput v2, v5, La/a/a/g/a;->k:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v13, :cond_1d

    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v0

    goto/16 :goto_8

    :cond_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v0, v4, :cond_1d

    instance-of v0, v1, Landroid/telephony/CellInfoTdscdma;

    const/4 v4, 0x5

    if-eqz v0, :cond_11

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoTdscdma;

    invoke-virtual {v0}, Landroid/telephony/CellInfoTdscdma;->getCellIdentity()Landroid/telephony/CellIdentityTdscdma;

    move-result-object v2

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_e

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_e

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v6, "CellInfoTdscdma"

    invoke-virtual {v0, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_e
    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getMccString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v0, :cond_f

    :try_start_2
    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getMccString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    :try_start_3
    sget-boolean v6, La/a/a/g/m/a;->a:Z

    if-eqz v6, :cond_f

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_f
    :goto_6
    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getMncString()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v0, :cond_10

    :try_start_4
    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getMncString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    :try_start_5
    sget-boolean v6, La/a/a/g/m/a;->a:Z

    if-eqz v6, :cond_10

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_10
    :goto_7
    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getLac()I

    move-result v0

    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    iput v0, v5, La/a/a/g/a;->a:I

    invoke-virtual {v2}, Landroid/telephony/CellIdentityTdscdma;->getCid()I

    move-result v0

    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    int-to-long v6, v0

    iput-wide v6, v5, La/a/a/g/a;->b:J

    iput-char v12, v5, La/a/a/g/a;->i:C

    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoTdscdma;

    invoke-virtual {v0}, Landroid/telephony/CellInfoTdscdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthTdscdma;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/CellSignalStrengthTdscdma;->getAsuLevel()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->h:I

    iput v4, v5, La/a/a/g/a;->k:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v13, :cond_1d

    goto/16 :goto_5

    :goto_8
    iput v0, v5, La/a/a/g/a;->j:I

    goto/16 :goto_e

    :cond_11
    instance-of v0, v1, Landroid/telephony/CellInfoNr;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-eqz v0, :cond_1d

    :try_start_6
    move-object v0, v1

    check-cast v0, Landroid/telephony/CellInfoNr;

    invoke-virtual {v0}, Landroid/telephony/CellInfoNr;->getCellIdentity()Landroid/telephony/CellIdentity;

    move-result-object v0

    check-cast v0, Landroid/telephony/CellIdentityNr;

    sget-boolean v6, La/a/a/g/m/a;->a:Z

    if-eqz v6, :cond_12

    sget-boolean v6, La/a/a/g/m/a;->b:Z

    if-eqz v6, :cond_12

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, " get cell nr = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/telephony/CellIdentityNr;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_12
    move-object v6, v0

    goto :goto_9

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v6, 0x0

    :goto_9
    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_13

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_13

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v9, "CellInfoNr"

    invoke-virtual {v0, v9}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_13
    if-eqz v6, :cond_1d

    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getMccString()Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-eqz v0, :cond_14

    :try_start_8
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getMccString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->c:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    :try_start_9
    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_14

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_14
    :goto_a
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getMncString()Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    if-eqz v0, :cond_15

    :try_start_a
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getMncString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->d:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_b

    :catchall_4
    move-exception v0

    :try_start_b
    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_15

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_15
    :goto_b
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getTac()I

    move-result v0

    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    iput v0, v5, La/a/a/g/a;->a:I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    const/4 v9, -0x1

    if-ne v0, v9, :cond_17

    :try_start_c
    invoke-static {v6}, La/a/a/g/l/a;->a(Landroid/telephony/CellIdentityNr;)I

    move-result v0

    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_16

    sget-boolean v9, La/a/a/g/m/a;->b:Z

    if-eqz v9, :cond_16

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, " get nrtac for huawei = "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_16
    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    iput v0, v5, La/a/a/g/a;->a:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_c

    :catchall_5
    move-exception v0

    :try_start_d
    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_17

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_17
    :goto_c
    iget v0, v5, La/a/a/g/a;->a:I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    const/4 v9, -0x1

    if-ne v0, v9, :cond_19

    :try_start_e
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/g/l/a;->b(Ljava/lang/String;)I

    move-result v0

    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_18

    sget-boolean v9, La/a/a/g/m/a;->b:Z

    if-eqz v9, :cond_18

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, " get nrtac for samsung = "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_18
    invoke-static {v0}, La/a/a/g/l/a;->d(I)I

    move-result v0

    iput v0, v5, La/a/a/g/a;->a:I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_d

    :catchall_6
    move-exception v0

    :try_start_f
    sget-boolean v9, La/a/a/g/m/a;->a:Z

    if-eqz v9, :cond_19

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_19
    :goto_d
    iget v0, v5, La/a/a/g/a;->a:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_1a

    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getTac()I

    move-result v0

    iput v0, v5, La/a/a/g/a;->a:I

    :cond_1a
    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getNci()J

    move-result-wide v9

    const-wide v14, 0x7fffffffffffffffL

    cmp-long v0, v9, v14

    if-eqz v0, :cond_1b

    invoke-virtual {v6}, Landroid/telephony/CellIdentityNr;->getNci()J

    move-result-wide v9

    iput-wide v9, v5, La/a/a/g/a;->b:J

    :cond_1b
    iput-char v12, v5, La/a/a/g/a;->i:C

    const/4 v0, 0x6

    iput v0, v5, La/a/a/g/a;->k:I

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v13, :cond_1c

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getCellConnectionStatus()I

    move-result v6

    iput v6, v5, La/a/a/g/a;->j:I

    :cond_1c
    move-object v6, v1

    check-cast v6, Landroid/telephony/CellInfoNr;

    invoke-virtual {v6}, Landroid/telephony/CellInfoNr;->getCellSignalStrength()Landroid/telephony/CellSignalStrength;

    move-result-object v6

    check-cast v6, Landroid/telephony/CellSignalStrengthNr;

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getAsuLevel()I

    move-result v9

    iput v9, v5, La/a/a/g/a;->h:I

    invoke-virtual {v5}, La/a/a/g/a;->e()Z

    move-result v9

    if-eqz v9, :cond_1d

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    const-string v10, "%d|%d|%d|%d|%d|%d|%d|%d"

    const/16 v12, 0x8

    :try_start_10
    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getCsiRsrp()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v7, 0x0

    aput-object v13, v12, v7

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getCsiRsrq()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v12, v8

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getCsiSinr()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x2

    aput-object v7, v12, v8

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getDbm()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x3

    aput-object v7, v12, v8

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getLevel()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v12, v2

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getSsRsrp()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v12, v4

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getSsRsrq()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v12, v0

    const/4 v0, 0x7

    invoke-virtual {v6}, Landroid/telephony/CellSignalStrengthNr;->getSsSinr()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v12, v0

    invoke-static {v9, v10, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, La/a/a/g/a;->o:Ljava/lang/String;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    goto :goto_e

    :catch_1
    move-exception v0

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1d
    :goto_e
    const/16 v0, 0x1e

    const-string v2, "new cell delta3 time(ms) = "

    if-lt v3, v0, :cond_1f

    :try_start_11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide v6

    sub-long/2addr v3, v6

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1e

    sget-boolean v6, La/a/a/g/m/a;->b:Z

    if-eqz v6, :cond_1e

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "new cell delta1 time(ms) = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "new cell delta2 time(ms) = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getTimestampMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v3

    iput-wide v1, v5, La/a/a/g/a;->g:J

    if-eqz v0, :cond_22

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new cell time apilevel up 30 (ms) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v5, La/a/a/g/a;->g:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :goto_f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_10

    :cond_1f
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide v6

    sub-long/2addr v3, v6

    const-wide/32 v6, 0xf4240

    div-long/2addr v3, v6

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_20

    sget-boolean v6, La/a/a/g/m/a;->b:Z

    if-eqz v6, :cond_20

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "new cell delta1 time(ns) = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "new cell delta2 time(ns) = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Landroid/telephony/CellInfo;->getTimeStamp()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v3

    iput-wide v1, v5, La/a/a/g/a;->g:J

    if-eqz v0, :cond_22

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_22

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new cell time(ms) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v5, La/a/a/g/a;->g:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto/16 :goto_f

    :goto_10
    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Error; {:try_start_11 .. :try_end_11} :catch_2

    goto :goto_11

    :catch_2
    move-exception v0

    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_21

    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    :cond_21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v5, La/a/a/g/a;->g:J

    :cond_22
    :goto_11
    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_23

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_23

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mcc = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v5, La/a/a/g/a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mnc = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v5, La/a/a/g/a;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lac = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v5, La/a/a/g/a;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cid = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v5, La/a/a/g/a;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cs = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v5, La/a/a/g/a;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_23
    return-object v5
.end method

.method public final a(Landroid/telephony/CellLocation;)La/a/a/g/a;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, La/a/a/g/l/a;->a(Landroid/telephony/CellLocation;Z)La/a/a/g/a;

    move-result-object p0

    return-object p0
.end method

.method public final a(Landroid/telephony/CellLocation;Z)La/a/a/g/a;
    .locals 9

    const/4 p2, 0x0

    if-eqz p1, :cond_14

    iget-object v0, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v1, "set cell info.."

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, La/a/a/g/a;

    invoke-direct {v0}, La/a/a/g/a;-><init>()V

    const/4 v1, 0x1

    iput v1, v0, La/a/a/g/a;->l:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, La/a/a/g/a;->g:J

    const/4 v2, 0x3

    :try_start_0
    iget-object v3, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_8

    const/4 v4, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    if-lt v5, v2, :cond_3

    invoke-virtual {v3, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gez v4, :cond_2

    iget-object v5, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget v5, v5, La/a/a/g/a;->c:I

    goto :goto_0

    :cond_2
    move v5, v4

    :goto_0
    iput v5, v0, La/a/a/g/a;->c:I

    :cond_3
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    move v5, v6

    :goto_1
    array-length v7, v4

    if-ge v5, v7, :cond_5

    aget-char v7, v4, v5

    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_6
    if-gez v4, :cond_7

    iget-object v3, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget v4, v3, La/a/a/g/a;->d:I

    :cond_7
    iput v4, v0, La/a/a/g/a;->d:I

    :cond_8
    iget-object v3, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v3

    iput v3, p0, La/a/a/g/l/a;->v:I

    sget-boolean v3, La/a/a/g/m/a;->a:Z

    if-eqz v3, :cond_a

    sget-boolean v3, La/a/a/g/m/a;->b:Z

    if-eqz v3, :cond_a

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sim state:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, La/a/a/g/l/a;->v:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v3

    sget-boolean v4, La/a/a/g/m/a;->a:Z

    if-eqz v4, :cond_9

    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    sput v1, La/a/a/g/l/a;->H:I

    :cond_a
    :goto_3
    instance-of v1, p1, Landroid/telephony/gsm/GsmCellLocation;

    if-eqz v1, :cond_b

    check-cast p1, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {p1}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result p2

    iput p2, v0, La/a/a/g/a;->a:I

    invoke-virtual {p1}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, v0, La/a/a/g/a;->b:J

    const/16 p1, 0x67

    iput-char p1, v0, La/a/a/g/a;->i:C

    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_13

    sget-boolean p1, La/a/a/g/m/a;->b:Z

    if-eqz p1, :cond_13

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p1

    const-string p2, "bslocation mNetworkType = \'g\'"

    invoke-virtual {p1, p2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_b
    instance-of v1, p1, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz v1, :cond_13

    const/16 v1, 0x63

    iput-char v1, v0, La/a/a/g/a;->i:C

    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_c

    sget-boolean v3, La/a/a/g/m/a;->b:Z

    if-eqz v3, :cond_c

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v3

    const-string v4, "bslocation mNetworkType = \'c\'"

    invoke-virtual {v3, v4}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_c
    sget-object v3, La/a/a/g/l/a;->G:Ljava/lang/Class;

    if-nez v3, :cond_d

    :try_start_1
    const-string v3, "android.telephony.cdma.CdmaCellLocation"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, La/a/a/g/l/a;->G:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    sput-object p2, La/a/a/g/l/a;->G:Ljava/lang/Class;

    return-object v0

    :cond_d
    :goto_4
    sget-object p2, La/a/a/g/l/a;->G:Ljava/lang/Class;

    if-eqz p2, :cond_13

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_13

    :try_start_2
    move-object p2, p1

    check-cast p2, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p2}, Landroid/telephony/cdma/CdmaCellLocation;->getSystemId()I

    move-result p2

    if-gez p2, :cond_e

    iget-object p2, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget p2, p2, La/a/a/g/a;->d:I

    :cond_e
    iput p2, v0, La/a/a/g/a;->d:I

    move-object p2, p1

    check-cast p2, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p2}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationId()I

    move-result p2

    int-to-long v3, p2

    iput-wide v3, v0, La/a/a/g/a;->b:J

    move-object p2, p1

    check-cast p2, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p2}, Landroid/telephony/cdma/CdmaCellLocation;->getNetworkId()I

    move-result p2

    iput p2, v0, La/a/a/g/a;->a:I

    move-object p2, p1

    check-cast p2, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p2}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLatitude()I

    move-result p2

    const-wide v3, 0x40cc200000000000L    # 14400.0

    if-eqz v1, :cond_f

    sget-boolean v5, La/a/a/g/m/a;->b:Z

    if-eqz v5, :cond_f

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "bslocation lat "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-double v7, p2

    div-double/2addr v7, v3

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_f
    const v5, 0x7fffffff

    if-ge p2, v5, :cond_10

    iput p2, v0, La/a/a/g/a;->e:I

    :cond_10
    check-cast p1, Landroid/telephony/cdma/CdmaCellLocation;

    invoke-virtual {p1}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLongitude()I

    move-result p1

    if-eqz v1, :cond_11

    sget-boolean p2, La/a/a/g/m/a;->b:Z

    if-eqz p2, :cond_11

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "bslocation lon"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-double v6, p1

    div-double/2addr v6, v3

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_11
    if-ge p1, v5, :cond_13

    iput p1, v0, La/a/a/g/a;->f:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    move-exception p0

    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_12

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_12
    sput v2, La/a/a/g/l/a;->H:I

    return-object v0

    :cond_13
    :goto_5
    invoke-virtual {p0, v0}, La/a/a/g/l/a;->g(La/a/a/g/a;)V

    return-object v0

    :cond_14
    :goto_6
    return-object p2
.end method

.method public final a(La/a/a/g/a;)Ljava/lang/String;
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-string p1, "|"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    if-lt v1, v3, :cond_6

    :try_start_0
    iget-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_5

    const-string v3, "&nc="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/CellInfo;

    invoke-virtual {v3}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget-object v5, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v3, v4, v5}, La/a/a/g/l/a;->a(Landroid/telephony/CellInfo;La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    iget v4, v3, La/a/a/g/a;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v5, -0x1

    const-string v6, ";"

    if-eq v4, v5, :cond_3

    :try_start_1
    iget-wide v4, v3, La/a/a/g/a;->b:J

    const-wide/16 v7, -0x1

    cmp-long v4, v4, v7

    if-eqz v4, :cond_3

    iget v4, v3, La/a/a/g/a;->c:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, La/a/a/g/a;->d:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, La/a/a/g/a;->a:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v3, La/a/a/g/a;->b:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, La/a/a/g/a;->h:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-le v4, v5, :cond_0

    iget v4, v3, La/a/a/g/a;->k:I

    const/4 v5, 0x6

    if-ne v4, v5, :cond_0

    iget-object v4, v3, La/a/a/g/a;->o:Ljava/lang/String;

    if-eqz v4, :cond_0

    invoke-virtual {v3}, La/a/a/g/a;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    if-nez v2, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    const-string v2, "&ncnr="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v2, v4

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_3
    invoke-virtual {p0, v3}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, La/a/a/g/a;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_0

    :catchall_1
    move-exception p0

    move-object v4, v2

    :goto_2
    move-object v2, v4

    goto :goto_3

    :cond_5
    :try_start_4
    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_6

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_6

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    const-string p1, "getAllCellInfo = null"

    invoke-virtual {p0, p1}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p0

    :goto_3
    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_4
    if-eqz v2, :cond_7

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final a()V
    .locals 2

    iget-object v0, p0, La/a/a/g/l/a;->C:Landroid/os/Handler;

    new-instance v1, La/a/a/g/l/a$a;

    invoke-direct {v1, p0}, La/a/a/g/l/a$a;-><init>(La/a/a/g/l/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    iget-boolean v0, p0, La/a/a/g/l/a;->u:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, La/a/a/g/l/a;->t:Landroid/content/Context;

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    iput-object p1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p1, La/a/a/g/l/a$e;

    invoke-direct {p1, p0}, La/a/a/g/l/a$e;-><init>(La/a/a/g/l/a;)V

    iput-object p1, p0, La/a/a/g/l/a;->p:La/a/a/g/l/a$e;

    :cond_1
    iget-object p1, p0, La/a/a/g/l/a;->C:Landroid/os/Handler;

    if-nez p1, :cond_2

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, La/a/a/g/l/a;->C:Landroid/os/Handler;

    :cond_2
    iget-boolean p1, p0, La/a/a/g/l/a;->g:Z

    if-eqz p1, :cond_3

    invoke-virtual {p0}, La/a/a/g/l/a;->c()V

    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v0, p0, La/a/a/g/l/a;->c:I

    if-lt p1, v0, :cond_5

    iget-object v0, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_4

    iget-object v0, p0, La/a/a/g/l/a;->t:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getMainExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    :cond_4
    const-string v0, "android.telephony.TelephonyManager$CellInfoCallback"

    invoke-static {v0}, La/a/a/g/m/b;->a(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, La/a/a/g/l/a;->w:Z

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_5

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_5

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isCellinfoCallbackExist = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, La/a/a/g/l/a;->w:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_a

    iget-object v1, p0, La/a/a/g/l/a;->p:La/a/a/g/l/a$e;

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    iget v2, p0, La/a/a/g/l/a;->c:I

    if-lt p1, v2, :cond_7

    iget-boolean p1, p0, La/a/a/g/l/a;->w:Z

    if-nez p1, :cond_8

    :cond_7
    const/16 p1, 0x500

    :try_start_0
    invoke-virtual {v0, v1, p1}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_8
    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_9

    sget-boolean p1, La/a/a/g/m/a;->b:Z

    if-eqz p1, :cond_9

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p1

    const-string v0, "cell manager start..."

    invoke-virtual {p1, v0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_9
    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/g/l/a;->u:Z

    :cond_a
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, La/a/a/g/l/a;->f:Z

    return-void
.end method

.method public a(La/a/a/g/a;La/a/a/g/a;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p1, :cond_9

    if-nez p2, :cond_1

    goto/16 :goto_2

    :cond_1
    iget v2, p1, La/a/a/g/a;->h:I

    iget v3, p2, La/a/a/g/a;->h:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    iget v3, p1, La/a/a/g/a;->h:I

    const/4 v4, -0x1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_0
    int-to-float v3, v3

    div-float/2addr v2, v3

    sget-boolean v3, La/a/a/g/m/a;->a:Z

    if-eqz v3, :cond_3

    sget-boolean v5, La/a/a/g/m/a;->b:Z

    if-eqz v5, :cond_3

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "cl-cache, str, old:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p1, La/a/a/g/a;->h:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " new:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p2, La/a/a/g/a;->h:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "cl-cache, str, diffRate:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p1, La/a/a/g/a;->m:Ljava/lang/String;

    if-eqz p1, :cond_5

    iget-object v5, p2, La/a/a/g/a;->m:Ljava/lang/String;

    if-eqz v5, :cond_5

    invoke-virtual {p0, p1}, La/a/a/g/l/a;->a(Ljava/lang/String;)I

    move-result p1

    iget-object p2, p2, La/a/a/g/a;->m:Ljava/lang/String;

    invoke-virtual {p0, p2}, La/a/a/g/l/a;->a(Ljava/lang/String;)I

    move-result p2

    sub-int p2, p1, p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-eqz p1, :cond_4

    move v4, p1

    :cond_4
    div-int/2addr p2, v4

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    iget p2, p0, La/a/a/g/l/a;->e:F

    cmpl-float p1, p1, p2

    if-lez p1, :cond_5

    move p1, v1

    goto :goto_1

    :cond_5
    move p1, v0

    :goto_1
    if-eqz v3, :cond_6

    sget-boolean p2, La/a/a/g/m/a;->b:Z

    if-eqz p2, :cond_6

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cl-cache, isStrengthChange2:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_6
    iget p0, p0, La/a/a/g/l/a;->e:F

    cmpl-float p0, v2, p0

    if-gtz p0, :cond_7

    if-eqz p1, :cond_8

    :cond_7
    move v0, v1

    :cond_8
    return v0

    :cond_9
    :goto_2
    return v1
.end method

.method public b(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x11

    if-ge v0, v2, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    iput v0, p0, La/a/a/g/l/a;->v:I

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_9

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v2, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/CellInfo;

    invoke-virtual {v3}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    const/4 v4, 0x1

    :cond_2
    invoke-virtual {p0, v3, p1, p2}, La/a/a/g/l/a;->a(Landroid/telephony/CellInfo;La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, La/a/a/g/a;->e()Z

    move-result v5

    if-nez v5, :cond_5

    sget-boolean v3, La/a/a/g/m/a;->a:Z

    if-eqz v3, :cond_4

    sget-boolean v3, La/a/a/g/m/a;->b:Z

    if-eqz v3, :cond_4

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v3

    const-string v4, "res.isValid()"

    invoke-virtual {v3, v4}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_4
    move-object v3, v1

    goto :goto_1

    :cond_5
    sget-boolean v5, La/a/a/g/m/a;->a:Z

    if-eqz v5, :cond_6

    sget-boolean v5, La/a/a/g/m/a;->b:Z

    if-eqz v5, :cond_6

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, " cell res.isValid() = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_6
    if-eqz v4, :cond_7

    if-eqz v2, :cond_7

    invoke-virtual {p0, v3}, La/a/a/g/l/a;->e(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, La/a/a/g/a;->m:Ljava/lang/String;

    invoke-virtual {p0, v3}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, La/a/a/g/a;->n:Ljava/lang/String;

    :cond_7
    :goto_1
    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_8
    move-object v1, v2

    goto :goto_2

    :cond_9
    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_a

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_a

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    const-string p1, "getAllCellInfo=null"

    invoke-virtual {p0, p1}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    sget-boolean p1, La/a/a/g/m/a;->a:Z

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_a
    :goto_2
    return-object v1
.end method

.method public b(La/a/a/g/a;)Ljava/lang/String;
    .locals 12

    const-string v0, "|"

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    const/16 v2, 0x80

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v2, "&nw="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-char v2, p1, La/a/a/g/a;->i:C

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p1, La/a/a/g/a;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget v4, p1, La/a/a/g/a;->d:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    iget v4, p1, La/a/a/g/a;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    iget-wide v8, p1, La/a/a/g/a;->b:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    iget v4, p1, La/a/a/g/a;->h:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v8, 0x4

    aput-object v4, v3, v8

    const-string v4, "&cl=%d|%d|%d|%d&cl_s=%d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p1, La/a/a/g/a;->e:I

    const v3, 0x7fffffff

    if-ge v2, v3, :cond_1

    iget v2, p1, La/a/a/g/a;->f:I

    if-ge v2, v3, :cond_1

    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    new-array v7, v7, [Ljava/lang/Object;

    int-to-double v8, v2

    const-wide v10, 0x40cc200000000000L    # 14400.0

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v7, v5

    iget v2, p1, La/a/a/g/a;->e:I

    int-to-double v8, v2

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v7, v6

    const-string v2, "&cdmall=%.6f|%.6f"

    invoke-static {v4, v2, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    const-string v2, "&cl_t="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-wide v6, p1, La/a/a/g/a;->g:J

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v2, "&cl_api="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p1, La/a/a/g/a;->l:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "&clp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p1, La/a/a/g/a;->k:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    iget-object v2, p1, La/a/a/g/a;->o:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v2, "&clnrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p1, La/a/a/g/a;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v2, v4, :cond_3

    iget v2, p1, La/a/a/g/a;->j:I

    if-eq v2, v3, :cond_3

    const-string v2, "&cl_cs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p1, La/a/a/g/a;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_3
    :try_start_0
    iget-object v2, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_9

    iget-object v2, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "&clt="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move v3, v5

    :goto_0
    if-ge v3, v2, :cond_9

    iget-object v4, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/a/a/g/a;

    if-eqz v4, :cond_8

    iget v6, v4, La/a/a/g/a;->c:I

    iget v7, p1, La/a/a/g/a;->c:I

    if-eq v6, v7, :cond_4

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v6, v4, La/a/a/g/a;->d:I

    iget v7, p1, La/a/a/g/a;->d:I

    if-eq v6, v7, :cond_5

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v6, v4, La/a/a/g/a;->a:I

    iget v7, p1, La/a/a/g/a;->a:I

    if-eq v6, v7, :cond_6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_6
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-wide v6, v4, La/a/a/g/a;->b:J

    iget-wide v8, p1, La/a/a/g/a;->b:J

    cmp-long v8, v6, v8

    if-eqz v8, :cond_7

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    :cond_7
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, v4, La/a/a/g/a;->g:J

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v4, ";"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    iget v0, p0, La/a/a/g/l/a;->v:I

    const/16 v2, 0x64

    if-le v0, v2, :cond_a

    iput v5, p0, La/a/a/g/l/a;->v:I

    :cond_a
    sget v0, La/a/a/g/l/a;->H:I

    shl-int/lit8 v0, v0, 0x8

    iget v2, p0, La/a/a/g/l/a;->v:I

    add-int/2addr v2, v0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_b

    sget-boolean v3, La/a/a/g/m/a;->b:Z

    if-eqz v3, :cond_b

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sim state:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, La/a/a/g/l/a;->v:I

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ","

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&cs="

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p0, p1, La/a/a/g/a;->m:Ljava/lang/String;

    if-eqz p0, :cond_c

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_c
    if-eqz v0, :cond_d

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_d

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "cell sb.toString() = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, La/a/a/g/l/a;->c:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, La/a/a/g/l/a;->g:Z

    return-void
.end method

.method public b()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/g/l/a;->B:Z

    return p0
.end method

.method public c(La/a/a/g/a;)Ljava/lang/String;
    .locals 3

    const-string v0, "&nc="

    const-string v1, ""

    :try_start_0
    invoke-virtual {p0, p1}, La/a/a/g/l/a;->a(La/a/a/g/a;)Ljava/lang/String;

    move-result-object p0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p0, :cond_0

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    const/16 v1, 0x11

    if-lt p1, v1, :cond_1

    return-object p0

    :cond_1
    move-object v1, p0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    return-object v1
.end method

.method public final c()V
    .locals 21

    move-object/from16 v0, p0

    const-string v1, " "

    iget-object v2, v0, La/a/a/g/l/a;->t:Landroid/content/Context;

    invoke-static {v2}, La/a/a/g/m/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "lcvif2.dat"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_b

    :try_start_0
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v6

    const-wide/32 v10, 0xea60

    cmp-long v8, v8, v10

    if-lez v8, :cond_2

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cellbuffer System.currentTimeMillis() - time > 1 *60 *1000"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    return-void

    :cond_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x3

    if-ge v7, v8, :cond_9

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v8

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v14

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v15

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v11

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v12

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v10

    sget-boolean v19, La/a/a/g/m/a;->a:Z

    if-eqz v19, :cond_3

    sget-boolean v16, La/a/a/g/m/a;->b:Z

    if-eqz v16, :cond_3

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cellbuffer cell info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_3
    const/4 v4, 0x1

    if-ne v10, v4, :cond_4

    const/16 v5, 0x67

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x2

    if-ne v10, v6, :cond_5

    const/16 v5, 0x63

    :cond_5
    move/from16 v17, v5

    const-wide/16 v5, 0x0

    cmp-long v10, v8, v5

    if-nez v10, :cond_6

    if-eqz v19, :cond_8

    sget-boolean v4, La/a/a/g/m/a;->b:Z

    if-eqz v4, :cond_8

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    const-string v8, "loc cell time1 == 0"

    :goto_2
    invoke-virtual {v4, v8}, La/a/a/g/e;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    new-instance v10, La/a/a/g/a;

    const/16 v16, 0x0

    const/16 v18, -0x1

    move-object/from16 v20, v10

    invoke-direct/range {v10 .. v18}, La/a/a/g/a;-><init>(IJIIICI)V

    iput-wide v8, v10, La/a/a/g/a;->g:J

    invoke-virtual {v10}, La/a/a/g/a;->e()Z

    move-result v8

    if-eqz v8, :cond_7

    iput-boolean v4, v0, La/a/a/g/l/a;->B:Z

    iget-object v4, v0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    if-eqz v19, :cond_8

    sget-boolean v4, La/a/a/g/m/a;->b:Z

    if-eqz v4, :cond_8

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "loc cell "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, La/a/a/g/l/a;->b(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_8
    :goto_3
    add-int/lit8 v7, v7, 0x1

    move-wide v4, v5

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_b
    :goto_4
    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, La/a/a/g/l/a;->d:I

    return-void
.end method

.method public d(La/a/a/g/a;)Ljava/util/HashSet;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/g/a;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_5

    :try_start_0
    iget-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/CellInfo;

    invoke-virtual {v2}, Landroid/telephony/CellInfo;->isRegistered()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget-object v4, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v2, v3, v4}, La/a/a/g/l/a;->a(Landroid/telephony/CellInfo;La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget v3, v2, La/a/a/g/a;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, -0x1

    const-string v5, ""

    if-eq v3, v4, :cond_3

    :try_start_1
    iget-wide v6, v2, La/a/a/g/a;->b:J

    const-wide/16 v8, -0x1

    cmp-long v4, v6, v8

    if-eqz v4, :cond_3

    iget v4, p1, La/a/a/g/a;->a:I

    if-eq v4, v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, v2, La/a/a/g/a;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, v2, La/a/a/g/a;->b:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v6, v2, La/a/a/g/a;->b:J

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_3
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_5

    const-string p0, "getAllCellInfo"

    const-string p1, "=null"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_2
    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, La/a/a/g/l/a;->q:La/a/a/g/l/a$d;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/g/l/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/a/a/g/l/a$d;-><init>(La/a/a/g/l/a;La/a/a/g/l/a$a;)V

    iput-object v0, p0, La/a/a/g/l/a;->q:La/a/a/g/l/a$d;

    :cond_0
    iget-object v0, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    iget-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    iget-object p0, p0, La/a/a/g/l/a;->q:La/a/a/g/l/a$d;

    invoke-virtual {v1, v0, p0}, Landroid/telephony/TelephonyManager;->requestCellInfoUpdate(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyManager$CellInfoCallback;)V

    :cond_1
    return-void
.end method

.method public final e(La/a/a/g/a;)Ljava/lang/String;
    .locals 4

    new-instance p0, Ljava/lang/StringBuffer;

    const/16 v0, 0x80

    invoke-direct {p0, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v0, "&nw2="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-char v0, p1, La/a/a/g/a;->i:C

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p1, La/a/a/g/a;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, La/a/a/g/a;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p1, La/a/a/g/a;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p1, La/a/a/g/a;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p1, La/a/a/g/a;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p1, La/a/a/g/a;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-wide v2, p1, La/a/a/g/a;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, "&cl2=%d|%d|%d|%d&cl_s2=%d&clp2=%d&cl_t2=%d"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v0, p1, La/a/a/g/a;->j:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    const-string v0, "&cl_cs2="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v0, p1, La/a/a/g/a;->j:I

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_0
    iget-object v0, p1, La/a/a/g/a;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, "&clnrs2="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p1, La/a/a/g/a;->o:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final e()V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/l/a;->x:J

    iget-boolean v0, p0, La/a/a/g/l/a;->f:Z

    if-nez v0, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/g/l/a;->k:Landroid/telephony/SubscriptionManager;

    if-nez v1, :cond_1

    iget-object v1, p0, La/a/a/g/l/a;->t:Landroid/content/Context;

    const-string v2, "telephony_subscription_service"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/SubscriptionManager;

    iput-object v1, p0, La/a/a/g/l/a;->k:Landroid/telephony/SubscriptionManager;

    :cond_1
    iget-object v1, p0, La/a/a/g/l/a;->k:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v1, v0}, Landroid/telephony/SubscriptionManager;->getSubscriptionIds(I)[I

    move-result-object v1

    iget-object v2, p0, La/a/a/g/l/a;->k:Landroid/telephony/SubscriptionManager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/telephony/SubscriptionManager;->getSubscriptionIds(I)[I

    move-result-object v2

    const/4 v4, -0x1

    if-eqz v1, :cond_2

    array-length v5, v1

    if-lez v5, :cond_2

    aget v1, v1, v0

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    if-eqz v2, :cond_3

    array-length v5, v2

    if-lez v5, :cond_3

    aget v4, v2, v0

    :cond_3
    invoke-static {v1}, Landroid/telephony/SubscriptionManager;->isValidSubscriptionId(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v4}, Landroid/telephony/SubscriptionManager;->isValidSubscriptionId(I)Z

    move-result v2

    if-eqz v2, :cond_4

    iput-boolean v3, p0, La/a/a/g/l/a;->z:Z

    goto :goto_1

    :cond_4
    iput-boolean v0, p0, La/a/a/g/l/a;->z:Z

    :goto_1
    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_5

    sget-boolean v2, La/a/a/g/m/a;->b:Z

    if-eqz v2, :cond_5

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getCellInfo: subId0 = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", subId1 = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", mLastSubId0 = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, La/a/a/g/l/a;->D:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", mLastSubId1 = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, La/a/a/g/l/a;->E:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_5
    invoke-static {v1}, Landroid/telephony/SubscriptionManager;->isValidSubscriptionId(I)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_9

    iget-object v2, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    if-nez v2, :cond_6

    iget-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    :goto_2
    invoke-virtual {v2, v1}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v2

    goto :goto_3

    :cond_6
    iget v2, p0, La/a/a/g/l/a;->D:I

    if-eq v2, v1, :cond_7

    iput-object v5, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    goto :goto_2

    :goto_3
    iput-object v2, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    :cond_7
    iget-object v2, p0, La/a/a/g/l/a;->r:La/a/a/g/l/a$b;

    if-nez v2, :cond_8

    new-instance v2, La/a/a/g/l/a$b;

    invoke-direct {v2, p0, v5}, La/a/a/g/l/a$b;-><init>(La/a/a/g/l/a;La/a/a/g/l/a$a;)V

    iput-object v2, p0, La/a/a/g/l/a;->r:La/a/a/g/l/a$b;

    :cond_8
    iget-object v2, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    if-eqz v2, :cond_a

    iget-object v6, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    if-eqz v6, :cond_a

    iget-object v7, p0, La/a/a/g/l/a;->r:La/a/a/g/l/a$b;

    invoke-virtual {v2, v6, v7}, Landroid/telephony/TelephonyManager;->requestCellInfoUpdate(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyManager$CellInfoCallback;)V

    move v0, v3

    goto :goto_4

    :cond_9
    iput-object v5, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    :cond_a
    :goto_4
    invoke-static {v4}, Landroid/telephony/SubscriptionManager;->isValidSubscriptionId(I)Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v2, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    if-nez v2, :cond_b

    iget-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    :goto_5
    invoke-virtual {v2, v4}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v2

    goto :goto_6

    :cond_b
    iget v2, p0, La/a/a/g/l/a;->E:I

    if-eq v2, v4, :cond_c

    iput-object v5, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    goto :goto_5

    :goto_6
    iput-object v2, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    :cond_c
    iget-object v2, p0, La/a/a/g/l/a;->s:La/a/a/g/l/a$c;

    if-nez v2, :cond_d

    new-instance v2, La/a/a/g/l/a$c;

    invoke-direct {v2, p0, v5}, La/a/a/g/l/a$c;-><init>(La/a/a/g/l/a;La/a/a/g/l/a$a;)V

    iput-object v2, p0, La/a/a/g/l/a;->s:La/a/a/g/l/a$c;

    :cond_d
    iget-object v2, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    if-eqz v2, :cond_f

    iget-object v5, p0, La/a/a/g/l/a;->o:Ljava/util/concurrent/Executor;

    if-eqz v5, :cond_f

    iget-object v6, p0, La/a/a/g/l/a;->s:La/a/a/g/l/a$c;

    invoke-virtual {v2, v5, v6}, Landroid/telephony/TelephonyManager;->requestCellInfoUpdate(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyManager$CellInfoCallback;)V

    move v0, v3

    goto :goto_7

    :cond_e
    iput-object v5, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    :cond_f
    :goto_7
    iput v1, p0, La/a/a/g/l/a;->D:I

    iput v4, p0, La/a/a/g/l/a;->E:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v1

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_10

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_10
    :goto_8
    if-nez v0, :cond_11

    :goto_9
    invoke-virtual {p0}, La/a/a/g/l/a;->d()V

    :cond_11
    iget-object v0, p0, La/a/a/g/l/a;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_12

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_12

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    const-string v2, "start waiting update to finish"

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_12
    iget v1, p0, La/a/a/g/l/a;->d:I

    if-eqz v1, :cond_13

    iget-object p0, p0, La/a/a/g/l/a;->F:Ljava/lang/Object;

    int-to-long v1, v1

    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_a

    :catchall_0
    move-exception p0

    goto :goto_b

    :catch_1
    move-exception p0

    :try_start_2
    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_13

    invoke-virtual {p0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :cond_13
    :goto_a
    monitor-exit v0

    return-void

    :goto_b
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public final f(La/a/a/g/a;)Ljava/lang/String;
    .locals 3

    sget-object p0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p1, La/a/a/g/a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p1, La/a/a/g/a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p1, La/a/a/g/a;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-wide v1, p1, La/a/a/g/a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    const-string p1, "%d|%d|%d|%d"

    invoke-static {p0, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public f()V
    .locals 3

    iget-boolean v0, p0, La/a/a/g/l/a;->u:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/g/l/a;->p:La/a/a/g/l/a$e;

    if-eqz v1, :cond_1

    iget-object v2, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1, v0}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, La/a/a/g/l/a;->p:La/a/a/g/l/a$e;

    iput-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    iput-object v1, p0, La/a/a/g/l/a;->i:Landroid/telephony/TelephonyManager;

    iput-object v1, p0, La/a/a/g/l/a;->j:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iput-object v1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    :cond_2
    iget-boolean v1, p0, La/a/a/g/l/a;->g:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0}, La/a/a/g/l/a;->h()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-boolean v2, La/a/a/g/m/a;->a:Z

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_4

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_4

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    const-string v2, "cell manager stop ..."

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_4
    iput-boolean v0, p0, La/a/a/g/l/a;->u:Z

    return-void
.end method

.method public final declared-synchronized g()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v0, v1}, La/a/a/g/l/a;->b(La/a/a/g/a;Landroid/telephony/TelephonyManager;)La/a/a/g/a;

    move-result-object v0

    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_0

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "new cell api = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, La/a/a/g/l/a;->g(La/a/a/g/a;)V

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-gt v1, v2, :cond_4

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La/a/a/g/a;->e()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_4

    :cond_2
    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, La/a/a/g/l/a;->h:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_3

    :try_start_2
    invoke-virtual {p0, v1}, La/a/a/g/l/a;->a(Landroid/telephony/CellLocation;)La/a/a/g/a;

    move-result-object v0

    :cond_3
    sget-boolean v1, La/a/a/g/m/a;->a:Z

    if-eqz v1, :cond_4

    sget-boolean v1, La/a/a/g/m/a;->b:Z

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " old cell api = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, La/a/a/g/l/a;->f(La/a/a/g/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, La/a/a/g/e;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_4
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g(La/a/a/g/a;)V
    .locals 5

    iget-object v0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    invoke-virtual {p1}, La/a/a/g/a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, La/a/a/g/a;->a(La/a/a/g/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    invoke-virtual {p0, v1, p1}, La/a/a/g/l/a;->a(La/a/a/g/a;La/a/a/g/a;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iput-object p1, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    :cond_1
    invoke-virtual {p1}, La/a/a/g/a;->e()Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, La/a/a/g/a;->a(La/a/a/g/a;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_2
    invoke-virtual {p1}, La/a/a/g/a;->e()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    iget-object v0, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    add-int/lit8 p1, p1, -0x1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/a/a/g/a;

    :goto_0
    if-eqz p1, :cond_4

    iget-wide v0, p1, La/a/a/g/a;->b:J

    iget-object v2, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    iget-wide v3, v2, La/a/a/g/a;->b:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_4

    iget p1, p1, La/a/a/g/a;->a:I

    iget v0, v2, La/a/a/g/a;->a:I

    if-eq p1, v0, :cond_8

    :cond_4
    iget-object p1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    iget-object v0, p0, La/a/a/g/l/a;->l:La/a/a/g/a;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-le p1, v0, :cond_5

    iget-object p1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_5
    iget-boolean p1, p0, La/a/a/g/l/a;->g:Z

    if-eqz p1, :cond_6

    invoke-virtual {p0}, La/a/a/g/l/a;->h()V

    :cond_6
    iput-boolean v1, p0, La/a/a/g/l/a;->B:Z

    goto :goto_1

    :cond_7
    iget-object p0, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    if-eqz p0, :cond_8

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_8
    :goto_1
    return-void
.end method

.method public final h()V
    .locals 9

    iget-object v0, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v1, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    if-nez v1, :cond_1

    sget-boolean p0, La/a/a/g/m/a;->a:Z

    if-eqz p0, :cond_0

    sget-boolean p0, La/a/a/g/m/a;->b:Z

    if-eqz p0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object p0

    const-string v0, "cellbuffer mTrackList == null"

    invoke-virtual {p0, v0}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    iget-object v1, p0, La/a/a/g/l/a;->m:La/a/a/g/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, La/a/a/g/l/a;->t:Landroid/content/Context;

    invoke-static {v0}, La/a/a/g/m/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    if-eqz v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "lcvif2.dat"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v3, "rw"

    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v1, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    add-int/lit8 v5, v0, -0x1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/g/a;

    iget-wide v5, v1, La/a/a/g/a;->g:J

    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->writeLong(J)V

    invoke-virtual {v2, v0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const/4 v1, 0x0

    move v5, v1

    :goto_0
    const/4 v6, 0x3

    rsub-int/lit8 v7, v0, 0x3

    const/4 v8, 0x2

    if-ge v5, v7, :cond_5

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->writeLong(J)V

    const/4 v6, -0x1

    invoke-virtual {v2, v6}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v2, v6}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v2, v6}, Ljava/io/RandomAccessFile;->writeInt(I)V

    const-wide/16 v6, -0x1

    invoke-virtual {v2, v6, v7}, Ljava/io/RandomAccessFile;->writeLong(J)V

    invoke-virtual {v2, v8}, Ljava/io/RandomAccessFile;->writeInt(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-ge v1, v0, :cond_8

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget-wide v3, v3, La/a/a/g/a;->g:J

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget v3, v3, La/a/a/g/a;->c:I

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget v3, v3, La/a/a/g/a;->d:I

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget v3, v3, La/a/a/g/a;->a:I

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget-wide v3, v3, La/a/a/g/a;->b:J

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget-char v3, v3, La/a/a/g/a;->i:C

    const/16 v4, 0x67

    if-ne v3, v4, :cond_6

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->writeInt(I)V

    goto :goto_2

    :cond_6
    iget-object v3, p0, La/a/a/g/l/a;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/g/a;

    iget-char v3, v3, La/a/a/g/a;->i:C

    const/16 v4, 0x63

    if-ne v3, v4, :cond_7

    invoke-virtual {v2, v8}, Ljava/io/RandomAccessFile;->writeInt(I)V

    goto :goto_2

    :cond_7
    invoke-virtual {v2, v6}, Ljava/io/RandomAccessFile;->writeInt(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_3
    return-void
.end method
