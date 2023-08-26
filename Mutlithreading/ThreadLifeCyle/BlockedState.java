package Mutlithreading.ThreadLifeCyle;

public class BlockedState {

    public static void main(String[] args) throws InterruptedException {
        DemoBlockedRunnable obj1 = new DemoBlockedRunnable();
        Thread objThread1  = new Thread(obj1);

        DemoBlockedRunnable obj2 = new DemoBlockedRunnable();
        Thread objThread2  = new Thread(obj2);
        objThread1.start();
        objThread2.start();

       // Thread.sleep(1000);
        // Thread.sleep(1000);

        System.out.println(objThread1.getState());
        System.out.println(objThread2.getState());
    }
}
