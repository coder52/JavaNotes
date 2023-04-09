package A09_Arrays.Tasks.Task4;

public class SubArray {
    /*
        Bu Taskta bir array icesinde ki sirali sub arraylerden toplami negatif olanlarin kac adet oldugunu bulacagiz
        Mesela {1, -2, 4, -5, 1,} arayi icin cevap 9 olmali.
     */
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1,};
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int subTotal=arr[i];
            if(arr[i]<0) {
                System.out.println(arr[i]);
                n++;
            }
            for (int j = i+1; j < arr.length; j++) {
                subTotal=subTotal+arr[j];
                if(subTotal<0) {
                    System.out.println(subTotal);
                    n++;
                }
            }
        }
        System.out.printf(String.valueOf(n));

    }
}
