package A09_Arrays.Tasks.Task1;


import java.util.Collections;
import java.util.HashSet;

/*
Asagida bir oyunda belirli bir "leap" yani atlama miktari icin verilen arrayin sonuna ulasip ulasamiyacagimizi soyleyen bir
oyun programi goruyorsunuz. Kurallar:
    - sadece 0 olan array elemani uzerine atlanabilir.
    - arrayin ilk elemani sifirdir ve oyuna mutlaka ordan baslanir.
    - ileri geri bir hamle yapilabilir tabiki gidecegimiz yerde ki deger 0 olmalidir.
    - leap kadar atlanilabilir ama gidecegimiz yerde 0 olmalidir.
    Ornegin game={0,0,0,1,1,1,0} arayi leap=3 ile kaybedilir. ama leap 4 ile kazanilir.
    Dogru calisip calsimadigini Task1Checker ile kontrol edebilirsin.
 */

public class Task1Game {
    public static boolean canWin(int leap, int[] game) {
        if(game[0]==1)
            return false;
        if(game.length<leap)
            return true;
        HashSet<Integer> idxSet = new HashSet<>();
        idxSet.add(0);
        HashSet<Integer> dummyIdxSet=new HashSet<>();;
        while(!idxSet.isEmpty()) {
            for (int idx:idxSet) {
                if(idx+leap >= game.length)
                    return true;

                for (int i = 0; i < game.length; i++) {
                    if(idx+i < game.length && game[idx+i]==0){
                        dummyIdxSet.add(idx+i);
                    } else {
                        break;
                    }
                }
                for (int j = 0; j <= idx; j++) {
                    if(idx-j>=0 && game[idx-j]==0){
                        dummyIdxSet.add(idx-j);
                    } else {
                        break;
                    }
                }
            }

            idxSet.clear();
            idxSet.addAll(dummyIdxSet);
            dummyIdxSet.clear();
            for (int idx:idxSet) {
                if(Collections.max(idxSet)>=game.length-1){
                    return true;
                }
                if(idx+leap<=Collections.max(idxSet)){
                   continue;
                }
                if (idx+leap>game.length-1) {
                    dummyIdxSet.add(idx+leap);
                } else if (game[idx+leap]==0){
                    dummyIdxSet.add(idx+leap);
                }
            }

            dummyIdxSet.removeAll(idxSet);
            idxSet.clear();
            idxSet.addAll(dummyIdxSet);
            dummyIdxSet.clear();
        }
        return false;

    }

    public static void main(String[] args) {

        int leap = 2;
        int[] game = {0, 0, 0, 1, 0, 0,0};
//        int[] game = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0,
//                0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0,
//                0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1};
//        int[] game = {0, 0, 0, 0, 0};
//        int[] game = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1,
//                0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0};
        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );

    }
}
