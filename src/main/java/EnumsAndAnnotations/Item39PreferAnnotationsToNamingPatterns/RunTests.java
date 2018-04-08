package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangcheng  on 2018/4/8.
 */
//Program to process marker annotations
public class RunTests {
    public static void main(String[] args) throws Exception{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns.Sample");
        for(Method m : testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(Test.class)){
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                }catch (InvocationTargetException wrappedExc){
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + "failed: " + exc);
                }catch (Exception exc){
                    System.out.println("Invalid@Test: " + m);
                }
            }
        }
        //m5()调不了，是因为它不是static方法，需要一个实例
        //如果增加:Object obj = testClass.newInstance(); m.invoke(obj);即可调用
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
