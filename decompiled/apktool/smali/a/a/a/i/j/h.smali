.class public La/a/a/i/j/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/i/j/h$c;,
        La/a/a/i/j/h$b;
    }
.end annotation


# static fields
.field public static a:I = -0x1

.field public static b:I = -0x1

.field public static c:I = -0x1

.field public static d:I = -0x1

.field public static e:I = -0x1

.field public static f:I = -0x1


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/i/j/g;)V
    .locals 0

    invoke-direct {p0}, La/a/a/i/j/h;-><init>()V

    return-void
.end method

.method public static a()La/a/a/i/j/h;
    .locals 1

    invoke-static {}, La/a/a/i/j/h$b;->a()La/a/a/i/j/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(La/a/a/i/j/h$c;)Ljava/lang/String;
    .locals 0

    sget-object p0, La/a/a/i/j/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget p0, La/a/a/i/j/h;->f:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/a;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    sget p0, La/a/a/i/j/h;->e:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/d;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_2
    sget p0, La/a/a/i/j/h;->d:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/b;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_3
    sget p0, La/a/a/i/j/h;->c:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/c;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    sget p0, La/a/a/i/j/h;->b:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/f;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_5
    sget p0, La/a/a/i/j/h;->a:I

    if-nez p0, :cond_0

    sget-object p0, La/a/a/i/j/e;->a:Ljava/lang/String;

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
