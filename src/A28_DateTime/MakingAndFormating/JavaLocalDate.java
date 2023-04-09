package A28_DateTime.MakingAndFormating;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class JavaLocalDate {
    public static void main(String[] args) {


        LocalDate now = LocalDate.now();            // 2020-05-19

        int dayOfMonth = now.getDayOfMonth();       // 19
        DayOfWeek dayOfWeek = now.getDayOfWeek();   // TUESDAY
        int dayOfYear = now.getDayOfYear();         // 140
        Month month = now.getMonth();               // MAY
        int monthValue = now.getMonthValue();       // 5
        int year = now.getYear();                   // 2020

        LocalDate localDate = LocalDate.of(2020,5,19);      // 2020-05-19
        LocalDate localDate1 = LocalDate.of(2020,Month.MAY,19);     // 2020-05-19


        System.out.println(localDate1);

    }
}
