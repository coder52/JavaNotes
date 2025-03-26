package Extra;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {
        // Lösung 2
        // begin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Zeit für die Konvertierung in Sekunden ein. :");
        int eingabe = Integer.parseInt(scanner.nextLine());

        int second = eingabe % 60;
        int minute = ((eingabe-second) / 60) % 60;
        int hour = (((eingabe-second) / 60)-minute) / 60 ;

        System.out.println(hour + " Stunden");
        System.out.println(minute + " Minuten");
        System.out.println(second + " Sekunden");
        // end
    }
}
