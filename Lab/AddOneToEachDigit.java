package Lab;

import java.util.*;


public class AddOneToEachDigit {
    public  static int AddOnetoDigit(int n)
    {
           int rev=0,rem, check=0;
           while (n>0)
           {
               rem=n%10;
              if (rem!=9){
if (check==0)
{
    rev=rev*10+(rem+1);
}
else {
    rev=rev*10+(rem+1+1);
    check=0;
}
              }
              else{
                  rev=rev*10+0;
                  check=0;
              }
            n/=10;

           }
        rev=reverse(rev);
        return rev;
    }
    public  static int reverse(int n)
    {
        int rev=0,rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return  rev;
    }


    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        int n;
        n=inp.nextInt();

        System.out.println(AddOnetoDigit(n));
    }
}
