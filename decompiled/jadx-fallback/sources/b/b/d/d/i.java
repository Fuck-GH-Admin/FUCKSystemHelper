package b.b.d.d;

/* JADX INFO: loaded from: classes.dex */
public class i implements android.view.Window.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.view.Window.Callback f1184b;

    public i(android.view.Window.Callback r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.f1184b = r1
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Window callback may not be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchGenericMotionEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchKeyEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchKeyShortcutEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchTouchEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.dispatchTrackballEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onActionModeFinished(r1)
            return
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onActionModeStarted(r1)
            return
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onCreatePanelMenu(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            android.view.View r0 = r0.onCreatePanelView(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onMenuItemSelected(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onMenuOpened(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onPanelClosed(r1, r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onPointerCaptureChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onPreparePanel(r1, r2, r3)
            return r0
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r1, android.view.Menu r2, int r3) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onProvideKeyboardShortcuts(r1, r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            boolean r0 = r0.onSearchRequested(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onWindowAttributesChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            r0.onWindowFocusChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1, int r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f1184b
            android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
            return r0
    }
}
