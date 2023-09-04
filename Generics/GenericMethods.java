package Generics;

public class GenericMethods <T>{

    private T[] boxData;


    public GenericMethods(T[] boxData)
    {
        this.boxData=boxData;
    }


    public T[] getBoxData(){
        return boxData;
    }
    public   <T> void showBoxData(T[] boxData)
    {
        for (T data:boxData)
        {
            System.out.println(data+ " ");
        }
        System.out.println();
    }

    public <T> void inspect(){
        System.out.println("T : " + boxData.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        String [] item_name = {"Gurjot","Ansh","Coke","Fries","Wrap"};
        GenericMethods<String> sObj = new GenericMethods<>(item_name);
        sObj.showBoxData(item_name);
        sObj.inspect();
        System.out.println(sObj.getBoxData().toString());;

    }
}
