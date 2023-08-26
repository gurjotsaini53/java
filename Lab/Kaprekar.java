package Lab;
import java.util.*;
public class Kaprekar {
    // the number is kaprekar  or not


//  public static  boolean KaprekarOrNot(int n)
//  {
//       if (n==1) return  true;
//       int sq=n*n;
//       int count=0;
//       while(sq>0)
//       {
//           count++;
//           sq/=10;
//       }
//       sq=n*n;
//
//       for (int i=1;i<count;i++)
//       {
//           int d = (int)Math.pow(10,i);
//           int sum =sq/d+ sq%d  ;
//           if(sum==n) return  true;
//
//       }
//       return false;
//  }
 public static  boolean KaprekarOrNot(int n)
  {
       if (n==1) return  true;
       int sq=n*n, temp=n;
       int count=0;
       while(temp>0)
       {
           count++;
           temp/=10;
       }

       int f=sq/(int)Math.pow(10,count);
       int l=sq%(int)Math.pow(10,count);
       if(f+l==n) return true;
       return false;
  }

    public  static void main(String [] args)
    {

        Scanner inp = new Scanner(System.in);
        int n;
        n=inp.nextInt();


        if (KaprekarOrNot(n)) System.out.println("YES");
        else System.out.println("NO");


    }


}
