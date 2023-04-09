package A14_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    /*
    Bu Taskta belirli bir sayida array listesi ve sonra da koordinatlar giriyoruz. Verilen koordinatlarda ki sayiyi dondurmeli.
    Eger o koordinatlarda sayi yoksa "ERROR!" yazisi donmeli. Ornegin
        3
        5 41 77 74 22 44
        1 12
        3 20 22 33
        3
        1 3
        3 4
        5 5
   konsola girildiginde sonuc
        74
        52
        Error
   olmalidir. Burada 3 adet liste ve 3 adet koordinat verilecegi de int olarak belirtilmis.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrList.add(new ArrayList<>());
            String[] strLine = scan.nextLine().split(" ");
            for (String strNum:strLine) {
                arrList.get(i).add(Integer.valueOf(strNum));
            }
        }

        int m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt();
            try{
                System.out.println(arrList.get(x).get(y));
            } catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
