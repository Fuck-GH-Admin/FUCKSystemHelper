.class public Lb/b/c/d/b$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/c/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private final b:[Lb/b/c/d/b$f;


# direct methods
.method public constructor <init>(I[Lb/b/c/d/b$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb/b/c/d/b$e;->a:I

    iput-object p2, p0, Lb/b/c/d/b$e;->b:[Lb/b/c/d/b$f;

    return-void
.end method


# virtual methods
.method public a()[Lb/b/c/d/b$f;
    .locals 0

    iget-object p0, p0, Lb/b/c/d/b$e;->b:[Lb/b/c/d/b$f;

    return-object p0
.end method

.method public b()I
    .locals 0

    iget p0, p0, Lb/b/c/d/b$e;->a:I

    return p0
.end method
