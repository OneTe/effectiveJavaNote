package Generics.Item31UseBoundedWildCards;

import Generics.Item29FavorGenericTypes.StackOneSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * Created by wangcheng  on 2018/3/28.
 */
public class Stack31<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAP = 16;

    @SuppressWarnings("unchecked")
    public Stack31(){
        elements = (E[])new Object[DEFAULT_INITIAL_CAP];
    }
    public void push(E e){
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

    // pushAll method without wildcard type - deficient!
    public void pushAll(Iterable<E> src){
        for(E e : src){
            push(e);
        }
    }

    // Wildcard type for a parameter that serves as an E producer
    public void pushAllWildcard(Iterable<? extends E> src){
        for(E e : src){
            push(e);
        }
    }

    // popAll method without wildcard type - deficient!
    public void popAll(Collection<E> out){
        //out.addAll(Arrays.asList(elements));
       if(!isEmpty()){
           out.add(pop());
       }
    }

    // Wildcard type for parameter that serves as an E consumer
    public void popAllWildcard(Collection<? super E> out){
        if(!isEmpty()){
            out.add(pop());
        }
    }
    public static void main(String[] args) {
        Stack31<Number> numberStack = new Stack31<>();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 5, 4, 7, 8));
        //numberStack.pushAll(al);//get this error message because parameterized types are invariant
        numberStack.pushAllWildcard(al);

        Collection<Object> objects = new ArrayList<>();
        //numberStack.popAll(objects);//error
        numberStack.popAllWildcard(objects);
    }
}
