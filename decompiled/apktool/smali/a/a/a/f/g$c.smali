.class public abstract enum La/a/a/f/g$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/a/a/f/g$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum g:La/a/a/f/g$c;

.field public static final enum h:La/a/a/f/g$c;

.field public static final enum i:La/a/a/f/g$c;

.field public static final enum j:La/a/a/f/g$c;

.field public static final synthetic k:[La/a/a/f/g$c;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 25

    new-instance v8, La/a/a/f/g$c$a;

    const-string v1, "AREA"

    const/4 v2, 0x0

    const-string v3, "RGCAREA"

    const-string v4, "area"

    const-string v5, "addrv"

    const/4 v6, 0x0

    const/16 v7, 0x3e8

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, La/a/a/f/g$c$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    sput-object v8, La/a/a/f/g$c;->g:La/a/a/f/g$c;

    new-instance v0, La/a/a/f/g$c$b;

    const-string v10, "ROAD"

    const/4 v11, 0x1

    const-string v12, "RGCROAD"

    const-string v13, "road"

    const-string v14, "addrv"

    const/16 v15, 0x3e8

    const/16 v16, 0x2710

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, La/a/a/f/g$c$b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    sput-object v0, La/a/a/f/g$c;->h:La/a/a/f/g$c;

    new-instance v1, La/a/a/f/g$c$c;

    const-string v18, "SITE"

    const/16 v19, 0x2

    const-string v20, "RGCSITE"

    const-string v21, "site"

    const-string v22, "addrv"

    const/16 v23, 0x64

    const v24, 0xc350

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v24}, La/a/a/f/g$c$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    sput-object v1, La/a/a/f/g$c;->i:La/a/a/f/g$c;

    new-instance v2, La/a/a/f/g$c$d;

    const-string v10, "POI"

    const/4 v11, 0x3

    const-string v12, "RGCPOI"

    const-string v13, "poi"

    const-string v14, "poiv"

    const/16 v16, 0x1388

    move-object v9, v2

    invoke-direct/range {v9 .. v16}, La/a/a/f/g$c$d;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    sput-object v2, La/a/a/f/g$c;->j:La/a/a/f/g$c;

    const/4 v3, 0x4

    new-array v3, v3, [La/a/a/f/g$c;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    sput-object v3, La/a/a/f/g$c;->k:[La/a/a/f/g$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, La/a/a/f/g$c;->c:Ljava/lang/String;

    iput-object p4, p0, La/a/a/f/g$c;->d:Ljava/lang/String;

    iput-object p5, p0, La/a/a/f/g$c;->e:Ljava/lang/String;

    iput p6, p0, La/a/a/f/g$c;->b:I

    iput p7, p0, La/a/a/f/g$c;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILa/a/a/f/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, La/a/a/f/g$c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/g$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/f/g$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(La/a/a/f/g$c;IDD)Ljava/lang/String;
    .locals 0

    invoke-virtual/range {p0 .. p5}, La/a/a/f/g$c;->a(IDD)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(La/a/a/f/g$c;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/f/g$c;->a(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, La/a/a/f/g$c;->b(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b(La/a/a/f/g$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/a/a/f/g$c;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static b(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    const-string v1, ","

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string v0, "(\""

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "\",\""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "\","

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    const-wide/32 v0, 0x5265c00

    div-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public static synthetic c(La/a/a/f/g$c;)I
    .locals 0

    iget p0, p0, La/a/a/f/g$c;->f:I

    return p0
.end method

.method public static synthetic d(La/a/a/f/g$c;)I
    .locals 0

    iget p0, p0, La/a/a/f/g$c;->b:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)La/a/a/f/g$c;
    .locals 1

    const-class v0, La/a/a/f/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/a/a/f/g$c;

    return-object p0
.end method

.method public static values()[La/a/a/f/g$c;
    .locals 1

    sget-object v0, La/a/a/f/g$c;->k:[La/a/a/f/g$c;

    invoke-virtual {v0}, [La/a/a/f/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/f/g$c;

    return-object v0
.end method


# virtual methods
.method public final a(IDD)Ljava/lang/String;
    .locals 15

    move-object v0, p0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-static/range {p1 .. p5}, La/a/a/f/g;->a(IDD)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget v2, v0, La/a/a/f/g$c;->b:I

    int-to-double v3, v2

    const-wide v5, 0x3ff69fbe76c8b439L    # 1.414

    mul-double/2addr v3, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v2, :cond_0

    move v2, v5

    :goto_0
    invoke-static {}, La/a/a/f/g;->c()[D

    move-result-object v7

    array-length v7, v7

    if-ge v2, v7, :cond_0

    invoke-static {}, La/a/a/f/g;->c()[D

    move-result-object v7

    aget-wide v13, v7, v2

    move-wide/from16 v7, p4

    move-wide/from16 v9, p2

    move-wide v11, v3

    invoke-static/range {v7 .. v14}, La/a/a/f/g;->b(DDDD)[D

    move-result-object v7

    aget-wide v8, v7, v6

    aget-wide v10, v7, v5

    move/from16 v7, p1

    invoke-static {v7, v8, v9, v10, v11}, La/a/a/f/g;->a(IDD)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v6

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_2

    :cond_1
    const/16 v7, 0x2c

    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_2
    const-string v7, "\""

    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v0, v0, La/a/a/f/g$c;->c:Ljava/lang/String;

    aput-object v0, v1, v5

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v6

    const-string v0, "SELECT * FROM %s WHERE gridkey IN (%s);"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object p0, p0, La/a/a/f/g$c;->c:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object v0, v1, p0

    const-string p0, "DELETE FROM %s WHERE gridkey IN (%s)"

    invoke-static {p1, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract a(Lorg/json/JSONObject;Ljava/lang/String;I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
