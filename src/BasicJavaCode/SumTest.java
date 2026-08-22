package BasicJavaCode;

import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        int num = 12345;
        int revNum = 0;
        int sum = 0;
        /*while (num > 0){
            sum = sum + num%10; //5,
            num = num/10; //1
        }*/

        while (num != 0){
            revNum = revNum*10 + num%10;
            num = num/10;

        }
        System.out.println("the reverse of the number is : " + revNum);


        System.out.println("The Sum of the number: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }


    }
}
