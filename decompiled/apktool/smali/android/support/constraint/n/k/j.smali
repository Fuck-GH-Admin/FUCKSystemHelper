.class public Landroid/support/constraint/n/k/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Landroid/support/constraint/n/k/j;->a:[Z

    return-void
.end method

.method static a(Landroid/support/constraint/n/k/f;Landroid/support/constraint/n/d;Landroid/support/constraint/n/k/e;)V
    .locals 5

    const/4 v0, -0x1

    iput v0, p2, Landroid/support/constraint/n/k/e;->l:I

    iput v0, p2, Landroid/support/constraint/n/k/e;->m:I

    iget-object v0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v0, v0, v1

    sget-object v1, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget v0, v0, Landroid/support/constraint/n/k/d;->g:I

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->C()I

    move-result v1

    iget-object v2, p2, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget v2, v2, Landroid/support/constraint/n/k/d;->g:I

    sub-int/2addr v1, v2

    iget-object v2, p2, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v4

    iput-object v4, v2, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget-object v2, p2, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v2}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v4

    iput-object v4, v2, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget-object v2, p2, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    invoke-virtual {p1, v2, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v2, p2, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    iget-object v2, v2, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    invoke-virtual {p1, v2, v1}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iput v3, p2, Landroid/support/constraint/n/k/e;->l:I

    invoke-virtual {p2, v0, v1}, Landroid/support/constraint/n/k/e;->c(II)V

    :cond_0
    iget-object v0, p0, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    sget-object v2, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Landroid/support/constraint/n/k/e;->Q:[Landroid/support/constraint/n/k/e$b;

    aget-object v0, v0, v1

    sget-object v1, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget v0, v0, Landroid/support/constraint/n/k/d;->g:I

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->k()I

    move-result p0

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget v1, v1, Landroid/support/constraint/n/k/d;->g:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v2

    iput-object v2, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v2

    iput-object v2, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    invoke-virtual {p1, v1, v0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    invoke-virtual {p1, v1, p0}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    iget v1, p2, Landroid/support/constraint/n/k/e;->Y:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Landroid/support/constraint/n/k/e;->B()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    invoke-virtual {p1, v1}, Landroid/support/constraint/n/d;->a(Ljava/lang/Object;)Landroid/support/constraint/n/i;

    move-result-object v2

    iput-object v2, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget-object v1, p2, Landroid/support/constraint/n/k/e;->J:Landroid/support/constraint/n/k/d;

    iget-object v1, v1, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    iget v2, p2, Landroid/support/constraint/n/k/e;->Y:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Landroid/support/constraint/n/d;->a(Landroid/support/constraint/n/i;I)V

    :cond_2
    iput v3, p2, Landroid/support/constraint/n/k/e;->m:I

    invoke-virtual {p2, v0, p0}, Landroid/support/constraint/n/k/e;->f(II)V

    :cond_3
    return-void
.end method

.method public static final a(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
