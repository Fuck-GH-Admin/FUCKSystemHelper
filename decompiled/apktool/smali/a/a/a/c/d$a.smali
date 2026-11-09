.class public La/a/a/c/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/c/d;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:La/a/a/c/d;


# direct methods
.method public constructor <init>(La/a/a/c/d;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/d$a;->b:La/a/a/c/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    iget-object p0, p0, La/a/a/c/d$a;->b:La/a/a/c/d;

    invoke-static {p0}, La/a/a/c/d;->a(La/a/a/c/d;)V

    return-void
.end method
