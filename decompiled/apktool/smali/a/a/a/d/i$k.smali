.class public La/a/a/d/i$k;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public volatile b:Z

.field public c:J

.field public d:J

.field public final synthetic e:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;)V
    .locals 2

    iput-object p1, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/a/a/d/i$k;->b:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/i$k;->c:J

    iput-wide v0, p0, La/a/a/d/i$k;->d:J

    return-void
.end method

.method public static synthetic a(La/a/a/d/i$k;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/d/i$k;->b:Z

    return p1
.end method


# virtual methods
.method public run()V
    .locals 7

    :goto_0
    iget-boolean v0, p0, La/a/a/d/i$k;->b:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->r(La/a/a/d/i;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->s(La/a/a/d/i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    const-wide/16 v2, 0x1388

    goto :goto_1

    :cond_0
    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    const-wide/16 v2, 0xbb8

    :goto_1
    invoke-static {v0, v2, v3}, La/a/a/d/i;->a(La/a/a/d/i;J)J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, La/a/a/d/i$k;->c:J

    sub-long/2addr v2, v4

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->t(La/a/a/d/i;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    const/4 v2, 0x0

    if-lez v0, :cond_1

    goto :goto_2

    :cond_1
    move v1, v2

    :goto_2
    if-eqz v1, :cond_2

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/g/f;->g()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, La/a/a/g/f;->b(J)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/d/i$k;->c:J

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0, v2}, La/a/a/d/i;->d(La/a/a/d/i;Z)Z

    :cond_2
    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/d/i$k;->d:J

    goto :goto_3

    :cond_3
    iget-wide v0, p0, La/a/a/d/i$k;->d:J

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    iput-wide v0, p0, La/a/a/d/i$k;->d:J

    const-wide/16 v3, 0xa

    cmp-long v0, v0, v3

    if-ltz v0, :cond_4

    iput-boolean v2, p0, La/a/a/d/i$k;->b:Z

    iget-object p0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-virtual {p0}, La/a/a/d/i;->l()V

    return-void

    :cond_4
    :goto_3
    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->d(La/a/a/d/i;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v0}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v3, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v3}, La/a/a/d/i;->u(La/a/a/d/i;)J

    move-result-wide v3

    sub-long/2addr v0, v3

    const-wide/16 v3, 0x7530

    cmp-long v0, v0, v3

    if-lez v0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v5, p0, La/a/a/d/i$k;->e:La/a/a/d/i;

    invoke-static {v5}, La/a/a/d/i;->p(La/a/a/d/i;)La/a/a/d/i$h;

    move-result-object v5

    invoke-static {v5}, La/a/a/d/i$h;->f(La/a/a/d/i$h;)J

    move-result-wide v5

    sub-long/2addr v0, v5

    cmp-long v0, v0, v3

    if-lez v0, :cond_5

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->l()V

    :cond_5
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    iput-boolean v2, p0, La/a/a/d/i$k;->b:Z

    :cond_6
    return-void
.end method
