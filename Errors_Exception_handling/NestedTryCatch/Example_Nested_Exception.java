package Errors_Exception_handling.NestedTryCatch;

public class Example_Nested_Exception {

    public static void main(String[] args) {
        try{
            int a=2,b=4,c=2,x=7,z;
            int p[] = {2};
            p[3]=33;
        try{
            z=x/(b*b)-(4*a*c);
            System.out.println("The value of z is = " + z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound");
        }
    }
}
