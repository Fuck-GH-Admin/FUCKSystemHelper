.class Lc/d/a/a/n$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/mobiletools/systemhelper/control/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/d/a/a/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    iput-object p3, p2, Lcom/mobiletools/systemhelper/control/b;->G:Ljava/lang/String;

    iput-object p4, p2, Lcom/mobiletools/systemhelper/control/b;->H:Ljava/lang/String;

    :cond_0
    iget-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->H:Ljava/lang/String;

    if-eqz p0, :cond_1

    const-string p3, ""

    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const-string p0, "ex01"

    iput-object p0, p2, Lcom/mobiletools/systemhelper/control/b;->H:Ljava/lang/String;

    :cond_2
    new-instance p0, Lcom/mobiletools/systemhelper/control/g;

    invoke-direct {p0, p1, p2}, Lcom/mobiletools/systemhelper/control/g;-><init>(Landroid/content/Context;Lcom/mobiletools/systemhelper/control/b;)V

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method
