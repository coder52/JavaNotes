package A00.loops;

public class Labeled {

    public static void main(String[] args) {
        //Using Label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
