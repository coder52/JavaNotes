package A02_DataTypes;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of tests : ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            System.out.println();
            System.out.println("Enter a number :");

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
                if(x>Long.MAX_VALUE)System.out.println(x+" can't be fitted anywhere.");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
