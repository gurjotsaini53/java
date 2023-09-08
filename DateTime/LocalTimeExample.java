package DateTime;
import java.time.LocalTime;
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime =  LocalTime.now();

        System.out.println("Local Time ");
        System.out.println("Time : " + localTime);
        System.out.println("local hour: "  + localTime.getHour());
        System.out.println("local minutes : "  + localTime.getMinute());

    }
}
