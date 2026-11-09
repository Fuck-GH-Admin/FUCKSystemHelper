.class public La/a/a/e/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/baidu/location/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/e/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/e/a;


# direct methods
.method public constructor <init>(La/a/a/e/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/e/a$b;->a:La/a/a/e/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/location/c;)V
    .locals 1

    iget-object v0, p0, La/a/a/e/a$b;->a:La/a/a/e/a;

    invoke-static {v0}, La/a/a/e/a;->a(La/a/a/e/a;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/e/a$b;->a:La/a/a/e/a;

    invoke-static {v0}, La/a/a/e/a;->a(La/a/a/e/a;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object p0, p0, La/a/a/e/a$b;->a:La/a/a/e/a;

    invoke-static {p0, p1}, La/a/a/e/a;->a(La/a/a/e/a;Lcom/baidu/location/c;)V

    :cond_0
    return-void
.end method
