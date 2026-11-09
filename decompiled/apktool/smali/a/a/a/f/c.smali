.class public final La/a/a/f/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/f/c$b;
    }
.end annotation


# instance fields
.field public final a:La/a/a/f/d;

.field public final b:Landroid/database/sqlite/SQLiteDatabase;

.field public final c:La/a/a/f/c$b;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:[Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:D

.field public p:D

.field public q:D

.field public r:D

.field public s:D

.field public t:I

.field public u:Z

.field public v:J

.field public w:J

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(La/a/a/f/d;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/f/c;->u:Z

    const-wide/16 v0, 0x1f40

    iput-wide v0, p0, La/a/a/f/c;->v:J

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, La/a/a/f/c;->w:J

    iput-wide v0, p0, La/a/a/f/c;->x:J

    iput-wide v0, p0, La/a/a/f/c;->y:J

    iput-wide v0, p0, La/a/a/f/c;->z:J

    iput-object p1, p0, La/a/a/f/c;->a:La/a/a/f/d;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/f/c;->d:Z

    iput-boolean p1, p0, La/a/a/f/c;->e:Z

    iput-boolean p1, p0, La/a/a/f/c;->f:Z

    iput-boolean p1, p0, La/a/a/f/c;->g:Z

    iput-boolean p1, p0, La/a/a/f/c;->h:Z

    iput-boolean p1, p0, La/a/a/f/c;->j:Z

    iput-boolean p1, p0, La/a/a/f/c;->k:Z

    const/4 v0, 0x6

    iput v0, p0, La/a/a/f/c;->l:I

    const/16 v0, 0x1e

    iput v0, p0, La/a/a/f/c;->m:I

    iput v0, p0, La/a/a/f/c;->n:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/f/c;->o:D

    iput-wide v0, p0, La/a/a/f/c;->p:D

    iput-wide v0, p0, La/a/a/f/c;->q:D

    iput-wide v0, p0, La/a/a/f/c;->r:D

    iput-wide v0, p0, La/a/a/f/c;->s:D

    const/16 v0, 0x8

    iput v0, p0, La/a/a/f/c;->t:I

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, La/a/a/f/c;->i:[Ljava/lang/String;

    iput-object p2, p0, La/a/a/f/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p1, La/a/a/f/c$b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, La/a/a/f/c$b;-><init>(La/a/a/f/c;La/a/a/f/c$a;)V

    iput-object p1, p0, La/a/a/f/c;->c:La/a/a/f/c$b;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result p1

    if-eqz p1, :cond_0

    :try_start_0
    const-string p1, "CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);"

    invoke-virtual {p2, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-virtual {p0}, La/a/a/f/c;->a()V

    return-void
.end method

.method public static synthetic a(La/a/a/f/c;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->o:D

    return-wide p1
.end method

.method public static synthetic a(La/a/a/f/c;)I
    .locals 0

    iget p0, p0, La/a/a/f/c;->l:I

    return p0
.end method

.method public static synthetic a(La/a/a/f/c;I)I
    .locals 0

    iput p1, p0, La/a/a/f/c;->l:I

    return p1
.end method

.method public static synthetic a(La/a/a/f/c;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->z:J

    return-wide p1
.end method

.method public static synthetic a(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->d:Z

    return p1
.end method

.method public static synthetic a(La/a/a/f/c;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La/a/a/f/c;->i:[Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(La/a/a/f/c;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->p:D

    return-wide p1
.end method

.method public static synthetic b(La/a/a/f/c;)I
    .locals 0

    iget p0, p0, La/a/a/f/c;->n:I

    return p0
.end method

.method public static synthetic b(La/a/a/f/c;I)I
    .locals 0

    iput p1, p0, La/a/a/f/c;->n:I

    return p1
.end method

.method public static synthetic b(La/a/a/f/c;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->y:J

    return-wide p1
.end method

.method public static synthetic b(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->e:Z

    return p1
.end method

.method public static synthetic c(La/a/a/f/c;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->q:D

    return-wide p1
.end method

.method public static synthetic c(La/a/a/f/c;)I
    .locals 0

    iget p0, p0, La/a/a/f/c;->m:I

    return p0
.end method

.method public static synthetic c(La/a/a/f/c;I)I
    .locals 0

    iput p1, p0, La/a/a/f/c;->m:I

    return p1
.end method

.method public static synthetic c(La/a/a/f/c;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->v:J

    return-wide p1
.end method

.method public static synthetic c(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->f:Z

    return p1
.end method

.method public static synthetic d(La/a/a/f/c;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->o:D

    return-wide v0
.end method

.method public static synthetic d(La/a/a/f/c;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->r:D

    return-wide p1
.end method

.method public static synthetic d(La/a/a/f/c;I)I
    .locals 0

    iput p1, p0, La/a/a/f/c;->t:I

    return p1
.end method

.method public static synthetic d(La/a/a/f/c;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->w:J

    return-wide p1
.end method

.method public static synthetic d(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->g:Z

    return p1
.end method

.method public static synthetic e(La/a/a/f/c;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->p:D

    return-wide v0
.end method

.method public static synthetic e(La/a/a/f/c;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->s:D

    return-wide p1
.end method

.method public static synthetic e(La/a/a/f/c;J)J
    .locals 0

    iput-wide p1, p0, La/a/a/f/c;->x:J

    return-wide p1
.end method

.method public static synthetic e(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->h:Z

    return p1
.end method

.method public static synthetic f(La/a/a/f/c;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->q:D

    return-wide v0
.end method

.method public static synthetic f(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->j:Z

    return p1
.end method

.method public static synthetic g(La/a/a/f/c;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->r:D

    return-wide v0
.end method

.method public static synthetic g(La/a/a/f/c;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/f/c;->k:Z

    return p1
.end method

.method public static synthetic h(La/a/a/f/c;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->s:D

    return-wide v0
.end method

.method public static synthetic i(La/a/a/f/c;)J
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->z:J

    return-wide v0
.end method

.method public static synthetic j(La/a/a/f/c;)J
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->y:J

    return-wide v0
.end method

.method public static synthetic k(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->d:Z

    return p0
.end method

.method public static synthetic l(La/a/a/f/c;)J
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->v:J

    return-wide v0
.end method

.method public static synthetic m(La/a/a/f/c;)J
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->w:J

    return-wide v0
.end method

.method public static synthetic n(La/a/a/f/c;)J
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->x:J

    return-wide v0
.end method

.method public static synthetic o(La/a/a/f/c;)I
    .locals 0

    iget p0, p0, La/a/a/f/c;->t:I

    return p0
.end method

.method public static synthetic p(La/a/a/f/c;)La/a/a/f/d;
    .locals 0

    iget-object p0, p0, La/a/a/f/c;->a:La/a/a/f/d;

    return-object p0
.end method

.method public static synthetic q(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->e:Z

    return p0
.end method

.method public static synthetic r(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->f:Z

    return p0
.end method

.method public static synthetic s(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->g:Z

    return p0
.end method

.method public static synthetic t(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->h:Z

    return p0
.end method

.method public static synthetic u(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->j:Z

    return p0
.end method

.method public static synthetic v(La/a/a/f/c;)Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->k:Z

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 1

    const-string v0, "2G"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide p0, p0, La/a/a/f/c;->v:J

    goto :goto_0

    :cond_0
    const-string v0, "3G"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide p0, p0, La/a/a/f/c;->w:J

    goto :goto_0

    :cond_1
    const-string v0, "4G"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide p0, p0, La/a/a/f/c;->x:J

    goto :goto_0

    :cond_2
    const-string v0, "WIFI"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide p0, p0, La/a/a/f/c;->y:J

    goto :goto_0

    :cond_3
    const-string v0, "unknown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-wide p0, p0, La/a/a/f/c;->z:J

    goto :goto_0

    :cond_4
    const-wide/16 p0, 0x1388

    :goto_0
    return-wide p0
.end method

.method public a()V
    .locals 0

    iget-object p0, p0, La/a/a/f/c;->c:La/a/a/f/c$b;

    if-eqz p0, :cond_0

    invoke-static {p0}, La/a/a/f/c$b;->a(La/a/a/f/c$b;)V

    :cond_0
    return-void
.end method

.method public a([Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_1

    if-lez v2, :cond_0

    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string v3, "(\""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    aget-object v3, p1, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "\")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/a/a/f/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    if-lez p1, :cond_2

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    const-string v0, "INSERT OR IGNORE INTO BLACK VALUES %s;"

    invoke-static {p1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    iget-object p0, p0, La/a/a/f/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method public b()I
    .locals 0

    iget p0, p0, La/a/a/f/c;->n:I

    return p0
.end method

.method public c()I
    .locals 0

    iget p0, p0, La/a/a/f/c;->l:I

    return p0
.end method

.method public d()I
    .locals 0

    iget p0, p0, La/a/a/f/c;->t:I

    return p0
.end method

.method public e()I
    .locals 0

    iget p0, p0, La/a/a/f/c;->m:I

    return p0
.end method

.method public f()D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->q:D

    return-wide v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->r:D

    return-wide v0
.end method

.method public h()D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->s:D

    return-wide v0
.end method

.method public i()D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->o:D

    return-wide v0
.end method

.method public j()D
    .locals 2

    iget-wide v0, p0, La/a/a/f/c;->p:D

    return-wide v0
.end method

.method public k()[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/f/c;->i:[Ljava/lang/String;

    return-object p0
.end method

.method public l()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->e:Z

    return p0
.end method

.method public m()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->d:Z

    return p0
.end method

.method public n()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->j:Z

    return p0
.end method

.method public o()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->u:Z

    return p0
.end method

.method public p()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->g:Z

    return p0
.end method

.method public q()Z
    .locals 0

    iget-boolean p0, p0, La/a/a/f/c;->f:Z

    return p0
.end method
