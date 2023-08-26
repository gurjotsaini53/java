package Mutlithreading.Thread_Example_CarRace;


class car extends Thread{
    public car (String name){
        super(name);
    }

@Override
    public void run(){
        for (int lap =0;lap<10;lap++)
        {
            System.out.println( getName() + " cleared lap " + lap);
            try{
                long time  = (long)Math.random()*1000;
                sleep(time);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    System.out.println("DONE! " + getName());
}
}
public class Race {

    public Race(){

    }

    public static void main(String[] args) {

        new car("Honda").start();
        new car("Maruti").start();
        new car("BMW").start();

    }
}
