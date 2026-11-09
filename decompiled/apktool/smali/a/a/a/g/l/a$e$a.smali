.class public La/a/a/g/l/a$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/g/l/a$e;->onCellInfoChanged(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/g/l/a$e;


# direct methods
.method public constructor <init>(La/a/a/g/l/a$e;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/l/a$e$a;->b:La/a/a/g/l/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v0, La/a/a/g/m/a;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    const-string v1, "cell received cellinfo change"

    invoke-virtual {v0, v1}, La/a/a/g/e;->a(Ljava/lang/String;)V

    :cond_0
    iget-object p0, p0, La/a/a/g/l/a$e$a;->b:La/a/a/g/l/a$e;

    iget-object p0, p0, La/a/a/g/l/a$e;->a:La/a/a/g/l/a;

    invoke-static {p0}, La/a/a/g/l/a;->e(La/a/a/g/l/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-boolean v0, La/a/a/g/m/a;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
