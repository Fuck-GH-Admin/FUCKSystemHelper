.class public La/a/a/b/q$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:La/a/a/b/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/b/q;

    invoke-direct {v0}, La/a/a/b/q;-><init>()V

    sput-object v0, La/a/a/b/q$b;->a:La/a/a/b/q;

    return-void
.end method

.method public static synthetic a()La/a/a/b/q;
    .locals 1

    sget-object v0, La/a/a/b/q$b;->a:La/a/a/b/q;

    return-object v0
.end method
