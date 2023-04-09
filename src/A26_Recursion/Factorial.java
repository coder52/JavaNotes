package A26_Recursion;

public class Factorial {

    static int factorial(int n){
        if (n == 1 || n==0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {
        int num=7;
        System.out.println(num + "! = " + factorial(num));

    }

}
