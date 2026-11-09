.class public abstract Landroid/support/v4/app/i;
.super Landroid/support/v4/app/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/app/g;"
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field final d:Landroid/support/v4/app/k;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/g;-><init>()V

    new-instance p4, Landroid/support/v4/app/k;

    invoke-direct {p4}, Landroid/support/v4/app/k;-><init>()V

    iput-object p4, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    iput-object p1, p0, Landroid/support/v4/app/i;->a:Landroid/app/Activity;

    const-string p1, "context == null"

    invoke-static {p2, p1}, Lb/b/c/f/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    iput-object p2, p0, Landroid/support/v4/app/i;->b:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {p3, p1}, Lb/b/c/f/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Landroid/os/Handler;

    iput-object p3, p0, Landroid/support/v4/app/i;->c:Landroid/os/Handler;

    return-void
.end method

.method constructor <init>(Landroid/support/v4/app/f;)V
    .locals 2

    iget-object v0, p1, Landroid/support/v4/app/f;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p1, v0, v1}, Landroid/support/v4/app/i;-><init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V

    return-void
.end method


# virtual methods
.method abstract a(Landroid/support/v4/app/e;)V
.end method

.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method b()Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/i;->a:Landroid/app/Activity;

    return-object p0
.end method

.method public abstract b(Landroid/support/v4/app/e;)Z
.end method

.method c()Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/i;->b:Landroid/content/Context;

    return-object p0
.end method

.method d()Landroid/support/v4/app/k;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    return-object p0
.end method

.method e()Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/i;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public abstract f()Landroid/view/LayoutInflater;
.end method

.method public abstract g()I
.end method

.method public abstract h()Z
.end method

.method public abstract i()V
.end method
