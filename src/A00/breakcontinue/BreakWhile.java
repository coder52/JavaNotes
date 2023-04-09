package A00.breakcontinue;

public class BreakWhile {

    public static void main (String [] args){

        byte count = 0;
        while(count<10){
            if(count==5){
                count++;
                break;
            }
            System.out.println(count++);
        }

        System.out.println("outside :" + count++);

    }

}
