package A05_String.Tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3Regex {
    public static void main(String[] args) {
        /*
        input:
                3
                ([A-Z])(.+)
                [AZ[a-z](a-z)
                batcatpat(nat
        Exoected output:
                Valid
                Invalid
                Invalid
         */

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (java.util.regex.PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();

    }
}
