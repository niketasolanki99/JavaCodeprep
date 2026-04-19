package java8Questions;

import java.util.HashMap;
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
        System.out.println("First non-repeated char : " + nonRepChar);

        //using for loop frequency and first-non repeated char
        Map<Character, Integer> map1 = new HashMap<>();
        for(char ch : str.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeated char : " + entry.getKey());
                break;
            }
        }






    }
}
