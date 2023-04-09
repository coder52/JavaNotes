package A05_String;

public class StringToInteger {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "456.45";
        String str3 = "13.23";
        String str4 = "trUE";


        int num1 = Integer.parseInt(str1);
        float num2 = Float.parseFloat(str2);
        Double num3 = Double.valueOf(str3);
        boolean bln1 = Boolean.valueOf(str4);
        boolean bln2 = Boolean.parseBoolean(str4);

        System.out.println(str1+str2+str3 + " is wrong result.");
        System.out.println(num1+num2+num3 + " is right result.");
        System.out.println(bln1);
        System.out.println(bln2);
    }


}
