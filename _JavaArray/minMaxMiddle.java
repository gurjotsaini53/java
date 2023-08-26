package _JavaArray;
import java.util.Arrays;

public class minMaxMiddle {

   public static void BubbleSort(int []arr, int size)
   {   int i,j;
       for(i=0;i<size;i++)
       {
           for(j=i+1;j<size-1-i;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp =arr[j] ;
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }


   }
    public static int max(int [] arr , int size)
    {

          BubbleSort(arr,size);
          return arr[size-1];
    }
    public static int min(int [] arr , int size)
    {

          BubbleSort(arr,size);
          return arr[0];
    }
    public static int middle(int [] arr , int size)
    {

          BubbleSort(arr,size);
          return arr[size/2];
    }
    public static  void main(String[] args)
    {
        int [] arr = new int[] {1,4,6,6,76,33,2,43,46,8};
        int size=10;
        max(arr,10);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("max : " + max(arr,size));
        System.out.println("min : " + min(arr,size));
        System.out.println("middle : " + middle(arr,size));



        int key=4;
        int search = Arrays.binarySearch(arr,key);
        System.out.println(key + " found at " + search + " index ");

        // array class methods

    }
}
