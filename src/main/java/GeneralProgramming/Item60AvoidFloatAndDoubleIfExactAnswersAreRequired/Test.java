package GeneralProgramming.Item60AvoidFloatAndDoubleIfExactAnswersAreRequired;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class Test {
    public static void main(String[] args){
        System.out.println(1.03 - 0.42);
        System.out.println(1.00 - 9 * 0.10);

        //Broken - uses floating point for monetary calculation!
        double funds = 1.00;
        int itemsBought = 0;
        for(double price = 0.10;funds >= price;price+=0.10){
            funds -= price;
            itemsBought++;
        }
        //This is the wrong answer! The right way to solve this problem is to useBigDecimal,
        //int, or long for monetary calculations.
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change:$" + funds);
    }
}
