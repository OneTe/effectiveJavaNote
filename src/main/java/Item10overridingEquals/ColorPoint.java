package Item10overridingEquals;

import java.awt.*;

/**
 * Created by wangcheng  on 2018/3/8.
 */
public class ColorPoint extends Point{
    private final Color color;
    public ColorPoint(int x,int y,Color color){
        super(x,y);
        this.color = color;
    }
//下面是用idea自动生成的
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorPoint that = (ColorPoint) o;

        return color != null ? color.equals(that.color) : that.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}
