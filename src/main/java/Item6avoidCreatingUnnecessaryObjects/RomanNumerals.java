package Item6avoidCreatingUnnecessaryObjects;

import java.util.regex.Pattern;

/**
 * Created by wangcheng  on 2018/3/5.
 */
public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeral(String s){
        return ROMAN.matcher(s).matches();
    }
}