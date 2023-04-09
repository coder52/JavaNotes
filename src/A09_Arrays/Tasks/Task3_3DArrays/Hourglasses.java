package A09_Arrays.Tasks.Task3_3DArrays;

public class Hourglasses {
    /*
    Bu taskta asagidaki gibi bir matris dusunuyoruz
            1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 2 4 4 0
            0 0 0 2 0 0
            0 0 1 2 4 0
     ve bu matris icersinden
              a b c
                d
              e f g
     seklinde bir filitre (hourglass) kullandigimizda en byuk toplam sayi kac olur bulmaliyiz. Cevap 19
         -1 -1 0 -9 -2 -2
         -2 -1 -6 -8 -2 -5
         -1 -1 -1 -2 -3 -4
         -1 -9 -2 -4 -4 -5
         -7 -3 -3 -2 -9 -9
         -1 -3 -1 -2 -4 -5
    Bu matris icin cevap -6 olmali
     */
    public static void main(String[] args) {
//        int[][] matrix = {  {1, 1, 1, 0, 0, 0},
//                            {0, 1, 0, 0, 0, 0},
//                            {1, 1, 1, 0, 0, 0},
//                            {0, 0, 2, 4, 4, 0},
//                            {0, 0, 0, 2, 0, 0},
//                            {0, 0, 1, 2, 4, 0}  };

        int[][] matrix = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };


        int[][] filter ={{1,1,1},
                         {0,1,0},
                         {1,1,1}};

        int max = hourglass(matrix, filter);

        System.out.println(max);

    }

    private static int hourglass(int[][] matrix, int[][] filter) {
        int yMatrix = matrix.length;
        int xMatrix = matrix[0].length;
        int yFilter = filter.length;
        int xFilter = filter[0].length;
        int biggestTotal=-1000;
        for (int a = 0; a <= xMatrix-xFilter; a++) {
            for (int i = 0; i <= yMatrix-yFilter; i++) {
                int total=0;
                for (int j = 0; j < yFilter; j++) {
                    int yM = i+j;
                    int yF = j;
                    for (int k = 0; k < xFilter; k++) {
                        int xM = a+k;
                        int xF = k;
                        total += matrix[yM][xM]*filter[yF][xF];
                    }
                }
                if(total>biggestTotal){
                    biggestTotal=total;
                }
            }
        }
        return biggestTotal;
    }
}
