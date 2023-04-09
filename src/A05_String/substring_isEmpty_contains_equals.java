package A05_String;

public class substring_isEmpty_contains_equals {

    public static void main(String[] args) {

        String message = "How are you today?";

        String subS = message.substring(4,13);   // 4 haric 13 dahil, saymaya birden basla
        System.out.println(subS);

        System.out.println(message.substring(8));  // 8 den sonra ki tum text (8 haric), saymaya birden basla

        boolean check = message.isEmpty();
        System.out.println(check);

        boolean check2 = message.equals("how are you today?");
        System.out.println(check2);

        boolean check3 = message.equalsIgnoreCase("how are you today?");
        System.out.println(check3);

        boolean check4 = message.contains("are");
        System.out.println(check4);

    }

}
