package LambdasAndStreams.Item45UseStreamsJudiciously;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by wangcheng  on 2018/4/10.
 */
//Overuse of streams - don't do this!
public class Anagrams2 {
    public static void main(String[] args) throws IOException{
        Path dictionary = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);
        try(Stream<String> words = Files.lines(dictionary)){
            words.collect(
                    groupingBy(word->word.chars().sorted()
                    .collect(StringBuilder::new,
                            (sb,c)->sb.append((char)c),
                            StringBuilder::append).toString()))
                    .values().stream()
                    .filter(group->group.size()>=minGroupSize)
                    .map(group->group.size() + ":" + group)
                    .forEach(System.out::println);
        }
    }
}