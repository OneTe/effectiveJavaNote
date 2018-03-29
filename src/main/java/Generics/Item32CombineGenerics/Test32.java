package Generics.Item32CombineGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by wangcheng  on 2018/3/29.
 */
//neverWrite unsafe varargs methods like dangerous or toArray
public class Test32 {

    static void dangerous(List<String>...stringLists){
        List<Integer> intList = new ArrayList<>(Arrays.asList(41));
        Object[] objects = stringLists;
        objects[0] = intList; //Heap pollution
        String s = stringLists[0].get(0);//ClassCastException
    }

    static <T> T[] toArray(T...args){
        return args;
    }
    //it is unsafe to give another method access to a generic varargs parameter array
    static <T> T[] pickTwo(T a,T b,T c){
        switch(ThreadLocalRandom.current().nextInt(3)){
            case 0: return toArray(a,b);
            case 1: return toArray(a,c);
            case 2: return toArray(b,c);
        }
        throw new AssertionError();//Can't get here
    }
    public static void main(String[] args){
        //Not safe ,get error
        //because Object[] is not a subtype of String[]
        String[] attributes = pickTwo("Good","Fast","Cheap");
    }
}
