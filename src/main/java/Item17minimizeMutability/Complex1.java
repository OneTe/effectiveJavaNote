package Item17minimizeMutability;
//This approach is often the best alternative. It is the most
//flexible because it allows the use of multiple package-private implementation classes
/**
 * Created by wangcheng  on 2018/3/16.
 */
// Immutable class with static factories instead of constructors
public class Complex1 {
    private final double re;
    private final double im;

    private Complex1(double re,double im){
        this.re = re;
        this.im = im;
    }
    public static Complex1 valueOf(double re,double im){
        return new Complex1(re,im);
    }
}
