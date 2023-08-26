package Mutlithreading.Thread_Creation;

public class RunningMultiplethreads extends Thread{
     
    public RunningMultiplethreads()
    {

    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        RunningMultiplethreads obj = new RunningMultiplethreads();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);


        // thread order is decided by priority order decided by Thread scheduler.
        t1.start();
        t2.start();
        t3.start();

        System.out.println(Thread.currentThread().getName());

    }
}
