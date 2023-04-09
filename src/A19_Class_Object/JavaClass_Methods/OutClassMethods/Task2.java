package A19_Class_Object.JavaClass_Methods.OutClassMethods;

public class Task2 {
    public static void main(String[] args) {

        User user1 = addUser("A", "12345", "Ahmet", "Ali");
        User user2 = addUser("def", "42345", "John", "Ocanor");
        User user3 = addUser("ad", "66345", "Ferdinand", "Samuel");

        printUser(user1);
        printUser(user2);
        printUser(user3);



    }

    public static User addUser(String username, String password, String firstname, String lastname){
        User user = new User();

        user.username = username;
        user.password = password;
        user.firstname = firstname;
        user.lastname = lastname;

        return user;
    }

    public static void printUser(User user){

        System.out.println("Username :" + user.username + "\n" +
                            "Password :" + user.password + "\n" +
                            "First Name :" + user.firstname + "\n" +
                            "Last Name :" +  user.lastname + "\n"
        );

    }


}
