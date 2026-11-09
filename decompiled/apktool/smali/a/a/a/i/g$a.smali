.class public La/a/a/i/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/b/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/i/g;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:La/a/a/i/g;


# direct methods
.method public constructor <init>(La/a/a/i/g;J)V
    .locals 0

    iput-object p1, p0, La/a/a/i/g$a;->b:La/a/a/i/g;

    iput-wide p2, p0, La/a/a/i/g$a;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 4

    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    iget-object p1, p0, La/a/a/i/g$a;->b:La/a/a/i/g;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, La/a/a/i/g$a;->a:J

    sub-long/2addr v0, v2

    iput-wide v0, p1, La/a/a/i/g;->g:J

    iget-object p0, p0, La/a/a/i/g$a;->b:La/a/a/i/g;

    iput-object p2, p0, La/a/a/i/g;->c:Ljava/lang/String;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/a/a/i/g$a;->b:La/a/a/i/g;

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 0

    iget-object p0, p0, La/a/a/i/g$a;->b:La/a/a/i/g;

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/i/g;->c:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, La/a/a/i/g;->a(Z)V

    return-void
.end method
