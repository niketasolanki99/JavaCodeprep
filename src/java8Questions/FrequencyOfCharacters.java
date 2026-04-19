package java8Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbc";

        Map<Character, Long> countFreq =  str.
                chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.
                        groupingBy(ch -> ch, Collectors.counting()));
        System.out.println("frequency of chars inside string is : " + countFreq);

        //using for loop
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    }
}
