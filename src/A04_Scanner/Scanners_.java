package A04_Scanner;

import java.util.Scanner;

public class Scanners_ {
    /*
     * User ile etkilesime girmek icin once Scanner class orneklenir sonra o ornekle calisilir.
     * Scanner input = new Scanner(System.in);
     * String userName = input.nextLine();
     *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name please.");
        String userName = input.nextLine();

        System.out.println("Enter your address now.");
        String address = input.nextLine();

        System.out.println("Enter your zipcode.");
        int zip = input.nextInt();
        
        System.out.println("Enter your salary.");
        double salary = input.nextDouble();

        System.out.println("Do you want insurance (true/false).");
        boolean insurance = input.nextBoolean();

        input.close();
        System.out.println("Your username is " + userName+".");
        System.out.println("Your adress is " + address + ".");
        System.out.println("Your zipcode is " + zip + ".");
        System.out.println("Your salary is " + salary + ".");
        System.out.println("You want insurance: " + insurance + ".");




    }

}
