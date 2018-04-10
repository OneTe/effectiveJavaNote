package LambdasAndStreams.Item46PreferSideEffectFreeFunctionInStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by wangcheng  on 2018/4/10.
 */
public class SteamParadigm2 {
    public static void main(String[] args){
        //Proper use of streams to initialize a frequency table
        Map<String,Long> freq;
        String[] a = {"One","where","two","One"};
        try(Stream<String> words = Arrays.stream(a)) {
            freq = words.collect(groupingBy(String::toLowerCase,counting()));
        }
        System.out.println(freq.toString());
    }
}
