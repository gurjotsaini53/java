package Errors_Exception_handling;

public class EH
{
    public static void main(String args[])
    {
        int divisor =0;
        int dividend = 11;

        try
        {
            int result=dividend/divisor;
            System.out.println("The result is "+result);
        }
        catch(Exception e)
        {
            System.out.println("An exception occured");
        }
//        catch(ArithmeticException ae)
//        {
//            System.out.println("Division by zero");
//        }
        finally{
            System.out.println("We are done!");
        }
    }
}