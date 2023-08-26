package _javaStrings;
import java.lang.StringBuilder;
public class _StringBuilder
{
    public static void main(String[] args) {
        // faster than string

        /// default capacity is 16
        StringBuilder _String = new StringBuilder("Gurjot Singh");

        // string builder methods
        System.out.println(_String.capacity());
        System.out.println(_String.append(" Saini is a prog ccsdsdssds"));  // capacity increases with (old_capacity*2)+2
        System.out.println(_String.capacity());
        System.out.println(_String.length());
        System.out.println(_String.delete(8,11));
        System.out.println(_String.deleteCharAt(7));
        System.out.println(_String.insert(7,"Sing"));
        System.out.println(_String.reverse());

    }
}
