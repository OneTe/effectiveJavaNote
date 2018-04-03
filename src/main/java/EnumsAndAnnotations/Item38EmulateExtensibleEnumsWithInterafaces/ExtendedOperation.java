package EnumsAndAnnotations.Item38EmulateExtensibleEnumsWithInterafaces;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by wangcheng  on 2018/4/3.
 */
//Note that you don't have to declare the abstract apply method in the
//enum as you do in a non extensible enum
public enum ExtendedOperation implements Operation38{
    EXP("^"){
        public double apply(double x,double y){
            return Math.pow(x,y);
        }
    },
    REMAINDER("%"){
        public double apply(double x,double y){
            return x % y;
        }
    };
    private final String symbol;
    ExtendedOperation(String symbol){
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return symbol;
    }
    //A second alternative is to pass a Collection<? extends Operation38>,
    //which is a bounded wildcard type,instead of passing a class object.
    private static void test(Collection<? extends Operation38> opSet,double x,double y){
        for(Operation38 op : opSet){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
    }
    public static void main(String[] args){
        double x = 2.0;
        double y = 3.0;
        test(Arrays.asList(ExtendedOperation.values()),x,y);
    }
}
