.class public La/a/a/b/a$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:La/a/a/b/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/b/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/b/a;-><init>(La/a/a/b/a$a;)V

    sput-object v0, La/a/a/b/a$c;->a:La/a/a/b/a;

    return-void
.end method
