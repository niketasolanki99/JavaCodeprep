package BasicJavaCode;

import java.util.Scanner;

public class PlayWithNumbers {
    public static void main(String[] args) {
       // print the numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
        System.out.println("The reverse of the N");
        // Then print reverse (N to 1)
        for(int j = N; j >=1; j--){
            System.out.println(j);
        }
        System.out.println("evens");
        // Then print only even numbers

        for(int k = 1; k <= N; k++){
            if (k%2 == 0){
                System.out.println("even numbers");
                System.out.println(k);
            }
        }
    }
}
