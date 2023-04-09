package A28_DateTime.GetTimeDateFromUser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvert {

    // userdan alinan tarih bilgisinin .parse vesilesi ile kullanilmasi anlatiliyor.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter data as MM/dd/yyyy form.");
        String text = input.nextLine();

        LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        System.out.println("Local date :" + date.format(DateTimeFormatter.ofPattern("yy-MM-dd")));




    }
}
