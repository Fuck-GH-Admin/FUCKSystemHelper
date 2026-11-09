.class public La/a/a/b/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La/a/a/b/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/b/i;

    invoke-direct {v0}, La/a/a/b/i;-><init>()V

    sput-object v0, La/a/a/b/i$a;->a:La/a/a/b/i;

    return-void
.end method

.method public static synthetic a()La/a/a/b/i;
    .locals 1

    sget-object v0, La/a/a/b/i$a;->a:La/a/a/b/i;

    return-object v0
.end method
