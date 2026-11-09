package b.b.c.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.view.View.AccessibilityDelegate f1106b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View.AccessibilityDelegate f1107a;

    private static final class a extends android.view.View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.b.c.g.b f1108a;

        a(b.b.c.g.b r1) {
                r0 = this;
                r0.<init>()
                r0.f1108a = r1
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                boolean r0 = r0.a(r1, r2)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r1) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                b.b.c.g.z.b r0 = r0.a(r1)
                if (r0 == 0) goto Lf
                java.lang.Object r0 = r0.a()
                android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                r0.b(r1, r2)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r1, android.view.accessibility.AccessibilityNodeInfo r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                b.b.c.g.z.a r2 = b.b.c.g.z.a.a(r2)
                r0.a(r1, r2)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                r0.c(r1, r2)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                boolean r0 = r0.a(r1, r2, r3)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                boolean r0 = r0.a(r1, r2, r3)
                return r0
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View r1, int r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                r0.a(r1, r2)
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                b.b.c.g.b r0 = r0.f1108a
                r0.d(r1, r2)
                return
        }
    }

    static {
            android.view.View$AccessibilityDelegate r0 = new android.view.View$AccessibilityDelegate
            r0.<init>()
            b.b.c.g.b.f1106b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            b.b.c.g.b$a r0 = new b.b.c.g.b$a
            r0.<init>(r1)
            r1.f1107a = r0
            return
    }

    android.view.View.AccessibilityDelegate a() {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = r0.f1107a
            return r0
    }

    public b.b.c.g.z.b a(android.view.View r2) {
            r1 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r1 < r0) goto L14
            android.view.View$AccessibilityDelegate r1 = b.b.c.g.b.f1106b
            android.view.accessibility.AccessibilityNodeProvider r1 = r1.getAccessibilityNodeProvider(r2)
            if (r1 == 0) goto L14
            b.b.c.g.z.b r2 = new b.b.c.g.z.b
            r2.<init>(r1)
            return r2
        L14:
            r1 = 0
            return r1
    }

    public void a(android.view.View r1, int r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            r0.sendAccessibilityEvent(r1, r2)
            return
    }

    public void a(android.view.View r1, b.b.c.g.z.a r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.q()
            r0.onInitializeAccessibilityNodeInfo(r1, r2)
            return
    }

    public boolean a(android.view.View r2, int r3, android.os.Bundle r4) {
            r1 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r1 < r0) goto Ld
            android.view.View$AccessibilityDelegate r1 = b.b.c.g.b.f1106b
            boolean r1 = r1.performAccessibilityAction(r2, r3, r4)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public boolean a(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1, r2)
            return r0
    }

    public boolean a(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            boolean r0 = r0.onRequestSendAccessibilityEvent(r1, r2, r3)
            return r0
    }

    public void b(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            r0.onInitializeAccessibilityEvent(r1, r2)
            return
    }

    public void c(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            r0.onPopulateAccessibilityEvent(r1, r2)
            return
    }

    public void d(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            android.view.View$AccessibilityDelegate r0 = b.b.c.g.b.f1106b
            r0.sendAccessibilityEventUnchecked(r1, r2)
            return
    }
}
