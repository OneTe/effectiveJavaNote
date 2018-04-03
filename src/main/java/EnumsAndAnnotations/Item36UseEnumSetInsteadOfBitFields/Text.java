package EnumsAndAnnotations.Item36UseEnumSetInsteadOfBitFields;

/**
 * Created by wangcheng  on 2018/4/2.
 */
//Bit fields have all the disadvantages of int enum constants and more
//1.It is even harder to interpret a bit field than a
// simple int enum constant when it is printed as a number
//2.There is no easy way to iterate over all of the elements represented by a bit field
//...
public class Text {
    public static final int STYLE_BOLD = 1 << 0;//1
    public static final int STYLE_ITALIC = 1 << 1;//2
    public static final int STYLE_UNDERLINE = 1 << 2;//4
    public static final int STYLE_STRIKETHROUGH = 1 << 3;//8
    //Parameter is bitwise OR of zero or more STYLE_ constants
    public void applyStyles(int style){
        //...//do something
    }
    public static void main(String[] args){
        Text text = new Text();
        text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
    }
}
