.class Lc/a/c/a/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lc/a/c/a/i;


# direct methods
.method constructor <init>(Lc/a/c/a/i;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc/a/c/a/j;->f:Lc/a/c/a/i;

    iput-object p2, p0, Lc/a/c/a/j;->b:Ljava/lang/String;

    iput p3, p0, Lc/a/c/a/j;->c:I

    iput-object p4, p0, Lc/a/c/a/j;->d:Ljava/lang/String;

    iput-object p5, p0, Lc/a/c/a/j;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lc/a/c/a/j;->f:Lc/a/c/a/i;

    invoke-static {v0}, Lc/a/c/a/i;->a(Lc/a/c/a/i;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lc/a/c/a/j;->b:Ljava/lang/String;

    iget v3, p0, Lc/a/c/a/j;->c:I

    iget-object v4, p0, Lc/a/c/a/j;->d:Ljava/lang/String;

    iget-object v5, p0, Lc/a/c/a/j;->e:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lc/a/c/a/i;->a(Lc/a/c/a/i;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
