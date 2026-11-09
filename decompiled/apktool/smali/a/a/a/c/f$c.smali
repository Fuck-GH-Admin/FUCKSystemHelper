.class public La/a/a/c/f$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I


# direct methods
.method public constructor <init>(La/a/a/c/f;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/a/c/f$c;->a:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, La/a/a/c/f$c;->b:I

    iput-object p2, p0, La/a/a/c/f$c;->a:Ljava/lang/String;

    iput p3, p0, La/a/a/c/f$c;->b:I

    return-void
.end method
