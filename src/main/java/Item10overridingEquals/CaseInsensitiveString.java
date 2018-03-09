package Item10overridingEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wangcheng  on 2018/3/8.
 */
//Broken-violates symmetry!
public final class CaseInsensitiveString {
    private final String s;
    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }
    //Broken-violates symmetry!
    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
        }
        if(o instanceof String){//One-way interoperability
            return s.equalsIgnoreCase((String)o);
        }
        return false;
    }
    public static void main(String[] args){
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        if(list.contains(s)){
            System.out.println("List contains 's'");
        }
        if(cis.equals(s)){
            System.out.println("it's true!");
        }
        if(s.equals(cis)){
            System.out.println("also,it's true");
        }
    }
}
