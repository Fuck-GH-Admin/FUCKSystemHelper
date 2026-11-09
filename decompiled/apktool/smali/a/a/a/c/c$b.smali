.class public La/a/a/c/c$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:La/a/a/c/c;


# direct methods
.method public constructor <init>(La/a/a/c/c;)V
    .locals 0

    iput-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    const/4 v1, 0x0

    invoke-static {p1, v1}, La/a/a/c/c;->a(La/a/a/c/c;Z)Z

    const-string p1, "status"

    invoke-virtual {p2, p1, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v2, "plugged"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "level"

    const/4 v3, -0x1

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "scale"

    invoke-virtual {p2, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-lez v2, :cond_0

    if-lez p2, :cond_0

    iget-object v3, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    mul-int/lit8 v2, v2, 0x64

    div-int/2addr v2, p2

    invoke-static {v3, v2}, La/a/a/c/c;->a(La/a/a/c/c;I)I

    goto :goto_0

    :cond_0
    iget-object p2, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p2, v3}, La/a/a/c/c;->a(La/a/a/c/c;I)I

    :goto_0
    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 v2, 0x3

    if-eq p1, v2, :cond_1

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p1, v0}, La/a/a/c/c;->a(La/a/a/c/c;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    :cond_1
    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    const-string v2, "3"

    :goto_1
    invoke-static {p1, v2}, La/a/a/c/c;->a(La/a/a/c/c;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    const-string v2, "4"

    goto :goto_1

    :goto_2
    const/4 p1, 0x1

    if-eq v1, p1, :cond_4

    if-eq v1, p2, :cond_3

    goto :goto_5

    :cond_3
    iget-object p2, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    const-string v1, "5"

    :goto_3
    invoke-static {p2, v1}, La/a/a/c/c;->a(La/a/a/c/c;Ljava/lang/String;)Ljava/lang/String;

    iget-object p2, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    goto :goto_4

    :cond_4
    iget-object p2, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    const-string v1, "6"

    goto :goto_3

    :goto_4
    invoke-static {p2, p1}, La/a/a/c/c;->a(La/a/a/c/c;Z)Z

    :goto_5
    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p1}, La/a/a/c/c;->b(La/a/a/c/c;)La/a/a/c/c$a;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p1}, La/a/a/c/c;->b(La/a/a/c/c;)La/a/a/c/c$a;

    move-result-object p1

    iget-object p2, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p2}, La/a/a/c/c;->a(La/a/a/c/c;)Z

    move-result p2

    invoke-interface {p1, p2}, La/a/a/c/c$a;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    iget-object p0, p0, La/a/a/c/c$b;->a:La/a/a/c/c;

    invoke-static {p0, v0}, La/a/a/c/c;->a(La/a/a/c/c;Ljava/lang/String;)Ljava/lang/String;

    :cond_5
    :goto_6
    return-void
.end method
