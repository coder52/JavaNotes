package A06_Math_Random;

import java.util.Random;

public class MathMethods {

    public static void main(String[] args) {

        int num1 = -100;
        System.out.println("ABS of " + num1 + " is " + Math.abs(num1) + ".");

        System.out.println("Largest value of 100 and 120.08 is " + Math.max(100,120.08));
        System.out.println("Smallest value of 100 and 120.08 is " + Math.min(100,120.08));

        System.out.println("Round of 0.5 is " + Math.round(0.5) + ".");
        System.out.println("Round of 0.4 is " + Math.round(0.4) + ".");
        System.out.println("Round of 0.6 is " + Math.round(0.6) + ".");

        System.out.println("Square root of 144 is " + Math.sqrt(144) + ".");
        System.out.println("Square root of 7 is " + (int)Math.sqrt(7) + ".");

        System.out.println("Square of 13 is " + Math.pow(13,2) + ".");
        System.out.println("5 power of 7 is " + Math.pow(7,5) + ".");

        System.out.println("Ceil of 0.5 is " + Math.ceil(0.5) + ".");
        System.out.println("Floor of 0.5 is " + Math.floor(0.5) + ".");

    }

}
