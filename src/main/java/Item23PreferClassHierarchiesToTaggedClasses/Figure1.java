package Item23PreferClassHierarchiesToTaggedClasses;
// Class hierarchy replacement for a tagged class
/**
 * Created by wangcheng  on 2018/3/22.
 */
public abstract class Figure1 {
    abstract double area();
}
class Circle1 extends Figure1{
    final double radius;
    Circle1(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * (radius * radius);
    }
}

class Rectangle1 extends Figure1{
    final double length;
    final double width;
    Rectangle1(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length * width;
    }
}

class Square1 extends Rectangle1{
    Square1(double side){
        super(side,side);
    }
}
