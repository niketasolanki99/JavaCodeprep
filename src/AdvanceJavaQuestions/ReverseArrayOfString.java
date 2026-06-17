package AdvanceJavaQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "grape"};


        int start = 0;
        int end = array.length-1;

        while (start < end){
            String temp = array[start];
            array[start] =array[end];
            array[end] = temp;
            start++;
            end--;
        }

        for(String words : array){
            System.out.print(words + " ");
        }

        String str = "banana";

        int left = 0;
        int right = str.length()-1;

        while (left < right){
            int temp = left;
            left = right;
            right = temp;
            left++;
            right--;
        }
        for (char ch : str.toCharArray()){
            System.out.print(ch);
        }

    }
}
