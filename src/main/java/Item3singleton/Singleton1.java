package Item3singleton;

import java.io.Serializable;

/**
 * Created by wangcheng  on 2018/3/2.
 */
public class Singleton1 implements Serializable{
    private static final Singleton1 INSTANCE = new Singleton1();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private Singleton1(){}
    public static Singleton1 getInstance(){
            return INSTANCE;
        }
    protected Object readResolve(){
        return INSTANCE;
    }
}
