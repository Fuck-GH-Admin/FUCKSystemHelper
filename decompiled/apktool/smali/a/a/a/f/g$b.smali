.class public final La/a/a/f/g$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:D

.field public b:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/a/a/f/g$b;->a:D

    iput-wide p3, p0, La/a/a/f/g$b;->b:D

    return-void
.end method

.method public synthetic constructor <init>(DDLa/a/a/f/g$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La/a/a/f/g$b;-><init>(DD)V

    return-void
.end method

.method public static synthetic a(La/a/a/f/g$b;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/g$b;->b:D

    return-wide v0
.end method

.method public static synthetic a(La/a/a/f/g$b;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/g$b;->b:D

    return-wide p1
.end method

.method public static synthetic b(La/a/a/f/g$b;)D
    .locals 2

    iget-wide v0, p0, La/a/a/f/g$b;->a:D

    return-wide v0
.end method

.method public static synthetic b(La/a/a/f/g$b;D)D
    .locals 0

    iput-wide p1, p0, La/a/a/f/g$b;->a:D

    return-wide p1
.end method
