.class public La/a/a/i/g$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/i/g;->a(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/a/a/i/g;


# direct methods
.method public constructor <init>(La/a/a/i/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iput-object p2, p0, La/a/a/i/g$f;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    const-string v0, "gzip"

    const-string v1, "close baos IOException!"

    const-string v2, "close is IOException!"

    const-string v3, "close os IOException!"

    const-string v4, "baidu_location_service"

    iget-object v5, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    invoke-virtual {v5}, La/a/a/i/g;->a()V

    iget-object v5, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iget-object v6, p0, La/a/a/i/g$f;->b:Ljava/lang/String;

    iput-object v6, v5, La/a/a/i/g;->a:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    new-instance v8, Ljava/net/URL;

    iget-object v9, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iget-object v9, v9, La/a/a/i/g;->a:Ljava/lang/String;

    invoke-direct {v8, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_11
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_e
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v8

    check-cast v8, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_d
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-virtual {v8, v5}, Ljavax/net/ssl/HttpsURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    invoke-virtual {v8, v9}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    sget v10, La/a/a/i/a;->a:I

    invoke-virtual {v8, v10}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    sget v10, La/a/a/i/a;->b:I

    invoke-virtual {v8, v10}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    const-string v10, "POST"

    invoke-virtual {v8, v10}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v10, "Content-Type"

    const-string v11, "application/x-www-form-urlencoded; charset=utf-8"

    invoke-virtual {v8, v10, v11}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "Accept-Encoding"

    invoke-virtual {v8, v10, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v10, La/a/a/i/i;->o0:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_b
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_a
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v10, :cond_0

    const-string v11, "bd-loc-android"

    :try_start_3
    invoke-virtual {v8, v11, v10}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v10, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iget-object v10, v10, La/a/a/i/g;->d:Ljava/util/Map;

    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v12, "="

    invoke-virtual {v7, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v11, "&"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->length()I

    move-result v10

    if-lez v10, :cond_2

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->length()I

    move-result v10

    sub-int/2addr v10, v9

    invoke-virtual {v7, v10}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    :cond_2
    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-virtual {v10, v7}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v7

    const/16 v11, 0xc8

    if-ne v7, v11, :cond_5

    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_3

    invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    new-instance v11, Ljava/io/BufferedInputStream;

    invoke-direct {v11, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v11}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v7, v0

    :cond_3
    :try_start_6
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/16 v11, 0x400

    :try_start_7
    new-array v11, v11, [B

    :goto_1
    invoke-virtual {v7, v11}, Ljava/io/InputStream;->read([B)I

    move-result v12

    const/4 v13, -0x1

    if-eq v12, v13, :cond_4

    invoke-virtual {v0, v11, v5, v12}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :cond_4
    iget-object v11, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    new-instance v12, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v13

    const-string v14, "utf-8"

    invoke-direct {v12, v13, v14}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v12, v11, La/a/a/i/g;->c:Ljava/lang/String;

    iget-object v11, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    invoke-virtual {v11, v9}, La/a/a/i/g;->a(Z)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object v6, v7

    goto :goto_2

    :catch_0
    move-exception v9

    goto/16 :goto_a

    :catch_1
    move-exception v9

    goto/16 :goto_d

    :catch_2
    move-exception v0

    goto/16 :goto_8

    :catch_3
    move-exception v0

    goto/16 :goto_9

    :catchall_0
    move-exception p0

    goto :goto_6

    :catch_4
    move-exception v0

    goto/16 :goto_8

    :catch_5
    move-exception v0

    goto/16 :goto_9

    :cond_5
    :try_start_8
    iget-object v0, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iput-object v6, v0, La/a/a/i/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v5}, La/a/a/i/g;->a(Z)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object v0, v6

    :goto_2
    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_6
    if-eqz v10, :cond_7

    :try_start_9
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_3

    :catch_6
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_3
    if-eqz v6, :cond_8

    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_4

    :catch_7
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_4
    if-eqz v0, :cond_f

    :goto_5
    :try_start_b
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_14

    goto/16 :goto_10

    :catchall_1
    move-exception p0

    move-object v7, v6

    goto :goto_6

    :catch_8
    move-exception v0

    move-object v7, v6

    goto :goto_8

    :catch_9
    move-exception v0

    move-object v7, v6

    goto :goto_9

    :catchall_2
    move-exception p0

    move-object v7, v6

    move-object v10, v7

    goto :goto_6

    :catch_a
    move-exception v0

    move-object v7, v6

    move-object v10, v7

    goto :goto_8

    :catch_b
    move-exception v0

    move-object v7, v6

    move-object v10, v7

    goto :goto_9

    :catchall_3
    move-exception p0

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    :goto_6
    move-object v0, v6

    :goto_7
    move-object v6, v8

    goto/16 :goto_11

    :catch_c
    move-exception v0

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    :goto_8
    move-object v9, v0

    move-object v0, v6

    goto :goto_a

    :catch_d
    move-exception v0

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    :goto_9
    move-object v9, v0

    move-object v0, v6

    goto :goto_d

    :catchall_4
    move-exception p0

    move-object v0, v6

    move-object v7, v0

    move-object v10, v7

    goto/16 :goto_11

    :catch_e
    move-exception v0

    move-object v9, v0

    move-object v0, v6

    move-object v7, v0

    move-object v8, v7

    move-object v10, v8

    :goto_a
    :try_start_c
    invoke-virtual {v9}, Ljava/lang/Error;->printStackTrace()V

    const-string v9, "https NetworkCommunicationError!"

    invoke-static {v4, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iput-object v6, p0, La/a/a/i/g;->c:Ljava/lang/String;

    invoke-virtual {p0, v5}, La/a/a/i/g;->a(Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_9
    if-eqz v10, :cond_a

    :try_start_d
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_f

    goto :goto_b

    :catch_f
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    :goto_b
    if-eqz v7, :cond_b

    :try_start_e
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_10

    goto :goto_c

    :catch_10
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_c
    if-eqz v0, :cond_f

    goto :goto_5

    :catch_11
    move-exception v0

    move-object v9, v0

    move-object v0, v6

    move-object v7, v0

    move-object v8, v7

    move-object v10, v8

    :goto_d
    :try_start_f
    invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V

    const-string v9, "https NetworkCommunicationException!"

    invoke-static {v4, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, La/a/a/i/g$f;->c:La/a/a/i/g;

    iput-object v6, p0, La/a/a/i/g;->c:Ljava/lang/String;

    invoke-virtual {p0, v5}, La/a/a/i/g;->a(Z)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    if-eqz v8, :cond_c

    invoke-virtual {v8}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_c
    if-eqz v10, :cond_d

    :try_start_10
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_12

    goto :goto_e

    :catch_12
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    :goto_e
    if-eqz v7, :cond_e

    :try_start_11
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_13

    goto :goto_f

    :catch_13
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    :goto_f
    if-eqz v0, :cond_f

    goto/16 :goto_5

    :catch_14
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    :goto_10
    return-void

    :catchall_5
    move-exception p0

    goto :goto_7

    :goto_11
    if-eqz v6, :cond_10

    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    :cond_10
    if-eqz v10, :cond_11

    :try_start_12
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_15

    goto :goto_12

    :catch_15
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    :goto_12
    if-eqz v7, :cond_12

    :try_start_13
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_16

    goto :goto_13

    :catch_16
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_12
    :goto_13
    if-eqz v0, :cond_13

    :try_start_14
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_17

    goto :goto_14

    :catch_17
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    :goto_14
    throw p0
.end method
