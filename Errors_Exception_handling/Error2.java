package Errors_Exception_handling;

public class Error2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x,y;

        try{
            x=a/(b-c) ; // exception here
        }
        catch (ArithmeticException e)
        {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Division by Zero");
        }
        y=a/(b+c);
        System.out.println("y = " + y);
    }
}
