package BasicJavaCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int left =0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        List<Integer> list = Arrays.asList(50,70,40,60,30,80,20,90,10,100);
       // Collections.reverse(list);
        //System.out.println("Reverse of the List : " + list);

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
       // System.out.println("Reverse of the sorted List: " + sortedList);

    }
}
