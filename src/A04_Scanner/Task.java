package A04_Scanner;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            Integer x=sc.nextInt();
            if(!s1.isEmpty()){
                for (int j = s1.length(); j < 15; j++) {
                    s1+=" ";
                }
                System.out.print(s1);
            }
            if(x!=null){
                if(x<100 && x>9){
                    System.out.println("0"+x);
                } else if (x<10 && x>=0){
                    System.out.println("00"+x);
                } else {
                    System.out.println(x);
                }

            }
        }
        System.out.println("================================");
    }
}
