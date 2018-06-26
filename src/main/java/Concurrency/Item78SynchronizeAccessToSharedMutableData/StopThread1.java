package Concurrency.Item78SynchronizeAccessToSharedMutableData;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangcheng  on 2018/6/26.
 */
//Properly synchronized cooperative thread termination
public class StopThread1 {
    private static boolean stopRequested;
    //Synchronization is not guaranteed to work unless both read and write operations are synchronized.
    private static synchronized void requestStop(){
        stopRequested = true;
    }
    private static synchronized boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(()->{
           int i = 0;
           while (!stopRequested()){
               i++;
           }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("what?");
        requestStop();
    }
}
