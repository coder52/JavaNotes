package Extra;

public class obeb {
    /*
        Bu alistirmada ortak bolenlerin en buyugunu bulmak icin kullandigimiz
        oklid bagantisini goruyoruz
     */
    public static void main(String[] args) {
        int obeb = euclideanAlgorithm(15,7);
        System.out.println(obeb);
    }

    public static int euclideanAlgorithm(int x, int y){
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
}
