package coreJava;

public class SumOfIntegers {
    public static void main(String[] args) {
        int num = 12345;

        int sum = 0;
       while (num > 0){
           sum = sum+ num%10;
           num = num/10;
       }
        System.out.println(sum);

       int num1 = 10;
       for(int i = 1; i <= num1; i++){
           System.out.println(i);
       }





    }
}
