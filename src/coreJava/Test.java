package coreJava;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //int[] arr = {10, 20, 5, 8, 20};

        int[] arr = {1,0,0,1,1,0};

        int[] result = new int[arr.length];
        int index = 0;
        for(int num : arr){
            if(num != 1){
                result[index] = num;
                index++;
            }
        }

        while (index < result.length){
            result[index] = 1;
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
