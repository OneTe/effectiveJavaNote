package Generics.Item29FavorGenericTypes;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by wangcheng  on 2018/3/26.
 */
public class StackSecondSolution<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAP = 16;

    public StackSecondSolution(){
        //There are two reasonable ways to solve it
        elements = new Object[DEFAULT_INITIAL_CAP];//won't compile!
    }
    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }
    // Appropriate suppression of unchecked warning
    public E pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        //push requires elements to be of type E, so cast is correct
        @SuppressWarnings("unchecked")
        E result = (E)elements[--size];
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
    public static void main(String[] args){
        String[] argsT = {"apple","RICE","whatEver"};
        StackSecondSolution<String> stack = new StackSecondSolution<>();
        for(String arg : argsT){
            stack.push(arg);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
