.class public final enum La/a/a/f/d$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/a/a/f/d$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La/a/a/f/d$d;

.field public static final enum c:La/a/a/f/d$d;

.field public static final enum d:La/a/a/f/d$d;

.field public static final enum e:La/a/a/f/d$d;

.field public static final enum f:La/a/a/f/d$d;

.field public static final synthetic g:[La/a/a/f/d$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, La/a/a/f/d$d;

    const/4 v1, 0x0

    const-string v2, "NETWORK_UNKNOWN"

    invoke-direct {v0, v2, v1}, La/a/a/f/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/f/d$d;->b:La/a/a/f/d$d;

    new-instance v2, La/a/a/f/d$d;

    const/4 v3, 0x1

    const-string v4, "NETWORK_WIFI"

    invoke-direct {v2, v4, v3}, La/a/a/f/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/a/a/f/d$d;->c:La/a/a/f/d$d;

    new-instance v4, La/a/a/f/d$d;

    const/4 v5, 0x2

    const-string v6, "NETWORK_2G"

    invoke-direct {v4, v6, v5}, La/a/a/f/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v4, La/a/a/f/d$d;->d:La/a/a/f/d$d;

    new-instance v6, La/a/a/f/d$d;

    const/4 v7, 0x3

    const-string v8, "NETWORK_3G"

    invoke-direct {v6, v8, v7}, La/a/a/f/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v6, La/a/a/f/d$d;->e:La/a/a/f/d$d;

    new-instance v8, La/a/a/f/d$d;

    const/4 v9, 0x4

    const-string v10, "NETWORK_4G"

    invoke-direct {v8, v10, v9}, La/a/a/f/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v8, La/a/a/f/d$d;->f:La/a/a/f/d$d;

    const/4 v10, 0x5

    new-array v10, v10, [La/a/a/f/d$d;

    aput-object v0, v10, v1

    aput-object v2, v10, v3

    aput-object v4, v10, v5

    aput-object v6, v10, v7

    aput-object v8, v10, v9

    sput-object v10, La/a/a/f/d$d;->g:[La/a/a/f/d$d;

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

.method public static valueOf(Ljava/lang/String;)La/a/a/f/d$d;
    .locals 1

    const-class v0, La/a/a/f/d$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/a/a/f/d$d;

    return-object p0
.end method

.method public static values()[La/a/a/f/d$d;
    .locals 1

    sget-object v0, La/a/a/f/d$d;->g:[La/a/a/f/d$d;

    invoke-virtual {v0}, [La/a/a/f/d$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/f/d$d;

    return-object v0
.end method
