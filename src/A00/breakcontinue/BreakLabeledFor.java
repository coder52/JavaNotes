package A00.breakcontinue;

public class BreakLabeledFor {

    public static void main(String [] args){

        aa:

        for(int i=0;i<6;i++){

            bb:

            for(int j=1;j<6;j++){

                if(i==j){

                    break bb;   // i=j sarti saglandiginda bb etiketinden hemen sonra gelen for loop'u atlar

                }

                System.out.println( i + " " + j );

            }

            if(i==4) break aa; // i=4 sarti saglandiginda aa etiketindan hemen sonra gelen for loop'u atlar

        }

    }

}
