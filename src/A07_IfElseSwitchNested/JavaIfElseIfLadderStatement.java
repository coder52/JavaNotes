package A07_IfElseSwitchNested;

import java.util.Random;

public class JavaIfElseIfLadderStatement {

    public static void main(String[] args) {
        Random rnd = new Random();

        int age = 10;//rnd.nextInt(21);

        if(age == 20) {
            System.out.println( "age is equal to 20" );
        } else if(age > 15) {
            System.out.println( "age is greater than 15" );
        } else if(age >= 10) {
            System.out.println( "age is equal or greater than 10" );
        } else {
            System.out.println( "age is smaller than ten" );
        }

    }
}
