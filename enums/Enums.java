package enums;



// an enum type is a special data type that enablesfor
public class Enums {


    public enum Parking_Type{

        PAY_FIRST_AND_PARK_LATER,
        PARK_LATER_AND_PAY_FIRST
    }

    public enum Card{
        NORTH , EAST , WEST , SOUTH
    }
    public enum Fuel{
        PETROL, DIESEL
    }
    public enum Months
    {
        JAN, FEB, MAR, APR, MAY, JUN , JULY, AUG, SEPT, OCT  , NOV,DEC
    }

    public  enum Weekdays{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
Weekdays _today = Weekdays.TUESDAY;
        System.out.println(_today);
        System.out.println("Length : " + Weekdays.values().length);



        for (Months x : Months.values())
        {
            System.out.println(x);
        }
    }
}
