package Mutlithreading.ThreadLifeCyle;

public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        Runnable runnable = new ThreadLifeCycleState();
        Thread objThread =  new Thread(runnable);

        {
            // we just created Thread
            // so state will be NEW
            System.out.println(objThread.getState());
        }

        {
            // we now run the thread Now
            // so state will be runnable
            objThread.start();
            System.out.println(objThread.getState());
        }

        {

        }


    }
}
