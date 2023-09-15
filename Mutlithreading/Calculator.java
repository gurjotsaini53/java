package Mutlithreading;

import java.awt.*;

class Add extends Thread{
    private int a, b;
    public Add(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        System.out.println("Add :  " + (a+b));
    }
}

class Sub extends Thread{
    private int a, b;
    public Sub(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        System.out.println("Sub :  " + (a-b));
    }
}

class Multi extends Thread{
    private int a, b;
    public Multi(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        System.out.println("Mutliplication :  " + (a*b));
    }
}
class div extends Thread{
    private int a, b;
    public div(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        System.out.println("divide :  " + (a/b));
    }
}
public class Calculator
{

    private int a ,b;
    public Calculator(int a , int b)
    {
        this.a=a;
        this.b=b;

        Thread addObj = new Add(a,b);
        Thread SubObj = new Sub(a,b);
        Thread multiObj = new Multi(a,b);
        Thread divObj = new div(a,b);

        addObj.start();
        SubObj.start();
        multiObj.start();
        divObj.start();



    }


    public static void main(String[] args) {

        Calculator obj = new Calculator(10,20);

    }

}
