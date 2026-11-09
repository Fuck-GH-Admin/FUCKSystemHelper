package a.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a.a.a.i.f f329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f330c = null;
    public static final double[] d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.LinkedList<a.a.a.i.f.b> f331a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f333b;

        public a(a.a.a.i.f r1, double r2, double r4) {
                r0 = this;
                r0.<init>()
                r0.f332a = r2
                r0.f333b = r4
                return
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.a.a.i.f.a f334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.a.a.i.f.a f335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.a.a.i.f f336c;

        public b(a.a.a.i.f r1, a.a.a.i.f.a r2, a.a.a.i.f.a r3) {
                r0 = this;
                r0.f336c = r1
                r0.<init>()
                r0.f334a = r2
                r0.f335b = r3
                return
        }

        public boolean a(a.a.a.i.f.a r9) {
                r8 = this;
                a.a.a.i.f r0 = r8.f336c
                double r1 = r8.b(r9)
                int r0 = r0.a(r1)
                if (r0 != 0) goto L5f
                double r0 = r9.f332a
                a.a.a.i.f$a r2 = r8.f334a
                double r2 = r2.f332a
                a.a.a.i.f$a r4 = r8.f335b
                double r4 = r4.f332a
                double r2 = java.lang.Math.max(r2, r4)
                r4 = 4487126258331716666(0x3e45798ee2308c3a, double:1.0E-8)
                double r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L5f
                double r0 = r9.f332a
                a.a.a.i.f$a r2 = r8.f334a
                double r2 = r2.f332a
                a.a.a.i.f$a r6 = r8.f335b
                double r6 = r6.f332a
                double r2 = java.lang.Math.min(r2, r6)
                double r2 = r2 - r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L5f
                double r0 = r9.f333b
                a.a.a.i.f$a r2 = r8.f334a
                double r2 = r2.f333b
                a.a.a.i.f$a r6 = r8.f335b
                double r6 = r6.f333b
                double r2 = java.lang.Math.max(r2, r6)
                double r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L5f
                double r0 = r9.f333b
                a.a.a.i.f$a r9 = r8.f334a
                double r2 = r9.f333b
                a.a.a.i.f$a r8 = r8.f335b
                double r8 = r8.f333b
                double r8 = java.lang.Math.min(r2, r8)
                double r8 = r8 - r4
                int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r8 <= 0) goto L5f
                r8 = 1
                goto L60
            L5f:
                r8 = 0
            L60:
                return r8
        }

        public double b(a.a.a.i.f.a r13) {
                r12 = this;
                a.a.a.i.f$a r6 = new a.a.a.i.f$a
                a.a.a.i.f r7 = r12.f336c
                a.a.a.i.f$a r0 = r12.f335b
                double r1 = r0.f332a
                a.a.a.i.f$a r12 = r12.f334a
                double r8 = r12.f332a
                double r2 = r1 - r8
                double r0 = r0.f333b
                double r10 = r12.f333b
                double r4 = r0 - r10
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r4)
                a.a.a.i.f$a r12 = new a.a.a.i.f$a
                double r0 = r13.f332a
                double r2 = r0 - r8
                double r0 = r13.f333b
                double r4 = r0 - r10
                r0 = r12
                r1 = r7
                r0.<init>(r1, r2, r4)
                double r0 = r6.f332a
                double r2 = r12.f333b
                double r0 = r0 * r2
                double r2 = r6.f333b
                double r12 = r12.f332a
                double r2 = r2 * r12
                double r0 = r0 - r2
                return r0
        }
    }

    static {
            r0 = 96
            double[] r1 = new double[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [4637468397836844266, 4637094076650215740, 4636519066971786004, 4636428868878449028, 4636302592448497187, 4636131216971876857, 4636131216971876857, 4635968857701710524, 4635838073168531684, 4635770424598528952, 4635693755318472597, 4635698263421699595, 4635531400551905890, 4635463751981903158, 4635301394963536638, 4635357768279291039, 4635325071020096422, 4635175117478053634, 4634995849443086338, 4634871827064747995, 4634850404989432966, 4634898886732002819, 4634936093220324340, 4634914670722796845, 4635010506056229894, 4635102958975236555, 4635208942185267465, 4635199921475213842, 4635215706591907776, 4635251786054422548, 4635308159722020669, 4635414141806151673, 4635456985675306755, 4635603557576979341, 4635747874301138522, 4635883170667087801, 4635965476202077810, 4636037635127107354, 4636110920937206159, 4636185333913849201, 4636296953378813765, 4636443525280486352, 4636593480652116489, 4636534850540367566, 4636611519820423921, 4636681422442040153, 4636853925507417185, 4636914808474510956, 4636894514128690117, 4637090694306158097, 4637166235434507796, 4637290257109158696, 4637556341034142814, 4637412022269290052, 4637601443669617255, 4637989293669526402, 4638070466549210128, 4637736740809622719, 4638052434136302136, 4638365867992974753, 4638336551811200384, 4638210275873829752, 4638385035805570051, 4638311748728833851, 4638294836938176889, 4638256278666279714, 4638227188368174156, 4638192235931466134, 4638161794623841109, 4638341062658808405, 4638346700250748199, 4638236207811590384, 4638294836797439400, 4638407583921529411, 4638595871962862889, 4638727285205586583, 4638767873897228260, 4638820864376343808, 4638847924254704864, 4638905425686981549, 4638975329856710152, 4638826503903424067, 4638808462483316820, 4638729539151646966, 4638573322509897389, 4638453810486585858, 4638300474178272961, 4638120077991599009, 4638129098701652632, 4638043408711542653, 4637899092831808403, 4637779580808496872, 4638079489018482355, 4637894582476781591, 4637563106285208054, 4637468397836844266} // fill-array
            a.a.a.i.f.f330c = r1
            double[] r0 = new double[r0]
            r0 = {x0196: FILL_ARRAY_DATA , data: [4631279034863066955, 4631161074611302030, 4631272822288118486, 4631448543738379228, 4631543727316503703, 4631609623986251388, 4631858562707454106, 4632048929863703057, 4632180720951398614, 4632085539625073952, 4632019642955326267, 4631858562707454106, 4631873206161642501, 4631675518404199260, 4631558370770692098, 4631296956374834123, 4631154047025558495, 4631022769770432924, 4630943005954482612, 4630820037418457074, 4630721994898994148, 4630595701862018681, 4630552497141943456, 4630427866777655418, 4630318191601092483, 4630173620423554356, 4630025725589491229, 4629783111611015200, 4629579987586609257, 4629357314421383317, 4629260933730182892, 4629074819097882085, 4629164553320457442, 4628775705773230833, 4628493210168254624, 4628456651635329490, 4628297124566378819, 4628513150981504714, 4628436711103554377, 4628154214935628215, 4628210714281803438, 4628563003296104915, 4628376887819379178, 4627349933122249791, 4627343286372149745, 4626794912318922418, 4626542327652346367, 4626695207971196993, 4626937821949673022, 4626974380482598156, 4627030879265823425, 4625422641587089607, 4623619979290317555, 4604420370155750338, 4609619726385953674, 4622102875327743299, 4624966624258795650, 4625729473518552220, 4626309032747399274, 4626938444009371553, 4627835817760322516, 4627903922038312542, 4629314080709385491, 4629442276798678499, 4629670627314184692, 4629771224359798756, 4629813718496295275, 4630018031048790379, 4630144486496827408, 4630390198107422138, 4630521494925058591, 4630536500074592059, 4630635910280966822, 4630680926151779692, 4630964151480633023, 4631002759151388610, 4631117615578585347, 4631176595563730321, 4631480809496434547, 4631486551867434421, 4632039569554090033, 4631965067631354349, 4632120278563012139, 4632238239096252041, 4632694559854570892, 4632744227803061348, 4632781478201479236, 4632654205350109839, 4632517619054711040, 4632266177458015411, 4632259968401504150, 4631881253953439124, 4631859524085237062, 4631741563551997160, 4631564623315087261, 4631279034863066955} // fill-array
            a.a.a.i.f.d = r0
            return
    }

    public f() {
            r16 = this;
            r6 = r16
            r16.<init>()
            r0 = 0
            r6.f331a = r0
            double[] r0 = a.a.a.i.f.f330c
            int r7 = r0.length
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r6.f331a = r0
            r0 = 0
            r8 = r0
        L14:
            int r0 = r7 + (-1)
            if (r8 >= r0) goto L50
            java.util.LinkedList<a.a.a.i.f$b> r9 = r6.f331a
            a.a.a.i.f$b r10 = new a.a.a.i.f$b
            a.a.a.i.f$a r11 = new a.a.a.i.f$a
            double[] r12 = a.a.a.i.f.f330c
            r0 = r12[r8]
            r13 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            double r2 = r0 * r13
            double[] r15 = a.a.a.i.f.d
            r0 = r15[r8]
            double r4 = r0 * r13
            r0 = r11
            r1 = r16
            r0.<init>(r1, r2, r4)
            a.a.a.i.f$a r4 = new a.a.a.i.f$a
            int r8 = r8 + 1
            r0 = r12[r8]
            double r2 = r0 * r13
            r0 = r15[r8]
            double r12 = r0 * r13
            r0 = r4
            r1 = r16
            r14 = r4
            r4 = r12
            r0.<init>(r1, r2, r4)
            r10.<init>(r6, r11, r14)
            r9.add(r10)
            goto L14
        L50:
            return
    }

    public static a.a.a.i.f a() {
            a.a.a.i.f r0 = a.a.a.i.f.f329b
            if (r0 != 0) goto Lb
            a.a.a.i.f r0 = new a.a.a.i.f
            r0.<init>()
            a.a.a.i.f.f329b = r0
        Lb:
            a.a.a.i.f r0 = a.a.a.i.f.f329b
            return r0
    }

    public int a(double r3) {
            r2 = this;
            r0 = -4736245778523059142(0xbe45798ee2308c3a, double:-1.0E-8)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb
            r2 = -1
            return r2
        Lb:
            r0 = 4487126258331716666(0x3e45798ee2308c3a, double:1.0E-8)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean a(double r10, double r12) {
            r9 = this;
            r0 = 0
            r1 = 1
            a.a.a.i.f$a r8 = new a.a.a.i.f$a     // Catch: java.lang.Exception -> L5e
            r2 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            double r4 = r10 * r2
            double r6 = r12 * r2
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r6)     // Catch: java.lang.Exception -> L5e
            java.util.LinkedList<a.a.a.i.f$b> r10 = r9.f331a     // Catch: java.lang.Exception -> L5e
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L5e
            r11 = r0
        L19:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Exception -> L5e
            if (r12 == 0) goto L5b
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Exception -> L5e
            a.a.a.i.f$b r12 = (a.a.a.i.f.b) r12     // Catch: java.lang.Exception -> L5e
            boolean r13 = r12.a(r8)     // Catch: java.lang.Exception -> L5e
            if (r13 == 0) goto L2c
            return r1
        L2c:
            double r2 = r12.b(r8)     // Catch: java.lang.Exception -> L5e
            int r13 = r9.a(r2)     // Catch: java.lang.Exception -> L5e
            a.a.a.i.f$a r2 = r12.f334a     // Catch: java.lang.Exception -> L5e
            double r2 = r2.f333b     // Catch: java.lang.Exception -> L5e
            double r4 = r8.f333b     // Catch: java.lang.Exception -> L5e
            double r2 = r2 - r4
            int r2 = r9.a(r2)     // Catch: java.lang.Exception -> L5e
            a.a.a.i.f$a r12 = r12.f335b     // Catch: java.lang.Exception -> L5e
            double r3 = r12.f333b     // Catch: java.lang.Exception -> L5e
            double r5 = r8.f333b     // Catch: java.lang.Exception -> L5e
            double r3 = r3 - r5
            int r12 = r9.a(r3)     // Catch: java.lang.Exception -> L5e
            if (r13 <= 0) goto L52
            if (r2 > 0) goto L52
            if (r12 <= 0) goto L52
            int r11 = r11 + 1
        L52:
            if (r13 >= 0) goto L19
            if (r12 > 0) goto L19
            if (r2 <= 0) goto L19
            int r11 = r11 + (-1)
            goto L19
        L5b:
            if (r11 != 0) goto L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            return r0
    }
}
