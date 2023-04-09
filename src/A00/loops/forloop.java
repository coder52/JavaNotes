package A00.loops;

public class forloop {

    public static void main(String[] args) {

        String[] fruits = {"Apple","Mango", "Orange"};

        for(int i=0;i<5;i++){

            System.out.println(i);

        }

        for(String fruit : fruits){

            System.out.print(fruit+" ");

        }

    }

}

// infinitive for loop for(;;){}