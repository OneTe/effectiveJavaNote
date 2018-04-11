package Methods.Item52UseOverloadingJudiciously;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class SetList {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = -3;i < 3;i++){
            set.add(i);
            list.add(i);
        }
        for(int i = 0;i < 3;i++){
            //The call to set.remove(i) selects the overloading remove(E),
            //where E is the element type of the set (Integer), and autoboxes i from int to Integer.
            set.remove(i);

            //The call to list.remove(i), on the other hand, selects
            //the overloading remove(int i), which removes the element at the specified position in the list.
            list.remove(i);
            /* To fix the problem, cast list.remove’s argument to Integer, forcing the correct overloading to be selected.
                 list.remove(Integer.valueOf(i));
                 list.remove((Integer)i);
               because the List<E> interface has two overloadings of the remove method: remove(E) and remove(int)
                in the presence of generics and autoboxing, the two parameter types are no longer radically different
            */
        }
        System.out.println(set + "" + list);
        //[-3, -2, -1][-2, 0, 2]
    }
}
