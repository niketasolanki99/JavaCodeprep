package interviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code1 {

    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Long> map1 = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(map1);

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
