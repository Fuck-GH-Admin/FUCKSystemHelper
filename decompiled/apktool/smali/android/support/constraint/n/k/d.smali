.class public Landroid/support/constraint/n/k/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/constraint/n/k/d$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/support/constraint/n/k/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Z

.field public final d:Landroid/support/constraint/n/k/e;

.field public final e:Landroid/support/constraint/n/k/d$b;

.field public f:Landroid/support/constraint/n/k/d;

.field public g:I

.field h:I

.field i:Landroid/support/constraint/n/i;


# direct methods
.method public constructor <init>(Landroid/support/constraint/n/k/e;Landroid/support/constraint/n/k/d$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/constraint/n/k/d;->g:I

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/constraint/n/k/d;->h:I

    iput-object p1, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iput-object p2, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Landroid/support/constraint/n/k/d;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    return-object p0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Landroid/support/constraint/n/k/d;->b:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroid/support/constraint/n/k/d;->c:Z

    return-void
.end method

.method public a(ILjava/util/ArrayList;Landroid/support/constraint/n/k/m/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Landroid/support/constraint/n/k/m/o;",
            ">;",
            "Landroid/support/constraint/n/k/m/o;",
            ")V"
        }
    .end annotation

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    invoke-static {v0, p1, p2, p3}, Landroid/support/constraint/n/k/m/i;->a(Landroid/support/constraint/n/k/e;ILjava/util/ArrayList;Landroid/support/constraint/n/k/m/o;)Landroid/support/constraint/n/k/m/o;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Landroid/support/constraint/n/c;)V
    .locals 2

    iget-object p1, p0, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    if-nez p1, :cond_0

    new-instance p1, Landroid/support/constraint/n/i;

    sget-object v0, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroid/support/constraint/n/i;-><init>(Landroid/support/constraint/n/i$a;Ljava/lang/String;)V

    iput-object p1, p0, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/support/constraint/n/i;->a()V

    :goto_0
    return-void
.end method

.method public a(Landroid/support/constraint/n/k/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->h()Landroid/support/constraint/n/k/d$b;

    move-result-object v1

    iget-object v2, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    sget-object v1, Landroid/support/constraint/n/k/d$b;->g:Landroid/support/constraint/n/k/d$b;

    if-ne v2, v1, :cond_2

    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->e()Landroid/support/constraint/n/k/e;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/constraint/n/k/e;->F()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->e()Landroid/support/constraint/n/k/e;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/constraint/n/k/e;->F()Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    sget-object v4, Landroid/support/constraint/n/k/d$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    sget-object p0, Landroid/support/constraint/n/k/d$b;->d:Landroid/support/constraint/n/k/d$b;

    if-eq v1, p0, :cond_5

    sget-object p0, Landroid/support/constraint/n/k/d$b;->f:Landroid/support/constraint/n/k/d$b;

    if-ne v1, p0, :cond_4

    goto :goto_0

    :cond_4
    move p0, v0

    goto :goto_1

    :cond_5
    :goto_0
    move p0, v3

    :goto_1
    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->e()Landroid/support/constraint/n/k/e;

    move-result-object p1

    instance-of p1, p1, Landroid/support/constraint/n/k/g;

    if-eqz p1, :cond_8

    if-nez p0, :cond_6

    sget-object p0, Landroid/support/constraint/n/k/d$b;->j:Landroid/support/constraint/n/k/d$b;

    if-ne v1, p0, :cond_7

    :cond_6
    move v0, v3

    :cond_7
    move p0, v0

    :cond_8
    return p0

    :pswitch_2
    sget-object p0, Landroid/support/constraint/n/k/d$b;->c:Landroid/support/constraint/n/k/d$b;

    if-eq v1, p0, :cond_a

    sget-object p0, Landroid/support/constraint/n/k/d$b;->e:Landroid/support/constraint/n/k/d$b;

    if-ne v1, p0, :cond_9

    goto :goto_2

    :cond_9
    move p0, v0

    goto :goto_3

    :cond_a
    :goto_2
    move p0, v3

    :goto_3
    invoke-virtual {p1}, Landroid/support/constraint/n/k/d;->e()Landroid/support/constraint/n/k/e;

    move-result-object p1

    instance-of p1, p1, Landroid/support/constraint/n/k/g;

    if-eqz p1, :cond_d

    if-nez p0, :cond_b

    sget-object p0, Landroid/support/constraint/n/k/d$b;->i:Landroid/support/constraint/n/k/d$b;

    if-ne v1, p0, :cond_c

    :cond_b
    move v0, v3

    :cond_c
    move p0, v0

    :cond_d
    return p0

    :pswitch_3
    sget-object p0, Landroid/support/constraint/n/k/d$b;->g:Landroid/support/constraint/n/k/d$b;

    if-eq v1, p0, :cond_e

    sget-object p0, Landroid/support/constraint/n/k/d$b;->i:Landroid/support/constraint/n/k/d$b;

    if-eq v1, p0, :cond_e

    sget-object p0, Landroid/support/constraint/n/k/d$b;->j:Landroid/support/constraint/n/k/d$b;

    if-eq v1, p0, :cond_e

    move v0, v3

    :cond_e
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Landroid/support/constraint/n/k/d;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/constraint/n/k/d;->m()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/constraint/n/k/d;->a(Landroid/support/constraint/n/k/d;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object p4, p1, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object p1, p1, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    if-lez p2, :cond_4

    iput p2, p0, Landroid/support/constraint/n/k/d;->g:I

    goto :goto_0

    :cond_4
    iput v1, p0, Landroid/support/constraint/n/k/d;->g:I

    :goto_0
    iput p3, p0, Landroid/support/constraint/n/k/d;->h:I

    return v0
.end method

.method public b()I
    .locals 1

    iget-boolean v0, p0, Landroid/support/constraint/n/k/d;->c:Z

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p0, p0, Landroid/support/constraint/n/k/d;->b:I

    return p0
.end method

.method public c()I
    .locals 3

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/e;->B()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget v0, p0, Landroid/support/constraint/n/k/d;->h:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    invoke-virtual {v0}, Landroid/support/constraint/n/k/e;->B()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget p0, p0, Landroid/support/constraint/n/k/d;->h:I

    return p0

    :cond_1
    iget p0, p0, Landroid/support/constraint/n/k/d;->g:I

    return p0
.end method

.method public final d()Landroid/support/constraint/n/k/d;
    .locals 2

    sget-object v0, Landroid/support/constraint/n/k/d$a;->a:[I

    iget-object v1, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->G:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_1
    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->I:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_2
    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->F:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_3
    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    iget-object p0, p0, Landroid/support/constraint/n/k/e;->H:Landroid/support/constraint/n/k/d;

    return-object p0

    :pswitch_4
    const/4 p0, 0x0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public e()Landroid/support/constraint/n/k/e;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    return-object p0
.end method

.method public f()Landroid/support/constraint/n/i;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->i:Landroid/support/constraint/n/i;

    return-object p0
.end method

.method public g()Landroid/support/constraint/n/k/d;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    return-object p0
.end method

.method public h()Landroid/support/constraint/n/k/d$b;
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    return-object p0
.end method

.method public i()Z
    .locals 2

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/constraint/n/k/d;

    invoke-virtual {v1}, Landroid/support/constraint/n/k/d;->d()Landroid/support/constraint/n/k/d;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/constraint/n/k/d;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public j()Z
    .locals 1

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/HashSet;->size()I

    move-result p0

    if-lez p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public k()Z
    .locals 0

    iget-boolean p0, p0, Landroid/support/constraint/n/k/d;->c:Z

    return p0
.end method

.method public l()Z
    .locals 0

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iget-object v0, v0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    iput-object v1, v0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    :cond_0
    iput-object v1, p0, Landroid/support/constraint/n/k/d;->a:Ljava/util/HashSet;

    iput-object v1, p0, Landroid/support/constraint/n/k/d;->f:Landroid/support/constraint/n/k/d;

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/constraint/n/k/d;->g:I

    const/4 v1, -0x1

    iput v1, p0, Landroid/support/constraint/n/k/d;->h:I

    iput-boolean v0, p0, Landroid/support/constraint/n/k/d;->c:Z

    iput v0, p0, Landroid/support/constraint/n/k/d;->b:I

    return-void
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/constraint/n/k/d;->c:Z

    iput v0, p0, Landroid/support/constraint/n/k/d;->b:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/constraint/n/k/d;->d:Landroid/support/constraint/n/k/e;

    invoke-virtual {v1}, Landroid/support/constraint/n/k/e;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroid/support/constraint/n/k/d;->e:Landroid/support/constraint/n/k/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
