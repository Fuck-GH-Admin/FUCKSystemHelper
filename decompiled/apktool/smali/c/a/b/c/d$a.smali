.class Lc/a/b/c/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:Lc/a/b/n$a;

.field final synthetic c:Lc/a/b/c/d;


# direct methods
.method constructor <init>(Lc/a/b/c/d;)V
    .locals 0

    iput-object p1, p0, Lc/a/b/c/d$a;->c:Lc/a/b/c/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p0, Lc/a/b/k/b;

    invoke-direct {p0}, Lc/a/b/k/b;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "pub_lst_ts"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Lc/a/b/c/d$a;->a:J

    const-string p1, "pub_info"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc/a/b/n;->b(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object p1

    iput-object p1, p0, Lc/a/b/c/d$a;->b:Lc/a/b/n$a;

    const-string p0, "d_form_ver"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/d$a;->a:J

    return-wide v0
.end method

.method public a(Landroid/content/pm/PackageInfo;)Z
    .locals 2

    iget-object v0, p0, Lc/a/b/c/d$a;->c:Lc/a/b/c/d;

    iget-object v0, v0, Lc/a/b/c/d;->f:Lc/a/b/i/a$a;

    new-instance v1, Ljava/io/File;

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc/a/b/i/a$a;->a(Ljava/io/File;)Lc/a/b/i/a$a;

    move-result-object p1

    const-string v0, "pub.dat"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lc/a/b/i/a$a;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/b/c/d$a;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public b()Lc/a/b/n$a;
    .locals 0

    iget-object p0, p0, Lc/a/b/c/d$a;->b:Lc/a/b/n$a;

    return-object p0
.end method
