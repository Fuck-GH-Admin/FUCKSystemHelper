.class public final enum Landroid/support/constraint/n/k/e$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/n/k/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroid/support/constraint/n/k/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroid/support/constraint/n/k/e$b;

.field public static final enum c:Landroid/support/constraint/n/k/e$b;

.field public static final enum d:Landroid/support/constraint/n/k/e$b;

.field public static final enum e:Landroid/support/constraint/n/k/e$b;

.field private static final synthetic f:[Landroid/support/constraint/n/k/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Landroid/support/constraint/n/k/e$b;

    const/4 v1, 0x0

    const-string v2, "FIXED"

    invoke-direct {v0, v2, v1}, Landroid/support/constraint/n/k/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    new-instance v0, Landroid/support/constraint/n/k/e$b;

    const/4 v2, 0x1

    const-string v3, "WRAP_CONTENT"

    invoke-direct {v0, v3, v2}, Landroid/support/constraint/n/k/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    new-instance v0, Landroid/support/constraint/n/k/e$b;

    const/4 v3, 0x2

    const-string v4, "MATCH_CONSTRAINT"

    invoke-direct {v0, v4, v3}, Landroid/support/constraint/n/k/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    new-instance v0, Landroid/support/constraint/n/k/e$b;

    const/4 v4, 0x3

    const-string v5, "MATCH_PARENT"

    invoke-direct {v0, v5, v4}, Landroid/support/constraint/n/k/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/n/k/e$b;->e:Landroid/support/constraint/n/k/e$b;

    const/4 v5, 0x4

    new-array v5, v5, [Landroid/support/constraint/n/k/e$b;

    sget-object v6, Landroid/support/constraint/n/k/e$b;->b:Landroid/support/constraint/n/k/e$b;

    aput-object v6, v5, v1

    sget-object v1, Landroid/support/constraint/n/k/e$b;->c:Landroid/support/constraint/n/k/e$b;

    aput-object v1, v5, v2

    sget-object v1, Landroid/support/constraint/n/k/e$b;->d:Landroid/support/constraint/n/k/e$b;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Landroid/support/constraint/n/k/e$b;->f:[Landroid/support/constraint/n/k/e$b;

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

.method public static valueOf(Ljava/lang/String;)Landroid/support/constraint/n/k/e$b;
    .locals 1

    const-class v0, Landroid/support/constraint/n/k/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroid/support/constraint/n/k/e$b;

    return-object p0
.end method

.method public static values()[Landroid/support/constraint/n/k/e$b;
    .locals 1

    sget-object v0, Landroid/support/constraint/n/k/e$b;->f:[Landroid/support/constraint/n/k/e$b;

    invoke-virtual {v0}, [Landroid/support/constraint/n/k/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/constraint/n/k/e$b;

    return-object v0
.end method
