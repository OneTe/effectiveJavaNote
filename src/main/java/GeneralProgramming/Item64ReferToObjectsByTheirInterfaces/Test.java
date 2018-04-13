package GeneralProgramming.Item64ReferToObjectsByTheirInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class Test {
    public static void main(String[] args){
        // Good - uses interface as type
        Set<Test> sonSet = new LinkedHashSet<>();

        // Bad - uses class as type!
        LinkedHashSet<Test> sonSet1 = new LinkedHashSet<>();

        //If you get into the habit of using interfaces as types,
        // your program will be much more flexible
        //for example:the first declaration could be changed to read

        Set<Test> sonSet_1 = new HashSet<>();


    }
}
