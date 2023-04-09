package A09_Arrays;

import java.util.Random;

public class Example1 {

    // fill array with random values 0<=n<=10
    // check 0 in it. If it is write "It has zero"


    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];

        Random rand = new Random();

        boolean check = false;

        for (int i = 0; i < size ; i++) {
            // first
            int randNum = (int)(Math.random()*(size+1));  // to produce random numbers between 0 and 10
            //arr[i]= randNum;
            //second
            arr[i] = rand.nextInt(size+1);          // to produce random numbers between 0 and 10

            if( arr[i] == 0 ) check=true;

        }

        if(check==true) System.out.println("It has zero.");

    }
}
