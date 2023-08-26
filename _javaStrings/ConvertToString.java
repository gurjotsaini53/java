package _javaStrings;

public class ConvertToString {

    public static void main(String[] args) {
        StringBuilder _Str = new StringBuilder("Gurjot Singh");
        System.out.println(_Str.getClass().getName());
        String str1= _Str.toString();

        // or

        String str2=new String(_Str);
        System.out.println(str1);
        System.out.println(str1.getClass().getName());
        System.out.println(str2);     System.out.println(str2.getClass().getName());

    }
}
