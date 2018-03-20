package Item19DesignAndDocumentForInheritanceOrElseProhibitIt;

/**
 * Created by wangcheng  on 2018/3/20.
 */
public class Super {
    //Broken-constructor invokes an overridable method
    public Super(){
        overrideMe();
    }
    public void overrideMe(){}
}
