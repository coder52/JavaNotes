package A05_String;

public class indexOf_lastIndexOf_charAt {

    public static void main(String[] args) {

        String s1 = "Hello World.";

        System.out.println(s1.indexOf("l"));

        String s2 = "Hello World.";

        int lenS2 = s2.indexOf("World.");

        System.out.println(lenS2);

        System.out.println(s2.indexOf("t"));

        System.out.println(s2.lastIndexOf("l"));
        System.out.println(s2.lastIndexOf("lo"));

        System.out.println(s1.charAt(6));

    }

}
