package Methods.Item49CheckParametersForValidity;

import java.math.BigInteger;
import java.util.Objects;

/**
 * Created by wangcheng  on 2018/4/11.
 */
/*
 * Returns a BigInteger whose value is (this mod m).This method
 * differs from the remainder method in that it always returns a
 * non-negative BigInteger.
 *
 * @param m the modulus,which must be positive
 * @return this mod m
 * @throws ArithmeticException if m is less than or equal to 0
 */
public class ShowRestrictions {
    public static BigInteger mod(BigInteger m){
        if(m.signum() <= 0){
            throw new ArithmeticException("Modulus <= 0:" + m);
        }
        //do the computation
        //The Objects.requireNonNull method, added in Java 7,
        //is flexible and convenient, so there’s no reason to perform null checks manually anymore
        BigInteger n = Objects.requireNonNull(m);
        return n;
    }
    //nonpublic methods can check their parameters using assertions
    //Private helper function for a recursive sort
    private static void sort(long a[],int offset,int length){
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
        //do the computation
    }

    public static void main(String[] args){
        BigInteger m=null;
        mod(m);
    }
}
