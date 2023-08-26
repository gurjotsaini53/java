package _javaStrings;

public class CompareStrings {
    public static void main(String [] args)
    {

        // == checks 2 objects are identical
        // .equals() compare character by character strings
        String a = new String("a");
        String b = new String("a");
        String c =  a ;  // referencing a to c but not creating a new object
        System.out.println(a==b); // false


        System.out.println(a==c); //true
        System.out.println(a.equals(b));  // true
        System.out.println(a.equals(c));  // true
    }
}
