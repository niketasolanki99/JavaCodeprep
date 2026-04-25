package BasicJavaCode;

public class CountOccurrence {

    public static int countOccur(int[] arr, int target){
        int count = 0;
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,0,1,0,1,7,9,4,5};
        int target = 0;

        int occurrences = countOccur(arr, target);
        System.out.println(occurrences);


    }
}
