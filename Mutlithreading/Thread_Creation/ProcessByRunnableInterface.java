package Mutlithreading.Thread_Creation;

public class ProcessByRunnableInterface implements Runnable {


    public ProcessByRunnableInterface(){


    }
    @Override
    public void run() {
        System.out.println("-------------------Inside Child Thread-----------------------------" );
        System.out.println("Thread name : " +  Thread.currentThread().getName());
        System.out.println( "Thread id : " + Thread.currentThread().getId());
        System.out.println( "Thread State: " + Thread.currentThread().getState());
        System.out.println( "Thread IsAlive: " + Thread.currentThread().isAlive());
        System.out.println( "Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println("This is child class running");
      //  main(new String[]{});
    }

    public static void main(String[] args) {

        System.out.println("-------------------Inside Main Thread-----------------------------" );
        System.out.println("Thread name : " +  Thread.currentThread().getName());
        System.out.println( "Thread id : " + Thread.currentThread().getId());
        System.out.println( "Thread State: " + Thread.currentThread().getState());
        System.out.println( "Thread IsAlive: " + Thread.currentThread().isAlive());
        System.out.println( "Thread Priority: " + Thread.currentThread().getPriority());
        ProcessByRunnableInterface obj = new ProcessByRunnableInterface();
        Thread objThread = new Thread(obj);
        objThread.start();
        System.out.println("This is main class running ");
    }
}
