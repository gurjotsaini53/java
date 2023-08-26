package _twoDimensional;
import java.util.*;

public class _Basics {

    public static  void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();


        int arr[][] = new int[n][n];
  // taking inp
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j]= inp.nextInt();
            }
        }

        // 1st find middle
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i+j==n-1 && i==j)
                {
                    System.out.println("middle : " + arr[i][j]);
                }
            }
        }

        int middle = arr[n/2][n/2];
        System.out.println("Middle : "+ middle);

        // 2nd
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i+j==n-1 || i==j)
                {
                    arr[i][j]=0;
                }
            }
        }


        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        // 3rd - SUM OF border values
        int sum=0;
       for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1) {
                    sum += arr[i][j];
                }
            }


        }

        System.out.println("sum : " +sum);


    }
}
