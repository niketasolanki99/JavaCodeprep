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
    }
}
