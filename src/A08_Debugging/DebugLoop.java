package A08_Debugging;

public class DebugLoop {

    /*
     Stepler arasi F7 ile gecebilirsin
     */

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {

            if(i/5 == 1){
                continue; // Debug yapinca 5. stepte buraya girdigini goreceksin.
            }
            System.out.println(i);

        }

    }
}
