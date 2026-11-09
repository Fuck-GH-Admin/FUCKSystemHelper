.class public final enum La/a/a/i/j/h$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/i/j/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/a/a/i/j/h$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La/a/a/i/j/h$c;

.field public static final enum c:La/a/a/i/j/h$c;

.field public static final enum d:La/a/a/i/j/h$c;

.field public static final enum e:La/a/a/i/j/h$c;

.field public static final enum f:La/a/a/i/j/h$c;

.field public static final enum g:La/a/a/i/j/h$c;

.field public static final synthetic h:[La/a/a/i/j/h$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, La/a/a/i/j/h$c;

    const/4 v1, 0x0

    const-string v2, "SUBWAY_STATIC"

    invoke-direct {v0, v2, v1}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/i/j/h$c;->b:La/a/a/i/j/h$c;

    new-instance v2, La/a/a/i/j/h$c;

    const/4 v3, 0x1

    const-string v4, "TRAFFIC_STATUS"

    invoke-direct {v2, v4, v3}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/a/a/i/j/h$c;->c:La/a/a/i/j/h$c;

    new-instance v4, La/a/a/i/j/h$c;

    const/4 v5, 0x2

    const-string v6, "VDR_INDOOR_SPEED_STATUS"

    invoke-direct {v4, v6, v5}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v4, La/a/a/i/j/h$c;->d:La/a/a/i/j/h$c;

    new-instance v6, La/a/a/i/j/h$c;

    const/4 v7, 0x3

    const-string v8, "INDOOR_POI_DATA_STATUS"

    invoke-direct {v6, v8, v7}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v6, La/a/a/i/j/h$c;->e:La/a/a/i/j/h$c;

    new-instance v8, La/a/a/i/j/h$c;

    const/4 v9, 0x4

    const-string v10, "OUTDOOR_POI_DATA_STATUS"

    invoke-direct {v8, v10, v9}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v8, La/a/a/i/j/h$c;->f:La/a/a/i/j/h$c;

    new-instance v10, La/a/a/i/j/h$c;

    const/4 v11, 0x5

    const-string v12, "GPS_CHECKER_STATUS"

    invoke-direct {v10, v12, v11}, La/a/a/i/j/h$c;-><init>(Ljava/lang/String;I)V

    sput-object v10, La/a/a/i/j/h$c;->g:La/a/a/i/j/h$c;

    const/4 v12, 0x6

    new-array v12, v12, [La/a/a/i/j/h$c;

    aput-object v0, v12, v1

    aput-object v2, v12, v3

    aput-object v4, v12, v5

    aput-object v6, v12, v7

    aput-object v8, v12, v9

    aput-object v10, v12, v11

    sput-object v12, La/a/a/i/j/h$c;->h:[La/a/a/i/j/h$c;

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

.method public static valueOf(Ljava/lang/String;)La/a/a/i/j/h$c;
    .locals 1

    const-class v0, La/a/a/i/j/h$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/a/a/i/j/h$c;

    return-object p0
.end method

.method public static values()[La/a/a/i/j/h$c;
    .locals 1

    sget-object v0, La/a/a/i/j/h$c;->h:[La/a/a/i/j/h$c;

    invoke-virtual {v0}, [La/a/a/i/j/h$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/i/j/h$c;

    return-object v0
.end method
