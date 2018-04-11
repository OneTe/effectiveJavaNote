package Methods.Item52UseOverloadingJudiciously;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangcheng  on 2018/4/11.
 */
class Wine{
    String name(){return "Wine";}
}
class SparklingWine extends Wine{
    @Override
    String name(){return "Sparkling Wine";}
}
class Champagne extends SparklingWine{
    @Override
    String name(){return "champagne";}
}
public class Overriding {
    public static void main(String[] args){
        List<Wine> wineList = new ArrayList<>(Arrays.asList(
                new Wine(),new SparklingWine(),new Champagne()
        ));
        for(Wine wine : wineList){
            System.out.println(wine.name());
        }
    }
}
