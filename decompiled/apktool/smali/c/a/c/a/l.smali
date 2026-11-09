.class Lc/a/c/a/l;
.super Ljava/net/Authenticator;
.source ""


# instance fields
.field final synthetic a:Lc/a/c/a/k;


# direct methods
.method constructor <init>(Lc/a/c/a/k;)V
    .locals 0

    iput-object p1, p0, Lc/a/c/a/l;->a:Lc/a/c/a/k;

    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    return-void
.end method


# virtual methods
.method protected getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .locals 2

    iget-object v0, p0, Lc/a/c/a/l;->a:Lc/a/c/a/k;

    invoke-static {v0}, Lc/a/c/a/k;->a(Lc/a/c/a/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/c/a/l;->a:Lc/a/c/a/k;

    invoke-static {v0}, Lc/a/c/a/k;->b(Lc/a/c/a/k;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/PasswordAuthentication;

    iget-object v1, p0, Lc/a/c/a/l;->a:Lc/a/c/a/k;

    invoke-static {v1}, Lc/a/c/a/k;->a(Lc/a/c/a/k;)Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Lc/a/c/a/l;->a:Lc/a/c/a/k;

    invoke-static {p0}, Lc/a/c/a/k;->b(Lc/a/c/a/k;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, "Proxy Username or Password is null"

    invoke-static {p0}, Lc/a/c/a/d;->a(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method
