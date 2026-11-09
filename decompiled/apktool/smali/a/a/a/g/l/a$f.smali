.class public La/a/a/g/l/a$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static a:La/a/a/g/l/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, La/a/a/g/l/a;

    invoke-direct {v0}, La/a/a/g/l/a;-><init>()V

    sput-object v0, La/a/a/g/l/a$f;->a:La/a/a/g/l/a;

    return-void
.end method

.method public static synthetic a()La/a/a/g/l/a;
    .locals 1

    sget-object v0, La/a/a/g/l/a$f;->a:La/a/a/g/l/a;

    return-object v0
.end method
