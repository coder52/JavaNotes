package A05_String;

public class regex_ {

    public static void main(String[] args) {

        String text3="kenfidini BILMEYEN kacmasin.";

        System.out.println(text3.replaceFirst("[A-Z]","b"));
        System.out.println(text3.replaceAll("[A-Z]","b"));
        System.out.println(text3.replace("E","e"));

        String str = "$18MM";

        str = str.replaceAll("[a-zA-Z$]","");

        System.out.println(str);

    }
}
