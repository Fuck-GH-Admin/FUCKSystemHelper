package a.a.a.d;

/* JADX INFO: loaded from: classes.dex */
public class f<T> extends java.util.ArrayList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137b;

    public f(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f137b = r0
            r1.f137b = r2
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T r3) {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L17
            int r1 = r2.f137b     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto Ld
            r0 = 0
            r2.remove(r0)     // Catch: java.lang.Throwable -> L17
        Ld:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L17
            r2.add(r0, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            return r2
        L17:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L1c
            r1 = 3
            if (r0 > r1) goto La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        La:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 / 2
        L10:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L1a
            r0 = 0
            r2.remove(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = r1
            goto L10
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }
}
