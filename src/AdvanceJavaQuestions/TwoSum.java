package AdvanceJavaQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,6,3};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int extra = target - arr[i];    //4

            if(map.containsKey(extra)){
                //it'll print the indices
                System.out.println(map.get(extra) + ", " + i);  //4, 5
                //System.out.println("the values : " +  extra + " and " + arr[i]);
                break;
            }
            map.put(arr[i], i);

        }


    }
}
