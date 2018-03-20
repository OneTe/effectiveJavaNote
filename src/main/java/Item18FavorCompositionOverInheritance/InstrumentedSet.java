package Item18FavorCompositionOverInheritance;

import java.util.*;

/**
 * Created by wangcheng  on 2018/3/19.
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s){
        super(s);
    }
    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount(){
        return addCount;
    }
    public static void main(String[] args){
        Set<String> s = new HashSet<>();
        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(s);
        instrumentedSet.addAll(Arrays.asList("one","two","three"));
        System.out.println(instrumentedSet.getAddCount());

    }
}
