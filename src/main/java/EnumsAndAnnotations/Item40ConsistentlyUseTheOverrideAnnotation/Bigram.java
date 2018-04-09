package EnumsAndAnnotations.Item40ConsistentlyUseTheOverrideAnnotation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangcheng  on 2018/4/9.
 */
//can you spot the bug?
public class Bigram {
    private final char first;
    private final char second;
    public Bigram(char first,char second){
        this.first = first;
        this.second = second;
    }
    //here if you insert @Override annotation,the compiler will generate an error message
    //so you will immediately realize what you did wrong
    public boolean equals(Bigram b){
        return b.first == first && b.second == second;
    }
    public int hashCode(){
        return 31*first + second;
    }
    public static void main(String[] args){
        Set<Bigram> s = new HashSet<>();
        for(int i = 0;i < 10;i++){
            for(char ch = 'a';ch <= 'z';ch++){
                s.add(new Bigram(ch,ch));
            }
        }
        System.out.println(s.size());
    }
    //should be like this
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Bigram)){
            return false;
        }
        Bigram b = (Bigram)o;
        return b.first == first && b.second == second;
    }
}


