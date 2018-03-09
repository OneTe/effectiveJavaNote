package Item10overridingEquals;

import java.util.Objects;
//To eliminate the problem,merely remove the ill-conceived attempt
//to interoperate with String from the equals method.
/**
 * Created by wangcheng  on 2018/3/8.
 */
public class CaseInsensitiveString2 {
    private final String s;
    public CaseInsensitiveString2(String s){
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof CaseInsensitiveString2 &&
                ((CaseInsensitiveString2)o).s.equalsIgnoreCase(s);
    }
}
