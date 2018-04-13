package GeneralProgramming.Item62AvoidStringsWhereOtherTypesAreMoreAppropriate;

/**
 * Created by wangcheng  on 2018/4/13.
 */
//Broken-inappropriate use of string as capability!
public class ThreadLocal1 {
    private ThreadLocal1(){}//Non instantiable
    //Sets the current thread's value for the named variable.
    //public static void set(String key,Object value);

    //Returns the current thread's value for the named variable.
    //public static Object get(String key);
}
