package DateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime =  LocalTime.now();

        System.out.println("Local Time ");
        System.out.println("Time : " + localTime);
        System.out.println("local hour: "  + localTime.getHour());
        System.out.println("local minutes : "  + localTime.getMinute());


        // 12 hour clock
        System.out.println(DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now()));

        // 24 hour clock
        System.out.println(DateTimeFormatter.ofPattern("HH:MM").format(LocalTime.now()));


        // am or pm
        System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now()));

    }
}
