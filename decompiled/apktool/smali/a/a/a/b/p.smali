.class public La/a/a/b/p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/b/p$c;,
        La/a/a/b/p$d;,
        La/a/a/b/p$b;
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/a/a/b/p$d;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/location/LocationManager;

.field public c:La/a/a/b/p$c;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/a/a/b/p;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;

    iput-object v0, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/b/p;->d:Z

    return-void
.end method

.method public static c()La/a/a/b/p;
    .locals 1

    invoke-static {}, La/a/a/b/p$b;->a()La/a/a/b/p;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    if-eqz v0, :cond_0

    iget-object v1, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    :cond_0
    return-void
.end method

.method public a(La/a/a/b/p$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/b/p;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/a/a/b/p;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, La/a/a/b/p;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget-boolean p1, p0, La/a/a/b/p;->d:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, La/a/a/b/p;->b()V

    iput-boolean v0, p0, La/a/a/b/p;->d:Z

    :cond_2
    return-void
.end method

.method public b()V
    .locals 7

    :try_start_0
    iget-object v0, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;

    :cond_0
    iget-object v0, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    if-nez v0, :cond_1

    new-instance v0, La/a/a/b/p$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/a/a/b/p$c;-><init>(La/a/a/b/p;La/a/a/b/p$a;)V

    iput-object v0, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    :cond_1
    iget-object v0, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;

    if-eqz v0, :cond_2

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v1, p0, La/a/a/b/p;->b:Landroid/location/LocationManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "network"

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    :try_start_1
    iget-object v6, p0, La/a/a/b/p;->c:La/a/a/b/p$c;

    invoke-virtual/range {v1 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method public b(La/a/a/b/p$d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La/a/a/b/p;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, La/a/a/b/p;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, La/a/a/b/p;->d:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, La/a/a/b/p;->a()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/a/a/b/p;->d:Z

    :cond_1
    return-void
.end method
