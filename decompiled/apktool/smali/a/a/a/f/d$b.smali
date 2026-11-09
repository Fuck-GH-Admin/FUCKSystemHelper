.class public final enum La/a/a/f/d$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/a/a/f/d$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La/a/a/f/d$b;

.field public static final enum c:La/a/a/f/d$b;

.field public static final synthetic d:[La/a/a/f/d$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, La/a/a/f/d$b;

    const/4 v1, 0x0

    const-string v2, "NEED_TO_LOG"

    invoke-direct {v0, v2, v1}, La/a/a/f/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/f/d$b;->b:La/a/a/f/d$b;

    new-instance v2, La/a/a/f/d$b;

    const/4 v3, 0x1

    const-string v4, "NO_NEED_TO_LOG"

    invoke-direct {v2, v4, v3}, La/a/a/f/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/a/a/f/d$b;->c:La/a/a/f/d$b;

    const/4 v4, 0x2

    new-array v4, v4, [La/a/a/f/d$b;

    aput-object v0, v4, v1

    aput-object v2, v4, v3

    sput-object v4, La/a/a/f/d$b;->d:[La/a/a/f/d$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/a/a/f/d$b;
    .locals 1

    const-class v0, La/a/a/f/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/a/a/f/d$b;

    return-object p0
.end method

.method public static values()[La/a/a/f/d$b;
    .locals 1

    sget-object v0, La/a/a/f/d$b;->d:[La/a/a/f/d$b;

    invoke-virtual {v0}, [La/a/a/f/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/f/d$b;

    return-object v0
.end method
