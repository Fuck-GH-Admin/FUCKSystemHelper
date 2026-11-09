.class public La/a/a/b/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:La/a/a/b/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/b/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/b/b;-><init>(La/a/a/b/b$a;)V

    sput-object v0, La/a/a/b/b$b;->a:La/a/a/b/b;

    return-void
.end method
