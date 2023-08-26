package Mutlithreading.ThreadLifeCyle;

public class DemoBlockedRunnable implements Runnable {


    @Override
    public void  run()
    {
        CommonResource();
    }
//
//    private  void CommonResource()
//    {
//        while(true) {
//            System.out.println(Thread.currentThread().getName());
//
//            // infinte loop to mimic heavy processing 't1' won't leave this method when 't2' try to enter this
//        }
//    }

    public static synchronized void CommonResource() {
        while (true)
        {
            // infinte loop to mimic heavy processing
            // t1 wont leave this methods
            // when t2 try to enter this
        }
    }
}
