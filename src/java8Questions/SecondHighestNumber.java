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
    }
}
