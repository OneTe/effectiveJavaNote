package LambdasAndStreams.Item46PreferSideEffectFreeFunctionInStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by wangcheng  on 2018/4/10.
 */
public class StreamParadigm {
    public static void main(String[] args){
        //Use the Streams API but not the paradigm-Don't do this!
        Map<String,Long> freq = new HashMap<>();
        String[] a = {"one","two","three"};
        try(Stream<String> words = Arrays.stream(a)){
            // The forEach operation should be used only to report the result of a stream
            //computation, not to perform the computation.
            words.forEach(word->{freq.merge(word.toLowerCase(),1L,Long::sum);});
        }
        System.out.println(freq.toString());
    }
}
