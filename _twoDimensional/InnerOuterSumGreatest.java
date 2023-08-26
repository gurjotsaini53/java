package _twoDimensional;

import java.util.*;


// QUES -- SUM of Outer Border and Sum of inner border around middle ......Print greatest value
public class InnerOuterSumGreatest {

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
        int OuterBorderSum=0, InnerBorderSum=0;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                  if(i==0 || j==0 || j==n-1 || i==n-1)
                  {
                      OuterBorderSum+=arr[i][j];
                  }
            }
        }

        int middle = arr[n/2][n/2];
        for(int i=n/2-1;i<=n/2+1;i++)
        {
            for (int j=n/2-1;j<=n/2+1;j++)
            {
                if(arr[i][j]!=middle )
                {
                    System.out.println(arr[i][j]);
                    InnerBorderSum+=arr[i][j];
                }
            }
        }

        System.out.println("Outer :"+OuterBorderSum);
        System.out.println("Inner : " + InnerBorderSum);

        System.out.println("Greatest sum ");
        if (InnerBorderSum>OuterBorderSum) System.out.println("Inner : " + InnerBorderSum);
        else System.out.println("Outer :"+OuterBorderSum);





    }
}
