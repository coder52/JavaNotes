package A09_Arrays;

public class ArraysString {

    public static void main(String[] args){

        String[] strArr = {"Alice", "Bob", "John"};

        for(int i=0; i<3 ; i++){
            System.out.print(strArr[i] + " ");
        }
        System.out.println("\n");
        for(String name: strArr){
            System.out.print(name + " ");
        }


    }



}
