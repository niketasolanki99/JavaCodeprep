package BasicJavaCode;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("The Number " + number + " is even ");
        }
        else
            System.out.println("The number " + number + " is odd!!");

        //find the even numbers inside an array
        int[] array = {2,3,6,8,7,1,0};

        for(int num : array){
            if (num%2 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
