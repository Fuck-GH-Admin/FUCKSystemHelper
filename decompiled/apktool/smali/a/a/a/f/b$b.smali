.class public final La/a/a/f/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:D

.field public b:D

.field public c:D


# direct methods
.method public constructor <init>(DDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/a/a/f/b$b;->a:D

    iput-wide p3, p0, La/a/a/f/b$b;->b:D

    iput-wide p5, p0, La/a/a/f/b$b;->c:D

    return-void
.end method

.method public synthetic constructor <init>(DDDLa/a/a/f/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, La/a/a/f/b$b;-><init>(DDD)V

    return-void
.end method
