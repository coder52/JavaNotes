package A28_DateTime.MakingAndFormating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDateTimeFormat {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();


        // SHORT
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localDate.format(shortDateTime));        //  mm/dd/yy

        // MEDIUM
        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(localDate.format(mediumDateTime));        //  Dec 5, 2021

        // LONG
        DateTimeFormatter longDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(localDate.format(longDateTime));        //  December 5, 2021

        // FULL
        DateTimeFormatter fullDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(localDate.format(fullDateTime));        //  Sunday, December 5, 2021

        // My Format typ

        LocalDateTime localDateTime = LocalDateTime.now();
                                                                // a harfi yazarsan AM/PM ekler
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm MM dd yyyy"); // HH olursa 24 saatten hh olursa 12 saate gore formatlar
        System.out.println(localDateTime.format(f));                // 06:43 05 19 2020     aralara : & % gibi karakterler koyulabiliyor.

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss a");   // 18:58:11 PM
        String formattedTime = localDateTime.format(f1);                  // aslinda PM gerekmez a'yi silerseniz gider.
        System.out.println(formattedTime);



    }

}
