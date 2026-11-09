.class public La/a/a/i/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static e:La/a/a/i/e;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "firll.dat"

    iput-object v0, p0, La/a/a/i/e;->a:Ljava/lang/String;

    const/16 v0, 0xc5c

    iput v0, p0, La/a/a/i/e;->b:I

    const/16 v0, 0x14

    iput v0, p0, La/a/a/i/e;->c:I

    const/16 v0, 0x3c

    iput v0, p0, La/a/a/i/e;->d:I

    return-void
.end method

.method public static c()La/a/a/i/e;
    .locals 1

    sget-object v0, La/a/a/i/e;->e:La/a/a/i/e;

    if-nez v0, :cond_0

    new-instance v0, La/a/a/i/e;

    invoke-direct {v0}, La/a/a/i/e;-><init>()V

    sput-object v0, La/a/a/i/e;->e:La/a/a/i/e;

    :cond_0
    sget-object v0, La/a/a/i/e;->e:La/a/a/i/e;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, La/a/a/i/e;->c:I

    invoke-virtual {p0, v0}, La/a/a/i/e;->a(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(I)J
    .locals 6

    invoke-static {}, La/a/a/i/i;->c()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, -0x1

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/a/a/i/e;->a:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    new-instance v3, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v3, p0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    int-to-long p0, p1

    :try_start_1
    invoke-virtual {v3, p0, p1}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result p0

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, p1, :cond_2

    :try_start_2
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-wide v4

    :catchall_0
    move-exception p0

    move-object v0, v3

    goto :goto_0

    :catch_1
    move-object v0, v3

    goto :goto_1

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_1
    throw p0

    :catch_3
    :goto_1
    if-eqz v0, :cond_3

    move-object v3, v0

    :cond_2
    :try_start_4
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_3
    return-wide v1
.end method

.method public final a(IJ)V
    .locals 4

    invoke-static {}, La/a/a/i/i;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, La/a/a/i/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "rw"

    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget p1, p0, La/a/a/i/e;->b:I

    invoke-virtual {v1, p1}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1, p2, p3}, Ljava/io/RandomAccessFile;->writeLong(J)V

    iget p0, p0, La/a/a/i/e;->b:I

    invoke-virtual {v1, p0}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(J)V
    .locals 1

    iget v0, p0, La/a/a/i/e;->c:I

    invoke-virtual {p0, v0, p1, p2}, La/a/a/i/e;->a(IJ)V

    return-void
.end method

.method public b()J
    .locals 2

    iget v0, p0, La/a/a/i/e;->d:I

    invoke-virtual {p0, v0}, La/a/a/i/e;->a(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(J)V
    .locals 1

    iget v0, p0, La/a/a/i/e;->d:I

    invoke-virtual {p0, v0, p1, p2}, La/a/a/i/e;->a(IJ)V

    return-void
.end method
