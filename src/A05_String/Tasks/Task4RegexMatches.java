package A05_String.Tasks;

public class Task4RegexMatches {
    public static void main(String[] args) {
        /*
        Bu taskda IP adreslerinin gecerli sinirlar icersinde olup olmadigini regex ile kontrol ediyoruz.
         */

            String[] ipArr = {
                              "000.000.000.000",
                              "0.0.0.0",
                              "00.00.0.0",
                              "000.12.12.034",
                              "121.234.12.12",
                              "23.45.12.56",
                              "00.12.123.123123.123",
                              "122.23",
                              "Hello.IP",
                              "255.000.099.0",
                              "249.",
                              "259.259.259.259",
                              "266.266.266.266",
                              "255.255.255.255",
                              "555.555.555.555",
                              "666.666.666.666",
                              "249.249.249.249",
                              "249.249.249.256"
                             };
        for (String IP:ipArr) {
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{

    String v1="([0-9]{1,2})";             // 0.-99., 00.-99.
    String v2="([01][0-9]{1,2})";         // 0.-199., 00.-199., 000.-199.
    String v3="(2[0-4][0-9])";            // 200.-249.
    String v4="(25[0-5])";                // 250.-255.


    String p = "(" + v1 + "|" + v2 + "|" + v3 + "|" + v4 + ")" ;

    String pattern = p + "[.]" + p + "[.]" + p + "[.]" + p;
}