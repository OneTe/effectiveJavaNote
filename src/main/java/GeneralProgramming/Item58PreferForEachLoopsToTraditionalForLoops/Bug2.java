package GeneralProgramming.Item58PreferForEachLoopsToTraditionalForLoops;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by wangcheng  on 2018/4/12.
 */
enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }
public class Bug2 {
    public static void main(String[] args){
        Collection<Face> faces = EnumSet.allOf(Face.class);
        for(Iterator<Face> i = faces.iterator();i.hasNext();){
            for(Iterator<Face> j = faces.iterator();j.hasNext();){
                //The program doesn’t throw an exception, but it prints only the
                //six “doubles” (from “ONE ONE” to “SIX SIX”), instead of the expected
                //thirty-six combinations.
                System.out.println(i.next() + " " + j.next());
            }
        }
    }
}
