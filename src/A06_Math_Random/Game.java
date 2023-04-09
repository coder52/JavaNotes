package A06_Math_Random;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        do {
            // Make a random object and a random number between 0 and 5.
            Random rand = new Random();
            int randNum = rand.nextInt(6);
            // Give info about the game to user
            System.out.print("Please enter a number between 0 and 5 ");
            System.out.print("(For exit press q) : ");
            // Get a number between 0 and 5 from user as String
            Scanner input = new Scanner(System.in);
            String guessStr = input.nextLine();
            // If user press the q or Q exit from game.
            if (guessStr.equals("q") || guessStr.equals("Q"))  break;
            // Convert string value into integer.
            int guess = Integer.valueOf(guessStr);
            // check the user entered value
            if(guess>=0 && guess<=5){
                // Congratulate when the answer is correct and exit
                if(guess==randNum)  {
                    System.out.println("Your guess is right.");
                    break;
                } // repeat game when the answer is not correct
                else System.out.println("Your guess is wrong. Repeat please...");

            }else System.out.println("You did not enter a number between 0 and 5.");


        } while(true);

    }

}
