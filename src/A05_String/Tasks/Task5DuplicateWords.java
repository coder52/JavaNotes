package A05_String.Tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class Task5DuplicateWords {
    public static void main(String[] args) {
        String regex = "([A-Za-z]+ )*";
        Pattern p = Pattern.compile(regex, CASE_INSENSITIVE);

        String[] strArray = {
                "Goodbye bye bye world world world",
                "Sam went went to to to his business",
                "Reya is is the the best player in eye eye game",
                "in inthe",
                "Hello hello Ab aB",
        };

        for (String input:strArray) {
            Matcher matcher = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (matcher.find()) {
                if (matcher.groupCount() == 1) {
                    input = input.replaceAll("(?i)\\b(\\w+)\\b(\\s+\\1)+\\b", "$1");
                }
            }


            // Prints the modified sentence.
            System.out.println(input);
        }

    }
}
