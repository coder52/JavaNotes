package A28_DateTime.MakingAndFormating;

import java.time.*;

public class JavaLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();          // 2020-05-19T17:53:56.594108900

        LocalDate localDate1 = LocalDate.of(2020, Month.MAY,19);     // 2020-05-19
        LocalTime localTime1 = LocalTime.of(10,05);                     // 10:05

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1,localTime1);     // 2020-05-19T10:05
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,06,13, 10,33,33,333);      //2021-06-13T10:33:33.000000333

        int year = localDateTime.getYear();       // 2020
        Month month = localDateTime.getMonth();     //MAY
        int monthValue = localDateTime.getMonthValue();  // 5
        int dayOfYear = localDateTime.getDayOfYear();       //140

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();     // TUESDAY

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();


        System.out.println(dayOfWeek);


    }

}
