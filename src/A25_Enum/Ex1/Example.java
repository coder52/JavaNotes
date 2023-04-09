package A25_Enum.Ex1;

public class Example {

    public static void main(String[] args) {

        User user1 = new User();
        user1.role = Role.ADMIN;
        user1.status = Status.LOGIN;

        User user2 = new User();
        user2.role = Role.COSTUMER;
        user2.status = Status.BUSY;


        // Enum + String

        System.out.println("Merhaba " + Role.COSTUMER );



    }


}
