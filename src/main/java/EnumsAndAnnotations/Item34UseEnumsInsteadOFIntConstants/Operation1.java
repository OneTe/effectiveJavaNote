package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

/**
 * Created by wangcheng  on 2018/3/30.
 */
//If you add a new enum constant but forget to add a corresponding case to
//the switch, the enum will still compile, but it will fail at runtime when
//you try to apply the new operation.

public enum  Operation1 {
    //declare an abstract apply method in the enum type, and override it with
    //a concrete method for each constant in a constant-specific class body

    // Enum type with constant-specific method implementations
    PLUS{public double apply(double x, double y){return x + y;}},
    MINUS {public double apply(double x, double y){return x - y;}},
    TIMES {public double apply(double x, double y){return x * y;}},
    DIVIDE{public double apply(double x, double y){return x / y;}};

    public abstract double apply(double x,double y);
}
