package Item25LimitSourceFiles;
//Static member classes instead of multiple top-level classes
//Never put multiple top-level classes or interfaces in a single source file.
/**
 * making them into static member classes is generally the better alternative
 *
 * Created by wangcheng  on 2018/3/23.
 */
public class Test25 {
    public static void main(String[] args){
        System.out.println(Utensil.NAME + Dessert.NAME);
    }
    private static class Utensil{
        static final String NAME = "pan";
    }
    private static class Dessert{
        static final String NAME = "cake";
    }
}

