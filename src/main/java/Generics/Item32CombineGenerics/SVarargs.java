package Generics.Item32CombineGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangcheng  on 2018/3/29.
 */
public class SVarargs {
    //Use @SafeVarargs on every method with a varargs parameter of a generic or parameterized type
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>...lists){
        List<T> result = new ArrayList<>();
        for(List<? extends T> list : lists){
            result.addAll(list);
        }
        return result;
    }
    //List as a typesafe alternative to a generic varargs parameter
    static <T> List<T> flattenT(List<List<? extends T>> lists){
        List<T> result = new ArrayList<>();
        for(List<? extends T> list : lists){
            result.addAll(list);
        }
        return result;
    }
}
