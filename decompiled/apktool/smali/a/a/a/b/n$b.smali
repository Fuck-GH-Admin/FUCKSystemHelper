.class public La/a/a/b/n$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:La/a/a/b/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/b/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/b/n;-><init>(La/a/a/b/n$a;)V

    sput-object v0, La/a/a/b/n$b;->a:La/a/a/b/n;

    return-void
.end method

.method public static synthetic a()La/a/a/b/n;
    .locals 1

    sget-object v0, La/a/a/b/n$b;->a:La/a/a/b/n;

    return-object v0
.end method
