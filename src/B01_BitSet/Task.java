package B01_BitSet;


import java.util.BitSet;
import java.util.Scanner;

public class Task {
    /*
     Bu alistirmada iki adet BitSet olusturacagiz. Diyelim ki konsola,
        5 4
        AND 1 2
        SET 1 4
        FLIP 2 2
        OR 2 1
     seklinde giris yapilmis olsun. 5 sayisi her iki BitSet'in size'ni vermeli ve 4 sayisi bi BitSet'ler ile yapilacak
     islem sayisini verecektir. daha sonra
        * AND, OR, XOR yazisi geliyor ise bu yazidan sonra gelecek ayri iki rakam 1 yada 2 olabilir
          ve 1 2 seklinde olursa operasyon sonucu 1. set'e kaydolacak demektir. 2 1 olursa 2. set'e kaydolacak demek olur.
        * FLIP yada SET yazisi gelirse bu yazidan sonra ki ilk rakam flip yada set isleminin hangi set'e yapilacagini
          ikincisi ise o set uzerinde ki hangi idx'e yapilacagini gostermektedir.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while(M>0){
            String s = input.next();
            int a = input.nextInt();
            int b = input.nextInt();

            switch (s) {
                case "AND":
                    if (a == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        B1.flip(b);
                    } else {
                        B2.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        B1.set(b);
                    } else {
                        B2.set(b);
                    }
                    break;
                default:
                    System.out.println("No such operation!");
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
            M--;
        }

    }
}
