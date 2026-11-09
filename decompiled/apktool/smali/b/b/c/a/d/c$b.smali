.class public final Lb/b/c/a/d/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/c/a/d/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/c/a/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:[Lb/b/c/a/d/c$c;


# direct methods
.method public constructor <init>([Lb/b/c/a/d/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/b/c/a/d/c$b;->a:[Lb/b/c/a/d/c$c;

    return-void
.end method


# virtual methods
.method public a()[Lb/b/c/a/d/c$c;
    .locals 0

    iget-object p0, p0, Lb/b/c/a/d/c$b;->a:[Lb/b/c/a/d/c$c;

    return-object p0
.end method
