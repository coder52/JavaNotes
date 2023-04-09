package A28_DateTime.HarderTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> Users;

    public Registration(){
        Users = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name = "";

        while (!name.equalsIgnoreCase("exit") ) {
            System.out.print("New User Name :");
            name = input.nextLine();
            User user = new User(name);
            Users.add(user);
        }
        for (User user:Users) {
            if(user.registration.getSecond() <= 10){
                System.out.println(user.toString());
            }
        }
    }
}
