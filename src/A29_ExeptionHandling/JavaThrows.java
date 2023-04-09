package A29_ExeptionHandling;

import java.io.IOException;

// Burada throw ile bir hata tanimladik ve m() metodunda baska ifade olmadigindan o hata her halukarda olusacak.
// O zaman ya o hatayi try catch blogu ile islememiz lazim (handle) yada throws anahtar kelimesi ile bildirmemiz lazim ki
// daha sonra onu cagiranlar tarafindan islenebilsin. Aksi halde hata mesaji peydah olacaktir.
// ha bu arada hata main icersinde islendiginden  n() metodu da throws ile hatayi bir sonraki cagiriciya bildirmeli
// yoksa yine hata mesaji alirsin.
// Yani anladigim kadariyla bir hata ile basa cikamiyorsak o zaman o hatayi throws ile metod taniminda yazip bu metodu
// cagiranlari uyariyoruz boylece metodumuzu cagiranlar daha dikatli oluyor ve belkide cagirildigi yerde isi cozuyor.
// Bu hatalar checked hatalar olmali yoksa run time errorlar zaten kontroledilip metod icersinde cozulmeli, degil mi?

public class JavaThrows {


        void m() throws IOException {

            throw new IOException("device error");          //checked exception

        }

        void n() throws IOException {

            m();

        }

        void p(){

            try{
                n();
            }catch(Exception e){
                System.out.println("exception handled");
            }

        }

        public static void main(String args[]){

            JavaThrows obj = new JavaThrows();
            obj.p();
            System.out.println("normal flow...");

        }


}



