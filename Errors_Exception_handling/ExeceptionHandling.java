package Errors_Exception_handling;

public class ExeceptionHandling {

    public static void main(String[] args){

        int a = 10,b=0;
        try {

//            if(a/b==0){
                throw new Exception("Divide by bruh");
//            }

        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

    }
}
