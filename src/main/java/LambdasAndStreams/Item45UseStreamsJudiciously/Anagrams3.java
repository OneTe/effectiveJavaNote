package LambdasAndStreams.Item45UseStreamsJudiciously;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by wangcheng  on 2018/4/10.
 */
//Tasteful use of streams enhances clarity and conciseness

public class Anagrams3 {
    public static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
    public static void main(String[] args) throws IOException{
        Path dictionary = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);
        try(Stream<String> words = Files.lines(dictionary)){
            words.collect(groupingBy(word->alphabetize(word))).values().stream()
                    .filter(group->group.size() >= minGroupSize)
                    .forEach(g->System.out.println(g.size() + ":" + g));
        }
       // "Hello,World".chars().forEach(x->System.out.print((char)x));
    }
}
