package EnumsAndAnnotations.Item37UseEnumMapInsteadOfOrdinalIndexing;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * Created by wangcheng  on 2018/4/3.
 */
//Using an EnumMap to associate data with an enum
public class UseEnumMap {
    public static void main(String[] args){
        Plant[] garden = {
                new Plant("one", Plant.LifeCycle.ANNUAL),
                new Plant("two", Plant.LifeCycle.PERENNIAL),
                new Plant("three", Plant.LifeCycle.BIENNIAL)};
        //the EnumMap constructor takes the Class object of the key type:
        //this is a bounded type token, which provides runtime generic type information
        Map<Plant.LifeCycle,Set<Plant>> plantsByLifeCycle =
                new EnumMap<Plant.LifeCycle, Set<Plant>>(Plant.LifeCycle.class);
        for(Plant.LifeCycle lc : Plant.LifeCycle.values()){
            plantsByLifeCycle.put(lc,new HashSet<>());
        }
        for(Plant p : garden){
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantsByLifeCycle);

        // Naive stream-based approach - unlikely to produce an EnumMap!
        System.out.println(Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle)));

        // Using a stream and an EnumMap to associate data with an enum
        System.out.println(Arrays.stream(garden).collect(groupingBy(p->p.lifeCycle,
                ()->new EnumMap<>(Plant.LifeCycle.class),toSet())));
    }
}
