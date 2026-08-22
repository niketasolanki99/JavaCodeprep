package AdvanceJavaQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int extra = target - arr[i];
            if(map.containsKey(extra)){
                System.out.println( "Index of the elements : " + map.get(extra) + ", " + i);
                System.out.println("Actual values : " +  extra + " and " + arr[i]);
                return new int[]{map.get(extra), i};
            }
            map.put(arr[i], i);

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,6,3};
        int target = 9;
        int[] result = twoSum(arr, target);

        System.out.println(result[0] + ", " + result[1]);




    }
}
