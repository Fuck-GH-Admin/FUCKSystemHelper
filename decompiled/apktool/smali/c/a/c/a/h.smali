.class Lc/a/c/a/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lc/a/c/a/g;


# direct methods
.method constructor <init>(Lc/a/c/a/g;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc/a/c/a/h;->f:Lc/a/c/a/g;

    iput-object p2, p0, Lc/a/c/a/h;->b:Ljava/lang/String;

    iput p3, p0, Lc/a/c/a/h;->c:I

    iput-object p4, p0, Lc/a/c/a/h;->d:Ljava/lang/String;

    iput-object p5, p0, Lc/a/c/a/h;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "postWithHttps start Thread id = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/c/a/d;->a(Ljava/lang/String;)V

    new-instance v1, Lc/a/c/a/k;

    iget-object v0, p0, Lc/a/c/a/h;->f:Lc/a/c/a/g;

    invoke-static {v0}, Lc/a/c/a/g;->a(Lc/a/c/a/g;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lc/a/c/a/k;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lc/a/c/a/h;->f:Lc/a/c/a/g;

    invoke-static {v0}, Lc/a/c/a/g;->b(Lc/a/c/a/g;)Ljava/util/HashMap;

    move-result-object v2

    iget-object v3, p0, Lc/a/c/a/h;->b:Ljava/lang/String;

    iget v4, p0, Lc/a/c/a/h;->c:I

    iget-object v5, p0, Lc/a/c/a/h;->d:Ljava/lang/String;

    iget-object v6, p0, Lc/a/c/a/h;->e:Ljava/lang/String;

    invoke-virtual/range {v1 .. v6}, Lc/a/c/a/k;->a(Ljava/util/HashMap;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lc/a/c/a/h;->f:Lc/a/c/a/g;

    invoke-static {p0, v0}, Lc/a/c/a/g;->a(Lc/a/c/a/g;Ljava/lang/String;)V

    return-void
.end method
