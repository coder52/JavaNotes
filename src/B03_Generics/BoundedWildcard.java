package B03_Generics;

import java.util.ArrayList;

public class BoundedWildcard {
    private static Double add(ArrayList<? extends Number> num) {  //?= Number class'ini extends yapan butun class'lar

        double sum=0.0;

        for(Number n:num)
        {
            sum = sum+n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        System.out.println("displaying the sum= "+add(l1));

        ArrayList<Double> l2=new ArrayList<>();
        l2.add(30.1);
        l2.add(40.4);
        System.out.println("displaying the sum= "+add(l2));


    }
}
