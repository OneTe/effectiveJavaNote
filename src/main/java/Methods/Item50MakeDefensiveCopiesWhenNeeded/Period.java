package Methods.Item50MakeDefensiveCopiesWhenNeeded;

import java.util.Date;

/**
 * Created by wangcheng  on 2018/4/11.
 */
//Broken "immutable" time period class
public final class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period(Date start,Date end){
        if(start.compareTo(end) > 0){
            throw new IllegalArgumentException(start + " after " +end);
        }
        this.start = start;
        this.end = end;
    }
    public Date start(){
        return start;
    }
    public Date end(){
        return end;
    }

    public static void main(String[] args){
        //Attack the internal of a Period instance
        //because Date is mutable
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start,end);

        end.setYear(78);//Modifies internal of p!
        //Date is obsolete and should no longer be used in new code.
        //as Java 8,you can use Instant (or Local-DateTime or ZonedDateTime) in place of
        //a Date because Instant (and the other java.time classes) are immutable
    }

}
