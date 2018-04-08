package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangcheng  on 2018/4/8.
 */
public class Sample4 {
    @ExceptionTest4(IndexOutOfBoundsException.class)
    @ExceptionTest4(NullPointerException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();

        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5,null);
    }
}
