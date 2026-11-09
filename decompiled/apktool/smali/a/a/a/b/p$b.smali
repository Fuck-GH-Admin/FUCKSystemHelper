.class public La/a/a/b/p$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:La/a/a/b/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/b/p;

    invoke-direct {v0}, La/a/a/b/p;-><init>()V

    sput-object v0, La/a/a/b/p$b;->a:La/a/a/b/p;

    return-void
.end method

.method public static synthetic a()La/a/a/b/p;
    .locals 1

    sget-object v0, La/a/a/b/p$b;->a:La/a/a/b/p;

    return-object v0
.end method
