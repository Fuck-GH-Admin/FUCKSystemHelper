.class public Landroid/support/v4/app/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/support/v4/app/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/app/i<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/support/v4/app/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/i<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    return-void
.end method

.method public static a(Landroid/support/v4/app/i;)Landroid/support/v4/app/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/i<",
            "*>;)",
            "Landroid/support/v4/app/h;"
        }
    .end annotation

    new-instance v0, Landroid/support/v4/app/h;

    invoke-direct {v0, p0}, Landroid/support/v4/app/h;-><init>(Landroid/support/v4/app/i;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/support/v4/app/e;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->b(Ljava/lang/String;)Landroid/support/v4/app/e;

    move-result-object p0

    return-object p0
.end method

.method public a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/support/v4/app/k;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public a()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->d()V

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public a(Landroid/os/Parcelable;Landroid/support/v4/app/l;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/k;->a(Landroid/os/Parcelable;Landroid/support/v4/app/l;)V

    return-void
.end method

.method public a(Landroid/support/v4/app/e;)V
    .locals 1

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object v0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {v0, p0, p0, p1}, Landroid/support/v4/app/k;->a(Landroid/support/v4/app/i;Landroid/support/v4/app/g;Landroid/support/v4/app/e;)V

    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->a(Landroid/view/Menu;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->a(Z)V

    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/k;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p0

    return p0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->a(Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public b()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->e()V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->b(Z)V

    return-void
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->b(Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/k;->b(Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public c()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->f()V

    return-void
.end method

.method public d()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->h()V

    return-void
.end method

.method public e()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->i()V

    return-void
.end method

.method public f()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->j()V

    return-void
.end method

.method public g()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->k()V

    return-void
.end method

.method public h()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->l()V

    return-void
.end method

.method public i()Z
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->n()Z

    move-result p0

    return p0
.end method

.method public j()Landroid/support/v4/app/j;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    invoke-virtual {p0}, Landroid/support/v4/app/i;->d()Landroid/support/v4/app/k;

    move-result-object p0

    return-object p0
.end method

.method public k()V
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->q()V

    return-void
.end method

.method public l()Landroid/support/v4/app/l;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->s()Landroid/support/v4/app/l;

    move-result-object p0

    return-object p0
.end method

.method public m()Landroid/os/Parcelable;
    .locals 0

    iget-object p0, p0, Landroid/support/v4/app/h;->a:Landroid/support/v4/app/i;

    iget-object p0, p0, Landroid/support/v4/app/i;->d:Landroid/support/v4/app/k;

    invoke-virtual {p0}, Landroid/support/v4/app/k;->t()Landroid/os/Parcelable;

    move-result-object p0

    return-object p0
.end method
