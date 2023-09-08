package DateTime;

import java.time.LocalDate;

public class LocalDateExample {
private LocalDate date;
   public LocalDateExample(){
       System.out.println("Local Date");
       date=LocalDate.now();
   }




   public void showTodayDate(){
       System.out.println("Today : "+date);
   }

   public void showCurrentYear(){
       System.out.println("Today : " +date.getYear());
   }


   public void showCurrentMonth(){
       System.out.println("Today : " + date.getMonth());
   }

    public void showCurrentMonthValue(){
        System.out.println("Today : " + date.getMonthValue());
    }

    public void showDayOfTheWeek(){
        System.out.println("Today : " + date.getDayOfWeek());
    }

    public void showNextDate(){
        System.out.println("Next Date : " + date.plusDays(1));
    }

    public void showPreviousDate(){
        System.out.println("Previous date : " + date.plusDays(-1));
    }

    public void showNextMonth(){
        System.out.println("Next Month : " + date.plusMonths(1));
    }

    public void showPreviousMonth(){
        System.out.println("Next Month : " + date.plusMonths(-1));
    }

    public void showNextYear() {
        System.out.println("Next year : " + date.plusYears(1));
    }
        public void showPrevoiusYear(){
            System.out.println("Next year : " + date.plusYears(-1));
    }

    public void showNextWeek(){
        System.out.println("Next year : " + date.plusWeeks(1));
    }

    public void showPreviousWeek(){
        System.out.println("Next year : " + date.plusWeeks(-1));
    }


    public void showLeapYear(){

       if(date.isLeapYear())
       {
           System.out.println(date.getYear() + " is a leap year");
       }
       else
           System.out.println(date.getYear() + " is not a leap year");

    }
    public static void main(String[] args) {


       LocalDateExample obj = new LocalDateExample();
       obj.showCurrentMonth();
       obj.showTodayDate();

    }
}
