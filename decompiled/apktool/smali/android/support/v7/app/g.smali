.class public Landroid/support/v7/app/g;
.super Landroid/app/Dialog;
.source ""

# interfaces
.implements Landroid/support/v7/app/d;


# instance fields
.field private b:Landroid/support/v7/app/e;

.field private final c:Lb/b/c/g/e$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-static {p1, p2}, Landroid/support/v7/app/g;->a(Landroid/content/Context;I)I

    move-result p2

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, Landroid/support/v7/app/g$a;

    invoke-direct {p1, p0}, Landroid/support/v7/app/g$a;-><init>(Landroid/support/v7/app/g;)V

    iput-object p1, p0, Landroid/support/v7/app/g;->c:Lb/b/c/g/e$a;

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/support/v7/app/e;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v7/app/e;->a()Z

    return-void
.end method

.method private static a(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lb/b/d/a/a;->dialogTheme:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public a()Landroid/support/v7/app/e;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/g;->b:Landroid/support/v7/app/e;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Landroid/support/v7/app/e;->a(Landroid/app/Dialog;Landroid/support/v7/app/d;)Landroid/support/v7/app/e;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/g;->b:Landroid/support/v7/app/e;

    :cond_0
    iget-object p0, p0, Landroid/support/v7/app/g;->b:Landroid/support/v7/app/e;

    return-object p0
.end method

.method public a(Lb/b/d/d/b$a;)Lb/b/d/d/b;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public a(Lb/b/d/d/b;)V
    .locals 0

    return-void
.end method

.method public a(I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->b(I)Z

    move-result p0

    return p0
.end method

.method a(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/app/e;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(Lb/b/d/d/b;)V
    .locals 0

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/app/g;->c:Lb/b/c/g/e$a;

    invoke-static {v1, v0, p0, p1}, Lb/b/c/g/e;->a(Lb/b/c/g/e$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->a(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public invalidateOptionsMenu()V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v7/app/e;->e()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/e;->d()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStop()V
    .locals 0

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v7/app/e;->i()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->c(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/app/e;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/support/v7/app/e;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/support/v7/app/g;->a()Landroid/support/v7/app/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/e;->a(Ljava/lang/CharSequence;)V

    return-void
.end method
