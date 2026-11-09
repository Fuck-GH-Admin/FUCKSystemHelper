.class public La/a/a/i/g$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/i/g;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/a/a/i/g;


# direct methods
.method public constructor <init>(La/a/a/i/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/a/a/i/g$d;->c:La/a/a/i/g;

    iput-object p2, p0, La/a/a/i/g$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/a/a/i/g$d;->c:La/a/a/i/g;

    iget-object p0, p0, La/a/a/i/g$d;->b:Ljava/lang/String;

    invoke-static {v0, p0}, La/a/a/i/g;->a(La/a/a/i/g;Ljava/lang/String;)V

    return-void
.end method
