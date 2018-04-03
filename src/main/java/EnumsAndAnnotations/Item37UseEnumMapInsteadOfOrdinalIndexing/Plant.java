package EnumsAndAnnotations.Item37UseEnumMapInsteadOfOrdinalIndexing;


import java.util.*;


/**
 * Created by wangcheng  on 2018/4/3.
 */
public class Plant {
    enum LifeCycle{ANNUAL,PERENNIAL,BIENNIAL}
    final String name;
    final LifeCycle lifeCycle;
    Plant(String name,LifeCycle lifeCycle){
        this.name = name;
        this.lifeCycle = lifeCycle;
    }
    @Override
    public String toString(){
        return name;
    }
    //Using ordinal() to index into an array - Don't do this
    //this works,but it is fraught with problems.because arrays are not
    //compatible with generics
    public static void main(String[] args){
       Plant[] garden= {
                        new Plant("one",LifeCycle.ANNUAL),
                        new Plant("two",LifeCycle.PERENNIAL),
                        new Plant("three",LifeCycle.BIENNIAL)};
        //requires an unchecked cast
        Set<Plant>[] plantsByLifeCycle =
                (Set<Plant>[]) new Set[LifeCycle.values().length];
        for(int i = 0; i < plantsByLifeCycle.length;i++){
            plantsByLifeCycle[i] = new HashSet<>();
        }
        for(Plant p : garden){
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }
        //print the results
        for(int i = 0;i < plantsByLifeCycle.length;i++){
            System.out.printf("%s: %s%n",Plant.LifeCycle.values()[i],plantsByLifeCycle[i]);
        }
    }
}
