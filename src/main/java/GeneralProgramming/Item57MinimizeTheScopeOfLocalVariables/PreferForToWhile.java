package GeneralProgramming.Item57MinimizeTheScopeOfLocalVariables;

/**
 * Created by wangcheng  on 2018/4/12.
 */
public class PreferForToWhile {
    /**
     * why these for loops are preferable to a while loop, consider the
     * following code fragment, which contains two while loops and one bug:
     *
     *  Iterator<Element> i = c.iterator(); while (i.hasNext()) {
        doSomething(i.next()); }
        ...
        Iterator<Element> i2 = c2.iterator(); while (i.hasNext()) { // BUG!
        doSomethingElse(i2.next()); }

     * copy-and-paste error:The resulting code compiles without error and runs
     * without throwing an exception, but it does the wrong thing
     */


    /**
     * If a similar copy-and-paste error were made in conjunction with either of
     * the for loops (for-each or traditional), the resulting code wouldn’t even compile
     *
     * for (Iterator<Element> i = c.iterator(); i.hasNext(); ) { Element e = i.next();
            ... // Do something with e and i
     } ...
     // Compile-time error - cannot find symbol i
     for (Iterator<Element> i2 = c2.iterator(); i.hasNext(); ) {
            Element e2 = i2.next();
     ... // Do something with e2 and i2 }
     *
     *
     *
     */

}
