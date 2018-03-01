package Item2ConsiderBulider;
//The second : JavaBeans pattern
//Because construction is split across multiple calls,a JavaBean may be
//in an inconsistent state partway through its construction.
/**
 * Created by wangcheng  on 2018/3/1.
 */
public class NutritionFacts2 {
    //Parameters initialized to default values
    private int servingSize = -1;//Required ;no default value
    private int servings = -1;//Required ;no default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2(){}

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    public static void main(String[] args){
        NutritionFacts2 nutritionFacts2 = new NutritionFacts2();
        nutritionFacts2.setServingSize(240);
        nutritionFacts2.setServings(8);
        //....
    }
}
