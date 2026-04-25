package AdvanceJavaQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find the Longest subString : ");
        String str = sc.nextLine();

        int left = 0, maxLen = 0, startIndex = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);
            while (set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
        if(right-left+1 > maxLen){
                maxLen = right-left+1;
                startIndex = left;
            }
        }
        String longestSub = str.substring(startIndex, startIndex+maxLen);
        System.out.println("Longest SubString exists in the String is --> " + longestSub);
        System.out.println("Length of the Longest SubString is " + maxLen);
    }
}
