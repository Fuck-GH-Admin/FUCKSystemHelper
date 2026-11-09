.class public La/a/a/d/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:La/a/a/d/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/d/k;

    invoke-direct {v0}, La/a/a/d/k;-><init>()V

    sput-object v0, La/a/a/d/k$b;->a:La/a/a/d/k;

    return-void
.end method

.method public static synthetic a()La/a/a/d/k;
    .locals 1

    sget-object v0, La/a/a/d/k$b;->a:La/a/a/d/k;

    return-object v0
.end method
