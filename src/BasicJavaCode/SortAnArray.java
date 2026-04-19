package BasicJavaCode;

import java.util.Arrays;
import java.util.List;

public class SortAnArray {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        for(int i = 0; i < arr.length-1; i++){  //0<5
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

       List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
       List<Integer> list =  numbers.stream().sorted().toList();
        System.out.println(list);

        List<String> names = Arrays.asList("Zara", "Bob", "Alex", "Charlie");
        List<String> namesSort = names.stream().sorted().toList();
        System.out.println(namesSort);
    }
}
