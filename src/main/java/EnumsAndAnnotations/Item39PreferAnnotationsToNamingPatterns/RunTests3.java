package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.reflect.Method;

/**
 * Created by wangcheng  on 2018/4/8.
 */
public class RunTests3 {
    public static void main(String[] args) throws Exception{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns.Sample3");
        for(Method m : testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(ExceptionTest3.class)){
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed:no exception %n",m);
                }catch (Throwable wrappedExc){
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    Class<? extends Exception>[] excTypes =
                            m.getAnnotation(ExceptionTest3.class).value();
                    for(Class<? extends Exception> excType : excTypes){
                        if(excType.isInstance(exc)){
                            passed++;
                            break;
                        }
                    }
                    if(passed == oldPassed){
                        System.out.printf("Test %s failed: %s %n", m, exc);
                    }
                }
            }
        }
    }
}
