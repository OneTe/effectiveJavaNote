package Item24FavorStaticMemberClassesOverNonstatic;

/**
 * nonstatic member classes
 * 1.Each instance of a nonstatic member class is implicitly
 *   associated with an enclosing instance of its containing class
 * 2.You can invoke methods on the enclosing instance or obtain
 *   a refer- ence to the enclosing instance using the qualified this construct
 * 3.The association between a nonstatic member class instance and
 *   its enclosing instance is established when the former is created
 * 4.The association takes up space in the nonstatic member class instance
 *   and adds time to its construction
 *
 * One common use of a nonstatic member class is to define an Adapter
 *
 * Created by wangcheng  on 2018/3/23.
 */
public class OuterNonstaticMember {
    private int x = 10;
    public void makeInner(){
        Inner i = new Inner();
        i.seeOuter();
    }
    class Inner{
        public void seeOuter(){
            System.out.println("Outer x is " + x);
            System.out.println("Inner class reference is " + this);
            System.out.println("Outer class reference is " + OuterNonstaticMember.this);
        }
    }
    public  static void main(String[] args){
        OuterNonstaticMember o = new OuterNonstaticMember();
        Inner i = o.new Inner();
        i.seeOuter();
    }
}
