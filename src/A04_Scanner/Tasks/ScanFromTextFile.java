package A04_Scanner.Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 Bu Taskta su gorevler .txt file'dan okunarak gerceklestirilecek
        5                       -> Arayin boyutu
        12 0 1 78 12            -> Arayin kendisi
        2                       -> Gac adet emir verilecek
        Insert                  -> Insert emri
        5 23                    -> 5. idx'e 23 rakami eklenecek
        Delete                  -> Delete emri
        0                       -> 0. idx silinecek
son olarak da arrayin yeni sekli basilacak.
 */

public class ScanFromTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\Sahin\\IdeaProjects\\JavaCourse\\src\\day5Scanner\\Tasks\\Text");
        Scanner scan = new Scanner(file);

        int n = scan.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scan.nextInt());
        }
        int nQueries = scan.nextInt();
        for (int i = 0; i < nQueries; i++) {
            scan.nextLine();
            String query= scan.nextLine();
            if(query.equals("Delete")){
                int idxDelete = scan.nextInt();
                numbers.remove(idxDelete);
            } else if (query.equals("Insert")) {
                int idxAdd = scan.nextInt();
                int number = scan.nextInt();
                numbers.add(idxAdd,number);
            }
        }

        for (int num:numbers) {
            System.out.print(num + " ");
        }

    }
}
