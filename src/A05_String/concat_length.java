package A05_String;

public class concat_length {

    public static void main(String[] args) {

        String name = "Ahmet";
        String surname = "Salih";

        String fullname = name + " " + surname;
        System.out.println(fullname);

        String result1  = surname.concat(" ").concat(name).concat(" bey ").concat("nasilsin?");
        System.out.println(result1);

        String result2  = "Ahmet ".concat("Ali");
        System.out.println(result2);

        System.out.println(result1.length());

    }

}
