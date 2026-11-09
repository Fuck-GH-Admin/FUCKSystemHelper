.class public La/a/a/g/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:La/a/a/g/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/g/f;

    invoke-direct {v0}, La/a/a/g/f;-><init>()V

    sput-object v0, La/a/a/g/f$b;->a:La/a/a/g/f;

    return-void
.end method

.method public static synthetic a()La/a/a/g/f;
    .locals 1

    sget-object v0, La/a/a/g/f$b;->a:La/a/a/g/f;

    return-object v0
.end method
