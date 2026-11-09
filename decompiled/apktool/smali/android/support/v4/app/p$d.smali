.class final Landroid/support/v4/app/p$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/p;->a(Landroid/support/v4/app/r;Landroid/view/ViewGroup;Landroid/view/View;Lb/b/c/f/a;Landroid/support/v4/app/p$e;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/app/r;

.field final synthetic c:Lb/b/c/f/a;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Landroid/support/v4/app/p$e;

.field final synthetic f:Ljava/util/ArrayList;

.field final synthetic g:Landroid/view/View;

.field final synthetic h:Landroid/support/v4/app/e;

.field final synthetic i:Landroid/support/v4/app/e;

.field final synthetic j:Z

.field final synthetic k:Ljava/util/ArrayList;

.field final synthetic l:Ljava/lang/Object;

.field final synthetic m:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroid/support/v4/app/r;Lb/b/c/f/a;Ljava/lang/Object;Landroid/support/v4/app/p$e;Ljava/util/ArrayList;Landroid/view/View;Landroid/support/v4/app/e;Landroid/support/v4/app/e;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/p$d;->b:Landroid/support/v4/app/r;

    iput-object p2, p0, Landroid/support/v4/app/p$d;->c:Lb/b/c/f/a;

    iput-object p3, p0, Landroid/support/v4/app/p$d;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroid/support/v4/app/p$d;->e:Landroid/support/v4/app/p$e;

    iput-object p5, p0, Landroid/support/v4/app/p$d;->f:Ljava/util/ArrayList;

    iput-object p6, p0, Landroid/support/v4/app/p$d;->g:Landroid/view/View;

    iput-object p7, p0, Landroid/support/v4/app/p$d;->h:Landroid/support/v4/app/e;

    iput-object p8, p0, Landroid/support/v4/app/p$d;->i:Landroid/support/v4/app/e;

    iput-boolean p9, p0, Landroid/support/v4/app/p$d;->j:Z

    iput-object p10, p0, Landroid/support/v4/app/p$d;->k:Ljava/util/ArrayList;

    iput-object p11, p0, Landroid/support/v4/app/p$d;->l:Ljava/lang/Object;

    iput-object p12, p0, Landroid/support/v4/app/p$d;->m:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroid/support/v4/app/p$d;->b:Landroid/support/v4/app/r;

    iget-object v1, p0, Landroid/support/v4/app/p$d;->c:Lb/b/c/f/a;

    iget-object v2, p0, Landroid/support/v4/app/p$d;->d:Ljava/lang/Object;

    iget-object v3, p0, Landroid/support/v4/app/p$d;->e:Landroid/support/v4/app/p$e;

    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Landroid/support/v4/app/r;Lb/b/c/f/a;Ljava/lang/Object;Landroid/support/v4/app/p$e;)Lb/b/c/f/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/app/p$d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lb/b/c/f/a;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroid/support/v4/app/p$d;->f:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/app/p$d;->g:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/p$d;->h:Landroid/support/v4/app/e;

    iget-object v2, p0, Landroid/support/v4/app/p$d;->i:Landroid/support/v4/app/e;

    iget-boolean v3, p0, Landroid/support/v4/app/p$d;->j:Z

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Landroid/support/v4/app/p;->a(Landroid/support/v4/app/e;Landroid/support/v4/app/e;ZLb/b/c/f/a;Z)V

    iget-object v1, p0, Landroid/support/v4/app/p$d;->d:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroid/support/v4/app/p$d;->b:Landroid/support/v4/app/r;

    iget-object v3, p0, Landroid/support/v4/app/p$d;->k:Ljava/util/ArrayList;

    iget-object v4, p0, Landroid/support/v4/app/p$d;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v3, v4}, Landroid/support/v4/app/r;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v1, p0, Landroid/support/v4/app/p$d;->e:Landroid/support/v4/app/p$e;

    iget-object v2, p0, Landroid/support/v4/app/p$d;->l:Ljava/lang/Object;

    iget-boolean v3, p0, Landroid/support/v4/app/p$d;->j:Z

    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Lb/b/c/f/a;Landroid/support/v4/app/p$e;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroid/support/v4/app/p$d;->b:Landroid/support/v4/app/r;

    iget-object p0, p0, Landroid/support/v4/app/p$d;->m:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, p0}, Landroid/support/v4/app/r;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method
