.class public interface abstract La/a/a/g/m/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Z

.field public static final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, La/a/a/g/g;->g()Z

    move-result v0

    sput-boolean v0, La/a/a/g/m/a;->a:Z

    invoke-static {}, La/a/a/g/g;->h()La/a/a/g/e;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, La/a/a/g/m/a;->b:Z

    return-void
.end method
