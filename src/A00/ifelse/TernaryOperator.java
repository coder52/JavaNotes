package A00.ifelse;

public class TernaryOperator {
    public static void main(String[] args) {

        int a1=3;
        int a2=4;

        int result = a1+a2 == 10 ? a1++ : a2++;

        System.out.println("a1:"+a1+" "+"a2:"+a2);


    }
}
