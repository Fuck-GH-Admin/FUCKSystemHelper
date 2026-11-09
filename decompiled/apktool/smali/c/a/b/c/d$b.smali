.class Lc/a/b/c/d$b;
.super Lc/a/b/c/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/b/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/String;

.field private e:J

.field private f:J

.field private g:J

.field private h:Lc/a/b/n$a;


# direct methods
.method public constructor <init>(Lc/a/b/c/d;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p1, Lc/a/b/c/d;->f:Lc/a/b/i/a$a;

    invoke-direct {p0, p1, p2}, Lc/a/b/c/a$b;-><init>(Lc/a/b/i/a$a;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/b/c/d$a;)V
    .locals 2

    invoke-virtual {p1}, Lc/a/b/c/d$a;->b()Lc/a/b/n$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/a/b/c/d$b;->a(Lc/a/b/n$a;)Z

    invoke-virtual {p1}, Lc/a/b/c/d$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lc/a/b/c/d$b;->b(J)Z

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "pkg"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/c/d$b;->d:Ljava/lang/String;

    const-string v0, "tar_pkg_lst_pub_ts"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lc/a/b/c/d$b;->f:J

    const-string v0, "last_fe_ts"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/b/c/d$b;->e:J

    const-string v0, "info"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/b/n;->b(Ljava/lang/String;)Lc/a/b/n$a;

    move-result-object v0

    iput-object v0, p0, Lc/a/b/c/d$b;->h:Lc/a/b/n$a;

    const-string v0, "tar_pkg_lst_up_ts"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lc/a/b/c/d$b;->g:J

    const-string p0, "d_form_ver"

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    return-void
.end method

.method public a(J)Z
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/d$b;->e:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lc/a/b/c/d$b;->e:J

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/a/b/c/a$b;->a(Z)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public a(Lc/a/b/n$a;)Z
    .locals 1

    iget-object v0, p0, Lc/a/b/c/d$b;->h:Lc/a/b/n$a;

    invoke-virtual {p1, v0}, Lc/a/b/n$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lc/a/b/c/d$b;->h:Lc/a/b/n$a;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/a/b/c/a$b;->a(Z)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lc/a/b/c/d$b;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lc/a/b/c/d$b;->d:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/a/b/c/a$b;->a(Z)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lc/a/b/c/d$b;->d:Ljava/lang/String;

    const-string v1, "pkg"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-wide v0, p0, Lc/a/b/c/d$b;->e:J

    const-string v2, "last_fe_ts"

    invoke-virtual {p1, v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-wide v0, p0, Lc/a/b/c/d$b;->f:J

    const-string v2, "tar_pkg_lst_pub_ts"

    invoke-virtual {p1, v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v0, p0, Lc/a/b/c/d$b;->h:Lc/a/b/n$a;

    invoke-virtual {v0}, Lc/a/b/n$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "info"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-wide v0, p0, Lc/a/b/c/d$b;->g:J

    const-string p0, "tar_pkg_lst_up_ts"

    invoke-virtual {p1, p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string p0, "d_form_ver"

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-void
.end method

.method public b(J)Z
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/d$b;->f:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lc/a/b/c/d$b;->f:J

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/a/b/c/a$b;->a(Z)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc/a/b/c/d$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Z
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/d$b;->g:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lc/a/b/c/d$b;->g:J

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/a/b/c/a$b;->a(Z)V

    return p1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public d()Lc/a/b/n$a;
    .locals 0

    iget-object p0, p0, Lc/a/b/c/d$b;->h:Lc/a/b/n$a;

    return-object p0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lc/a/b/c/d$b;->g:J

    return-wide v0
.end method
