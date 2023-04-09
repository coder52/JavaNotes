package A05_String.Tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class Task6ValidUserNameRegex {
    public static void main(String[] args) {
        String regex = "[A-Za-z]([\\w_]){7,29}";
        Pattern p = Pattern.compile(regex);

        String[] strArray = {
                "Julia",
                "Samantha",
                "Samantha_21",
                "1Samantha",
                "Samantha?10_2A",
                "JuliaZ007",
                "Julia@007",
                "_Julia007",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                "In3wXoumYI5GSbybf8pqKdq7UCieLPhnSF05FnvH1UIWAEu93zrxrzVpl22Vv1l_pHtPoE1Bmm_dbPDomvrO9WKllXn",
                "adzy5uzuw2eUpUBK6LIGKT7h1n49tCu"
        };

        for (String input:strArray) {
            if(p.matcher(input).matches()){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }
}
