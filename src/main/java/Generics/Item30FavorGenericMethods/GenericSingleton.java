package Generics.Item30FavorGenericMethods;

import java.util.function.UnaryOperator;

/**
 * Created by wangcheng  on 2018/3/27.
 */
public class GenericSingleton {
    // Generic singleton factory pattern
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;//@since 1.8

    //or this (without lambda)
    private static UnaryOperator<Object> IDENTITY_FUNCTION =
            new UnaryOperator<Object>() {
                @Override
                public Object apply(Object o) {
                    return o;
                }
            };
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>)IDENTITY_FN;
    }

    //Sample program  to exercise generic singleton
    public static void main(String[] args){
        String[] strings = {"jute","hemp","nylon"};
        UnaryOperator<String> sameString = identityFunction();
        for(String s : strings){
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1,2.0,3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for(Number n : numbers){
            System.out.println(sameNumber.apply(n));
        }
    }
}
