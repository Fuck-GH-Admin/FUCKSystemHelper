.class public Lc/a/b/e/d/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lc/a/b/e/d/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lc/a/b/e/d/a;
    .locals 3

    new-instance v0, Lc/a/b/e/d/a;

    invoke-direct {v0}, Lc/a/b/e/d/a;-><init>()V

    new-instance v1, Lc/a/b/e/d/c;

    invoke-direct {v1}, Lc/a/b/e/d/c;-><init>()V

    iput-object v1, v0, Lc/a/b/e/d/a;->a:Lc/a/b/e/d/c;

    const-string v2, "PKCS1Padding"

    invoke-virtual {v1, v2}, Lc/a/b/e/d/c;->a(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(ILc/a/b/e/d/d;)V
    .locals 1

    iget-object p0, p0, Lc/a/b/e/d/a;->a:Lc/a/b/e/d/c;

    sget-object v0, Lc/a/b/e/d/b;->a:Ljava/security/SecureRandom;

    invoke-virtual {p0, p1, p2, v0}, Lc/a/b/e/d/c;->a(ILc/a/b/e/d/d;Ljava/security/SecureRandom;)V

    return-void
.end method

.method public final a([B)[B
    .locals 2

    if-eqz p1, :cond_0

    iget-object p0, p0, Lc/a/b/e/d/a;->a:Lc/a/b/e/d/c;

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lc/a/b/e/d/c;->a([BII)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Null input buffer"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
