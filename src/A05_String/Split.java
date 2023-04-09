package A05_String;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        String str = "This method has two variants and splits this string around matches of the given regular expression.";

        String[] splitted = str.split(" ");

        for(String word:splitted)
            System.out.println(word);

        String text = "SOFTWARE DEVELOPER in TEST";

        System.out.println(Arrays.toString(text.split(" ")));

    }

}
