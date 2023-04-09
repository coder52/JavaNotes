package A14_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayVSArrayList2D {

    public static void main(String[] args) {

//        oneDimensional();
        twoDimensional();

    }

    public static void oneDimensional(){

        //TestCase4
        int[] numArray = {1,2,3,4};

        //ArrayList
        //1st Way
        List<Integer> numList1 = Arrays.asList(1,2,3,4);
        //2nd Way // Bunda problem var
        ArrayList<Integer> numList2 = (ArrayList<Integer>) Arrays.asList(1,2,3,4);
        //3rd Way
        ArrayList<Integer> numList3 = new ArrayList<Integer>();
        numList3.add(1);
        numList3.add(2);
        numList3.add(3);
        numList3.add(4);

    }

    public static void twoDimensional(){

        // 2D TestCase4
        // 1st Way
        int[][] numArrays2D_1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        //2nd Way
        int[][] numArrays2D_2;
        numArrays2D_2 = new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        //3rd Way
        int[] row1 = {1,2,3,4};
        int[] row2 = {1,2,3,4};
        int[] row3 = {1,2,3,4};
        int[][] numArray2D_3 = {row1, row2, row3};

        // 2D ArrayLists
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        ArrayList<Integer> listRow1 = (ArrayList<Integer>) Arrays.asList(1,2,3,4);
        ArrayList<Integer> listRow2 = (ArrayList<Integer>) Arrays.asList(1,2,3,4);
        ArrayList<Integer> listRow3 = (ArrayList<Integer>) Arrays.asList(1,2,3,4);
        list2D.add(listRow1);
        list2D.add(listRow2);
        list2D.add(listRow3);

        // Access 0th element of 0th ArrayList
        int element = list2D.get(0).get(0);

        System.out.println(element);

    }

}
