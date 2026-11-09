.class public final enum Lcom/baidu/location/i$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/baidu/location/i$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/baidu/location/i$b;

.field public static final enum c:Lcom/baidu/location/i$b;

.field public static final enum d:Lcom/baidu/location/i$b;

.field public static final enum e:Lcom/baidu/location/i$b;

.field private static final synthetic f:[Lcom/baidu/location/i$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/baidu/location/i$b;

    const/4 v1, 0x0

    const-string v2, "Hight_Accuracy"

    invoke-direct {v0, v2, v1}, Lcom/baidu/location/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/baidu/location/i$b;->b:Lcom/baidu/location/i$b;

    new-instance v2, Lcom/baidu/location/i$b;

    const/4 v3, 0x1

    const-string v4, "Battery_Saving"

    invoke-direct {v2, v4, v3}, Lcom/baidu/location/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/baidu/location/i$b;->c:Lcom/baidu/location/i$b;

    new-instance v4, Lcom/baidu/location/i$b;

    const/4 v5, 0x2

    const-string v6, "Device_Sensors"

    invoke-direct {v4, v6, v5}, Lcom/baidu/location/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/baidu/location/i$b;->d:Lcom/baidu/location/i$b;

    new-instance v6, Lcom/baidu/location/i$b;

    const/4 v7, 0x3

    const-string v8, "Fuzzy_Locating"

    invoke-direct {v6, v8, v7}, Lcom/baidu/location/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/baidu/location/i$b;->e:Lcom/baidu/location/i$b;

    const/4 v8, 0x4

    new-array v8, v8, [Lcom/baidu/location/i$b;

    aput-object v0, v8, v1

    aput-object v2, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Lcom/baidu/location/i$b;->f:[Lcom/baidu/location/i$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/baidu/location/i$b;
    .locals 1

    const-class v0, Lcom/baidu/location/i$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/baidu/location/i$b;

    return-object p0
.end method

.method public static values()[Lcom/baidu/location/i$b;
    .locals 1

    sget-object v0, Lcom/baidu/location/i$b;->f:[Lcom/baidu/location/i$b;

    invoke-virtual {v0}, [Lcom/baidu/location/i$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/baidu/location/i$b;

    return-object v0
.end method
