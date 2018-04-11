package Methods.Item54ReturnEmptyCollectionsOrArraysNotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class DontDoThis {
    private final List<Cheese> cheesesInStock =
            new ArrayList<>();

    /**
     * @return a list containing all of the cheeses in the shop, * or null if no cheeses are available for purchase.
     */
    public List<Cheese> getCheeses(){
        return cheesesInStock.isEmpty() ? null
                : new ArrayList<>(cheesesInStock);
    }
    //Doing so requires extra code in the client to handle the possibly null return value, for example:
    public static void main(String[] args){
        DontDoThis shop = new DontDoThis();
        List<Cheese> cheeses = shop.getCheeses();
        if (cheeses != null && cheeses.contains(Cheese.STILTON))
            System.out.println("Jolly good, just the thing.");
    }
}
