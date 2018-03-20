package Item19DesignAndDocumentForInheritanceOrElseProhibitIt;

import java.time.Instant;

/**
 * Created by wangcheng  on 2018/3/20.
 */
public final class Sub extends Super{
    //Blank final,set by constructor
    private final Instant instant;

    Sub(){
        instant = Instant.now();
    }
    //Overriding method invoked by superclass constructor
    @Override
    public void overrideMe(){
        System.out.println(instant);
    }
    public static void main(String[] arg){
        Sub sub = new Sub();
        //it prints out null the first time because overrideMe is invoked by
        //the Super constructor before the Sub constructor has a chance to initialize the instant field
        sub.overrideMe();
    }
}