.class public La/a/a/b/s$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/b/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:D


# direct methods
.method public constructor <init>(La/a/a/b/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, La/a/a/b/s$b;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La/a/a/b/s$b;->b:D

    return-void
.end method
