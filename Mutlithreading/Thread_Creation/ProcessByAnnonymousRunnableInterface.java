package Mutlithreading.Thread_Creation;

import java.util.SortedMap;

public class ProcessByAnnonymousRunnableInterface {

 public ProcessByAnnonymousRunnableInterface(){

 }
    public static void main(String[] args) {


        System.out.println("--------------Inside main thread-----------");
        System.out.println("Thread Name : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable");
       Runnable runnable = new Runnable() {

           @Override
           public void run() {

               System.out.println("--------------Inside child thread-----------");
               System.out.println("Child class in running");
               System.out.println("Thread Name : " + Thread.currentThread().getName());

           }

       } ;


       Thread objThread = new Thread(runnable);
        System.out.println("Starting Thread");
        objThread.start();
        System.out.println("Main thread is running ");

    }
}
