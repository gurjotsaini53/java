package Generics;

public class Box {

    private Object object;
    public Box(){

    }

    public void set(Object object)
    {
        this.object=object;
    }

    public Object get(){
        return object;
    }


    public static void main(String[] args) {
        Box object = new Box();
        object.set(new String("Gurjot"));
        System.out.println(object.get());

        Box object1 = new Box();
        object1.set(new Double(100.00));
        System.out.println(object1.get());


    }
}
