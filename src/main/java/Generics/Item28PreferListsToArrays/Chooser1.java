package Generics.Item28PreferListsToArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by wangcheng  on 2018/3/26.
 */
// List-based Chooser - typesafe
    public class Chooser1<T> {
    private final List<T> choiceList;

    public Chooser1(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }

    public T choose(){
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
