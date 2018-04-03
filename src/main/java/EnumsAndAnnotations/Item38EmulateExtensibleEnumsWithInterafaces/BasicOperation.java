package EnumsAndAnnotations.Item38EmulateExtensibleEnumsWithInterafaces;
//The pattern described in this item is used in the Java libraries. For example,
//the java.nio.file.LinkOption enum type implements
//the CopyOption and OpenOption interfaces
/**
 * Created by wangcheng  on 2018/4/3.
 */
public enum  BasicOperation implements Operation38 {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
        },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
        },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    BasicOperation(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
    //use case
    private static <T extends Enum<T> & Operation38> void test(
            Class<T> opEnumType,double x,double y
    ){
        for(Operation38 op : opEnumType.getEnumConstants()){
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }
    public static void main(String[] args){
        double x = 1.0;
        double y = 2.0;
        test(ExtendedOperation.class,x,y);
    }
}
