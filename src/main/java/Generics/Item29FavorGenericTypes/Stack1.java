package Generics.Item29FavorGenericTypes;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by wangcheng  on 2018/3/26.
 */
// Initial attempt to generify Stack - won't compile!
public class Stack1<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAP = 16;

    public Stack1(){
        //There are two reasonable ways to solve it
        //elements = new E[DEFAULT_INITIAL_CAP];//won't compile!
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
