package A09_Arrays.Tasks.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeAnArray {
    /*
        Bu taskta ekrana girilen sayilari bir array icersinde saklayip sonra
        bu sayilari siraya diziyoruz. ekranda girilen ilk sayi arrayin uzunlugu olmaldir.
        sonrakiler ise arrayin elementleri
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= scan.nextInt();
        }
        scan.close();
        Arrays.sort(a);
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
