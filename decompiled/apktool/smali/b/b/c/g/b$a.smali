.class final Lb/b/c/g/b$a;
.super Landroid/view/View$AccessibilityDelegate;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/c/g/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lb/b/c/g/b;


# direct methods
.method constructor <init>(Lb/b/c/g/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1}, Lb/b/c/g/b;->a(Landroid/view/View;)Lb/b/c/g/z/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lb/b/c/g/z/b;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-static {p2}, Lb/b/c/g/z/a;->a(Landroid/view/accessibility/AccessibilityNodeInfo;)Lb/b/c/g/z/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->a(Landroid/view/View;Lb/b/c/g/z/a;)V

    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2, p3}, Lb/b/c/g/b;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2, p3}, Lb/b/c/g/b;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->a(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    iget-object p0, p0, Lb/b/c/g/b$a;->a:Lb/b/c/g/b;

    invoke-virtual {p0, p1, p2}, Lb/b/c/g/b;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
