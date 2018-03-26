package Generics.Item26DonotUseRawTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/3/23.
 */
// Fails at runtime - unsafeAdd method uses a raw type (List)!
public class Test26 {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,Integer.valueOf(42));
        String s =  strings.get(0);// Has compiler-generate cast
    }
    private static void unsafeAdd(List list,Object o){
        list.add(o);
    }
    //Use of raw type for unknown element type - don't do this!
    static int numElementsInCommon(Set s1,Set s2){
        int result = 0;
        for(Object o1 : s1){
            if(s2.contains(o1)){
                result++;
            }
        }
        return result;
    }
    //If you want to use a generic type but you don’t know or care what the actual type
    //parameter is, you can use a question mark instead. For example, the unbounded wildcard type for the generic
    //type Set<E> is Set<?> (read “set of some type”)

    // Uses unbounded wildcard type - typeSafe and flexible
    static int numElementsInCommon1(Set<?> s1, Set<?> s2) {return 0;}


 // Legitimate use of raw type - instanceof operator
//    if (o instanceof Set) { // Raw type
//        Set<?> s = (Set<?>) o; // Wildcard type
//    }
}
