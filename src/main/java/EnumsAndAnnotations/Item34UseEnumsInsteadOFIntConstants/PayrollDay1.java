package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

/**
 * Created by wangcheng  on 2018/4/2.
 */
//The strategy enum pattern
public enum PayrollDay1 {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay1(PayType payType){this.payType = payType;}
    PayrollDay1(){this(PayType.WEEKDAY);}//default

    int pay(int minutesWorked,int payRate){
        return payType.pay(minutesWorked,payRate);
    }

    //The strategy enum typex
    private enum PayType{
        WEEKDAY{
            int overtimePay(int minsWorked,int payRate){
                return minsWorked <= MINS_PER_SHIFT ?
                    0 : (minsWorked - MINS_PER_SHIFT) * payRate/2;
            }
        },
        WEEKEND{
            int overtimePay(int minsWorked,int payRate){
                return minsWorked * payRate;
            }
        };
        abstract int overtimePay(int mins,int payRate);
        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked,int payRate){
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked,payRate);
        }
    }
}
