.class public La/a/a/d/i$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# static fields
.field public static a:La/a/a/d/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/d/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/d/i;-><init>(La/a/a/d/i$a;)V

    sput-object v0, La/a/a/d/i$i;->a:La/a/a/d/i;

    return-void
.end method

.method public static synthetic a()La/a/a/d/i;
    .locals 1

    sget-object v0, La/a/a/d/i$i;->a:La/a/a/d/i;

    return-object v0
.end method
