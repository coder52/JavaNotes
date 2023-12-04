package A28_DateTime.PeriodAndDuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {

    public static void main(String[] args) {

        String strDate = "01.25.2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");

        LocalDate localDate = LocalDate.parse(strDate, formatter);
        System.out.println(localDate);

        String strTime = "12:50";
        LocalTime localTime = LocalTime.parse(strTime);

        System.out.println(localTime);

    }
}
