.class public La/a/a/b/c$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static a:La/a/a/b/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/b/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/b/c;-><init>(La/a/a/b/c$a;)V

    sput-object v0, La/a/a/b/c$c;->a:La/a/a/b/c;

    return-void
.end method

.method public static synthetic a()La/a/a/b/c;
    .locals 1

    sget-object v0, La/a/a/b/c$c;->a:La/a/a/b/c;

    return-object v0
.end method
