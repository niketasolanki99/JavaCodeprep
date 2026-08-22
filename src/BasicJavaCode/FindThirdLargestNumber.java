package BasicJavaCode;

import java.util.Arrays;

public class FindThirdLargestNumber {

    public static int ThirdLargestNumber(int[] arr){
       if(arr == null || arr.length < 3){
           return Integer.MIN_VALUE;
       }
       Arrays.sort(arr);
       return arr[arr.length-3];
    }

    public static void main(String[] args) {
        int[] arr = {9,10,16,17,18};

        int num = ThirdLargestNumber(arr);
        System.out.println("Third largest number inside an array: " + num);
    }
}
