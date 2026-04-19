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
            int temp = right;
            right = left;
            left = temp;

            left++;
            right--;
        }
       System.out.println("reverse of the array : " + Arrays.toString(arr));


        List<Integer> list = Arrays.asList(50,40,30,20,100);

        Collections.reverse(list);
        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);

    }
}
