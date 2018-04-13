package GeneralProgramming.Item60AvoidFloatAndDoubleIfExactAnswersAreRequired;

import java.math.BigDecimal;

/**
 * Created by wangcheng  on 2018/4/13.
 */
public class UseBIgDecimal {
    //This is the correct answer,but there are two disadvantages:
    //1.it’s a lot less convenient than using a primitive arithmetic type
    //2.it’s a lot slower
    public static void main(String[] args){
        final BigDecimal TEN_CENT = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENT;
            funds.compareTo(price) >= 0;
            price = price.add(TEN_CENT)){
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + "items bought.");
        System.out.println("Money left over:$" + funds);
    }
}
