package Item14implementingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/3/14.
 */
public final class PhoneNumber implements Comparable<PhoneNumber>{
    private final short areaCode,prefix,lineNum;
    public PhoneNumber(int areaCode,int prefix,int lineNum){
        this.areaCode = rangeCheck(areaCode,999,"area code");
        this.prefix = rangeCheck(prefix,999,"prefix");
        this.lineNum = rangeCheck(lineNum,9999,"line num");
    }
    private static short rangeCheck(int val,int max,String arg){
        if(val < 0 || val > max){
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short)val;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                '}';
    }

    //Multiple-field Comparable with primitive fields
    public int CompareTo(PhoneNumber pn){
        int result = Short.compare(areaCode,pn.areaCode);
        if(result == 0){
            result = Short.compare(prefix,pn.prefix);
            if(result == 0){
                result = Short.compare(lineNum,pn.lineNum);
            }
        }
        return result;
    }

    //Comparable with comparator construction methods(Java 8)
    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn)->pn.areaCode)
            .thenComparingInt(pn -> pn.prefix)
            .thenComparingInt(pn -> pn.lineNum);
    public int compareTo(PhoneNumber pn){
        return COMPARATOR.compare(this,pn);
    }

    //There are also comparator construction methods for object reference types
    static Comparator<Object> hashCodeOrder = new Comparator(){
        public int compare(Object o1, Object o2){
            return Integer.compare(o1.hashCode(),o2.hashCode());
        }
    };
    static Comparator<Object> hashCodeOrder1 =
            Comparator.comparingInt(o ->o.hashCode());
    public static void main(String[] args){
        PhoneNumber p1 = new PhoneNumber(5,2,3);
        PhoneNumber p2 = new PhoneNumber(5,1,3);
        PhoneNumber p3 = new PhoneNumber(3,2,3);
        ArrayList<PhoneNumber> as = new ArrayList<>();
        as.add(p1);
        as.add(p2);
        as.add(p3);
        //Collections.sort(as);//用这个就必须实现Comparable接口
        as.sort(COMPARATOR);
        for(PhoneNumber p : as){
            System.out.println(p);
        }
    }
}
