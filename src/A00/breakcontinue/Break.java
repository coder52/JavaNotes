package A00.breakcontinue;

public class Break {

    public static void main (String [] args){

        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==j){
                    break;
                }
                System.out.println(i + " " + j);
            }

        }

    }

}
