.class public La/a/a/d/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/d/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La/a/a/d/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La/a/a/d/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/d/d;-><init>(La/a/a/d/c;)V

    sput-object v0, La/a/a/d/d$a;->a:La/a/a/d/d;

    return-void
.end method
