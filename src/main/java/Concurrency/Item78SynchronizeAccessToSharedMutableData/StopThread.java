package Concurrency.Item78SynchronizeAccessToSharedMutableData;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangcheng  on 2018/6/26.
 */
//Broken! - How long would you expect this program to run?
    //On my machine, however, the program never terminates: the background thread loops forever!
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(()->{
            int i = 0;
            while (!stopRequested){
                //In the absence of synchronization, it’s quite acceptable for the virtual machine to transform this code:
                //while(true)
                i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(1);
        stopRequested = true;
    }
}
