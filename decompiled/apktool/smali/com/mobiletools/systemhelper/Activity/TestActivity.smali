.class public Lcom/mobiletools/systemhelper/Activity/TestActivity;
.super Landroid/support/v7/app/c;
.source ""


# instance fields
.field private q:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/c;-><init>()V

    return-void
.end method

.method private l()V
    .locals 2

    const v0, 0x7f0700cf

    invoke-virtual {p0, v0}, Landroid/support/v7/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/mobiletools/systemhelper/Activity/TestActivity;->q:Landroid/widget/TextView;

    invoke-static {}, Lc/d/a/a/n;->c()V

    invoke-static {p0}, Lc/d/a/a/n;->a(Landroid/content/Context;)Lc/d/a/a/n$c;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/mobiletools/systemhelper/control/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mobiletools/systemhelper/control/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobiletools/systemhelper/control/b;->a()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object p0, p0, Lcom/mobiletools/systemhelper/Activity/TestActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/support/v7/app/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001c

    invoke-virtual {p0, p1}, Landroid/support/v7/app/c;->setContentView(I)V

    sget-boolean p1, Lc/d/a/b/d;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "preference_enable_log"

    invoke-static {p0, v0, p1}, Lc/d/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sput-boolean p1, Lc/d/a/b/d;->a:Z

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p1, v0, :cond_1

    invoke-static {p0}, Lc/d/a/a/a;->e(Landroid/content/Context;)V

    :cond_1
    const-string p1, "android.permission.READ_PHONE_STATE"

    invoke-static {p0, p1}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    if-nez v0, :cond_3

    invoke-static {p0, v4}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0, v3}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0, v2}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p0, v1}, Lb/b/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/mobiletools/systemhelper/Activity/TestActivity;->l()V

    goto :goto_1

    :cond_3
    :goto_0
    filled-new-array {p1, v4, v3, v2, v1}, [Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/support/v4/app/a;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    :goto_1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    return-void

    :cond_0
    array-length p1, p3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    aget p1, p3, p1

    if-nez p1, :cond_1

    aget p1, p3, p2

    if-nez p1, :cond_1

    const/4 p1, 0x2

    aget p1, p3, p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/mobiletools/systemhelper/Activity/TestActivity;->l()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method
