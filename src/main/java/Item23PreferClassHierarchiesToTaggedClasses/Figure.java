package Item23PreferClassHierarchiesToTaggedClasses;

/**
 * Created by wangcheng  on 2018/3/22.
 */
// Tagged class - vastly inferior to a class hierarchy!
public class Figure {
    enum Shape{RECTANGLE,CIRCLE};

    //Tag field - the shape of this figure
    final Shape shape;

    //These field are used only if shape is RECTANGLE
    double length;
    double width;

    //This field is used only if shape is CIRCLE
    double radius;

    //Constructor for circle
    Figure(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }
    //Constructor for rectangle
    Figure(double length,double width){
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
    double area(){
        switch (shape){
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
