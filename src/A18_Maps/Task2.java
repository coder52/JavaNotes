package A18_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> members = getMembers();
        System.out.println(members);

    }

    public static HashMap<String, ArrayList<String>> getMembers(){
        HashMap<String, ArrayList<String>> members = new HashMap<>();

        String positio1 = "NJ";
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Halit");

        members.put(positio1, names1);

        String position2 = "Admins";
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Fetih");
        names2.add("TechnoStudy");

        members.put(position2, names2);

        // Burda farkli bir yontem goruyoruz isimleri bir array icinde yazip, arrayi arrayliste cevirdik.
        // Fakat bu list degistirilemez imis. Ona dikkat etmek gerek dedi ogretmen.
        String position3 = "NJ Teachers";
        String[] names3 = {"Dauke", "Dos", "Sena", "Tuba"};
        ArrayList<String> namesList3 = new ArrayList<>(Arrays.asList(names3));

        members.put(position3, namesList3);

        return members;
    }


}
