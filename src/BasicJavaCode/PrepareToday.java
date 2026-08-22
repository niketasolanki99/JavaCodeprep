package BasicJavaCode;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrepareToday {
    public static void main(String[] args) {
        String str = "swiss";
         str = "nik";
         str = "solanki";
         String str1 = new String("niketa");
         String str2 = new String("solanki");
        System.out.println(str2 == str);
        System.out.println(str);

        Set<String> set = new HashSet<>();


        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
               // System.out.println("char " + entry.getKey());
                return;
            }
        }

    }
}
