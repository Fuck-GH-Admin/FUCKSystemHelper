.class public abstract Lc/a/b/c/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/c/a$b;,
        Lc/a/b/c/a$c;,
        Lc/a/b/c/a$e;,
        Lc/a/b/c/a$d;,
        Lc/a/b/c/a$a;
    }
.end annotation


# static fields
.field public static e:Ljava/util/Comparator;


# instance fields
.field protected a:Lc/a/b/c/a$a;

.field protected b:Lc/a/b/i/a$a;

.field private final c:Ljava/lang/String;

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/b/c/b;

    invoke-direct {v0}, Lc/a/b/c/b;-><init>()V

    sput-object v0, Lc/a/b/c/a;->e:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/b/c/a;->c:Ljava/lang/String;

    iput-wide p2, p0, Lc/a/b/c/a;->d:J

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Lc/a/b/c/a$d;)Lc/a/b/c/a$e;
.end method

.method public a()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc/a/b/c/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Lc/a/b/c/a$a;)V
    .locals 1

    iput-object p1, p0, Lc/a/b/c/a;->a:Lc/a/b/c/a$a;

    iget-object p1, p1, Lc/a/b/c/a$a;->b:Lc/a/b/i/a;

    invoke-virtual {p1}, Lc/a/b/i/a;->b()Lc/a/b/i/a$a;

    move-result-object p1

    const-string v0, "cs"

    invoke-virtual {p1, v0}, Lc/a/b/i/a$a;->a(Ljava/lang/String;)Lc/a/b/i/a$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/c/a;->b:Lc/a/b/i/a$a;

    return-void
.end method

.method public abstract a(Lc/a/b/c/a$c;)V
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/a;->d:J

    return-wide v0
.end method
