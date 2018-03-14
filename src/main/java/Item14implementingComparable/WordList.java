package Item14implementingComparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wangcheng  on 2018/3/13.
 */
public class WordList {
    public static void main(String[] args){
        String[] st = {"hello","world","apple"};
        Set<String> s = new TreeSet<>();
        Collections.addAll(s,st);
        System.out.println(s);
    }
}
