package Methods.Item52UseOverloadingJudiciously;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangcheng  on 2018/4/11.
 */
//The addition of lambdas and method references in Java 8 further
//increased the potential for confusion in overloading.

public class MethodReferenceConfusion {
    public static void main(String[] args){
        new Thread(System.out::println).start();
        ExecutorService exec = Executors.newCachedThreadPool();
        //exec.submit(System.out::println);
    }
}
