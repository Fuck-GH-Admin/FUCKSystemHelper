.class public La/a/a/g/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static a:La/a/a/g/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/g/c;

    invoke-direct {v0}, La/a/a/g/c;-><init>()V

    sput-object v0, La/a/a/g/c$b;->a:La/a/a/g/c;

    return-void
.end method

.method public static synthetic a()La/a/a/g/c;
    .locals 1

    sget-object v0, La/a/a/g/c$b;->a:La/a/a/g/c;

    return-object v0
.end method
