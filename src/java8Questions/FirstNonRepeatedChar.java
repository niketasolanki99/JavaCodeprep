package java8Questions;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "swiss";

       Character nonRepChar =  str.chars()
               .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1)
                .findFirst()
                .map(Map.Entry::getKey).orElseThrow(RuntimeException::new);
        System.out.println(nonRepChar);






    }
}
