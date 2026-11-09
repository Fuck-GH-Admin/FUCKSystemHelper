.class public La/a/a/d/m/c/a$c;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/m/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public final synthetic d:La/a/a/d/m/c/a;


# direct methods
.method public constructor <init>(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p2, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    iput-object p3, p0, La/a/a/d/m/c/a$c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v2}, La/a/a/d/m/c/a;->a(La/a/a/d/m/c/a;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-static {}, La/a/a/i/i;->g()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    new-instance v2, Ljava/net/URL;

    sget-object v3, La/a/a/i/d;->d:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    invoke-virtual {v3, v4}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    const-string v5, "POST"

    invoke-virtual {v3, v5}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    new-instance v5, La/a/a/d/m/c/a$f;

    invoke-direct {v5, v2}, La/a/a/d/m/c/a$f;-><init>(Ljava/net/URL;)V

    invoke-virtual {v3, v5}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    const-string v2, "Accept-encoding"

    const-string v5, "gzip"

    invoke-virtual {v3, v2, v5}, Ljavax/net/ssl/HttpsURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "bldg="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "&md5="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, La/a/a/d/m/c/a$c;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v6, :cond_2

    const-string v6, "null"

    :cond_2
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v2

    const/4 v5, 0x0

    const/16 v6, 0xc8

    if-ne v2, v6, :cond_5

    const-string v2, "Hash"

    invoke-virtual {v3, v2}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    new-instance v4, Ljava/io/File;

    iget-object v5, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    iget-object v6, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-static {v5, v6, v2}, La/a/a/d/m/c/a;->a(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v5, 0x400

    new-array v5, v5, [B

    :goto_0
    invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-ltz v6, :cond_3

    invoke-virtual {v1, v5, v0, v6}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    invoke-static {v4}, La/a/a/d/m/c/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    iget-object v2, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    iget-object v3, p0, La/a/a/d/m/c/a$c;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    iget-object v2, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-static {v1, v2}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v1}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v5, "OK"

    goto :goto_2

    :cond_4
    :try_start_2
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v1, "Download failed"

    goto :goto_1

    :cond_5
    const/16 v1, 0x130

    if-ne v2, v1, :cond_6

    :try_start_3
    iget-object v1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    iget-object v2, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-static {v1, v2}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v1}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;)Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No roadnet update for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La/a/a/d/m/c/a$c;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_6
    const/16 v1, 0xcc

    if-ne v2, v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not found bldg "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La/a/a/d/m/c/a$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v2, v4}, La/a/a/d/m/c/a;->a(La/a/a/d/m/c/a;Z)Z

    :goto_1
    move-object v5, v1

    :cond_7
    move v1, v0

    :goto_2
    iget-object v2, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v2}, La/a/a/d/m/c/a;->c(La/a/a/d/m/c/a;)La/a/a/d/m/c/a$d;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v2, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {v2}, La/a/a/d/m/c/a;->c(La/a/a/d/m/c/a;)La/a/a/d/m/c/a$d;

    move-result-object v2

    invoke-interface {v2, v1, v5}, La/a/a/d/m/c/a$d;->a(ZLjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_3
    iget-object p0, p0, La/a/a/d/m/c/a$c;->d:La/a/a/d/m/c/a;

    invoke-static {p0, v0}, La/a/a/d/m/c/a;->b(La/a/a/d/m/c/a;Z)Z

    return-void
.end method
