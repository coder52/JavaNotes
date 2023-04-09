package A05_String;

public class trim_replace_replaceFirst_replaceAll_regex {

    public static void main(String[] args){

        String text= "           Her insan olumu tadacaktir            ";

        System.out.println(text.trim());

        System.out.println(text.trim().replace("insan", "nass"));

        String text2= "Hi millet Hi";

        System.out.println(text2.replace("Hi", "Hello").replace("millet","halk"));







    }

}
