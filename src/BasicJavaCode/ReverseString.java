package BasicJavaCode;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        //using StringBuilder reverse method
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        //using for loop
       /* for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }*/
        System.out.println("Reverse of the Input String " + sb);

        String str1 = "Java is a object oriented language";
        String[] words = str1.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
