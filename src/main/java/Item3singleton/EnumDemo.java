package Item3singleton;
//when serializing an enum, field variables are not getting serialized.
//For example, if we serialize and deserialize the SingletonEnum class,
//we will lose the value of the int value field
/**
 * Created by wangcheng  on 2018/3/2.
 */
public class EnumDemo {
    public static void main(String[] args){
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum.getValue());
        singletonEnum.setValue(2);
        System.out.println(singletonEnum.getValue());
    }
}

