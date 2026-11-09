.class public La/a/a/b/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:La/a/a/b/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/b/f;

    invoke-direct {v0}, La/a/a/b/f;-><init>()V

    sput-object v0, La/a/a/b/f$a;->a:La/a/a/b/f;

    return-void
.end method

.method public static synthetic a()La/a/a/b/f;
    .locals 1

    sget-object v0, La/a/a/b/f$a;->a:La/a/a/b/f;

    return-object v0
.end method
