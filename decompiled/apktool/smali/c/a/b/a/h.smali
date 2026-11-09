.class final Lc/a/b/a/h;
.super Lc/a/b/a/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/b/a/h$a;
    }
.end annotation


# instance fields
.field private d:Lc/a/b/a/h$a;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Lc/a/b/a/g;-><init>()V

    const/16 v0, 0x20

    iput v0, p0, Lc/a/b/a/g;->a:I

    iput p1, p0, Lc/a/b/a/g;->b:I

    iput p2, p0, Lc/a/b/a/g;->c:I

    new-instance p1, Lc/a/b/a/h$a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc/a/b/a/h$a;-><init>(Lc/a/b/a/i;)V

    iput-object p1, p0, Lc/a/b/a/h;->d:Lc/a/b/a/h$a;

    return-void
.end method


# virtual methods
.method public a([BII)Lc/a/b/a/b;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/a/b/a/h;->d:Lc/a/b/a/h$a;

    invoke-static {v0}, Lc/a/b/a/h$a;->a(Lc/a/b/a/h$a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lc/a/b/a/h;->d:Lc/a/b/a/h$a;

    invoke-static {v1, v0, p1, p2, p3}, Lc/a/b/a/h$a;->a(Lc/a/b/a/h$a;Ljava/lang/Object;[BII)V

    iget-object p0, p0, Lc/a/b/a/h;->d:Lc/a/b/a/h$a;

    invoke-static {p0, v0}, Lc/a/b/a/h$a;->a(Lc/a/b/a/h$a;Ljava/lang/Object;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide p0, 0xffffffffL

    :goto_0
    const/4 p2, 0x1

    new-array p2, p2, [J

    const/4 p3, 0x0

    aput-wide p0, p2, p3

    invoke-static {p2}, Lc/a/b/a/b;->a([J)Lc/a/b/a/b;

    move-result-object p0

    return-object p0
.end method
