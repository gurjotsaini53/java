package Mutlithreading.Thread_Creation;

public class ProcessByThreadClass extends Thread{

    public ProcessByThreadClass(){

    }
    @Override
    public void  run(){
        System.out.println("This is child class running");
    }

    public static void main(String[] args) {

        Thread objThread =  new ProcessByThreadClass();
        objThread.start();
        System.out.println("This is main class running");
    }
}
