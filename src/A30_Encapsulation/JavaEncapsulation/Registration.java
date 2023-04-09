package A30_Encapsulation.JavaEncapsulation;

public class Registration {

    public static void main(String[] args) {

        User user = new User();

        user = new User(10,"Kenan","132367");

        System.out.println(user.toString());


    }
}
