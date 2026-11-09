.class Lc/a/c/a/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/a/g$a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lc/a/c/a/b;


# direct methods
.method constructor <init>(Lc/a/c/a/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc/a/c/a/p;->b:Lc/a/c/a/b;

    iput-object p2, p0, Lc/a/c/a/p;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lc/a/c/a/p;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lc/a/c/a/p;->b:Lc/a/c/a/b;

    iget-object p0, p0, Lc/a/c/a/p;->a:Ljava/lang/String;

    invoke-static {v0, p1, p0}, Lc/a/c/a/b;->a(Lc/a/c/a/b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
