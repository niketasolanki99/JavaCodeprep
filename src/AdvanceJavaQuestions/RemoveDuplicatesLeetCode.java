package AdvanceJavaQuestions;

public class RemoveDuplicatesLeetCode {

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        int unique = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[unique] != nums[i]){
                nums[i] = nums[i-1];
                unique++;
            }
        }


        return unique;
    }

    public static void main(String[] args) {


    }
}
