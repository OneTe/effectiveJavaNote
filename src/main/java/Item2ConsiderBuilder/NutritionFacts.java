package Item2ConsiderBuilder;
//The telescoping constructor pattern works,but it is hard
//to write client code when there are many parameters,and
//harder still to read it.
/**
 * Created by wangcheng  on 2018/3/1.
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public NutritionFacts(int servingSize,int servings){
        this(servingSize,servings,0);
    }
    public NutritionFacts(int servingSize,int servings,int calories){
        this(servingSize,servings,calories,0);
    }
    public NutritionFacts(int servingSize,int servings,int calories,int fat){
        this(servingSize,servings,calories,fat,0);
    }
    public NutritionFacts(int servingSize,int servings,int calories,int fat,
                          int sodium){
        this(servingSize,servings,calories,fat,sodium,0);
    }
    public NutritionFacts(int servingSize,int servings,int calories,int fat,
                          int sodium,int carbohydrate){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat =fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
    public static void main(String[] args){
        NutritionFacts nutritionFacts = new NutritionFacts(100,
                2,3,0,4,5);
    }
}
