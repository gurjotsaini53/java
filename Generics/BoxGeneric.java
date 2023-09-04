package Generics;

public class BoxGeneric <T> {


    private T object;
    public BoxGeneric(){

    }

    public void set(T object)
    {
        this.object=object;
    }

    public T get(){
        return object;
    }


    public static void main(String[] args) {
        BoxGeneric<String> object = new BoxGeneric<>();
        object.set("Gurjot");
        System.out.println(object.get());

        BoxGeneric<Double> object1 = new BoxGeneric<>();
        object1.set(100.00);
        System.out.println(object1.get());


    }
}
