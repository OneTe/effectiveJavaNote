package Item16useAccessorMethods;
//While it’s never a good idea for a public class to expose fields directly,
//it is less harmful if the fields are immutable.
/**
 * Created by wangcheng  on 2018/3/15.
 */
public final class Time {
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
}