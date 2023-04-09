package A06_Math_Random;

public class MathRandom {
    public static void main(String[] args) {

        System.out.println(Math.random() + " is a random number produced by Math.random() method");
        System.out.println( (int)(Math.random()*10) + " is a random integer number between 0 and 10 produced by Math.random() method");
        System.out.println( (int)(Math.random()*100) + " is a random integer number between 0 and 100 produced by Math.random() method");

        // Formula of the finding random number between two ranges by Math.random() method.

        int max = 100;
        int min = 70;

        int numberInRange = (int)( Math.random() * ((max-min)+1) ) + min;
        System.out.println("Random number between " + min + " and " + max + " is " + numberInRange + ".");

    }
}
