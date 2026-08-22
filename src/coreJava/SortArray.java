package coreJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2};
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println();

        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
