.class public La/a/a/g/l/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:La/a/a/g/l/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/g/l/b;

    invoke-direct {v0}, La/a/a/g/l/b;-><init>()V

    sput-object v0, La/a/a/g/l/b$b;->a:La/a/a/g/l/b;

    return-void
.end method

.method public static synthetic a()La/a/a/g/l/b;
    .locals 1

    sget-object v0, La/a/a/g/l/b$b;->a:La/a/a/g/l/b;

    return-object v0
.end method
