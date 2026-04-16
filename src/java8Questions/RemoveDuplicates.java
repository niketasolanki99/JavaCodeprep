package java8Questions;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry","apple", "cherry", "papaya", "chiku");

        Set<String> uniqueStr = new LinkedHashSet<>(list);
        System.out.println(uniqueStr);

        //remove duplicates from the list
        list.stream().distinct().forEach(System.out::println);
    }
}
