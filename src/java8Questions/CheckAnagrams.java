package java8Questions;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);   //(ch, 0) -- means count the value of char by default it's 0, then it'll be one
        }
        for(char ch : str2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);
            if (map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));





    }
}
