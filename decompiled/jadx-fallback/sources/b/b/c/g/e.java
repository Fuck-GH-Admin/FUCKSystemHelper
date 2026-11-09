package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1110a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f1111b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1112c = false;
    private static java.lang.reflect.Field d;

    public interface a {
        boolean a(android.view.KeyEvent r1);
    }

    static {
            return
    }

    private static android.content.DialogInterface.OnKeyListener a(android.app.Dialog r3) {
            boolean r0 = b.b.c.g.e.f1112c
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mOnKeyListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            b.b.c.g.e.d = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            b.b.c.g.e.f1112c = r0
        L14:
            java.lang.reflect.Field r0 = b.b.c.g.e.d
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L1f
            android.content.DialogInterface$OnKeyListener r3 = (android.content.DialogInterface.OnKeyListener) r3     // Catch: java.lang.IllegalAccessException -> L1f
            return r3
        L1f:
            r3 = 0
            return r3
    }

    private static boolean a(android.app.ActionBar r6, android.view.KeyEvent r7) {
            boolean r0 = b.b.c.g.e.f1110a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1a
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.String r3 = "onMenuKeyEvent"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            r4[r2] = r5     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L18
            b.b.c.g.e.f1111b = r0     // Catch: java.lang.NoSuchMethodException -> L18
        L18:
            b.b.c.g.e.f1110a = r1
        L1a:
            java.lang.reflect.Method r0 = b.b.c.g.e.f1111b
            if (r0 == 0) goto L2d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2d
            r1[r2] = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2d
            return r6
        L2d:
            return r2
    }

    private static boolean a(android.app.Activity r5, android.view.KeyEvent r6) {
            r5.onUserInteraction()
            android.view.Window r0 = r5.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L25
            android.app.ActionBar r1 = r5.getActionBar()
            int r3 = r6.getKeyCode()
            r4 = 82
            if (r3 != r4) goto L25
            if (r1 == 0) goto L25
            boolean r1 = a(r1, r6)
            if (r1 == 0) goto L25
            return r2
        L25:
            boolean r1 = r0.superDispatchKeyEvent(r6)
            if (r1 == 0) goto L2c
            return r2
        L2c:
            android.view.View r0 = r0.getDecorView()
            boolean r1 = b.b.c.g.q.a(r0, r6)
            if (r1 == 0) goto L37
            return r2
        L37:
            if (r0 == 0) goto L3e
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            boolean r5 = r6.dispatch(r5, r0, r5)
            return r5
    }

    private static boolean a(android.app.Dialog r3, android.view.KeyEvent r4) {
            android.content.DialogInterface$OnKeyListener r0 = a(r3)
            r1 = 1
            if (r0 == 0) goto L12
            int r2 = r4.getKeyCode()
            boolean r0 = r0.onKey(r3, r2, r4)
            if (r0 == 0) goto L12
            return r1
        L12:
            android.view.Window r0 = r3.getWindow()
            boolean r2 = r0.superDispatchKeyEvent(r4)
            if (r2 == 0) goto L1d
            return r1
        L1d:
            android.view.View r0 = r0.getDecorView()
            boolean r2 = b.b.c.g.q.a(r0, r4)
            if (r2 == 0) goto L28
            return r1
        L28:
            if (r0 == 0) goto L2f
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            goto L30
        L2f:
            r0 = 0
        L30:
            boolean r3 = r4.dispatch(r3, r0, r3)
            return r3
    }

    public static boolean a(android.view.View r0, android.view.KeyEvent r1) {
            boolean r0 = b.b.c.g.q.b(r0, r1)
            return r0
    }

    public static boolean a(b.b.c.g.e.a r3, android.view.View r4, android.view.Window.Callback r5, android.view.KeyEvent r6) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r3 = r3.a(r6)
            return r3
        Lf:
            boolean r1 = r5 instanceof android.app.Activity
            if (r1 == 0) goto L1a
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r3 = a(r5, r6)
            return r3
        L1a:
            boolean r1 = r5 instanceof android.app.Dialog
            if (r1 == 0) goto L25
            android.app.Dialog r5 = (android.app.Dialog) r5
            boolean r3 = a(r5, r6)
            return r3
        L25:
            if (r4 == 0) goto L2d
            boolean r4 = b.b.c.g.q.a(r4, r6)
            if (r4 != 0) goto L33
        L2d:
            boolean r3 = r3.a(r6)
            if (r3 == 0) goto L34
        L33:
            r0 = 1
        L34:
            return r0
    }
}
