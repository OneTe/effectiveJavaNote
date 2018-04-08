package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

/**
 * Created by wangcheng  on 2018/4/8.
 */
public class Sample {
    @Test
    public static void m1(){}//Test should pass
    public static void m2(){}
    @Test
    public static void m3(){//Test should fail
        throw new RuntimeException("Boom");
    }
    public static void m4(){}
    @Test
    public void m5(){}//Invalid use:nonstatic method
    public static void m6(){}
    @Test
    public static void m7(){//Test should fail
        throw new RuntimeException("Crash");
    }
    public static void m8(){}
}
