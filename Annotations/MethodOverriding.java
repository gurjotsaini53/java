package Annotations;


abstract class Car{
    public  abstract  void carName();
//    public  abstract  void carName(int i);

}

class Maruti extends Car{
    @Override
    public void carName()
    {
        System.out.println("this is class for Maruti Car");
    }

//    @Override
//    public void carName(int i)
//    {
//        System.out.println("this is class for Maruti Car");
//    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        Car car1  = new Maruti();
        car1.carName();

    }
}
