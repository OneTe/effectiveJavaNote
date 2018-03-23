package Item24FavorStaticMemberClassesOverNonstatic;

/**
 * static member classes
 * Ordinary class that happens to be declared inside another class
 * to all of the enclosing class's members,even those declared private.
 * One common use of static member class is as a public helper class,
 * useful only in conjunction with its outer class
 * Created by wangcheng  on 2018/3/23.
 */
class Outer{
    static class Inner{
        void go(){
            System.out.println("Inner class reference is :" + this);
        }
    }
}
public class Test {
    public static void main(String[] args){
        Outer.Inner n = new Outer.Inner();
        n.go();
    }
}
