package Methods.Item54ReturnEmptyCollectionsOrArraysNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class RightWay {
    private final List<Cheese> cheesesInStock =
            new ArrayList<>(Arrays.asList(Cheese.STILTON,Cheese.FETA));

    //The right way to return a possibly empty collection
    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheesesInStock);
    }

    //Optimization - avoids allocating empty collections
    public List<Cheese> getCheeses2(){
        return cheesesInStock.isEmpty() ? Collections.emptyList()
                :new ArrayList<>(cheesesInStock);
    }
    /*
     * The situation for arrays is identical to that for collections.
     * Never return null instead of a zero-length array
    */

    //The right way to return a possibly empty array
    public Cheese[] getCheeses3(){
        return cheesesInStock.toArray(new Cheese[0]);
    }

    //Optimization - avoid allocating empty arrays
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public  Cheese[] getCheeses4() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }


    // Don’t do this - preallocating the array harms performance!
    //return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);

    public static void main(String[] args){
        RightWay rw = new RightWay();
        for(int i = 0;i < rw.getCheeses4().length;i++)
            System.out.println(rw.getCheeses4()[i]);
    }
}
