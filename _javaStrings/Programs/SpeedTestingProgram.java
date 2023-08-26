package _javaStrings.Programs;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SpeedTestingProgram {

    public static void main(String[] args) {
        GregorianCalendar Gc = (GregorianCalendar) GregorianCalendar.getInstance();
        long start = Gc.getTimeInMillis();

        for(int i= 0 ; i<10000000;i++)
        {
            System.out.println("gurjot");
        }
        long end = Gc.getTimeInMillis();

        System.out.println(end);
        System.out.println(start);

    }
}
