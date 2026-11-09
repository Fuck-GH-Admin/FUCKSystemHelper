.class Lc/a/b/c/e$c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Lc/a/b/c/e$a;


# direct methods
.method public constructor <init>(Lc/a/b/c/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/b/c/e$c$a;->b:Lc/a/b/c/e$a;

    return-void
.end method

.method static synthetic a(Lc/a/b/c/e$c$a;)I
    .locals 0

    iget p0, p0, Lc/a/b/c/e$c$a;->a:I

    return p0
.end method

.method static synthetic b(Lc/a/b/c/e$c$a;)Lc/a/b/c/e$a;
    .locals 0

    iget-object p0, p0, Lc/a/b/c/e$c$a;->b:Lc/a/b/c/e$a;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget v0, p0, Lc/a/b/c/e$c$a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc/a/b/c/e$c$a;->a:I

    return-void
.end method
