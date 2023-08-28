package Mutlithreading.ThreadInterferenceExample;

public class SharedCounter {
    static int counter  = 5 ;
    // incrementing the value


    // try without using synchronized
    public synchronized  void incrementByOne() {
        for (int i = 0; i < 10; i++) {
            System.out.println("After Increment : " + ++counter);
        }

    }


    // try without using synchronized
    public  synchronized void decrementByOne() {
        for (int i = 0; i < 10; i++) {
            System.out.println("After Decrement : " + --counter);
        }

    }
    public void getCounter(){
        System.out.println(counter);
    }

}
