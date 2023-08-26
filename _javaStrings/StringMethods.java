package _javaStrings;


class StringMethodsClass {

    StringMethodsClass() {
        String str = new String("Gurjot Singh");
        String str1 =  new String ("Girn");
        System.out.println(str.isEmpty());              // false
        System.out.println(str.length());               // 12
        System.out.println(str.toUpperCase());         // GURJOT SINGH
        System.out.println(str.toLowerCase());         // gurjot singh
        str=str.concat(  " " + str1);                // Gurjot Singh Girn
        System.out.println(str);                         // Gurjot Singh Girn
        System.out.println(str.charAt(2));                  // r
        System.out.println(str.substring(4));       // ot Singh Girn
        System.out.println(str.substring(0,7));  // 7th index excluded         // Gurjot
       str=str.replace("Girn","Saini");           // Gurjot Singh Saini
        System.out.println(str.endsWith("Saini"));               // True
        System.out.println(str);               // Gurjot Singh Saini
        System.out.println(str.startsWith("Gur")) ;        // true

    }
}
public class StringMethods {

    public static void main(String[] args) {
    StringMethodsClass obj = new StringMethodsClass();

    }
}



