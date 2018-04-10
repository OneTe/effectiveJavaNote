package LambdasAndStreams.Item45UseStreamsJudiciously;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by wangcheng  on 2018/4/9.
 */
//prints all large anagram groups in a dictionary iteratively
public class Anagrams {
    public static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
    public static void main(String[] args) throws IOException {
        File dictionary = new File(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word),
                        (unused) -> new TreeSet<>()).add(word);
            }
        }
        //computeIfAbsent使用方法
        Map<Integer, Set<String>> map1 = new HashMap<>();
        // Java7及以前的实现方式
        if (map1.containsKey(1)) {
            map1.get(1).add("one");
        } else {
            Set<String> valueSet = new HashSet<String>();
            valueSet.add("one");
            map1.put(1, valueSet);
        }
        // Java8的实现方式
        map1.computeIfAbsent(1, v -> new HashSet<String>()).add("yi");
    }
}
