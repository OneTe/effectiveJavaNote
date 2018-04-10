package LambdasAndStreams.Item46PreferSideEffectFreeFunctionInStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by wangcheng  on 2018/4/10.
 */
public class FrequencyTable {
    public static void main(String[] args){
        Map<String,Long> freq;
        String[] a = {"One","where","two","One","two"};
        try(Stream<String> words = Arrays.stream(a)) {
            freq = words.collect(groupingBy(String::toLowerCase,counting()));
        }
        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());
        System.out.println(topTen.toString());

    }
}
