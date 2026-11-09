.class Lb/a/a/b/b$c;
.super Lb/a/a/b/b$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lb/a/a/b/b$f<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lb/a/a/b/b$d;Lb/a/a/b/b$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lb/a/a/b/b$f;-><init>(Lb/a/a/b/b$d;Lb/a/a/b/b$d;)V

    return-void
.end method


# virtual methods
.method b(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p0, p1, Lb/a/a/b/b$d;->d:Lb/a/a/b/b$d;

    return-object p0
.end method

.method c(Lb/a/a/b/b$d;)Lb/a/a/b/b$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;)",
            "Lb/a/a/b/b$d<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p0, p1, Lb/a/a/b/b$d;->e:Lb/a/a/b/b$d;

    return-object p0
.end method
