package AdvanceJavaQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int left = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);

            while (set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right-left+1);
        }
        System.out.println(maxLen);
    }
}
