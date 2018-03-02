package Item3singleton;

import java.lang.reflect.Constructor;
//In this way, the non-accessible private constructor becomes
//accessible and the whole idea of making the class a singleton breaks
/**
 * Created by wangcheng  on 2018/3/2.
 */
public class RefectionDemo {
    public static void main(String[] args) throws Exception{
        Singleton singleton = Singleton.INSTANCE;

        Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        Singleton singleton2 = (Singleton)constructor.newInstance();

        if(singleton == singleton2){
            System.out.println("Two object are same");
        }else {
            System.out.println("Two object are not same");
        }

    }
}
