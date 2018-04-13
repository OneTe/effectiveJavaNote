package GeneralProgramming.Item59KnowAndUseTheLibraries;

import java.util.Random;

/**
 * Created by wangcheng  on 2018/4/12.
 */
/*
1.As of Java 7, you should no longer use Random. For most uses, the random number generator of choice is
now ThreadLocalRandom.
2.For fork join pools and parallel streams, use SplittableRandom.
 */
public class Test {
    static Random rnd = new Random();
    //use Random.nextInt(int) instead
    static int random(int n){
            return Math.abs(rnd.nextInt()) % n;
    }
    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for(int i = 0;i < 1000000;i++){
            if(random(n) < n/2){
                low++;
            }
        }
        System.out.println(low);


        // Printing the contents of a URL with transferTo, added in Java 9
        //try (InputStream in = new URL(args[0]).openStream()) { in.transferTo(System.out);

    }
}
