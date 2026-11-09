.class public La/a/a/f/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/f/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/f/a;


# direct methods
.method public constructor <init>(La/a/a/f/a;)V
    .locals 0

    iput-object p1, p0, La/a/a/f/a$a;->b:La/a/a/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    sget-boolean v0, Lcom/baidu/location/f;->f:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, La/a/a/f/a$a;->b:La/a/a/f/a;

    invoke-static {p0}, La/a/a/f/a;->a(La/a/a/f/a;)V

    :cond_0
    return-void
.end method
