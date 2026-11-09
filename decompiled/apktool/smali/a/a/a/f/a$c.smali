.class public La/a/a/f/a$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/a/a/f/a;


# direct methods
.method public constructor <init>(La/a/a/f/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/f/a;La/a/a/f/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/f/a$c;-><init>(La/a/a/f/a;)V

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 5

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    iget-object p0, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    invoke-static {p0, v1}, La/a/a/f/a;->a(La/a/a/f/a;Z)Z

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, La/a/a/f/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v0, :cond_1

    iget-object p0, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    invoke-static {p0, v1}, La/a/a/f/a;->a(La/a/a/f/a;Z)Z

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    iget-object v2, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    aget-object v3, p1, v1

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v4, p1, v4

    check-cast v4, La/a/a/g/a;

    invoke-static {v2, v3, v4, v0}, La/a/a/f/a;->a(La/a/a/f/a;Ljava/lang/String;La/a/a/g/a;Landroid/database/sqlite/SQLiteDatabase;)V

    iget-object v2, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    const/4 v3, 0x2

    aget-object v3, p1, v3

    check-cast v3, La/a/a/g/k;

    const/4 v4, 0x3

    aget-object p1, p1, v4

    check-cast p1, Lcom/baidu/location/c;

    invoke-static {v2, v3, p1, v0}, La/a/a/f/a;->a(La/a/a/f/a;La/a/a/g/k;Lcom/baidu/location/c;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iget-object p0, p0, La/a/a/f/a$c;->a:La/a/a/f/a;

    invoke-static {p0, v1}, La/a/a/f/a;->a(La/a/a/f/a;Z)Z

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/f/a$c;->a([Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
