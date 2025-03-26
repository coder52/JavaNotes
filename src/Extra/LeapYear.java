package Extra;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Lösung 1
        //begin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Jahr ein. :");
        int year = Integer.parseInt(scanner.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Es ist ein Schaltjahr.");
        }
        else{
            System.out.println("Es ist kein Schaltjahr!");
        }
        //end
    }
}
