package GeneralProgramming.Item60AvoidFloatAndDoubleIfExactAnswersAreRequired;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class UseInt {
    // //An alternative to using BigDecimal is to use int or long, depending
    //on the amounts involved
    public static void main(String[] args){
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++; }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Cash left over: " + funds + " cents");
    }
}
