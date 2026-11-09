.class public Lc/d/a/b/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/net/HttpURLConnection;

.field private b:Ljavax/net/ssl/HttpsURLConnection;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    const/4 v0, 0x0

    iput v0, p0, Lc/d/a/b/f;->c:I

    return-void
.end method


# virtual methods
.method public declared-synchronized a()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lc/d/a/b/f;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;[B[B)Z
    .locals 5

    monitor-enter p0

    const/4 p3, 0x0

    :try_start_0
    const-string v0, "HttpHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendHttpRequest() path = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v1, 0xc8

    const/16 v2, 0x3a98

    const/16 v3, 0x2710

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    :try_start_1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    iput-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    const-string v0, "Content-Type"

    const-string v2, "application/encrypted-json"

    invoke-virtual {p1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    const-string v0, "Content-Length"

    array-length v2, p2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    iput p1, p0, Lc/d/a/b/f;->c:I

    const-string p1, "HttpHelper"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "server responseCode-->"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lc/d/a/b/f;->c:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lc/d/a/b/f;->c:I

    if-ne p1, v1, :cond_0

    const-string p1, "HttpHelper"

    const-string p2, "register success!"

    invoke-static {p1, p2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move p3, v4

    goto :goto_0

    :cond_0
    const-string p1, "HttpHelper"

    const-string p2, "register fail!"

    invoke-static {p1, p2}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lc/d/a/b/f;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    throw p1

    :cond_2
    const-string v0, "https://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v0, :cond_5

    :try_start_3
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/HttpsURLConnection;

    iput-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1, v3}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1, v4}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1, v4}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    const-string v0, "Content-Type"

    const-string v2, "application/encrypted-json"

    invoke-virtual {p1, v0, v2}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    const-string v0, "Content-Length"

    array-length v2, p2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result p1

    iput p1, p0, Lc/d/a/b/f;->c:I

    const-string p1, "HttpHelper"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "server responseCode-->"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lc/d/a/b/f;->c:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lc/d/a/b/f;->c:I

    if-ne p1, v1, :cond_3

    const-string p1, "HttpHelper"

    const-string p2, "register success!"

    invoke-static {p1, p2}, Lc/d/a/b/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move p3, v4

    goto :goto_1

    :cond_3
    const-string p1, "HttpHelper"

    const-string p2, "register fail!"

    invoke-static {p1, p2}, Lc/d/a/b/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p1}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    goto :goto_2

    :catchall_1
    move-exception p1

    iget-object p2, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lc/d/a/b/f;->b:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {p2}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_5
    :goto_2
    monitor-exit p0

    return p3

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method
