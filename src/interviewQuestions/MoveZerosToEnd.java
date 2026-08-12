package interviewQuestions;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 1, 0};
       // int[] result = new int[arr.length];

        int index = 0;

// Copy all non-zero elements
        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }

// Print the result
    }
}
