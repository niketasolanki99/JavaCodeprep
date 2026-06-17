package java8Questions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry","apple", "cherry", "papaya", "chiku");

        Set<String> uniqueStr = new LinkedHashSet<>(list);
        System.out.println(uniqueStr);

        //remove duplicates from the list
        list.stream().distinct().forEach(System.out::println);

        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5,1);

        HashSet<Integer> set = new HashSet<>(duplicateNumbers);

        //List<Integer> result = duplicateNumbers.stream().filter(set::add).toList();
        System.out.println(set);


    }
}
