.class public final enum La/a/a/g/g$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/g/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/a/a/g/g$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La/a/a/g/g$b;

.field public static final enum c:La/a/a/g/g$b;

.field public static final enum d:La/a/a/g/g$b;

.field public static final synthetic e:[La/a/a/g/g$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, La/a/a/g/g$b;

    const/4 v1, 0x0

    const-string v2, "ONLY_CELL_MODE"

    invoke-direct {v0, v2, v1}, La/a/a/g/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/g/g$b;->b:La/a/a/g/g$b;

    new-instance v2, La/a/a/g/g$b;

    const/4 v3, 0x1

    const-string v4, "ONLY_WIFI_MODE"

    invoke-direct {v2, v4, v3}, La/a/a/g/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/a/a/g/g$b;->c:La/a/a/g/g$b;

    new-instance v4, La/a/a/g/g$b;

    const/4 v5, 0x2

    const-string v6, "GET_ALL_DATA"

    invoke-direct {v4, v6, v5}, La/a/a/g/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v4, La/a/a/g/g$b;->d:La/a/a/g/g$b;

    const/4 v6, 0x3

    new-array v6, v6, [La/a/a/g/g$b;

    aput-object v0, v6, v1

    aput-object v2, v6, v3

    aput-object v4, v6, v5

    sput-object v6, La/a/a/g/g$b;->e:[La/a/a/g/g$b;

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

.method public static valueOf(Ljava/lang/String;)La/a/a/g/g$b;
    .locals 1

    const-class v0, La/a/a/g/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/a/a/g/g$b;

    return-object p0
.end method

.method public static values()[La/a/a/g/g$b;
    .locals 1

    sget-object v0, La/a/a/g/g$b;->e:[La/a/a/g/g$b;

    invoke-virtual {v0}, [La/a/a/g/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/g/g$b;

    return-object v0
.end method
