package A29_ExeptionHandling.Task;

import java.util.Scanner;

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public long power(int n, int p) throws Exception {
        if(n==0 || p==0){
            throw new Exception(" n and p should not be zero.");
        } else if(n<0 || p<0){
            throw new Exception(" n and p should not be negative.");
        } else {

        }
        return (long) Math.pow(n,p);
    }

}

public class trc {
    public static void main(String[] args) throws Exception {
        MyCalculator cal = new MyCalculator();

        System.out.println(cal.power(2,3));
    }
}
