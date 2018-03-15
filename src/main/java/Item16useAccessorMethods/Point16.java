package Item16useAccessorMethods;
//If a class is accessible outside its package, provide accessor methods
//if a class is package-private or is a private nested class, there is nothing
//inherently wrong with exposing its data fields
/**
 * Created by wangcheng  on 2018/3/15.
 */
public class Point16 {
    private double x;
    private double y;

    public Point16(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
}
