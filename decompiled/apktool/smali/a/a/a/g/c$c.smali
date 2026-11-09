.class public La/a/a/g/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/b/p$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/g/c;


# direct methods
.method public constructor <init>(La/a/a/g/c;)V
    .locals 0

    iput-object p1, p0, La/a/a/g/c$c;->a:La/a/a/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/g/c;La/a/a/g/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, La/a/a/g/c$c;-><init>(La/a/a/g/c;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, La/a/a/g/c$c;->a:La/a/a/g/c;

    iput-object p1, p0, La/a/a/g/c;->b:Landroid/location/Location;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/g/c;->e:J

    return-void
.end method
