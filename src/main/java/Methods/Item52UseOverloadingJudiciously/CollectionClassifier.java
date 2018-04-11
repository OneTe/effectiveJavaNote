package Methods.Item52UseOverloadingJudiciously;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class CollectionClassifier {
    public static String classify(Set<?> set){
        return "Set";
    }
    public static String classify(List<?> lst){
        return "List";
    }
    /**
     * the classify method is overloaded, and the choice of which overloading to invoke
     * is made at compile time. For all three iterations of the loop, the compile-time
     * type of the parameter is the same: Collection<?>
     */
    public static String classify(Collection<?> c){
        return "Unknown Collection";
    }
    public static void main(String[] args){
        Collection<?>[] collections =
                {
                        new HashSet<String>(),
                        new ArrayList<BigInteger>(),
                        new HashMap<String,String>().values()
                };
        for(Collection<?> c : collections){
            System.out.println(classify(c));
        }
    }
}
