package A28_DateTime.GetTimeDateFromUser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataConvert2 {
    public static void main(String[] args) {

        String strDate1 = "2022-02-02T22:14:49.587Z";
        String strDate2 = "2022-02-02T22:14:40.587Z";

        LocalDateTime nextDate1 = LocalDateTime.parse(strDate1, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
        LocalDateTime nextDate2 = LocalDateTime.parse(strDate2, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
        System.out.println(nextDate1.isBefore(nextDate2));



        // dateOfAd =2022-02-02T22:14:49.587
        // dateOfNextAd = 2022-02-02T19:07:38.547
        // dateOfNextAd.isAfter(dateOfAd)       //false

    }
}
