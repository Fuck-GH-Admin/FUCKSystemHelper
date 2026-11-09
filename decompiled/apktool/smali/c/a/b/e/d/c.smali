.class public final Lc/a/b/e/d/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lc/a/b/e/d/f;

.field private d:[B

.field private e:I

.field private f:Lc/a/b/e/d/d;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SHA-1"

    iput-object v0, p0, Lc/a/b/e/d/c;->g:Ljava/lang/String;

    const-string v0, "PKCS1Padding"

    iput-object v0, p0, Lc/a/b/e/d/c;->b:Ljava/lang/String;

    return-void
.end method

.method private a(ILc/a/b/e/d/d;Ljava/security/SecureRandom;Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eq p1, v4, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_2

    if-ne p1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/InvalidKeyException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown mode: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    move p1, v0

    goto :goto_1

    :cond_2
    move p1, v4

    :goto_1
    instance-of v5, p2, Lc/a/b/e/d/d;

    if-eqz v5, :cond_e

    if-eqz p1, :cond_3

    move v5, v4

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    iput v5, p0, Lc/a/b/e/d/c;->a:I

    iput-object p2, p0, Lc/a/b/e/d/c;->f:Lc/a/b/e/d/d;

    invoke-interface {p2}, Lc/a/b/e/d/d;->a()Ljava/math/BigInteger;

    move-result-object p2

    invoke-static {p2}, Lc/a/b/e/d/b;->a(Ljava/math/BigInteger;)I

    move-result p2

    iput v0, p0, Lc/a/b/e/d/c;->e:I

    iget-object v0, p0, Lc/a/b/e/d/c;->b:Ljava/lang/String;

    const-string v5, "Parameters not supported"

    const-string v6, "NoPadding"

    if-ne v0, v6, :cond_5

    if-nez p4, :cond_4

    invoke-static {v1, p2, p3}, Lc/a/b/e/d/f;->a(IILjava/security/SecureRandom;)Lc/a/b/e/d/f;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/e/d/c;->c:Lc/a/b/e/d/f;

    new-array p1, p2, [B

    iput-object p1, p0, Lc/a/b/e/d/c;->d:[B

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-direct {p0, v5}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    const-string v6, "PKCS1Padding"

    if-ne v0, v6, :cond_9

    if-nez p4, :cond_8

    iget p4, p0, Lc/a/b/e/d/c;->a:I

    if-gt p4, v2, :cond_6

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_3
    invoke-static {v2, p2, p3}, Lc/a/b/e/d/f;->a(IILjava/security/SecureRandom;)Lc/a/b/e/d/f;

    move-result-object p3

    iput-object p3, p0, Lc/a/b/e/d/c;->c:Lc/a/b/e/d/f;

    if-eqz p1, :cond_7

    invoke-virtual {p3}, Lc/a/b/e/d/f;->a()I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Lc/a/b/e/d/c;->d:[B

    goto :goto_5

    :cond_7
    new-array p1, p2, [B

    iput-object p1, p0, Lc/a/b/e/d/c;->d:[B

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-direct {p0, v5}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    iget v0, p0, Lc/a/b/e/d/c;->a:I

    if-eq v0, v1, :cond_d

    if-eq v0, v3, :cond_d

    if-eqz p4, :cond_b

    instance-of v0, p4, Ljavax/crypto/spec/OAEPParameterSpec;

    if-eqz v0, :cond_a

    check-cast p4, Ljavax/crypto/spec/OAEPParameterSpec;

    goto :goto_4

    :cond_a
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    const-string p1, "Wrong Parameters for OAEP Padding"

    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p4, Ljavax/crypto/spec/OAEPParameterSpec;

    iget-object v0, p0, Lc/a/b/e/d/c;->g:Ljava/lang/String;

    sget-object v1, Ljava/security/spec/MGF1ParameterSpec;->SHA1:Ljava/security/spec/MGF1ParameterSpec;

    sget-object v2, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    const-string v4, "MGF1"

    invoke-direct {p4, v0, v4, v1, v2}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    :goto_4
    invoke-static {v3, p2, p3, p4}, Lc/a/b/e/d/f;->a(IILjava/security/SecureRandom;Ljavax/crypto/spec/OAEPParameterSpec;)Lc/a/b/e/d/f;

    move-result-object p3

    iput-object p3, p0, Lc/a/b/e/d/c;->c:Lc/a/b/e/d/f;

    if-eqz p1, :cond_c

    invoke-virtual {p3}, Lc/a/b/e/d/f;->a()I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Lc/a/b/e/d/c;->d:[B

    goto :goto_5

    :cond_c
    new-array p1, p2, [B

    iput-object p1, p0, Lc/a/b/e/d/c;->d:[B

    :goto_5
    return-void

    :cond_d
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string p1, "OAEP cannot be used to sign or verify signatures"

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/security/InvalidKeyException;

    const-string p1, "only support helios key"

    invoke-direct {p0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private a()[B
    .locals 6

    iget v0, p0, Lc/a/b/e/d/c;->e:I

    iget-object v1, p0, Lc/a/b/e/d/c;->d:[B

    array-length v2, v1

    if-gt v0, v2, :cond_4

    const/4 v2, 0x0

    :try_start_0
    iget v3, p0, Lc/a/b/e/d/c;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    const-string v5, "only verify supported"

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    :try_start_1
    invoke-static {v1, v2, v0}, Lc/a/b/e/d/b;->a([BII)[B

    move-result-object v0

    iget-object v1, p0, Lc/a/b/e/d/c;->f:Lc/a/b/e/d/d;

    invoke-static {v0, v1}, Lc/a/b/e/d/b;->a([BLc/a/b/e/d/d;)[B

    move-result-object v0

    iget-object v1, p0, Lc/a/b/e/d/c;->c:Lc/a/b/e/d/f;

    invoke-virtual {v1, v0}, Lc/a/b/e/d/f;->b([B)[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput v2, p0, Lc/a/b/e/d/c;->e:I

    return-object v0

    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Internal error"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v5}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, v5}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, p0, Lc/a/b/e/d/c;->c:Lc/a/b/e/d/f;

    invoke-virtual {v3, v1, v2, v0}, Lc/a/b/e/d/f;->a([BII)[B

    move-result-object v0

    iget-object v1, p0, Lc/a/b/e/d/c;->f:Lc/a/b/e/d/d;

    invoke-static {v0, v1}, Lc/a/b/e/d/b;->a([BLc/a/b/e/d/d;)[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput v2, p0, Lc/a/b/e/d/c;->e:I

    return-object v0

    :catchall_0
    move-exception v0

    iput v2, p0, Lc/a/b/e/d/c;->e:I

    throw v0

    :cond_4
    new-instance v0, Ljavax/crypto/IllegalBlockSizeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data must not be longer than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/b/e/d/c;->d:[B

    array-length p0, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " bytes"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljavax/crypto/IllegalBlockSizeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b([BII)V
    .locals 4

    if-eqz p3, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lc/a/b/e/d/c;->e:I

    add-int v1, v0, p3

    iget-object v2, p0, Lc/a/b/e/d/c;->d:[B

    array-length v3, v2

    if-le v1, v3, :cond_1

    array-length p1, v2

    add-int/lit8 p1, p1, 0x1

    :goto_0
    iput p1, p0, Lc/a/b/e/d/c;->e:I

    return-void

    :cond_1
    invoke-static {p1, p2, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lc/a/b/e/d/c;->e:I

    add-int/2addr p1, p3

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public a(ILc/a/b/e/d/d;Ljava/security/SecureRandom;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, p2, p3, v0}, Lc/a/b/e/d/c;->a(ILc/a/b/e/d/d;Ljava/security/SecureRandom;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "Wrong parameters"

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/security/InvalidKeyException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "NoPadding"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    iput-object v0, p0, Lc/a/b/e/d/c;->b:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v0, "PKCS1Padding"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "oaeppadding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "OAEP"

    if-eqz v1, :cond_2

    iput-object v2, p0, Lc/a/b/e/d/c;->b:Ljava/lang/String;

    :goto_1
    return-void

    :cond_2
    const-string v1, "oaepwith"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "andmgf1padding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object v2, p0, Lc/a/b/e/d/c;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0xe

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/e/d/c;->g:Ljava/lang/String;

    new-instance p0, Ljavax/crypto/NoSuchPaddingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageDigest not available for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljavax/crypto/NoSuchPaddingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Padding "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " not supported"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljavax/crypto/NoSuchPaddingException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a([BII)[B
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc/a/b/e/d/c;->b([BII)V

    invoke-direct {p0}, Lc/a/b/e/d/c;->a()[B

    move-result-object p0

    return-object p0
.end method
