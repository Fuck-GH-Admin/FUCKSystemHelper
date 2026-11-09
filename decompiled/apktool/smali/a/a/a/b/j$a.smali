.class public La/a/a/b/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/j;->e(Landroid/location/Location;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/location/Location;

.field public final synthetic c:La/a/a/b/j;


# direct methods
.method public constructor <init>(La/a/a/b/j;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/j$a;->c:La/a/a/b/j;

    iput-object p2, p0, La/a/a/b/j$a;->b:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/a/a/b/j$a;->c:La/a/a/b/j;

    iget-object p0, p0, La/a/a/b/j$a;->b:Landroid/location/Location;

    invoke-static {v0, p0}, La/a/a/b/j;->a(La/a/a/b/j;Landroid/location/Location;)V

    return-void
.end method
