package A09_Arrays;

import java.util.Arrays;

public class ArrayMethods {

    // TestCase4.toString(....)
    // TestCase4.fill(arrayName , value)
    // TestCase4.binarySearch(arrayName, searchNumber)
    // TestCase4.sort(arrayName); or TestCase4.sort(arrayName, fromIdx, toIdx);
    // TestCase4.equals(arr1, arr2)

    public static void main(String[] args) {

        //String[] strArr = {"apple", "orange", "banana", "mango", "watermelon"};

        int[] intArr = new int[5];
        System.out.println("Before filling :" + Arrays.toString(intArr));
        Arrays.fill(intArr, 8);
        System.out.println("After filling :" + Arrays.toString(intArr));

        int[] numbers1 = {2,3,6,17,7,4,7,11};
        Arrays.sort(numbers1);
        System.out.println("Sorted array : " + Arrays.toString(numbers1));

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,5));  // gives index of number 5 in array

        int[] numbers2 = {1,2,3,4,5,6,7,9,8};
        System.out.println(Arrays.equals(numbers,numbers2));

    }

}
