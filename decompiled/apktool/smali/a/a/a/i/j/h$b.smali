.class public La/a/a/i/j/h$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/i/j/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:La/a/a/i/j/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/i/j/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/i/j/h;-><init>(La/a/a/i/j/g;)V

    sput-object v0, La/a/a/i/j/h$b;->a:La/a/a/i/j/h;

    return-void
.end method

.method public static synthetic a()La/a/a/i/j/h;
    .locals 1

    sget-object v0, La/a/a/i/j/h$b;->a:La/a/a/i/j/h;

    return-object v0
.end method
