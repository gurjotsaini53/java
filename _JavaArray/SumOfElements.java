package _JavaArray;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args)
    {
        // Write your code here
        int t , sum=0;
        Scanner inp = new Scanner(System.in);
        t  = inp.nextInt();
        while((t--)>0)
        {
            int n ;
            n  = inp.nextInt();
            int [] arr =  new int[n];

            for (int i =0 ;i<n;i++)
            {
                arr[i] = inp.nextInt();
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
