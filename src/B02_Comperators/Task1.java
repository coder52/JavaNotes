package B02_Comperators;
import java.util.Scanner;
import java.util.*;
/*
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
        olmalidir
 */
class Checker implements Comparator{
    public int compare(Object obj1,Object obj2){
        Player p1=(Player) obj1;
        Player p2=(Player) obj2;

        if(p1.score==p2.score)
            return p1.name.compareTo(p2.name); // burada return 0; yazmaliyiz fakat scor'u ayni olanlari isimlere gore
        else if(p1.score>p2.score)                      //siralamamiz gerektiginden boyle yazdik. Yani String'in compareTo
            return -1;                                           // methodunu kullandik.
        else
            return 1;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
