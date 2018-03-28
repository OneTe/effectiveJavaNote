package Generics.Item31UseBoundedWildCards;

import java.util.*;

/**
 * Created by wangcheng  on 2018/3/28.
 */
public class Test31 {
    /*
    For maximum flexibility, use wildcard types on input parameters that represent producers or consumers
        PECS stands for producer-extends, consumer-super.
    Do not use wildcard types as return types
        1.Rather than providing additional flexibility for your users, it would force them to use wildcard types in client code
        2.If the user of a class has to think about wildcard types, there is probably something wrong with the class’s API
     */
    //Item30FavorGenericMethods.Test30,should be :
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {return null;}

    Set<Integer> integers = new HashSet<>(Arrays.asList(1,2,3));
    Set<Double> doubles = new HashSet<>(Arrays.asList(1.0,2.2)) ;
    // error message: incompatible types
    Set<Number> numbers1 = union(integers, doubles);
    // explicit type parameter - required prior to Java 8
    Set<Number> numbers2 = Test31.<Number>union(integers, doubles);


    // always use Comparator<? super T> in preference to Comparator<T>
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        Iterator<? extends T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }

}
