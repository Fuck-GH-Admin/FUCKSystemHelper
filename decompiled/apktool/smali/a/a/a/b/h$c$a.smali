.class public La/a/a/b/h$c$a;
.super Ljava/util/TimerTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/h$c;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/Timer;

.field public final synthetic c:La/a/a/b/h$c;


# direct methods
.method public constructor <init>(La/a/a/b/h$c;Ljava/util/Timer;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/h$c$a;->c:La/a/a/b/h$c;

    iput-object p2, p0, La/a/a/b/h$c$a;->b:Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, La/a/a/b/h$c$a;->c:La/a/a/b/h$c;

    iget-boolean v1, v0, La/a/a/b/h$c;->l:Z

    if-nez v1, :cond_0

    invoke-static {v0}, La/a/a/b/h$c;->a(La/a/a/b/h$c;)V

    :cond_0
    iget-object v0, p0, La/a/a/b/h$c$a;->b:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object p0, p0, La/a/a/b/h$c$a;->b:Ljava/util/Timer;

    invoke-virtual {p0}, Ljava/util/Timer;->purge()I

    return-void
.end method
