package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by wangcheng  on 2018/3/30.
 */
public enum  Operation2 {
    PLUS("+"){
        public double apply(double x,double y){return x + y;}
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    }, TIMES("*") {
        public double apply(double x, double y) { return x * y; } },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };
    private final String symbol;

    Operation2(String symbol){this.symbol = symbol;}

    @Override
    public String toString(){
        return symbol;
    }
    public abstract double apply(double x,double y);

    // Implementing a fromString method on an enum type
    private static final Map<String,Operation2> stringToEnum =
            new HashMap<>();
    static {
        for(Operation2 op : values()){
            stringToEnum.put(op.toString(),op);
        }
    }

    //Returns Operation for string,if any
    public static Optional<Operation2> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }


    public static void main(String[] args){
        double x = 1.0;
        double y = 2.0;
        for(Operation2 op : Operation2.values()){
            System.out.printf("%f%s%f = %f%n",x,op,y,op.apply(x,y));
        }
    }
}
