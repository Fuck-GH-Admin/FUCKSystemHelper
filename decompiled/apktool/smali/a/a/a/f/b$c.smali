.class public La/a/a/f/b$c;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/f/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Long;

.field public d:Lcom/baidu/location/c;

.field public e:Lcom/baidu/location/c;

.field public f:Lcom/baidu/location/c;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:La/a/a/f/b;


# direct methods
.method public constructor <init>(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lcom/baidu/location/c;",
            "Lcom/baidu/location/c;",
            "Lcom/baidu/location/c;",
            "Ljava/lang/String;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p2, p0, La/a/a/f/b$c;->b:Ljava/lang/String;

    iput-object p3, p0, La/a/a/f/b$c;->c:Ljava/lang/Long;

    iput-object p4, p0, La/a/a/f/b$c;->d:Lcom/baidu/location/c;

    iput-object p5, p0, La/a/a/f/b$c;->e:Lcom/baidu/location/c;

    iput-object p6, p0, La/a/a/f/b$c;->f:Lcom/baidu/location/c;

    iput-object p7, p0, La/a/a/f/b$c;->g:Ljava/lang/String;

    iput-object p8, p0, La/a/a/f/b$c;->h:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public synthetic constructor <init>(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/util/LinkedHashMap;La/a/a/f/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, La/a/a/f/b$c;-><init>(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    iget-object v2, p0, La/a/a/f/b$c;->b:Ljava/lang/String;

    iget-object v3, p0, La/a/a/f/b$c;->c:Ljava/lang/Long;

    iget-object v4, p0, La/a/a/f/b$c;->d:Lcom/baidu/location/c;

    invoke-static {v1, v2, v3, v4}, La/a/a/f/b;->a(La/a/a/f/b;Ljava/lang/String;Ljava/lang/Long;Lcom/baidu/location/c;)V

    iget-object v1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    invoke-static {v1, v0}, La/a/a/f/b;->a(La/a/a/f/b;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    iget-object v1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    invoke-static {v1, v0}, La/a/a/f/b;->b(La/a/a/f/b;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    iget-object v1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    iget-object v2, p0, La/a/a/f/b$c;->h:Ljava/util/LinkedHashMap;

    invoke-static {v1, v2}, La/a/a/f/b;->a(La/a/a/f/b;Ljava/util/LinkedHashMap;)V

    iget-object v3, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    iget-object v4, p0, La/a/a/f/b$c;->f:Lcom/baidu/location/c;

    iget-object v5, p0, La/a/a/f/b$c;->d:Lcom/baidu/location/c;

    iget-object v6, p0, La/a/a/f/b$c;->e:Lcom/baidu/location/c;

    iget-object v7, p0, La/a/a/f/b$c;->b:Ljava/lang/String;

    iget-object v8, p0, La/a/a/f/b$c;->c:Ljava/lang/Long;

    invoke-static/range {v3 .. v8}, La/a/a/f/b;->a(La/a/a/f/b;Lcom/baidu/location/c;Lcom/baidu/location/c;Lcom/baidu/location/c;Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p0, La/a/a/f/b$c;->g:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, La/a/a/f/b$c;->i:La/a/a/f/b;

    invoke-static {v1}, La/a/a/f/b;->c(La/a/a/f/b;)La/a/a/f/d;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/f/d;->e()La/a/a/f/f;

    move-result-object v1

    iget-object v2, p0, La/a/a/f/b$c;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, La/a/a/f/f;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iput-object v0, p0, La/a/a/f/b$c;->h:Ljava/util/LinkedHashMap;

    iput-object v0, p0, La/a/a/f/b$c;->b:Ljava/lang/String;

    iput-object v0, p0, La/a/a/f/b$c;->g:Ljava/lang/String;

    iput-object v0, p0, La/a/a/f/b$c;->c:Ljava/lang/Long;

    iput-object v0, p0, La/a/a/f/b$c;->d:Lcom/baidu/location/c;

    iput-object v0, p0, La/a/a/f/b$c;->e:Lcom/baidu/location/c;

    iput-object v0, p0, La/a/a/f/b$c;->f:Lcom/baidu/location/c;

    return-void
.end method
