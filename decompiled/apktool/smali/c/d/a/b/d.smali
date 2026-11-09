.class public Lc/d/a/b/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Z = false

.field public static b:Z = false

.field public static c:Z = true

.field public static d:Landroid/content/Context; = null

.field public static e:Z = false

.field public static f:Landroid/telephony/TelephonyManager; = null

.field public static g:Landroid/telephony/TelephonyManager; = null

.field public static h:Lcom/mobiletools/systemhelper/control/a; = null

.field public static i:Lcom/mobiletools/systemhelper/control/a; = null

.field public static j:Z = false

.field public static k:Z = false

.field public static l:Ljava/lang/String; = "http://dm.wo.com.cn:18080/register"

.field public static m:J

.field public static n:J

.field public static o:J

.field public static p:I

.field public static q:I

.field public static r:I

.field public static s:J

.field public static t:J

.field public static u:J

.field public static v:J

.field public static w:Lc/c/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const v1, 0x5265c00

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v2, v0

    sput-wide v2, Lc/d/a/b/d;->m:J

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v2, v0

    sput-wide v2, Lc/d/a/b/d;->n:J

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lc/d/a/b/d;->o:J

    const/4 v0, 0x0

    sput v0, Lc/d/a/b/d;->p:I

    sput v0, Lc/d/a/b/d;->q:I

    sput v0, Lc/d/a/b/d;->r:I

    const-wide/32 v0, 0x5265c00

    sput-wide v0, Lc/d/a/b/d;->s:J

    sput-wide v0, Lc/d/a/b/d;->t:J

    const-wide/32 v0, 0x2932e00

    sput-wide v0, Lc/d/a/b/d;->u:J

    const-wide/32 v0, 0x1b7740

    sput-wide v0, Lc/d/a/b/d;->v:J

    return-void
.end method
