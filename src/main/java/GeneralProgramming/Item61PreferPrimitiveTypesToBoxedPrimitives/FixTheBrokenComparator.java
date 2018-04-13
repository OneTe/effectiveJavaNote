package GeneralProgramming.Item61PreferPrimitiveTypesToBoxedPrimitives;

import java.util.Comparator;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class FixTheBrokenComparator {
    public static void main(String[] args){
        Comparator<Integer> naturalOrder = (iBoxed,jBoxed) ->{
            int i = iBoxed; int j = jBoxed;//Auto-unboxing
            return i < j ? -1 : (i == j ? 0 : 1);
        };
    }
}
