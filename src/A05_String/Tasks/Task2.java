package A05_String.Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String str = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        str = "Its always better if you find edge cases by yourself rather than buying test cases with " +
                "valuable hackos!!   May be this case won't help you to find the   buuuuuug";
        str="                            ";



        str = str.trim();
        String[] strArray = str.split("[^*a-z*A-Z*0-9]* |[^+a-z+A-Z+0-9]");
        int arrayLength = str.length()!=0 ? strArray.length : 0;
        System.out.println(arrayLength);
        for (String s:strArray) {
            System.out.println(s);
        }

    }
}
/*
"Its always better if you find edge cases by yourself rather than buying test cases with " +
                "valuable hackos!!   May be this case won't help you to find the   buuuuuug"
 */