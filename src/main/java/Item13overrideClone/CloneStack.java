package Item13overrideClone;


import java.util.*;

/**
 * Created by wangcheng  on 2018/3/12.
 */
public class CloneStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public CloneStack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop(){
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; //Eliminate obsolete reference
        return result;
    }
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }
    @Override
    public CloneStack clone() {
        try {
            CloneStack result = (CloneStack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
