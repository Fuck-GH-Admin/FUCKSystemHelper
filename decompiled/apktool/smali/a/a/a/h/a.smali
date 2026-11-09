.class public La/a/a/h/a;
.super Landroid/app/Service;
.source ""

# interfaces
.implements Lcom/baidu/location/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/a/h/a$b;
    }
.end annotation


# static fields
.field public static g:La/a/a/h/a$b;

.field public static h:J


# instance fields
.field public b:Landroid/os/Messenger;

.field public c:Landroid/os/Looper;

.field public d:Z

.field public e:I

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/a/a/h/a;->b:Landroid/os/Messenger;

    iput-object v0, p0, La/a/a/h/a;->c:Landroid/os/Looper;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/h/a;->d:Z

    const/4 v1, 0x0

    iput v1, p0, La/a/a/h/a;->e:I

    iput-boolean v0, p0, La/a/a/h/a;->f:Z

    return-void
.end method

.method public static synthetic a(La/a/a/h/a;)I
    .locals 0

    iget p0, p0, La/a/a/h/a;->e:I

    return p0
.end method

.method public static synthetic a(La/a/a/h/a;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/h/a;->b(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic a(La/a/a/h/a;Z)Z
    .locals 0

    iput-boolean p1, p0, La/a/a/h/a;->f:Z

    return p1
.end method

.method public static synthetic b(La/a/a/h/a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/h/a;->c()V

    return-void
.end method

.method public static synthetic b(La/a/a/h/a;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/h/a;->c(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic c(La/a/a/h/a;)V
    .locals 0

    invoke-virtual {p0}, La/a/a/h/a;->b()V

    return-void
.end method

.method public static synthetic c(La/a/a/h/a;Landroid/os/Message;)V
    .locals 0

    invoke-virtual {p0, p1}, La/a/a/h/a;->a(Landroid/os/Message;)V

    return-void
.end method

.method public static d()J
    .locals 2

    sget-wide v0, La/a/a/h/a;->h:J

    return-wide v0
.end method

.method public static e()Landroid/os/Handler;
    .locals 1

    sget-object v0, La/a/a/h/a;->g:La/a/a/h/a$b;

    return-object v0
.end method


# virtual methods
.method public a()D
    .locals 2

    const-wide v0, 0x40230ac080000000L    # 9.520999908447266

    return-wide v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, La/a/a/b/b;->a()La/a/a/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, La/a/a/b/b;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/a/c/a/b;->a(Z)V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, La/a/a/i/i;->o0:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, La/a/a/h/a;->h:J

    invoke-static {}, La/a/a/b/v;->a()Landroid/os/HandlerThread;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, La/a/a/h/a;->c:Landroid/os/Looper;

    :cond_0
    iget-object p1, p0, La/a/a/h/a;->c:Landroid/os/Looper;

    if-nez p1, :cond_1

    new-instance p1, La/a/a/h/a$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0, p0}, La/a/a/h/a$b;-><init>(Landroid/os/Looper;La/a/a/h/a;)V

    goto :goto_0

    :cond_1
    new-instance p1, La/a/a/h/a$b;

    iget-object v0, p0, La/a/a/h/a;->c:Landroid/os/Looper;

    invoke-direct {p1, v0, p0}, La/a/a/h/a$b;-><init>(Landroid/os/Looper;La/a/a/h/a;)V

    :goto_0
    sput-object p1, La/a/a/h/a;->g:La/a/a/h/a$b;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    new-instance p1, Landroid/os/Messenger;

    sget-object v0, La/a/a/h/a;->g:La/a/a/h/a$b;

    invoke-direct {p1, v0}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, La/a/a/h/a;->b:Landroid/os/Messenger;

    sget-object p1, La/a/a/h/a;->g:La/a/a/h/a$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iput v1, p0, La/a/a/h/a;->e:I

    return-void
.end method

.method public final a(Landroid/os/Message;)V
    .locals 0

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->a(Landroid/os/Message;)Z

    return-void
.end method

.method public final b()V
    .locals 2

    invoke-static {}, La/a/a/c/d;->j()La/a/a/c/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/d;->h()V

    invoke-static {}, La/a/a/i/b;->e()La/a/a/i/b;

    invoke-static {}, La/a/a/b/f;->c()La/a/a/b/f;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/b/f;->a(Landroid/content/Context;)V

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/a/a/b/d;->b(Z)V

    invoke-static {}, La/a/a/b/d;->i()La/a/a/b/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/d;->h()V

    :try_start_0
    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/z;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, La/a/a/b/l;->f()La/a/a/b/l;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/l;->d()V

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->a()V

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->m()V

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, La/a/a/g/f;->a(Landroid/content/Context;)V

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/o;->n()V

    invoke-static {}, La/a/a/f/a;->e()La/a/a/f/a;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/a;->c()V

    invoke-static {}, La/a/a/c/c;->f()La/a/a/c/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/c;->d()V

    invoke-static {}, La/a/a/c/e;->b()La/a/a/c/e;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/e;->a()V

    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/a;->a()V

    const/4 v0, 0x2

    iput v0, p0, La/a/a/h/a;->e:I

    return-void
.end method

.method public final b(Landroid/os/Message;)V
    .locals 0

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->d(Landroid/os/Message;)V

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    invoke-static {}, La/a/a/c/d;->j()La/a/a/c/d;

    move-result-object p0

    invoke-virtual {p0}, La/a/a/c/d;->c()V

    return-void
.end method

.method public final c()V
    .locals 1

    invoke-static {}, La/a/a/g/d;->n()La/a/a/g/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/d;->b()V

    iget-boolean v0, p0, La/a/a/h/a;->f:Z

    if-eqz v0, :cond_0

    invoke-static {}, La/a/a/f/d;->r()La/a/a/f/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/f/d;->b()V

    :cond_0
    invoke-static {}, La/a/a/b/z;->f()La/a/a/b/z;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/z;->b()V

    invoke-static {}, La/a/a/c/d;->j()La/a/a/c/d;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/d;->i()V

    invoke-static {}, La/a/a/c/c;->f()La/a/a/c/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/c;->e()V

    invoke-static {}, La/a/a/c/b;->g()La/a/a/c/b;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/b;->f()V

    invoke-static {}, La/a/a/c/a;->d()La/a/a/c/a;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/c/a;->b()V

    invoke-static {}, La/a/a/b/g;->b()La/a/a/b/g;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/g;->a()V

    invoke-static {}, La/a/a/g/f;->w()La/a/a/g/f;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/g/f;->u()V

    invoke-static {}, La/a/a/b/o;->q()La/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/o;->o()V

    invoke-static {}, La/a/a/d/i;->m()La/a/a/d/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/d/i;->l()V

    invoke-static {}, La/a/a/b/l;->f()La/a/a/b/l;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/l;->e()V

    iget-boolean v0, p0, La/a/a/h/a;->f:Z

    if-eqz v0, :cond_1

    invoke-static {}, La/a/a/b/y;->b()V

    :cond_1
    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/c;->c()V

    :try_start_0
    invoke-static {}, La/a/a/b/w;->d()La/a/a/b/w;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/b/w;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/4 v0, 0x4

    iput v0, p0, La/a/a/h/a;->e:I

    iget-boolean p0, p0, La/a/a/h/a;->d:Z

    if-nez p0, :cond_2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p0

    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    :cond_2
    return-void
.end method

.method public final c(Landroid/os/Message;)V
    .locals 0

    invoke-static {}, La/a/a/b/c;->h()La/a/a/b/c;

    move-result-object p0

    invoke-virtual {p0, p1}, La/a/a/b/c;->e(Landroid/os/Message;)V

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "key"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/i/b;->i:Ljava/lang/String;

    const-string v0, "sign"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/i/b;->h:Ljava/lang/String;

    const-string v0, "kill_process"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, La/a/a/h/a;->d:Z

    const-string v0, "cache_exception"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "auth_key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "proxyHost"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, La/a/a/i/i;->Q0:Ljava/lang/String;

    const-string v2, "proxyPort"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    sput v2, La/a/a/i/i;->R0:I

    const-string v2, "username"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, La/a/a/i/i;->S0:Ljava/lang/String;

    const-string v2, "password"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, La/a/a/i/i;->T0:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {}, La/a/a/a/a;->b()La/a/a/a/a;

    move-result-object p1

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, La/a/a/a/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    sget-object p1, La/a/a/i/i;->Q0:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    sget p1, La/a/a/i/i;->R0:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p1

    sget-object v1, La/a/a/i/i;->Q0:Ljava/lang/String;

    sget v2, La/a/a/i/i;->R0:I

    invoke-virtual {p1, v1, v2}, Lc/a/c/a/b;->a(Ljava/lang/String;I)V

    :cond_2
    sget-object p1, La/a/a/i/i;->S0:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, La/a/a/i/i;->T0:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lc/a/c/a/b;->c(Landroid/content/Context;)Lc/a/c/a/b;

    move-result-object p1

    sget-object v1, La/a/a/i/i;->S0:Ljava/lang/String;

    sget-object v2, La/a/a/i/i;->T0:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lc/a/c/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-static {}, La/a/a/a/a;->b()La/a/a/a/a;

    move-result-object p1

    invoke-static {}, Lcom/baidu/location/f;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, La/a/a/a/a;->a(Landroid/content/Context;)V

    if-nez v0, :cond_4

    invoke-static {}, La/a/a/c/e;->b()La/a/a/c/e;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_4
    iget-object p0, p0, La/a/a/h/a;->b:Landroid/os/Messenger;

    invoke-virtual {p0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object p0

    return-object p0
.end method

.method public onDestroy()V
    .locals 5

    :try_start_0
    sget-object v0, La/a/a/h/a;->g:La/a/a/h/a$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "baidu_location_service"

    const-string v1, "baidu location service stop exception..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, La/a/a/h/a;->f:Z

    invoke-virtual {p0}, La/a/a/h/a;->c()V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :goto_0
    const/4 v0, 0x3

    iput v0, p0, La/a/a/h/a;->e:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v2, La/a/a/h/a$a;

    invoke-direct {v2, p0, v1}, La/a/a/h/a$a;-><init>(La/a/a/h/a;Ljava/lang/ref/WeakReference;)V

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p0, 0x2

    return p0
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    const-string p0, "baidu_location_service"

    const-string p1, "baidu location service remove task..."

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
