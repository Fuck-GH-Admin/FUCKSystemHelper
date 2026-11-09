.class public Lc/a/b/e/a/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Ljava/security/SecureRandom;


# instance fields
.field private a:Lc/a/b/e/a/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lc/a/b/e/a/c;->b:Ljava/security/SecureRandom;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/b/e/a/c;->a:Lc/a/b/e/a/e;

    new-instance v0, Lc/a/b/e/a/e;

    new-instance v1, Lc/a/b/e/a/b;

    invoke-direct {v1}, Lc/a/b/e/a/b;-><init>()V

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lc/a/b/e/a/e;-><init>(Lc/a/b/e/a/b;I)V

    iput-object v0, p0, Lc/a/b/e/a/c;->a:Lc/a/b/e/a/e;

    return-void
.end method

.method public static a([B[B[B)[B
    .locals 2

    new-instance v0, Lc/a/b/e/a/c;

    invoke-direct {v0}, Lc/a/b/e/a/c;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p0, p1}, Lc/a/b/e/a/c;->a(I[B[B)V

    invoke-virtual {v0, p2}, Lc/a/b/e/a/c;->a([B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I[B[B)V
    .locals 1

    iget-object p0, p0, Lc/a/b/e/a/c;->a:Lc/a/b/e/a/e;

    sget-object v0, Lc/a/b/e/a/c;->b:Ljava/security/SecureRandom;

    invoke-virtual {p0, p1, p2, p3, v0}, Lc/a/b/e/a/e;->a(I[B[BLjava/security/SecureRandom;)V

    return-void
.end method

.method public final a([B)[B
    .locals 2

    if-eqz p1, :cond_0

    iget-object p0, p0, Lc/a/b/e/a/c;->a:Lc/a/b/e/a/e;

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lc/a/b/e/a/e;->a([BII)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Null input buffer"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
