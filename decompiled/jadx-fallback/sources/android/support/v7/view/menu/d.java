package android.support.v7.view.menu;

/* JADX INFO: loaded from: classes.dex */
class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T f747a;

    d(T r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.f747a = r1
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrapped Object can not be null."
            r0.<init>(r1)
            throw r0
    }
}
