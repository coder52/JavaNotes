package A00.breakcontinue;

public class Continue {

    public static void main(String [] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 6)
                continue;  // for loopun kontrol statementine (i<10) donderir. ama increment yapar(i++)
            System.out.println(i);
        }
    }

}
