package Extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.SocketHandler;

import static java.lang.System.in;

/*
Input Format
    There are only five lines of input, each containing one integer.
Output Format
    There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed
    to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should
    be printed.
Example 1
        Sample Input
        2
        1
        3
        4
        5
        Sample Output
        2
        2
        2 3
        2 3 5

Ezample 2
        Sample Input
        1
        2
        3
        4
        5
        Sample Output
        {empty}
        2
        2 3
        2 3 5
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Prime{
    public void checkPrime(int ... numbers) {
        boolean emptyPrint=true;
        for (int n:numbers) {
            if(checker(n)){
                System.out.print(n+" ");
                emptyPrint=false;
            }
        }
        System.out.println("");
    }
    public boolean checker(int number) {
        if (number==1)
            return false;
        if (number==2)
            return true;
        if (number % 2 == 0)
            return false;
        for(int i=3;i<number;i=i+2){
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
