package Item2ConsiderBuilder;
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
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder sodium(int val){
            sodium = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        public NutritionFacts3 build(){
            return new NutritionFacts3(this);
        }
    }
    public NutritionFacts3(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
    public static void main(String[] args){
        NutritionFacts3 nutritionFacts3  = new NutritionFacts3.Builder(2,12)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
