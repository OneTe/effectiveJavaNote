package Methods.Item52UseOverloadingJudiciously;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class CollectionClassifier2 {
    //The best way to fix CollectionClassifier is use instanceof

    public static String classify(Collection<?> c){
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" :
                        "Unknown Collection";
    }
}
