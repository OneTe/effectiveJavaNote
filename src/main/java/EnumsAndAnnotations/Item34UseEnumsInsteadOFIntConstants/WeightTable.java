package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

/**
 * Created by wangcheng  on 2018/3/30.
 */
import java.math.RoundingMode;
public class WeightTable {
    public static void main(String[] args){
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p : Planet.values()){
            System.out.printf("Weight on %s is %f%n",p,p.surfaceWeight(mass));
        }
    }
}
