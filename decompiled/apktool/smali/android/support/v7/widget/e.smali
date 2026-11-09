.class Landroid/support/v7/widget/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/support/v7/widget/j;

.field private c:I

.field private d:Landroid/support/v7/widget/r0;

.field private e:Landroid/support/v7/widget/r0;

.field private f:Landroid/support/v7/widget/r0;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/e;->c:I

    iput-object p1, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-static {}, Landroid/support/v7/widget/j;->a()Landroid/support/v7/widget/j;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v7/widget/e;->b:Landroid/support/v7/widget/j;

    return-void
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/e;->f:Landroid/support/v7/widget/r0;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/r0;

    invoke-direct {v0}, Landroid/support/v7/widget/r0;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/e;->f:Landroid/support/v7/widget/r0;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/e;->f:Landroid/support/v7/widget/r0;

    invoke-virtual {v0}, Landroid/support/v7/widget/r0;->a()V

    iget-object v1, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-static {v1}, Lb/b/c/g/q;->b(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Landroid/support/v7/widget/r0;->d:Z

    iput-object v1, v0, Landroid/support/v7/widget/r0;->a:Landroid/content/res/ColorStateList;

    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-static {v1}, Lb/b/c/g/q;->c(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    if-eqz v1, :cond_2

    iput-boolean v2, v0, Landroid/support/v7/widget/r0;->c:Z

    iput-object v1, v0, Landroid/support/v7/widget/r0;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    iget-boolean v1, v0, Landroid/support/v7/widget/r0;->d:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, Landroid/support/v7/widget/r0;->c:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_0
    iget-object p0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-static {p1, v0, p0}, Landroid/support/v7/widget/j;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/r0;[I)V

    return v2
.end method

.method private d()Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-le v0, v3, :cond_1

    iget-object p0, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method


# virtual methods
.method a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Landroid/support/v7/widget/e;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/e;->b(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    if-eqz v1, :cond_1

    iget-object p0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-static {v0, v1, p0}, Landroid/support/v7/widget/j;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/r0;[I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    if-eqz v1, :cond_2

    iget-object p0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-static {v0, v1, p0}, Landroid/support/v7/widget/j;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/r0;[I)V

    :cond_2
    :goto_0
    return-void
.end method

.method a(I)V
    .locals 2

    iput p1, p0, Landroid/support/v7/widget/e;->c:I

    iget-object v0, p0, Landroid/support/v7/widget/e;->b:Landroid/support/v7/widget/j;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/support/v7/widget/j;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/e;->a(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/e;->a()V

    return-void
.end method

.method a(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/r0;

    invoke-direct {v0}, Landroid/support/v7/widget/r0;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    iput-object p1, v0, Landroid/support/v7/widget/r0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroid/support/v7/widget/r0;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Landroid/support/v7/widget/e;->d:Landroid/support/v7/widget/r0;

    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/e;->a()V

    return-void
.end method

.method a(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/r0;

    invoke-direct {v0}, Landroid/support/v7/widget/r0;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    iput-object p1, v0, Landroid/support/v7/widget/r0;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroid/support/v7/widget/r0;->c:Z

    invoke-virtual {p0}, Landroid/support/v7/widget/e;->a()V

    return-void
.end method

.method a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, -0x1

    iput p1, p0, Landroid/support/v7/widget/e;->c:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/e;->a(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/e;->a()V

    return-void
.end method

.method a(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lb/b/d/a/j;->ViewBackgroundHelper:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Landroid/support/v7/widget/t0;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/t0;

    move-result-object p1

    :try_start_0
    sget p2, Lb/b/d/a/j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/t0;->g(I)Z

    move-result p2

    const/4 v0, -0x1

    if-eqz p2, :cond_0

    sget p2, Lb/b/d/a/j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2, v0}, Landroid/support/v7/widget/t0;->g(II)I

    move-result p2

    iput p2, p0, Landroid/support/v7/widget/e;->c:I

    iget-object p2, p0, Landroid/support/v7/widget/e;->b:Landroid/support/v7/widget/j;

    iget-object v1, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroid/support/v7/widget/e;->c:I

    invoke-virtual {p2, v1, v2}, Landroid/support/v7/widget/j;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Landroid/support/v7/widget/e;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget p2, Lb/b/d/a/j;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/t0;->g(I)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    sget v1, Lb/b/d/a/j;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, v1}, Landroid/support/v7/widget/t0;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v1}, Lb/b/c/g/q;->a(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    sget p2, Lb/b/d/a/j;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/t0;->g(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p0, p0, Landroid/support/v7/widget/e;->a:Landroid/view/View;

    sget p2, Lb/b/d/a/j;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, p2, v0}, Landroid/support/v7/widget/t0;->d(II)I

    move-result p2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroid/support/v7/widget/c0;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p2

    invoke-static {p0, p2}, Lb/b/c/g/q;->a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/widget/t0;->a()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Landroid/support/v7/widget/t0;->a()V

    throw p0
.end method

.method b()Landroid/content/res/ColorStateList;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    if-eqz p0, :cond_0

    iget-object p0, p0, Landroid/support/v7/widget/r0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method b(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    if-nez v0, :cond_0

    new-instance v0, Landroid/support/v7/widget/r0;

    invoke-direct {v0}, Landroid/support/v7/widget/r0;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    iput-object p1, v0, Landroid/support/v7/widget/r0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroid/support/v7/widget/r0;->d:Z

    invoke-virtual {p0}, Landroid/support/v7/widget/e;->a()V

    return-void
.end method

.method c()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/widget/e;->e:Landroid/support/v7/widget/r0;

    if-eqz p0, :cond_0

    iget-object p0, p0, Landroid/support/v7/widget/r0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
