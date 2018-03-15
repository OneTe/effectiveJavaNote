package Item15MinimizeAccess;
/*
Conclusion
        Always reduce accessibility as much as possible
        Prevent any stray classes, interfaces, or members from becoming a part of the API
        Except immutable public static final fields, public classes should have no public fields
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangcheng  on 2018/3/15.
 */
public class MinimizeTheAccessibility {
    public class Thing{}
    // Exception
    public static final String CLASS_NAME = "Point";

    // Potential security hole!
    public static final Thing[] VALUES = {};

    // Alternative #1: Private array and add a public immutable list
    private static final Thing[] PRIVATE_VALUES1={};
    public static final List<Thing> VALUES1 = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES1));

    // Alternative #2: Private array and add a public method that returns a copy of a private array
    private static final Thing[] PRIVATE_VALUES2={};
    public static final Thing[]values(){
        return PRIVATE_VALUES2.clone();
    };
}
