package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

/**
 * Created by wangcheng  on 2018/3/29.
 */
public class IntEnumPattern {
    //The int enum pattern - severely deficient
    //Shortcomings :
    //* Provides nothing in the way of type safety and little in the way of convenience
    //* Java don’t provide namespaces for int enum groups * Programs that use the int enum pattern are brittle
    //* There is no easy way to translate int enum constants into printable strings
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
}
