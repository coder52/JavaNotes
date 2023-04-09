package A04_Scanner.HasNext;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x=0;
        System.out.println("Enter a number");
        while(input.hasNext()){
            System.out.println("Enter a number");
            x+=input.nextInt();
            System.out.println(x);

            if(x>50){
                break;
            }
        }


    }
}
