package Methods.Item55RetrunOptionalsJudiciously;

import java.util.*;
//Optionals are similar in spirit to checked exceptions
/**
 * Created by wangcheng  on 2018/4/12.
 */
//Optional<T> @since java8
public class CalculateMax {
    //Returns maximum value in collection - throws exception if empty
    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty()){
            throw new IllegalArgumentException("Empty Collection");
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    //Returns maximum value in collection as an Optional<E>
    public static <E extends Comparable<E>> Optional<E>
        max2(Collection<E> c){
        if(c.isEmpty()){
            return Optional.empty();
        }
        E result = null;
        for(E e : c){
            if(result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        }
        return Optional.of(result);
    }

    // Returns max val in collection as Optional<E> - uses stream
    public static <E extends Comparable<E>> Optional<E> max3(Collection<E> c){
            return c.stream().max(Comparator.naturalOrder());
    }
    public static void main(String[] args){
        List<Integer> ls = new ArrayList<>();
        System.out.println(max2(ls));
    }
}
