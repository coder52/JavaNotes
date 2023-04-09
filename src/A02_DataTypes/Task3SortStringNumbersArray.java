package A02_DataTypes;

public class Task3SortStringNumbersArray {
    public static void main(String[] args) {

        String[] s = {
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000"
        };
        int n = s.length;

        for (int i = 0; i < n-2; i++) {
            int count = 0;
            for (int j = 1; j < n; j++) {
                if(Double.parseDouble(s[j-1]) < Double.parseDouble(s[j])){
                    String dummy = s[j-1];
                    s[j-1]=s[j];
                    s[j]=dummy;
                } else {
                    count++;
                }
            }
            // to increase speed
            if(count>n-1){
                break;
            }
        }

        for (String strNumber:s) {
            System.out.println(strNumber);
        }

    }
}
