package Item24FavorStaticMemberClassesOverNonstatic;

/**
 * anonymous classes
 * one common use of anonymous classes is to create function objects
 * Created by wangcheng  on 2018/3/23.
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base constructor.i=" + i);
    }
    public abstract void f();
}
public class AnonymousClass {
    public Base getBase(int i){
        return new Base(i){
            public void f(){
                System.out.println("inside !");
            }
        };
    }
    public static void main(String[] args){
        AnonymousClass a = new AnonymousClass();
        a.getBase(10);
    }
}
