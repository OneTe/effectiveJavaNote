package Item2ConsiderBulider;
//The third : Builder pattern
//the builder is typically a static member class of the class it builds.
/**
 * Created by wangcheng  on 2018/3/1.
 */
public class NutritionFacts3 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //Required parameters
        private final int servingSize;
        private final int servings;

        //optional parameters-initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize,int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Bu
    }
}
