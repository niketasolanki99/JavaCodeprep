package BasicJavaCode;

import java.util.Scanner;

public class CheckTheNumbers {
    public static void main(String[] args) {

        //to find the largest number between the below numbers i'll use the if-else block to check and find the match
       //always think about the local condition u are using || OR --> if one condition is correct it'll return true
      // && returns true when both condition are  true


        int a = 200, b = 100, c = 30;
        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }


    }
}