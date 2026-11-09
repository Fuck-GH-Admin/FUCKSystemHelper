.class public La/a/a/d/m/c/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/d/m/c/a$f;,
        La/a/a/d/m/c/a$c;,
        La/a/a/d/m/c/a$b;,
        La/a/a/d/m/c/a$e;,
        La/a/a/d/m/c/a$d;
    }
.end annotation


# static fields
.field public static j:La/a/a/d/m/c/a;


# instance fields
.field public a:La/a/a/d/m/c/a$d;

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "La/a/a/d/m/c/a$e;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[[D>;"
        }
    .end annotation
.end field

.field public i:La/a/a/d/m/c/a$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/m/c/a;->c:Z

    const-string v1, "rn"

    iput-object v1, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    const-string v1, "gcj02"

    iput-object v1, p0, La/a/a/d/m/c/a;->e:Ljava/lang/String;

    iput-boolean v0, p0, La/a/a/d/m/c/a;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/d/m/c/a;->i:La/a/a/d/m/c/a$e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/a/a/d/m/c/a;->h:Ljava/util/HashMap;

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    iget-object v1, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)La/a/a/d/m/c/a;
    .locals 1

    sget-object v0, La/a/a/d/m/c/a;->j:La/a/a/d/m/c/a;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/d/m/c/a;

    invoke-direct {v0, p0}, La/a/a/d/m/c/a;-><init>(Landroid/content/Context;)V

    sput-object v0, La/a/a/d/m/c/a;->j:La/a/a/d/m/c/a;

    :cond_0
    sget-object p0, La/a/a/d/m/c/a;->j:La/a/a/d/m/c/a;

    return-object p0
.end method

.method public static synthetic a(La/a/a/d/m/c/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(La/a/a/d/m/c/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/d/m/c/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v4, 0x0

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p0

    const-string v2, "MD5"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/security/MessageDigest;->update(Ljava/nio/ByteBuffer;)V

    new-instance p0, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-direct {p0, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    const/16 v2, 0x10

    invoke-virtual {p0, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    rsub-int/lit8 p0, p0, 0x20

    :goto_0
    if-lez p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_0
    return-object v0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0
.end method

.method public static synthetic a(La/a/a/d/m/c/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/m/c/a;->f:Z

    return p1
.end method

.method public static synthetic b(La/a/a/d/m/c/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La/a/a/d/m/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(La/a/a/d/m/c/a;)Z
    .locals 0

    invoke-virtual {p0}, La/a/a/d/m/c/a;->c()Z

    move-result p0

    return p0
.end method

.method public static synthetic b(La/a/a/d/m/c/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/m/c/a;->c:Z

    return p1
.end method

.method public static synthetic c(La/a/a/d/m/c/a;)La/a/a/d/m/c/a$d;
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a;->a:La/a/a/d/m/c/a$d;

    return-object p0
.end method

.method public static d()La/a/a/d/m/c/a;
    .locals 1

    sget-object v0, La/a/a/d/m/c/a;->j:La/a/a/d/m/c/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, La/a/a/d/m/c/a;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/d/m/c/a;->c:Z

    return-void
.end method

.method public a(DD)V
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v10, p1

    move-wide/from16 v12, p3

    iget-object v1, v0, La/a/a/d/m/c/a;->i:La/a/a/d/m/c/a$e;

    if-nez v1, :cond_0

    const/4 v1, 0x2

    new-array v14, v1, [F

    new-array v15, v1, [F

    const-wide v16, 0x3f847ae147ae147bL    # 0.01

    add-double v7, v10, v16

    add-double v18, v12, v16

    move-wide/from16 v1, p3

    move-wide/from16 v3, p1

    move-wide/from16 v5, p3

    move-object v9, v14

    invoke-static/range {v1 .. v9}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/16 v20, 0x0

    aget v1, v14, v20

    float-to-double v1, v1

    div-double v7, v1, v16

    move-wide/from16 v1, p3

    move-wide/from16 v5, v18

    move-wide v12, v7

    move-wide/from16 v7, p1

    move-object v9, v15

    invoke-static/range {v1 .. v9}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    aget v1, v15, v20

    float-to-double v1, v1

    div-double v1, v1, v16

    new-instance v3, La/a/a/d/m/c/a$e;

    const-string v4, "outdoor"

    invoke-direct {v3, v4}, La/a/a/d/m/c/a$e;-><init>(Ljava/lang/String;)V

    iput-object v3, v0, La/a/a/d/m/c/a;->i:La/a/a/d/m/c/a$e;

    const-string v0, "out"

    iput-object v0, v3, La/a/a/d/m/c/a$e;->b:Ljava/lang/String;

    new-instance v0, La/a/a/d/m/c/a$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "0|1.0|"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, "|"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-double v6, v10

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, p3

    neg-double v1, v1

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "|0|0"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, La/a/a/d/m/c/a$b;-><init>(Ljava/lang/String;)V

    iput-object v0, v3, La/a/a/d/m/c/a$e;->g:La/a/a/d/m/c/a$b;

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, La/a/a/d/m/c/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/d/m/c/a;->c:Z

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, La/a/a/d/m/c/a$c;

    invoke-direct {v1, p0, p1, v0}, La/a/a/d/m/c/a$c;-><init>(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public a(Ljava/lang/String;La/a/a/d/m/c/a$d;)V
    .locals 1

    iget-object v0, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, La/a/a/d/m/c/a;->f:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iput-object p2, p0, La/a/a/d/m/c/a;->a:La/a/a/d/m/c/a$d;

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->h(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->i(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    iput-object p1, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    invoke-virtual {p0}, La/a/a/d/m/c/a;->c()Z

    iget-object p0, p0, La/a/a/d/m/c/a;->a:La/a/a/d/m/c/a$d;

    if-eqz p0, :cond_2

    const/4 p1, 0x1

    const-string p2, "OK"

    invoke-interface {p0, p1, p2}, La/a/a/d/m/c/a$d;->a(ZLjava/lang/String;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, La/a/a/d/m/c/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public b()La/a/a/d/m/c/a$e;
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a;->i:La/a/a/d/m/c/a$e;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x1

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-double v1, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2e

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, v0, 0x1

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v2, v0

    move v0, v1

    move-wide v1, v2

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public final c()Z
    .locals 6

    iget-object v0, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, v0}, La/a/a/d/m/c/a;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v0, v2}, La/a/a/d/m/c/c;->a(Ljava/io/File;Ljava/io/ByteArrayOutputStream;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, La/a/a/d/m/c/a;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "\\t"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v2

    const-string v5, "_"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v1

    const-string v5, "geo"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v3}, La/a/a/d/m/c/a;->j(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v4, La/a/a/d/m/c/a$e;

    iget-object v5, p0, La/a/a/d/m/c/a;->b:Ljava/lang/String;

    invoke-direct {v4, v5}, La/a/a/d/m/c/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, La/a/a/d/m/c/a$e;->a(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/d/m/c/a;->e:Ljava/lang/String;

    invoke-virtual {v4, v3}, La/a/a/d/m/c/a$e;->b(Ljava/lang/String;)V

    iget-object v3, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    iget-object v5, v4, La/a/a/d/m/c/a$e;->b:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    return v2

    :cond_3
    return v1
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, La/a/a/d/m/c/a$a;

    invoke-direct {v1, p0, p1}, La/a/a/d/m/c/a$a;-><init>(La/a/a/d/m/c/a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_3

    array-length v0, p0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    aget-object p0, p0, p1

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "_"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x2

    if-ge p1, v0, :cond_2

    return-object v2

    :cond_2
    aget-object p0, p0, v1

    return-object p0

    :cond_3
    :goto_0
    if-eqz p0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    aget-object v0, p0, p1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-object v2
.end method

.method public final e(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, La/a/a/d/m/c/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, v0}, La/a/a/d/m/c/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public f(Ljava/lang/String;)[[D
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a;->h:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [[D

    return-object p0
.end method

.method public g(Ljava/lang/String;)La/a/a/d/m/c/a$e;
    .locals 0

    iget-object p0, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/a/a/d/m/c/a$e;

    return-object p0
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    const-wide/32 p0, 0x4d3f6400

    cmp-long p0, v0, p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final j(Ljava/lang/String;)V
    .locals 11

    const-string v0, "\\t"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v1, p1, v0

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x5

    aget-object p1, p1, v2

    invoke-virtual {p0, p1}, La/a/a/d/m/c/a;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/a/a/d/m/c/a$e;

    iget-object v2, v2, La/a/a/d/m/c/a$e;->h:[[S

    array-length v2, v2

    iget-object v3, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/a/a/d/m/c/a$e;

    iget-object v3, v3, La/a/a/d/m/c/a$e;->h:[[S

    const/4 v4, 0x0

    aget-object v3, v3, v4

    array-length v3, v3

    const/4 v5, 0x2

    new-array v5, v5, [I

    aput v3, v5, v0

    aput v2, v5, v4

    const-class v0, D

    invoke-static {v0, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[D

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v5, v2, :cond_3

    move v7, v4

    :goto_1
    if-ge v7, v3, :cond_2

    iget-object v8, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/a/a/d/m/c/a$e;

    iget-object v8, v8, La/a/a/d/m/c/a$e;->h:[[S

    aget-object v8, v8, v5

    aget-short v8, v8, v7

    if-lez v8, :cond_1

    iget-object v8, p0, La/a/a/d/m/c/a;->g:Ljava/util/HashMap;

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/a/a/d/m/c/a$e;

    iget-object v8, v8, La/a/a/d/m/c/a$e;->h:[[S

    aget-object v8, v8, v5

    aget-short v8, v8, v7

    const/16 v9, 0x9

    if-eq v8, v9, :cond_1

    aget-object v8, v0, v5

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Double;

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    aput-wide v9, v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    aget-object v8, v0, v5

    const-wide/16 v9, 0x0

    aput-wide v9, v8, v7

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget-object p0, p0, La/a/a/d/m/c/a;->h:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/m/c/a;->e:Ljava/lang/String;

    return-void
.end method
