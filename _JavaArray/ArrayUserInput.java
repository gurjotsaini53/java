package _JavaArray;
import java.util.Scanner;
public class ArrayUserInput {

    public static  void printArray(int [] arr)
    {
       for (int x:arr)
       {
           System.out.print(x + " ");
       }
        System.out.println();
    }
    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        int size;
        size = inp.nextInt();

        int [] arr =  new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=inp.nextInt();
        }

        printArray(arr);
    }
}
