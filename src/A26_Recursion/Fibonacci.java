package A26_Recursion;

public class Fibonacci {

    // Print first fifteen fibonacci numbers
    // Sirasiyla 0 ve 1 ile baslayip daha sonra ki sayilar kendinden onceki iki sayinin toplami olan seriye
    // fibonacci sayilari deniliyor.
    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }
    }

    public static void main(String[] args) {
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibo(count-2);//n-2 because 2 numbers are already printed
    }

}
