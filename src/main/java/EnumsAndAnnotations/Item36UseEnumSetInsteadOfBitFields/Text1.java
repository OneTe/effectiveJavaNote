package EnumsAndAnnotations.Item36UseEnumSetInsteadOfBitFields;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/4/2.
 */
//EnumSet - a modern replacement for bit fields
public class Text1 {
    public enum Style{
        BOLD, ITALIC, UNDERLINE,STRIKETHROUGH
    }
    //Any Set could be passed in,but EnumSet is clearly best
    public void applyStyles(Set<Style> styles){
        //...//do something
    }
    public static void main(String[] args){
        Text1 text = new Text1();
        //The EnumSet class provides a rich set of static factories for easy set creation
        text.applyStyles(EnumSet.of(Style.BOLD,Style.ITALIC));
    }
}
