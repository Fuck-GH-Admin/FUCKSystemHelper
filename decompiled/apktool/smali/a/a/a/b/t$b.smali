.class public La/a/a/b/t$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:La/a/a/b/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/b/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/b/t;-><init>(La/a/a/b/t$a;)V

    sput-object v0, La/a/a/b/t$b;->a:La/a/a/b/t;

    return-void
.end method

.method public static synthetic a()La/a/a/b/t;
    .locals 1

    sget-object v0, La/a/a/b/t$b;->a:La/a/a/b/t;

    return-object v0
.end method
