package Generics.Item27EliminateUncheckedWarnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/3/26.
 */
// ArrayList.java (the method toArray())
public class Test27 {
    private  int size = 10;
    transient Object[] elements;
    // Adding local variable to reduce scope of @SuppressWarnings
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // This cast is correct because the array we're creating
            // is of the same type as the one passed in, which is T[].
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
    public static void main(String[] args){
        Set<String> exaltation = new HashSet<>();
        System.out.println("hah");
    }
}
