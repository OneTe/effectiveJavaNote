package LambdasAndStreams.Item42PreferLambadsToAnonyMousClasses;

import java.util.*;

import static java.util.Comparator.comparingInt;

/**
 * Created by wangcheng  on 2018/4/9.
 */
public class AnonymousAndLambda {
    public static void main(String[] args){
        String[] words ={"one","two","three","four"};
        List<String> list = new ArrayList<>();
                list.addAll(Arrays.asList(words));
        //Anonymous class instance as a function object-obsolete!
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(),s2.length());
            }
        });

        //Lambda expression as function object(replaces anonymous class)
        Collections.sort(list,(s1,s2)->Integer.compare(s1.length(),s2.length()));

        //or
        Collections.sort(list,comparingInt(String::length));

        //or（java8）
        list.sort(comparingInt(String::length));


        System.out.println(list.toString());
    }
}
