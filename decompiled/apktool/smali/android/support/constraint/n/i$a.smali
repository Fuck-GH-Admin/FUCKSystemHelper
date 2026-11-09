.class public final enum Landroid/support/constraint/n/i$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/n/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroid/support/constraint/n/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroid/support/constraint/n/i$a;

.field public static final enum c:Landroid/support/constraint/n/i$a;

.field public static final enum d:Landroid/support/constraint/n/i$a;

.field public static final enum e:Landroid/support/constraint/n/i$a;

.field public static final enum f:Landroid/support/constraint/n/i$a;

.field private static final synthetic g:[Landroid/support/constraint/n/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Landroid/support/constraint/n/i$a;

    const/4 v1, 0x0

    const-string v2, "UNRESTRICTED"

    invoke-direct {v0, v2, v1}, Landroid/support/constraint/n/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    new-instance v0, Landroid/support/constraint/n/i$a;

    const/4 v2, 0x1

    const-string v3, "CONSTANT"

    invoke-direct {v0, v3, v2}, Landroid/support/constraint/n/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/i$a;->c:Landroid/support/constraint/n/i$a;

    new-instance v0, Landroid/support/constraint/n/i$a;

    const/4 v3, 0x2

    const-string v4, "SLACK"

    invoke-direct {v0, v4, v3}, Landroid/support/constraint/n/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/i$a;->d:Landroid/support/constraint/n/i$a;

    new-instance v0, Landroid/support/constraint/n/i$a;

    const/4 v4, 0x3

    const-string v5, "ERROR"

    invoke-direct {v0, v5, v4}, Landroid/support/constraint/n/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/i$a;->e:Landroid/support/constraint/n/i$a;

    new-instance v0, Landroid/support/constraint/n/i$a;

    const/4 v5, 0x4

    const-string v6, "UNKNOWN"

    invoke-direct {v0, v6, v5}, Landroid/support/constraint/n/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/i$a;->f:Landroid/support/constraint/n/i$a;

    const/4 v6, 0x5

    new-array v6, v6, [Landroid/support/constraint/n/i$a;

    sget-object v7, Landroid/support/constraint/n/i$a;->b:Landroid/support/constraint/n/i$a;

    aput-object v7, v6, v1

    sget-object v1, Landroid/support/constraint/n/i$a;->c:Landroid/support/constraint/n/i$a;

    aput-object v1, v6, v2

    sget-object v1, Landroid/support/constraint/n/i$a;->d:Landroid/support/constraint/n/i$a;

    aput-object v1, v6, v3

    sget-object v1, Landroid/support/constraint/n/i$a;->e:Landroid/support/constraint/n/i$a;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Landroid/support/constraint/n/i$a;->g:[Landroid/support/constraint/n/i$a;

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

.method public static valueOf(Ljava/lang/String;)Landroid/support/constraint/n/i$a;
    .locals 1

    const-class v0, Landroid/support/constraint/n/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroid/support/constraint/n/i$a;

    return-object p0
.end method

.method public static values()[Landroid/support/constraint/n/i$a;
    .locals 1

    sget-object v0, Landroid/support/constraint/n/i$a;->g:[Landroid/support/constraint/n/i$a;

    invoke-virtual {v0}, [Landroid/support/constraint/n/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/constraint/n/i$a;

    return-object v0
.end method
