package A06_Math_Random;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random(5);

        System.out.println("Any integer random number : "+random.nextInt());
        System.out.println("Random number between 0 and 10 : "  + random.nextInt(10)); // it will not make 10

        // check next Gaussian value
        System.out.println("Next Gaussian value: " + random.nextGaussian());


    }

}
