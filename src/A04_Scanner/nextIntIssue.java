package A04_Scanner;

import java.util.Scanner;
/*
   Bu örnek gerçekten enteresan ve önemli. Aşağıda scan.nextLine(); satırını eklememiz boşuna değil. Eğer bunu eklemezsen
   scan metodu String girdisini beklemeden programı tamamlar ve istenmeyen bir netice oluşturur.
   Bunun sebebi .nextInt(), .nextDouble() gibi sayı çeken metodlar en sonda ki ENTER karakterini (yani \n) okuyamazlar
   dolayisiyla kullanici enter tusuna bastiginda en sonda ki \n karakteri yazilmayi bekliyor olarak beklemektedir. Bunun yaninda
   .nextLine() metodu \n karakterini gorunce Enter tusuna basildi kabul eder ve girdi beklemeden islemi sonlandirir. Buna
   engel olmak icin scan.nextLine(); satirini araya ekliyoruz.
 */
public class nextIntIssue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
