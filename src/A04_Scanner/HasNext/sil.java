package A04_Scanner.HasNext;

import java.util.Scanner;

public class sil {
    public static void main(String []args){
        String str = new String("Deneme");
        //Create scanner Object and pass string in it
        Scanner input = new Scanner(str);
        //Check if the scanner has a token
        System.out.println("Result:"+input.hasNext());
        //Print the string
        System.out.println(input);
        //Check if the scanner has a token after printing the line
        System.out.println("After:"+input.hasNext());
        //Close the scanner
        input.close();
    }


}
