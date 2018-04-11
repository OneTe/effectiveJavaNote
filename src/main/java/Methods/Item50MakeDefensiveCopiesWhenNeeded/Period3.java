package Methods.Item50MakeDefensiveCopiesWhenNeeded;

import java.util.Date;

/**
 * Created by wangcheng  on 2018/4/11.
 */
public class Period3 {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period3(Date start,Date end){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        //defensive copies are made before checking the validity of the parameters (Item 49),
        //and the validity check is performed on the copies rather than on the originals
        if(this.start.compareTo(this.end) > 0){
            throw new IllegalArgumentException(this.start + " after " + this.end);
        }
    }
    //Repaired accessors(Period2) - make defensive copies of internal fields
    public Date start(){
        return new Date(start.getTime());
    }
    public Date end(){
        return new Date(end.getTime());
    }
    public static void main(String[] args){
    }
}
