.class public Landroid/support/v7/app/k;
.super Landroid/support/v7/app/a;
.source ""

# interfaces
.implements Landroid/support/v7/widget/ActionBarOverlayLayout$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/k$d;
    }
.end annotation


# static fields
.field private static final B:Landroid/view/animation/Interpolator;

.field private static final C:Landroid/view/animation/Interpolator;


# instance fields
.field final A:Lb/b/c/g/x;

.field a:Landroid/content/Context;

.field private b:Landroid/content/Context;

.field c:Landroid/support/v7/widget/ActionBarOverlayLayout;

.field d:Landroid/support/v7/widget/ActionBarContainer;

.field e:Landroid/support/v7/widget/b0;

.field f:Landroid/support/v7/widget/ActionBarContextView;

.field g:Landroid/view/View;

.field h:Landroid/support/v7/widget/m0;

.field private i:Z

.field j:Landroid/support/v7/app/k$d;

.field k:Lb/b/d/d/b;

.field l:Lb/b/d/d/b$a;

.field private m:Z

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/support/v7/app/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private o:Z

.field private p:I

.field q:Z

.field r:Z

.field s:Z

.field private t:Z

.field private u:Z

.field v:Lb/b/d/d/h;

.field private w:Z

.field x:Z

.field final y:Lb/b/c/g/v;

.field final z:Lb/b/c/g/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/v7/app/k;->B:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/v7/app/k;->C:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/k;->n:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/app/k;->p:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/k;->q:Z

    iput-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    new-instance v0, Landroid/support/v7/app/k$a;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$a;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->y:Lb/b/c/g/v;

    new-instance v0, Landroid/support/v7/app/k$b;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$b;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->z:Lb/b/c/g/v;

    new-instance v0, Landroid/support/v7/app/k$c;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$c;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->A:Lb/b/c/g/x;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/support/v7/app/k;->b(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v7/app/k;->g:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/k;->n:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/app/k;->p:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/k;->q:Z

    iput-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    new-instance v0, Landroid/support/v7/app/k$a;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$a;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->y:Lb/b/c/g/v;

    new-instance v0, Landroid/support/v7/app/k$b;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$b;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->z:Lb/b/c/g/v;

    new-instance v0, Landroid/support/v7/app/k$c;

    invoke-direct {v0, p0}, Landroid/support/v7/app/k$c;-><init>(Landroid/support/v7/app/k;)V

    iput-object v0, p0, Landroid/support/v7/app/k;->A:Lb/b/c/g/x;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/support/v7/app/k;->b(Landroid/view/View;)V

    return-void
.end method

.method private a(Landroid/view/View;)Landroid/support/v7/widget/b0;
    .locals 2

    instance-of p0, p1, Landroid/support/v7/widget/b0;

    if-eqz p0, :cond_0

    check-cast p1, Landroid/support/v7/widget/b0;

    return-object p1

    :cond_0
    instance-of p0, p1, Landroid/support/v7/widget/Toolbar;

    if-eqz p0, :cond_1

    check-cast p1, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getWrapper()Landroid/support/v7/widget/b0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t make a decor toolbar out of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string p1, "null"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static a(ZZZ)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    sget v0, Lb/b/d/a/f;->decor_content_parent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroid/support/v7/widget/ActionBarOverlayLayout$d;)V

    :cond_0
    sget v0, Lb/b/d/a/f;->action_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v7/app/k;->a(Landroid/view/View;)Landroid/support/v7/widget/b0;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    sget v0, Lb/b/d/a/f;->action_context_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ActionBarContextView;

    iput-object v0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    sget v0, Lb/b/d/a/f;->action_bar_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/ActionBarContainer;

    iput-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    iget-object v0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    if-eqz v0, :cond_7

    iget-object v1, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    invoke-interface {v0}, Landroid/support/v7/widget/b0;->m()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1}, Landroid/support/v7/widget/b0;->h()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    iput-boolean v0, p0, Landroid/support/v7/app/k;->i:Z

    :cond_2
    iget-object v2, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-static {v2}, Lb/b/d/d/a;->a(Landroid/content/Context;)Lb/b/d/d/a;

    move-result-object v2

    invoke-virtual {v2}, Lb/b/d/d/a;->a()Z

    move-result v3

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move p1, v1

    goto :goto_2

    :cond_4
    :goto_1
    move p1, v0

    :goto_2
    invoke-virtual {p0, p1}, Landroid/support/v7/app/k;->j(Z)V

    invoke-virtual {v2}, Lb/b/d/d/a;->f()Z

    move-result p1

    invoke-direct {p0, p1}, Landroid/support/v7/app/k;->k(Z)V

    iget-object p1, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, Lb/b/d/a/j;->ActionBar:[I

    sget v4, Lb/b/d/a/a;->actionBarStyle:I

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v2, Lb/b/d/a/j;->ActionBar_hideOnContentScroll:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Landroid/support/v7/app/k;->i(Z)V

    :cond_5
    sget v0, Lb/b/d/a/j;->ActionBar_elevation:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/k;->a(F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v0, Landroid/support/v7/app/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " can only be used "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "with a compatible window decor layout"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private k(Z)V
    .locals 4

    iput-boolean p1, p0, Landroid/support/v7/app/k;->o:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1, v0}, Landroid/support/v7/widget/b0;->a(Landroid/support/v7/widget/m0;)V

    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    iget-object v0, p0, Landroid/support/v7/app/k;->h:Landroid/support/v7/widget/m0;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/widget/m0;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/widget/m0;)V

    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    iget-object v0, p0, Landroid/support/v7/app/k;->h:Landroid/support/v7/widget/m0;

    invoke-interface {p1, v0}, Landroid/support/v7/widget/b0;->a(Landroid/support/v7/widget/m0;)V

    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/app/k;->m()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v0, p0, Landroid/support/v7/app/k;->h:Landroid/support/v7/widget/m0;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    iget-object v0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lb/b/c/g/q;->m(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    :cond_3
    :goto_2
    iget-object v0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    iget-boolean v3, p0, Landroid/support/v7/app/k;->o:Z

    if-nez v3, :cond_4

    if-eqz p1, :cond_4

    move v3, v1

    goto :goto_3

    :cond_4
    move v3, v2

    :goto_3
    invoke-interface {v0, v3}, Landroid/support/v7/widget/b0;->b(Z)V

    iget-object v0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    iget-boolean p0, p0, Landroid/support/v7/app/k;->o:Z

    if-nez p0, :cond_5

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    move v1, v2

    :goto_4
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method private l(Z)V
    .locals 3

    iget-boolean v0, p0, Landroid/support/v7/app/k;->r:Z

    iget-boolean v1, p0, Landroid/support/v7/app/k;->s:Z

    iget-boolean v2, p0, Landroid/support/v7/app/k;->t:Z

    invoke-static {v0, v1, v2}, Landroid/support/v7/app/k;->a(ZZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k;->g(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/k;->u:Z

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k;->f(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private n()V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/app/k;->t:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/k;->t:Z

    iget-object v1, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-direct {p0, v0}, Landroid/support/v7/app/k;->l(Z)V

    :cond_1
    return-void
.end method

.method private o()Z
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-static {p0}, Lb/b/c/g/q;->k(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private p()V
    .locals 2

    iget-boolean v0, p0, Landroid/support/v7/app/k;->t:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/k;->t:Z

    iget-object v1, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/app/k;->l(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lb/b/d/d/b$a;)Lb/b/d/d/b;
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/app/k$d;->a()V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarContextView;->c()V

    new-instance v0, Landroid/support/v7/app/k$d;

    iget-object v1, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Landroid/support/v7/app/k$d;-><init>(Landroid/support/v7/app/k;Landroid/content/Context;Lb/b/d/d/b$a;)V

    invoke-virtual {v0}, Landroid/support/v7/app/k$d;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    invoke-virtual {v0}, Landroid/support/v7/app/k$d;->i()V

    iget-object p1, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/ActionBarContextView;->a(Lb/b/d/d/b;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k;->e(Z)V

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    const/16 p1, 0x20

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/b/d/d/h;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    :cond_0
    return-void
.end method

.method public a(F)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-static {p0, p1}, Lb/b/c/g/q;->a(Landroid/view/View;F)V

    return-void
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Landroid/support/v7/app/k;->p:I

    return-void
.end method

.method public a(II)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {v0}, Landroid/support/v7/widget/b0;->h()I

    move-result v0

    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/app/k;->i:Z

    :cond_0
    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {p0, p1}, Landroid/support/v7/widget/b0;->c(I)V

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-static {p1}, Lb/b/d/d/a;->a(Landroid/content/Context;)Lb/b/d/d/a;

    move-result-object p1

    invoke-virtual {p1}, Lb/b/d/d/a;->f()Z

    move-result p1

    invoke-direct {p0, p1}, Landroid/support/v7/app/k;->k(Z)V

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p0, p1}, Landroid/support/v7/widget/b0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/app/k;->q:Z

    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 3

    iget-object p0, p0, Landroid/support/v7/app/k;->j:Landroid/support/v7/app/k$d;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/app/k$d;->c()Landroid/view/Menu;

    move-result-object p0

    if-eqz p0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    invoke-static {v1}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    invoke-interface {p0, v2}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {p0, p1, p2, v0}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p0

    return p0

    :cond_3
    return v0
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/app/k;->s:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/k;->s:Z

    invoke-direct {p0, v0}, Landroid/support/v7/app/k;->l(Z)V

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 3

    iget-boolean v0, p0, Landroid/support/v7/app/k;->m:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/app/k;->m:Z

    iget-object v0, p0, Landroid/support/v7/app/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroid/support/v7/app/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/app/a$b;

    invoke-interface {v2, p1}, Landroid/support/v7/app/a$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/app/k;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/k;->s:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v7/app/k;->l(Z)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/app/k;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v7/app/k;->h(Z)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/app/k;->w:Z

    if-nez p1, :cond_0

    iget-object p0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lb/b/d/d/h;->a()V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 9

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroid/support/v7/app/k;->p()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroid/support/v7/app/k;->n()V

    :goto_0
    invoke-direct {p0}, Landroid/support/v7/app/k;->o()Z

    move-result v0

    const/4 v1, 0x4

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-wide/16 v4, 0x64

    const-wide/16 v6, 0xc8

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1, v1, v4, v5}, Landroid/support/v7/widget/b0;->a(IJ)Lb/b/c/g/u;

    move-result-object p1

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, v3, v6, v7}, Landroid/support/v7/widget/ActionBarContextView;->a(IJ)Lb/b/c/g/u;

    move-result-object p0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1, v3, v6, v7}, Landroid/support/v7/widget/b0;->a(IJ)Lb/b/c/g/u;

    move-result-object p1

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, v2, v4, v5}, Landroid/support/v7/widget/ActionBarContextView;->a(IJ)Lb/b/c/g/u;

    move-result-object p0

    move-object v8, p1

    move-object p1, p0

    move-object p0, v8

    :goto_1
    new-instance v0, Lb/b/d/d/h;

    invoke-direct {v0}, Lb/b/d/d/h;-><init>()V

    invoke-virtual {v0, p1, p0}, Lb/b/d/d/h;->a(Lb/b/c/g/u;Lb/b/c/g/u;)Lb/b/d/d/h;

    invoke-virtual {v0}, Lb/b/d/d/h;->c()V

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1, v1}, Landroid/support/v7/widget/b0;->a(I)V

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, v3}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p1, v3}, Landroid/support/v7/widget/b0;->a(I)V

    iget-object p0, p0, Landroid/support/v7/app/k;->f:Landroid/support/v7/widget/ActionBarContextView;

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/ActionBarContextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public f(Z)V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/b/d/d/h;->a()V

    :cond_0
    iget v0, p0, Landroid/support/v7/app/k;->p:I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroid/support/v7/app/k;->w:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object v0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, Lb/b/d/d/h;

    invoke-direct {v0}, Lb/b/d/d/h;-><init>()V

    iget-object v2, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v3, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    aget p1, p1, v1

    int-to-float p1, p1

    sub-float/2addr v2, p1

    :cond_2
    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-static {p1}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object p1

    invoke-virtual {p1, v2}, Lb/b/c/g/u;->b(F)Lb/b/c/g/u;

    iget-object v1, p0, Landroid/support/v7/app/k;->A:Lb/b/c/g/x;

    invoke-virtual {p1, v1}, Lb/b/c/g/u;->a(Lb/b/c/g/x;)Lb/b/c/g/u;

    invoke-virtual {v0, p1}, Lb/b/d/d/h;->a(Lb/b/c/g/u;)Lb/b/d/d/h;

    iget-boolean p1, p0, Landroid/support/v7/app/k;->q:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroid/support/v7/app/k;->g:Landroid/view/View;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object p1

    invoke-virtual {p1, v2}, Lb/b/c/g/u;->b(F)Lb/b/c/g/u;

    invoke-virtual {v0, p1}, Lb/b/d/d/h;->a(Lb/b/c/g/u;)Lb/b/d/d/h;

    :cond_3
    sget-object p1, Landroid/support/v7/app/k;->B:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Lb/b/d/d/h;->a(Landroid/view/animation/Interpolator;)Lb/b/d/d/h;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Lb/b/d/d/h;->a(J)Lb/b/d/d/h;

    iget-object p1, p0, Landroid/support/v7/app/k;->y:Lb/b/c/g/v;

    invoke-virtual {v0, p1}, Lb/b/d/d/h;->a(Lb/b/c/g/v;)Lb/b/d/d/h;

    iput-object v0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    invoke-virtual {v0}, Lb/b/d/d/h;->c()V

    goto :goto_0

    :cond_4
    iget-object p0, p0, Landroid/support/v7/app/k;->y:Lb/b/c/g/v;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lb/b/c/g/v;->a(Landroid/view/View;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/support/v7/widget/b0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p0}, Landroid/support/v7/widget/b0;->collapseActionView()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public g()I
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p0}, Landroid/support/v7/widget/b0;->h()I

    move-result p0

    return p0
.end method

.method public g(Z)V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/b/d/d/h;->a()V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Landroid/support/v7/app/k;->p:I

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroid/support/v7/app/k;->w:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-object v0, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v2, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V

    const/4 v2, 0x1

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_2
    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    new-instance p1, Lb/b/d/d/h;

    invoke-direct {p1}, Lb/b/d/d/h;-><init>()V

    iget-object v2, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-static {v2}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object v2

    invoke-virtual {v2, v1}, Lb/b/c/g/u;->b(F)Lb/b/c/g/u;

    iget-object v3, p0, Landroid/support/v7/app/k;->A:Lb/b/c/g/x;

    invoke-virtual {v2, v3}, Lb/b/c/g/u;->a(Lb/b/c/g/x;)Lb/b/c/g/u;

    invoke-virtual {p1, v2}, Lb/b/d/d/h;->a(Lb/b/c/g/u;)Lb/b/d/d/h;

    iget-boolean v2, p0, Landroid/support/v7/app/k;->q:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroid/support/v7/app/k;->g:Landroid/view/View;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Landroid/support/v7/app/k;->g:Landroid/view/View;

    invoke-static {v0}, Lb/b/c/g/q;->a(Landroid/view/View;)Lb/b/c/g/u;

    move-result-object v0

    invoke-virtual {v0, v1}, Lb/b/c/g/u;->b(F)Lb/b/c/g/u;

    invoke-virtual {p1, v0}, Lb/b/d/d/h;->a(Lb/b/c/g/u;)Lb/b/d/d/h;

    :cond_3
    sget-object v0, Landroid/support/v7/app/k;->C:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Lb/b/d/d/h;->a(Landroid/view/animation/Interpolator;)Lb/b/d/d/h;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, Lb/b/d/d/h;->a(J)Lb/b/d/d/h;

    iget-object v0, p0, Landroid/support/v7/app/k;->z:Lb/b/c/g/v;

    invoke-virtual {p1, v0}, Lb/b/d/d/h;->a(Lb/b/c/g/v;)Lb/b/d/d/h;

    iput-object p1, p0, Landroid/support/v7/app/k;->v:Lb/b/d/d/h;

    invoke-virtual {p1}, Lb/b/d/d/h;->c()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setAlpha(F)V

    iget-object p1, p0, Landroid/support/v7/app/k;->d:Landroid/support/v7/widget/ActionBarContainer;

    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    iget-boolean p1, p0, Landroid/support/v7/app/k;->q:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroid/support/v7/app/k;->g:Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    iget-object p1, p0, Landroid/support/v7/app/k;->z:Lb/b/c/g/v;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lb/b/c/g/v;->a(Landroid/view/View;)V

    :goto_0
    iget-object p0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    if-eqz p0, :cond_6

    invoke-static {p0}, Lb/b/c/g/q;->m(Landroid/view/View;)V

    :cond_6
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public h()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/k;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Lb/b/d/a/a;->actionBarWidgetTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Landroid/support/v7/app/k;->b:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/k;->a:Landroid/content/Context;

    iput-object v0, p0, Landroid/support/v7/app/k;->b:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object p0, p0, Landroid/support/v7/app/k;->b:Landroid/content/Context;

    return-object p0
.end method

.method public h(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/app/k;->a(II)V

    return-void
.end method

.method public i(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroid/support/v7/widget/ActionBarOverlayLayout;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    iput-boolean p1, p0, Landroid/support/v7/app/k;->x:Z

    iget-object p0, p0, Landroid/support/v7/app/k;->c:Landroid/support/v7/widget/ActionBarOverlayLayout;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    return-void
.end method

.method public j(Z)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p0, p1}, Landroid/support/v7/widget/b0;->a(Z)V

    return-void
.end method

.method l()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/k;->l:Lb/b/d/d/b$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/app/k;->k:Lb/b/d/d/b;

    invoke-interface {v0, v1}, Lb/b/d/d/b$a;->a(Lb/b/d/d/b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/k;->k:Lb/b/d/d/b;

    iput-object v0, p0, Landroid/support/v7/app/k;->l:Lb/b/d/d/b$a;

    :cond_0
    return-void
.end method

.method public m()I
    .locals 0

    iget-object p0, p0, Landroid/support/v7/app/k;->e:Landroid/support/v7/widget/b0;

    invoke-interface {p0}, Landroid/support/v7/widget/b0;->n()I

    move-result p0

    return p0
.end method
