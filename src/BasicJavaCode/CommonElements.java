package BasicJavaCode;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,4,5};
        int[] arr2 = {3,5,6,0,2,7};

        Set<Integer> set  = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        System.out.println("common elements between arr1 and arr2 : " + result);
    }
}
