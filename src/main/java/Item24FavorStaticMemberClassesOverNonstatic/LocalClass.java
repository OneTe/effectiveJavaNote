package Item24FavorStaticMemberClassesOverNonstatic;

/**
 * Local classes are the least frequently used of the four kinds
 * of nested classes. A local class can be declared anywhere a
 * local variable can be declared and obeys the same scoping rules
 *
 * Created by wangcheng  on 2018/3/23.
 */
public class LocalClass {
    private String x = "outer";

    public void doStuff() {
        class MyInner {
            public void seeOuter() {
                System.out.println("x is " + x);
            }
        }

        MyInner i = new MyInner();
        i.seeOuter();
    }

    public static void main(String[] args) {
        LocalClass o = new LocalClass();
        o.doStuff();
    }
}
