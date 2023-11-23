package B02b_Comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
Comperators'da ki Task1 ornegini bu sefer Comparable interface'ini kullanarak yapalim.
Bu Taskta consola girilen isim ve scordan olusan belli sayida ki girdiyi score gore siraliyoruz scoru ayni olanlari ise
ismine gore siralamamiz gerekiyor. Bunun icin Comparotor interfaceni implement edecegiz ve boyle bir Comparator'un nasil
kullanildigini ogreniyoruz.
Ornegin;
 */

/*

        10
        ab 6
        bcc 0
        ade 5
        cab 2
        dee 0
        bda 2
        c 5
        db 2
        a 1
        cbb 1
girdisi icin sonuc;
        ab 6
        ade 5
        c 5
        bda 2
        cab 2
        db 2
        a 1
        cbb 1
        bcc 0
        dee 0
olmalidir.
 */

class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.score, other.score);
    }
}

class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
