package Extra;

public class obeb {
    /*
        Bu alistirmada ortak bolenlerin en buyugunu bulmak icin kullandigimiz
        oklid bagantisini goruyoruz
     */
    public static void main(String[] args) {
        int obeb = euclideanAlgorithm_2(64,12);
        System.out.println(obeb);
    }

    public static int euclideanAlgorithm_1(int x, int y){
        while(x!=y){
            if(x>y){
                x = x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }

    public static int euclideanAlgorithm_2(int m, int n){

        int r = m%n;
        while(r>0) {
            m=n;
            n=r;
            r=m%n;
        }

        return n;
    }
}
