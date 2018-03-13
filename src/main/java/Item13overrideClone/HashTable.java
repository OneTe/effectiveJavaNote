package Item13overrideClone;


import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * Created by wangcheng  on 2018/3/12.
 */
//Recursive clone method for class with complex mutable state
public class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[10];
    private static class Entry{
        final Object key;
        Object value;
        Entry next;

        Entry(Object key,Object value,Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        //Recursively copy the linked list headed by this Entry
        /*While this technique is cute and works fine if the buckets aren't too long,
          it'is not a good way to clone a linked list because it consumes one stack
          frame for each element in the list.if the list is long,this could easily
          cause a stack overflow
        */
        Entry deepCopy(){
            return new Entry(key,value,next == null ? null : next.deepCopy());
        }

        //To prevent this from happening,use iterator
        Entry deepCopy2(){
            Entry result = new Entry(key,value,next);
            for(Entry p = result;p.next != null;p = p.next){
                p.next = new Entry(p.next.key,p.next.value,p.next.next);
            }
            return result;
        }
    }
    @Override
    public HashTable clone(){
        try{
            HashTable result = (HashTable)super.clone();
            result.buckets = new Entry[buckets.length];
            for(int i = 0;i < buckets.length;i++){
                if(buckets[i] != null){
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    public static void main(String[] args) throws Exception{
    }
}
