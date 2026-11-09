.class public final enum Landroid/support/constraint/b$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/constraint/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroid/support/constraint/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroid/support/constraint/b$b;

.field public static final enum c:Landroid/support/constraint/b$b;

.field public static final enum d:Landroid/support/constraint/b$b;

.field public static final enum e:Landroid/support/constraint/b$b;

.field public static final enum f:Landroid/support/constraint/b$b;

.field public static final enum g:Landroid/support/constraint/b$b;

.field public static final enum h:Landroid/support/constraint/b$b;

.field private static final synthetic i:[Landroid/support/constraint/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v1, 0x0

    const-string v2, "INT_TYPE"

    invoke-direct {v0, v2, v1}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->b:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v2, 0x1

    const-string v3, "FLOAT_TYPE"

    invoke-direct {v0, v3, v2}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->c:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v3, 0x2

    const-string v4, "COLOR_TYPE"

    invoke-direct {v0, v4, v3}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->d:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v4, 0x3

    const-string v5, "COLOR_DRAWABLE_TYPE"

    invoke-direct {v0, v5, v4}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->e:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v5, 0x4

    const-string v6, "STRING_TYPE"

    invoke-direct {v0, v6, v5}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->f:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v6, 0x5

    const-string v7, "BOOLEAN_TYPE"

    invoke-direct {v0, v7, v6}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->g:Landroid/support/constraint/b$b;

    new-instance v0, Landroid/support/constraint/b$b;

    const/4 v7, 0x6

    const-string v8, "DIMENSION_TYPE"

    invoke-direct {v0, v8, v7}, Landroid/support/constraint/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroid/support/constraint/b$b;->h:Landroid/support/constraint/b$b;

    const/4 v8, 0x7

    new-array v8, v8, [Landroid/support/constraint/b$b;

    sget-object v9, Landroid/support/constraint/b$b;->b:Landroid/support/constraint/b$b;

    aput-object v9, v8, v1

    sget-object v1, Landroid/support/constraint/b$b;->c:Landroid/support/constraint/b$b;

    aput-object v1, v8, v2

    sget-object v1, Landroid/support/constraint/b$b;->d:Landroid/support/constraint/b$b;

    aput-object v1, v8, v3

    sget-object v1, Landroid/support/constraint/b$b;->e:Landroid/support/constraint/b$b;

    aput-object v1, v8, v4

    sget-object v1, Landroid/support/constraint/b$b;->f:Landroid/support/constraint/b$b;

    aput-object v1, v8, v5

    sget-object v1, Landroid/support/constraint/b$b;->g:Landroid/support/constraint/b$b;

    aput-object v1, v8, v6

    aput-object v0, v8, v7

    sput-object v8, Landroid/support/constraint/b$b;->i:[Landroid/support/constraint/b$b;

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

.method public static valueOf(Ljava/lang/String;)Landroid/support/constraint/b$b;
    .locals 1

    const-class v0, Landroid/support/constraint/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroid/support/constraint/b$b;

    return-object p0
.end method

.method public static values()[Landroid/support/constraint/b$b;
    .locals 1

    sget-object v0, Landroid/support/constraint/b$b;->i:[Landroid/support/constraint/b$b;

    invoke-virtual {v0}, [Landroid/support/constraint/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/constraint/b$b;

    return-object v0
.end method
