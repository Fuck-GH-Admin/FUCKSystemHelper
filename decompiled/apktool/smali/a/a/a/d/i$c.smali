.class public La/a/a/d/i$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/a/d/m/c/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/d/i;->a(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/a/a/d/i;


# direct methods
.method public constructor <init>(La/a/a/d/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/d/i$c;->b:La/a/a/d/i;

    iput-object p3, p0, La/a/a/d/i$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;)V
    .locals 0

    iget-object p2, p0, La/a/a/d/i$c;->b:La/a/a/d/i;

    invoke-static {p2, p1}, La/a/a/d/i;->a(La/a/a/d/i;Z)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, La/a/a/d/i$c;->b:La/a/a/d/i;

    iget-object p0, p0, La/a/a/d/i$c;->a:Ljava/lang/String;

    invoke-static {p0}, La/a/a/d/m/b/a;->a(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p1, p0}, La/a/a/d/i;->b(La/a/a/d/i;Z)Z

    :cond_0
    return-void
.end method
