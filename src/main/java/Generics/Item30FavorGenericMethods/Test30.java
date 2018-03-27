package Generics.Item30FavorGenericMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/**
 * Created by wangcheng  on 2018/3/27.
 */
public class Test30 {
    //Uses raw types - unacceptable(item26)
    public static Set union(Set s1,Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    //Generic method
    public static <E> Set<E> union1(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args){
        Set<String> guys = new HashSet<>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union1(guys,stooges);
        System.out.println(aflCio);
    }
}
