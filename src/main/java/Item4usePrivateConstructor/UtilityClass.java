package Item4usePrivateConstructor;
//if a class that is just a grouping of static methods and
//static fields.you can use it.
/**
 * Created by wangcheng  on 2018/3/2.
 */
//Noninstantiable utility class
public class UtilityClass {
    private UtilityClass(){
        throw new RuntimeException();
    }
    //...
}
