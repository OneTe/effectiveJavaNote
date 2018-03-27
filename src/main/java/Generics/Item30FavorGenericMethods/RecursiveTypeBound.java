package Generics.Item30FavorGenericMethods;

import java.util.*;

/**
 * Created by wangcheng  on 2018/3/27.
 */
public class RecursiveTypeBound {
    //Returns max value in a collection - uses recursive type bound
    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty()){
            throw new IllegalArgumentException("Empty collection");
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> ls = new ArrayList<>(Arrays.asList(1,4,2,29,2,39,15,3));
        System.out.println(max(ls));
    }
}
