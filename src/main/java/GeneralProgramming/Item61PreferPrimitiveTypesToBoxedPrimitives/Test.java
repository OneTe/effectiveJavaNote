package GeneralProgramming.Item61PreferPrimitiveTypesToBoxedPrimitives;

import java.util.*;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class Test {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,2,8,9,5,5,3));
        //Broken comparator - can you spot the flaw?
        Comparator<Integer> naturalOrder =
                (i,j)->(i<j)? -1 :(i == j ? 0 : 1);
        Collections.sort(list,naturalOrder);
        //this seem ok
        System.out.println(list.toString());

        //the result is 1,not 0
        //Applying the == operator to boxed primitives is almost always wrong.
        naturalOrder.compare(new Integer(42),new Integer(42));

        /*
            In practice, if you need a comparator to describe a type’s natural order,
            you should simply call Comparator.naturalOrder(), and if you write a comparator
            yourself, you should use the comparator construction methods, or the static compare
            methods on primitive types (Item 14).
         */
    }
}
