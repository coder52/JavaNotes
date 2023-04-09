package A00.breakcontinue;

public class BreakLabeledFor {

    public static void main(String [] args){

        aa:   // bu etiket distaki for loopu iptal eder

        for(int i=0;i<6;i++){
            bb:       // bu etiket icteki for loopu iptal eder.
            for(int j=1;j<6;j++){
                if(i==j){
                    break bb;
                }
                System.out.println(i + " " + j);
            }
            if(i==4) break aa;

        }

    }

}
