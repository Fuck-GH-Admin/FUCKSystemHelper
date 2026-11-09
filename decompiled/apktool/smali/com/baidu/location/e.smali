.class public abstract Lcom/baidu/location/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:D

.field public b:D

.field public c:F

.field public d:Ljava/lang/String;

.field public e:D

.field public f:D

.field public g:I

.field public h:Z

.field public i:La/a/a/e/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/baidu/location/e;->a:D

    iput-wide v0, p0, Lcom/baidu/location/e;->b:D

    const/4 v2, 0x0

    iput v2, p0, Lcom/baidu/location/e;->c:F

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/baidu/location/e;->d:Ljava/lang/String;

    iput-wide v0, p0, Lcom/baidu/location/e;->e:D

    iput-wide v0, p0, Lcom/baidu/location/e;->f:D

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/location/e;->g:I

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/location/c;F)V
    .locals 0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "new location, not far from the destination..."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "baidu_location_service"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
