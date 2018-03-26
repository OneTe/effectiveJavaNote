package Generics.Item29FavorGenericTypes;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by wangcheng  on 2018/3/26.
 */
public class StackOneSolution<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAP = 16;

    @SuppressWarnings("unchecked")
    public StackOneSolution(){
        // The elements array will contain only E instances from push(E)
        // This is sufficient to ensure type safety, but the runtime
        // type of the array won't be E[]; it will always be Object[]!
        elements = (E[])new Object[DEFAULT_INITIAL_CAP];
    }
    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
