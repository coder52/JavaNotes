package A29_ExeptionHandling.Task;

import java.util.Scanner;

public class Registration {
        // bu program kullnaicinin girdigi parola ile ilgili hatalari throw ile bildiriyor.
    public static void main(String[] args) {

        Registration reg = new Registration();
        reg.signUp();

    }

    private String user;
    private String password;

    public void signUp(){

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        this.user = input.nextLine();

        this.password=null;
        System.out.print("Password : ");
        this.password = input.nextLine();

        try{

            this.checkPassword();

        } catch (NullPointerException e){

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e){

            System.out.println(e.getMessage());

        } catch (RuntimeException e){

            System.out.println(e.getMessage());

        }

    }

    private void checkPassword(){

        boolean result = false;

         if(this.password == null){

            throw new NullPointerException("How did you meke it?");

        }

        if(this.password.isEmpty()){

            throw new NullPointerException("You didn't write password");

        }
        // Javayi tekrar yukledim. Burada .isBlank() metodu calismamaya basladi.
        // Bu nedenle .trim().isEmpty() metodunu kullandim.
        if(this.password.trim().isEmpty()){

            throw new IllegalArgumentException("You can not write just space or spaces.");

        }

        if(this.password.length() < 6 ){

            throw new IllegalArgumentException("Write least 6 characters.");

        }

        if(numberOfDigits()<3){

            throw new RuntimeException("Write least 3 digits");

        }

        if(numberOfLetters()<3){

            throw new RuntimeException("Write least 3 letters ");

        }

    }

    private int numberOfDigits(){

        int count = 0;
        for (int i=0; i<this.password.length();i++) {

            if(Character.isDigit(this.password.charAt(i))){

                count++;

            }
        }

        return count;
    }

    private int numberOfLetters(){

        int count = 0;
        for (int i=0; i<this.password.length();i++) {

            if(Character.isLetter(this.password.charAt(i))){

                count++;

            }

        }

        return count;

    }
}
