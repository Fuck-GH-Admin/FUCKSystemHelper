package android.arch.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static android.arch.lifecycle.a f383c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.Class, android.arch.lifecycle.a.C0022a> f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map<java.lang.Class, java.lang.Boolean> f385b;

    /* JADX INFO: renamed from: android.arch.lifecycle.a$a, reason: collision with other inner class name */
    static class C0022a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Map<android.arch.lifecycle.c.a, java.util.List<android.arch.lifecycle.a.b>> f386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.Map<android.arch.lifecycle.a.b, android.arch.lifecycle.c.a> f387b;

        C0022a(java.util.Map<android.arch.lifecycle.a.b, android.arch.lifecycle.c.a> r5) {
                r4 = this;
                r4.<init>()
                r4.f387b = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.f386a = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L14:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L42
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                android.arch.lifecycle.c$a r1 = (android.arch.lifecycle.c.a) r1
                java.util.Map<android.arch.lifecycle.c$a, java.util.List<android.arch.lifecycle.a$b>> r2 = r4.f386a
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L3a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Map<android.arch.lifecycle.c$a, java.util.List<android.arch.lifecycle.a$b>> r3 = r4.f386a
                r3.put(r1, r2)
            L3a:
                java.lang.Object r0 = r0.getKey()
                r2.add(r0)
                goto L14
            L42:
                return
        }

        private static void a(java.util.List<android.arch.lifecycle.a.b> r2, android.arch.lifecycle.e r3, android.arch.lifecycle.c.a r4, java.lang.Object r5) {
                if (r2 == 0) goto L16
                int r0 = r2.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L16
                java.lang.Object r1 = r2.get(r0)
                android.arch.lifecycle.a$b r1 = (android.arch.lifecycle.a.b) r1
                r1.a(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L16:
                return
        }

        void a(android.arch.lifecycle.e r2, android.arch.lifecycle.c.a r3, java.lang.Object r4) {
                r1 = this;
                java.util.Map<android.arch.lifecycle.c$a, java.util.List<android.arch.lifecycle.a$b>> r0 = r1.f386a
                java.lang.Object r0 = r0.get(r3)
                java.util.List r0 = (java.util.List) r0
                a(r0, r2, r3, r4)
                java.util.Map<android.arch.lifecycle.c$a, java.util.List<android.arch.lifecycle.a$b>> r1 = r1.f386a
                android.arch.lifecycle.c$a r0 = android.arch.lifecycle.c.a.ON_ANY
                java.lang.Object r1 = r1.get(r0)
                java.util.List r1 = (java.util.List) r1
                a(r1, r2, r3, r4)
                return
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.reflect.Method f389b;

        b(int r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f388a = r1
                r0.f389b = r2
                r0 = 1
                r2.setAccessible(r0)
                return
        }

        void a(android.arch.lifecycle.e r5, android.arch.lifecycle.c.a r6, java.lang.Object r7) {
                r4 = this;
                int r0 = r4.f388a     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r1 = 0
                if (r0 == 0) goto L22
                r2 = 1
                if (r0 == r2) goto L18
                r3 = 2
                if (r0 == r3) goto Lc
                goto L29
            Lc:
                java.lang.reflect.Method r4 = r4.f389b     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r0[r1] = r5     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r0[r2] = r6     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r4.invoke(r7, r0)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                goto L29
            L18:
                java.lang.reflect.Method r4 = r4.f389b     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r6[r1] = r5     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r4.invoke(r7, r6)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                goto L29
            L22:
                java.lang.reflect.Method r4 = r4.f389b     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
                r4.invoke(r7, r5)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L31
            L29:
                return
            L2a:
                r4 = move-exception
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                r5.<init>(r4)
                throw r5
            L31:
                r4 = move-exception
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.Throwable r4 = r4.getCause()
                java.lang.String r6 = "Failed to call observer method"
                r5.<init>(r6, r4)
                throw r5
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L2d
                java.lang.Class<android.arch.lifecycle.a$b> r2 = android.arch.lifecycle.a.b.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L2d
            L10:
                android.arch.lifecycle.a$b r5 = (android.arch.lifecycle.a.b) r5
                int r2 = r4.f388a
                int r3 = r5.f388a
                if (r2 != r3) goto L2b
                java.lang.reflect.Method r4 = r4.f389b
                java.lang.String r4 = r4.getName()
                java.lang.reflect.Method r5 = r5.f389b
                java.lang.String r5 = r5.getName()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L2b
                goto L2c
            L2b:
                r0 = r1
            L2c:
                return r0
            L2d:
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.f388a
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r1.f389b
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            android.arch.lifecycle.a r0 = new android.arch.lifecycle.a
            r0.<init>()
            android.arch.lifecycle.a.f383c = r0
            return
    }

    a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f384a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f385b = r0
            return
    }

    private android.arch.lifecycle.a.C0022a a(java.lang.Class r12, java.lang.reflect.Method[] r13) {
            r11 = this;
            java.lang.Class r0 = r12.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r0 == 0) goto L16
            android.arch.lifecycle.a$a r0 = r11.a(r0)
            if (r0 == 0) goto L16
            java.util.Map<android.arch.lifecycle.a$b, android.arch.lifecycle.c$a> r0 = r0.f387b
            r1.putAll(r0)
        L16:
            java.lang.Class[] r0 = r12.getInterfaces()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L1d:
            if (r4 >= r2) goto L4e
            r5 = r0[r4]
            android.arch.lifecycle.a$a r5 = r11.a(r5)
            java.util.Map<android.arch.lifecycle.a$b, android.arch.lifecycle.c$a> r5 = r5.f387b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            android.arch.lifecycle.a$b r7 = (android.arch.lifecycle.a.b) r7
            java.lang.Object r6 = r6.getValue()
            android.arch.lifecycle.c$a r6 = (android.arch.lifecycle.c.a) r6
            r11.a(r1, r7, r6, r12)
            goto L2f
        L4b:
            int r4 = r4 + 1
            goto L1d
        L4e:
            if (r13 == 0) goto L51
            goto L55
        L51:
            java.lang.reflect.Method[] r13 = r11.c(r12)
        L55:
            int r0 = r13.length
            r2 = r3
            r4 = r2
        L58:
            if (r2 >= r0) goto Lc3
            r5 = r13[r2]
            java.lang.Class<android.arch.lifecycle.l> r6 = android.arch.lifecycle.l.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            android.arch.lifecycle.l r6 = (android.arch.lifecycle.l) r6
            r7 = 1
            if (r6 != 0) goto L68
            goto Lb8
        L68:
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r8 = r4.length
            if (r8 <= 0) goto L83
            r8 = r4[r3]
            java.lang.Class<android.arch.lifecycle.e> r9 = android.arch.lifecycle.e.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L7b
            r8 = r7
            goto L84
        L7b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r11.<init>(r12)
            throw r11
        L83:
            r8 = r3
        L84:
            android.arch.lifecycle.c$a r6 = r6.value()
            int r9 = r4.length
            r10 = 2
            if (r9 <= r7) goto Lac
            r8 = r4[r7]
            java.lang.Class<android.arch.lifecycle.c$a> r9 = android.arch.lifecycle.c.a.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto La4
            android.arch.lifecycle.c$a r8 = android.arch.lifecycle.c.a.ON_ANY
            if (r6 != r8) goto L9c
            r8 = r10
            goto Lac
        L9c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Second arg is supported only for ON_ANY value"
            r11.<init>(r12)
            throw r11
        La4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "invalid parameter type. second arg must be an event"
            r11.<init>(r12)
            throw r11
        Lac:
            int r4 = r4.length
            if (r4 > r10) goto Lbb
            android.arch.lifecycle.a$b r4 = new android.arch.lifecycle.a$b
            r4.<init>(r8, r5)
            r11.a(r1, r4, r6, r12)
            r4 = r7
        Lb8:
            int r2 = r2 + 1
            goto L58
        Lbb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "cannot have more than 2 params"
            r11.<init>(r12)
            throw r11
        Lc3:
            android.arch.lifecycle.a$a r13 = new android.arch.lifecycle.a$a
            r13.<init>(r1)
            java.util.Map<java.lang.Class, android.arch.lifecycle.a$a> r0 = r11.f384a
            r0.put(r12, r13)
            java.util.Map<java.lang.Class, java.lang.Boolean> r11 = r11.f385b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r11.put(r12, r0)
            return r13
    }

    private void a(java.util.Map<android.arch.lifecycle.a.b, android.arch.lifecycle.c.a> r3, android.arch.lifecycle.a.b r4, android.arch.lifecycle.c.a r5, java.lang.Class r6) {
            r2 = this;
            java.lang.Object r2 = r3.get(r4)
            android.arch.lifecycle.c$a r2 = (android.arch.lifecycle.c.a) r2
            if (r2 == 0) goto L44
            if (r5 != r2) goto Lb
            goto L44
        Lb:
            java.lang.reflect.Method r3 = r4.f389b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method "
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = " in "
            r0.append(r3)
            java.lang.String r3 = r6.getName()
            r0.append(r3)
            java.lang.String r3 = " already declared with different @OnLifecycleEvent value: previous value "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = ", new value "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2)
            throw r4
        L44:
            if (r2 != 0) goto L49
            r3.put(r4, r5)
        L49:
            return
    }

    private java.lang.reflect.Method[] c(java.lang.Class r2) {
            r1 = this;
            java.lang.reflect.Method[] r1 = r2.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r2.<init>(r0, r1)
            throw r2
    }

    android.arch.lifecycle.a.C0022a a(java.lang.Class r2) {
            r1 = this;
            java.util.Map<java.lang.Class, android.arch.lifecycle.a$a> r0 = r1.f384a
            java.lang.Object r0 = r0.get(r2)
            android.arch.lifecycle.a$a r0 = (android.arch.lifecycle.a.C0022a) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            android.arch.lifecycle.a$a r1 = r1.a(r2, r0)
            return r1
    }

    boolean b(java.lang.Class r7) {
            r6 = this;
            java.util.Map<java.lang.Class, java.lang.Boolean> r0 = r6.f385b
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L15
            java.util.Map<java.lang.Class, java.lang.Boolean> r6 = r6.f385b
            java.lang.Object r6 = r6.get(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L15:
            java.lang.reflect.Method[] r0 = r6.c(r7)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L1c:
            if (r3 >= r1) goto L32
            r4 = r0[r3]
            java.lang.Class<android.arch.lifecycle.l> r5 = android.arch.lifecycle.l.class
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            android.arch.lifecycle.l r4 = (android.arch.lifecycle.l) r4
            if (r4 == 0) goto L2f
            r6.a(r7, r0)
            r6 = 1
            return r6
        L2f:
            int r3 = r3 + 1
            goto L1c
        L32:
            java.util.Map<java.lang.Class, java.lang.Boolean> r6 = r6.f385b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.put(r7, r0)
            return r2
    }
}
