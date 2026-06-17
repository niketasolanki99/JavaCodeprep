package coreJavaConcepts;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class LinkedListImplementation {


    public static void main(String[] args) {
        /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
       List<Integer> result =  numbers.stream().filter(num -> num%2 == 0).toList();

        List<String> names = Arrays.asList("niketa","java","spring");
        List<String> result1 =  names.stream().map(String::toUpperCase).toList();

        List<Integer> numbers1 = Arrays.asList(1,2,3,2,4,5,1);

        Set<Integer> set = new HashSet<>();

        numbers1.stream().filter(num -> !set.add(num)).forEach(System.out::println);
*/
     /*  int num =  numbers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       // System.out.println(num);

        String str = "java";

        Map<Character, Long> result3 = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));



        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer>  result4 = nums.stream().reduce(Integer::sum);

        System.out.println(result4);

        long count1 = nums.stream().filter(num1 -> num1%2 == 0).count();*/

        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

        map.put(1, "A");
        map.put(1, "B");
        System.out.println(map);

        List<String> names =
                Arrays.asList("John", "Alice", "Bob", "John", "David");
        //Remove duplicates.

        names.stream().distinct().toList();

        //Convert all names to uppercase.
        names.stream().map(String::toUpperCase).toList();
        //Sort them alphabetically.
        names.stream().sorted().toList().forEach(System.out::println);

        //Collect into a List.


    }
}
