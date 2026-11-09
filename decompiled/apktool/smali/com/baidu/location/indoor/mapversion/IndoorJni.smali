.class public Lcom/baidu/location/indoor/mapversion/IndoorJni;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Z = false


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "indoorJNI"

    :try_start_0
    const-string v1, "indoor"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const/4 v1, 0x1

    sput-boolean v1, Lcom/baidu/location/indoor/mapversion/IndoorJni;->a:Z

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "load vdr indoor lib success."

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "indoor lib loadJniSuccess:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v2, Lcom/baidu/location/indoor/mapversion/IndoorJni;->a:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "indoor lib annot load indoor lib:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "Cannot load indoor lib"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/baidu/location/indoor/mapversion/IndoorJni;->a:Z

    :goto_0
    return-void
.end method

.method public static native destroyGpsChecker()I
.end method

.method public static native getFloor(JI)Ljava/lang/String;
.end method

.method public static native getGpsStatus(ILjava/lang/String;)I
.end method

.method public static native getInout(JI)I
.end method

.method public static native initGpsChecker(ILjava/lang/String;Ljava/lang/String;)I
.end method

.method public static native initPf()V
.end method

.method public static native pgo()F
.end method

.method public static native phs(IFFFJ)Ljava/lang/String;
.end method

.method public static native resetPf()V
.end method

.method public static native setBarometers(FJ)V
.end method

.method public static native setBleLoc4Scenario(DDLjava/lang/String;IJI)V
.end method

.method public static native setGps(DDFFFDIJ)V
.end method

.method public static native setPfBle(DDDDLjava/lang/String;Ljava/lang/String;JILjava/lang/String;)[D
.end method

.method public static native setPfDr(DDLjava/lang/String;J)[D
.end method

.method public static native setPfGeoMap([[DLjava/lang/String;II)V
.end method

.method public static native setPfRdnt(Ljava/lang/String;[[SDDIIDDLjava/lang/String;)V
.end method

.method public static native setPfWf(DDDJ)[D
.end method

.method public static native startPdr()V
.end method

.method public static native stopPdr()V
.end method
