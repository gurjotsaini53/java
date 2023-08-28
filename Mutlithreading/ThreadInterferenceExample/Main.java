package Mutlithreading.ThreadInterferenceExample;

public class Main {
    public static void main(String[] args) {
        final  SharedCounter obj = new SharedCounter();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                obj.incrementByOne();
            }
        } ;

        Thread t2 = new Thread(){
            @Override
            public void run(){
                obj.decrementByOne();
            }
        } ;


        t1.start();
        t2.start();
    }
}
