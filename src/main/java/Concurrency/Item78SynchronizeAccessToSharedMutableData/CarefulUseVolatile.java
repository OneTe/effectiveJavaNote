package Concurrency.Item78SynchronizeAccessToSharedMutableData;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangcheng  on 2018/6/26.
 */
public class CarefulUseVolatile {

    //Broken! requires synchronization!
    private static volatile  int nextSerialNumber = 0;

    public static int generateSerialNumber(){
        return nextSerialNumber++;
    }

    //Lock-free synchronization with java.util.concurrent.atomic
    private static final AtomicLong nextSerialNumber1 = new AtomicLong();
    public static long generateSerialNumber1(){
        return nextSerialNumber1.getAndIncrement();
    }
    /*
       The best way to avoid the problems discussed in this item is not to share
       mutable data. Either share immutable data (Item 17) or don’t share at all.
       In other words, confine mutable data to a single thread.
     */
}
