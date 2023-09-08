package DateTime;
import java.time.LocalDate;;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentTime);
        System.out.println(currentDate);
        System.out.println(currentDateTime);
    }
}
