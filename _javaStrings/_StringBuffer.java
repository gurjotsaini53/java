package _javaStrings;
import java.lang.StringBuffer;
public class _StringBuffer {

    public static void main(String[] args) {

        // string are immutable but string buffer are mutable
        //
        StringBuffer _StringBuffer = new StringBuffer("Gurjot Singh");

        // string buffer extra methods than String
        System.out.println(_StringBuffer.capacity());
        System.out.println(_StringBuffer.append(" Saini"));
        System.out.println(_StringBuffer.delete(8,11));
        System.out.println(_StringBuffer.deleteCharAt(7));
        System.out.println(_StringBuffer.insert(7,"Sing"));
        System.out.println(_StringBuffer.reverse());



    }
}
