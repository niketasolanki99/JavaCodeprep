package java8Questions;

import java.util.*;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,2,3,4,7,5,6);
        Optional<Integer> secHigh = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secHigh.ifPresent(System.out::println);

        int[] arr = {2,3,4,6,7,8};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second highest number is inside array is : "+ second);

        //flatten the list and find the numbers divisible by 2
        List<List<Integer>> list2 = Arrays.asList(
                Arrays.asList(1,3,2,4),
                Arrays.asList(5,6,7),
                Arrays.asList(8,9,10)
        );

        List<String > strings = Arrays.asList("a", "abcd", "ab", "niketa");

        List<Integer> nums = Arrays.asList(1,2,3,4,1,5);



    }
}
