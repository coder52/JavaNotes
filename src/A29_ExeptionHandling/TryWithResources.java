package A29_ExeptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/*
    Bu ornegi Umschulung sirasinda ogrendim. Burada ilk olarak bir dosya islemi sirasinda finally kullanilarak dosyanin
    her halukarda kapatilmasini goruyoruz. Bu zaten bildigimiz bir sey idi. Fakat ayni zamanda da uzun bir yontem.
    Yeni gorecegimiz ise daha kisa bir yol olan TryWithResources yontemidir. Bu yontemde try buloguna parantez ekliyoruz
    try(...) ve boylece bu parantez icersine koydugumuz object otomatik kapanabilen object oldugundan finally'e gerek
    kalmiyor. Hatta TryWithResources'da catch bloklari yazilmasa da oluyor. Cok pratik degil mi?
    Fakat unutma try() parantezi icersine yazdigin object'in sinifi AutoClosable adinda ki bir interface'i implement
    etmis olmalidir. Bu interface'i implement etmemis olan class'larin objectleri TryWithResources ile kullanilamiyor.
    Son olarak sunu da soylemeliyim ki parantez icersinde birden fazla farkli objectler aralarinda ; isareti koyularak
    yazilabilir. Asagida buna ornek yok ama umschulung sirasinda io konusunda buna ornek yapmistik.
 */
public class TryWithResources {

    public static void main(String[] args) {

        Writer out = null;
        try {
            out = new FileWriter("data.txt");
            out.append("Das ist das Haus von Nikigraus!");
        }
        catch(IOException e) {
            System.out.println("Problem");
        }
        finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Problem");
                }
            }
        }

        // Alle Klassen die im try-with-resources geöffnet werden müssen AutoClosable sein
        // AutoClosable ist ein Interface, dass eine close-Methode erzwingt
        try(Writer out2 = new FileWriter("data.txt")) {
        //try(List out2 = new ArrayList()) { // Implementiert nicht das AutoClosable
            out = new FileWriter("data.txt");
            out.append("Das ist das Haus von Nikigraus!");
            // out2 wird automatisch geschlossen
        }
        catch(IOException e) {
            System.out.println("Problem");
        }
    }
}
