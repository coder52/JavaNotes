package A09_Arrays.Tasks.Task5ArrayDeque;

import java.util.*;

//public class Task5 {
//    /*
//    Bu Task icersinde bir array icersinde ki sub arraylerin benyersiz elememanlarini bulacagiz ve subarrayinde en cok
//    benzersiz elemani olanin benzersiz eleman sayisini dondurecegiz. Ornegin 6 elemani olan bir arrayin 3 elemanli sub arrayleri
//    icin
//        6 3
//        5 3 5 2 3 2
//    girdisi icin sonuc 3 olacak
//     */

//Solution 1
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(max>=m)
                break;
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(i>m-2){
                if(set.size()>max){
                    max= set.size();
                }
                Object polled = deque.poll();
                if(!deque.contains(polled)){
                    set.remove(polled);
                }
            }
        }
        System.out.println(max);
    }
}
// Solution2
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Deque deque = new ArrayDeque<>();
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            if(max==m){
//                break;
//            }
//            int num = in.nextInt();
//            if(!deque.contains(num)){
//                max++;
//            }
//            if(i>=m){
//                if(!deque.contains(deque.poll())){
//                    max--;
//                }
//            }
//            deque.add(num);
//        }
//        System.out.println(max);
//    }
//
//}


