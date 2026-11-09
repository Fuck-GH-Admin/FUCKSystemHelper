.class public La/a/a/g/f$c;
.super La/a/a/g/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:J

.field public b:Z

.field public final synthetic c:La/a/a/g/f;


# direct methods
.method public constructor <init>(La/a/a/g/f;)V
    .locals 2

    iput-object p1, p0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-direct {p0}, La/a/a/g/e;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/g/f$c;->a:J

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/g/f$c;->b:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/content/Intent;)Z
    .locals 7

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const-string v0, "resultsUpdated"

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iget-object v0, p0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-static {v0, v3, v4}, La/a/a/g/f;->a(La/a/a/g/f;J)J

    iget-object v0, p0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-static {v0}, La/a/a/g/f;->a(La/a/a/g/f;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-static {v0}, La/a/a/g/f;->a(La/a/a/g/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, La/a/a/g/f$c$a;

    invoke-direct {v1, p0, p1}, La/a/a/g/f$c$a;-><init>(La/a/a/g/f$c;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    const-string v1, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "networkInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/NetworkInfo;

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object p1

    sget-object v0, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    invoke-virtual {p1, v0}, Landroid/net/NetworkInfo$State;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, La/a/a/g/f$c;->a:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x1388

    cmp-long p1, v3, v5

    if-gez p1, :cond_3

    return v0

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, La/a/a/g/f$c;->a:J

    iget-boolean p1, p0, La/a/a/g/f$c;->b:Z

    if-nez p1, :cond_4

    iput-boolean v2, p0, La/a/a/g/f$c;->b:Z

    return v0

    :cond_4
    iget-object p0, p0, La/a/a/g/f$c;->c:La/a/a/g/f;

    invoke-static {p0}, La/a/a/g/f;->a(La/a/a/g/f;)Landroid/os/Handler;

    move-result-object p0

    if-nez p0, :cond_5

    return v0

    :cond_5
    :goto_0
    return v2
.end method

.method public a(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/telephony/CellInfo;",
            ">;)Z"
        }
    .end annotation

    invoke-static {}, La/a/a/c/b;->g()La/a/a/c/b;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/c/b;->b()V

    const/4 p0, 0x1

    return p0
.end method
