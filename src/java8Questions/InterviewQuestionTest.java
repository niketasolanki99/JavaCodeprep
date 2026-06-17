package java8Questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestionTest {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        int n = 5;

        int expectedSum, actualSum = 0, missingNumber;
        expectedSum = n*(n+1)/2;
        for(int num1 : nums){
            actualSum += num1;
        }

        missingNumber = expectedSum-actualSum;

        System.out.println(missingNumber);


        int left = 0;
        int right = nums.length-1;

        while (left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        for(int num : nums){
           // System.out.print(num + " ");
        }
        //System.out.println();
    }
}
