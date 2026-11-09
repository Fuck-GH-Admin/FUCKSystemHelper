.class final Landroid/support/v7/view/menu/t;
.super Landroid/support/v7/view/menu/m;
.source ""

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/support/v7/view/menu/o;
.implements Landroid/view/View$OnKeyListener;


# static fields
.field private static final w:I


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Landroid/support/v7/view/menu/h;

.field private final e:Landroid/support/v7/view/menu/g;

.field private final f:Z

.field private final g:I

.field private final h:I

.field private final i:I

.field final j:Landroid/support/v7/widget/j0;

.field final k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private final l:Landroid/view/View$OnAttachStateChangeListener;

.field private m:Landroid/widget/PopupWindow$OnDismissListener;

.field private n:Landroid/view/View;

.field o:Landroid/view/View;

.field private p:Landroid/support/v7/view/menu/o$a;

.field q:Landroid/view/ViewTreeObserver;

.field private r:Z

.field private s:Z

.field private t:I

.field private u:I

.field private v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb/b/d/a/g;->abc_popup_menu_item_layout:I

    sput v0, Landroid/support/v7/view/menu/t;->w:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;IIZ)V
    .locals 3

    invoke-direct {p0}, Landroid/support/v7/view/menu/m;-><init>()V

    new-instance v0, Landroid/support/v7/view/menu/t$a;

    invoke-direct {v0, p0}, Landroid/support/v7/view/menu/t$a;-><init>(Landroid/support/v7/view/menu/t;)V

    iput-object v0, p0, Landroid/support/v7/view/menu/t;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v0, Landroid/support/v7/view/menu/t$b;

    invoke-direct {v0, p0}, Landroid/support/v7/view/menu/t$b;-><init>(Landroid/support/v7/view/menu/t;)V

    iput-object v0, p0, Landroid/support/v7/view/menu/t;->l:Landroid/view/View$OnAttachStateChangeListener;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/view/menu/t;->u:I

    iput-object p1, p0, Landroid/support/v7/view/menu/t;->c:Landroid/content/Context;

    iput-object p2, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    iput-boolean p6, p0, Landroid/support/v7/view/menu/t;->f:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p6

    new-instance v0, Landroid/support/v7/view/menu/g;

    iget-boolean v1, p0, Landroid/support/v7/view/menu/t;->f:Z

    sget v2, Landroid/support/v7/view/menu/t;->w:I

    invoke-direct {v0, p2, p6, v1, v2}, Landroid/support/v7/view/menu/g;-><init>(Landroid/support/v7/view/menu/h;Landroid/view/LayoutInflater;ZI)V

    iput-object v0, p0, Landroid/support/v7/view/menu/t;->e:Landroid/support/v7/view/menu/g;

    iput p4, p0, Landroid/support/v7/view/menu/t;->h:I

    iput p5, p0, Landroid/support/v7/view/menu/t;->i:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p5

    iget p5, p5, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p5, p5, 0x2

    sget p6, Lb/b/d/a/d;->abc_config_prefDialogWidth:I

    invoke-virtual {p4, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    invoke-static {p5, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Landroid/support/v7/view/menu/t;->g:I

    iput-object p3, p0, Landroid/support/v7/view/menu/t;->n:Landroid/view/View;

    new-instance p3, Landroid/support/v7/widget/j0;

    iget-object p4, p0, Landroid/support/v7/view/menu/t;->c:Landroid/content/Context;

    iget p5, p0, Landroid/support/v7/view/menu/t;->h:I

    iget p6, p0, Landroid/support/v7/view/menu/t;->i:I

    const/4 v0, 0x0

    invoke-direct {p3, p4, v0, p5, p6}, Landroid/support/v7/widget/j0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object p3, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p2, p0, p1}, Landroid/support/v7/view/menu/h;->a(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V

    return-void
.end method

.method private g()Z
    .locals 7

    invoke-virtual {p0}, Landroid/support/v7/view/menu/t;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/view/menu/t;->r:Z

    const/4 v2, 0x0

    if-nez v0, :cond_7

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->n:Landroid/view/View;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iput-object v0, p0, Landroid/support/v7/view/menu/t;->o:Landroid/view/View;

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/h0;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/h0;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/h0;->a(Z)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->o:Landroid/view/View;

    iget-object v3, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    iput-object v4, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/view/menu/t;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v4, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v3, p0, Landroid/support/v7/view/menu/t;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v3, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/h0;->a(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    iget v3, p0, Landroid/support/v7/view/menu/t;->u:I

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/h0;->c(I)V

    iget-boolean v0, p0, Landroid/support/v7/view/menu/t;->s:Z

    const/4 v3, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->e:Landroid/support/v7/view/menu/g;

    iget-object v4, p0, Landroid/support/v7/view/menu/t;->c:Landroid/content/Context;

    iget v5, p0, Landroid/support/v7/view/menu/t;->g:I

    invoke-static {v0, v3, v4, v5}, Landroid/support/v7/view/menu/m;->a(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/view/menu/t;->t:I

    iput-boolean v1, p0, Landroid/support/v7/view/menu/t;->s:Z

    :cond_4
    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    iget v4, p0, Landroid/support/v7/view/menu/t;->t:I

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/h0;->b(I)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/h0;->e(I)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/view/menu/m;->f()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/h0;->a(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v0}, Landroid/support/v7/widget/h0;->c()V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v0}, Landroid/support/v7/widget/h0;->b()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v4, p0, Landroid/support/v7/view/menu/t;->v:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    invoke-virtual {v4}, Landroid/support/v7/view/menu/h;->h()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Landroid/support/v7/view/menu/t;->c:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, Lb/b/d/a/g;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v4, v5, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    const v5, 0x1020016

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_5

    iget-object v6, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    invoke-virtual {v6}, Landroid/support/v7/view/menu/h;->h()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v4, v2}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    invoke-virtual {v0, v4, v3, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_6
    iget-object v0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    iget-object v2, p0, Landroid/support/v7/view/menu/t;->e:Landroid/support/v7/view/menu/g;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/h0;->a(Landroid/widget/ListAdapter;)V

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/widget/h0;->c()V

    return v1

    :cond_7
    :goto_1
    return v2
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Landroid/support/v7/view/menu/t;->u:I

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/h;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/h;Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/view/menu/t;->dismiss()V

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->p:Landroid/support/v7/view/menu/o$a;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1, p2}, Landroid/support/v7/view/menu/o$a;->a(Landroid/support/v7/view/menu/h;Z)V

    :cond_1
    return-void
.end method

.method public a(Landroid/support/v7/view/menu/o$a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/view/menu/t;->p:Landroid/support/v7/view/menu/o$a;

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/view/menu/t;->n:Landroid/view/View;

    return-void
.end method

.method public a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/view/menu/t;->m:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public a(Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroid/support/v7/view/menu/t;->s:Z

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->e:Landroid/support/v7/view/menu/g;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/view/menu/g;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v7/view/menu/t;->r:Z

    if-nez v0, :cond_0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/widget/h0;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public a(Landroid/support/v7/view/menu/u;)Z
    .locals 9

    invoke-virtual {p1}, Landroid/support/v7/view/menu/h;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/support/v7/view/menu/n;

    iget-object v3, p0, Landroid/support/v7/view/menu/t;->c:Landroid/content/Context;

    iget-object v5, p0, Landroid/support/v7/view/menu/t;->o:Landroid/view/View;

    iget-boolean v6, p0, Landroid/support/v7/view/menu/t;->f:Z

    iget v7, p0, Landroid/support/v7/view/menu/t;->h:I

    iget v8, p0, Landroid/support/v7/view/menu/t;->i:I

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Landroid/support/v7/view/menu/n;-><init>(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;ZII)V

    iget-object v2, p0, Landroid/support/v7/view/menu/t;->p:Landroid/support/v7/view/menu/o$a;

    invoke-virtual {v0, v2}, Landroid/support/v7/view/menu/n;->a(Landroid/support/v7/view/menu/o$a;)V

    invoke-static {p1}, Landroid/support/v7/view/menu/m;->b(Landroid/support/v7/view/menu/h;)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v7/view/menu/n;->a(Z)V

    iget-object v2, p0, Landroid/support/v7/view/menu/t;->m:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/view/menu/n;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    const/4 v2, 0x0

    iput-object v2, p0, Landroid/support/v7/view/menu/t;->m:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    invoke-virtual {v2, v1}, Landroid/support/v7/view/menu/h;->a(Z)V

    iget-object v2, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v2}, Landroid/support/v7/widget/h0;->g()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {v3}, Landroid/support/v7/widget/h0;->h()I

    move-result v3

    iget v4, p0, Landroid/support/v7/view/menu/t;->u:I

    iget-object v5, p0, Landroid/support/v7/view/menu/t;->n:Landroid/view/View;

    invoke-static {v5}, Lb/b/c/g/q;->d(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Landroid/support/v7/view/menu/t;->n:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v2, v4

    :cond_0
    invoke-virtual {v0, v2, v3}, Landroid/support/v7/view/menu/n;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->p:Landroid/support/v7/view/menu/o$a;

    if-eqz p0, :cond_1

    invoke-interface {p0, p1}, Landroid/support/v7/view/menu/o$a;->a(Landroid/support/v7/view/menu/h;)Z

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public b()Landroid/widget/ListView;
    .locals 0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/widget/h0;->b()Landroid/widget/ListView;

    move-result-object p0

    return-object p0
.end method

.method public b(I)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/h0;->d(I)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->e:Landroid/support/v7/view/menu/g;

    invoke-virtual {p0, p1}, Landroid/support/v7/view/menu/g;->a(Z)V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/view/menu/t;->g()Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public c(I)V
    .locals 0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/h0;->h(I)V

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/view/menu/t;->v:Z

    return-void
.end method

.method public d()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public dismiss()V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/view/menu/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->j:Landroid/support/v7/widget/j0;

    invoke-virtual {p0}, Landroid/support/v7/widget/h0;->dismiss()V

    :cond_0
    return-void
.end method

.method public onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/view/menu/t;->r:Z

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->d:Landroid/support/v7/view/menu/h;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/h;->close()V

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/view/menu/t;->o:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Landroid/support/v7/view/menu/t;->k:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/view/menu/t;->q:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Landroid/support/v7/view/menu/t;->o:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/view/menu/t;->l:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p0, p0, Landroid/support/v7/view/menu/t;->m:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz p0, :cond_2

    invoke-interface {p0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/view/menu/t;->dismiss()V

    return p3

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
