package Concurrency.Item78SynchronizeAccessToSharedMutableData;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangcheng  on 2018/6/26.
 */
//Cooperative thread termination with a volatile field
public class StopThread2 {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(()->{
            int i = 0;
            while (!stopRequested){
                i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
