package A00.switchh;

public class SwitchStrings {

    public static void main(String[] args) {

        String levelString = "expert";

        int level = 0;

        switch(levelString){

            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level =2;
                break;
            case "expert":
                level = 3;
                break;
            default:
                level =0;
                break;

        }
        System.out.println("Your level is "+level+".");

    }


}
