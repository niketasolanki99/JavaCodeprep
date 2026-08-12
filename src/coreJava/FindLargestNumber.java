package coreJava;

import java.util.List;

public class FindLargestNumber {
    public static int findLargestNumber(List<Integer> numbers){

        int temp = numbers.get(0);
        for(int highNum : numbers){
            if(highNum > temp){
                temp = highNum;
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,55,90, 67,34,45);

        int highestNumber = findLargestNumber(numbers);
      //  System.out.println(highestNumber);

        int[] arr = {-5, -10, -2};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int cNum : arr){
            if(cNum > max){
                secMax = max;
                max = cNum;
            } else if (cNum > secMax && cNum != max) {
                secMax = cNum;

            }
        }
        System.out.println(secMax);


    }
}
