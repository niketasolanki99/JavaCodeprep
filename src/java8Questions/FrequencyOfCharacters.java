package java8Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbc";

      Map<Character, Long> countFreq =  str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        Map<Character, Integer> map = new HashMap<>();
        Character uni = countFreq.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().map(Map.Entry::getKey).orElse(null);

       // System.out.println(uni);


        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
     //   System.out.println(map);

    }
}
