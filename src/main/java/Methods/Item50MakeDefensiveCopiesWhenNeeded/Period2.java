package Methods.Item50MakeDefensiveCopiesWhenNeeded;

import java.util.Date;

/**
 * Created by wangcheng  on 2018/4/11.
 */
//To protect the internals of a Period instance from this sort of attack
// makes defensive copies of parameters

public class Period2 {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period2(Date start,Date end){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        //defensive copies are made before checking the validity of the parameters (Item 49),
        //and the validity check is performed on the copies rather than on the originals
        if(this.start.compareTo(this.end) > 0){
            throw new IllegalArgumentException(this.start + " after " + this.end);
        }
    }
    public Date start(){
        return start;
    }
    public Date end(){
        return end;
    }

    public static void main(String[] args){
        // Second attack on the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        Period2 p = new Period2(start,end);
        p.end().setYear(78);//Modifies internals of p!
    }
}
