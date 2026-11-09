.class public La/a/a/b/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/b/o;->a(Lcom/baidu/location/c;)Lcom/baidu/location/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/b/o;


# direct methods
.method public constructor <init>(La/a/a/b/o;)V
    .locals 0

    iput-object p1, p0, La/a/a/b/o$a;->b:La/a/a/b/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object p0, p0, La/a/a/b/o$a;->b:La/a/a/b/o;

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/a/a/b/o;->a(La/a/a/b/o;Landroid/os/Message;)V

    return-void
.end method
