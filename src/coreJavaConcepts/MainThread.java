package coreJavaConcepts;

public class MainThread extends Thread{
    int number;
    public static void printEven(int number){

        for(number = 0; number <= 20; number++){
            if(number%2 == 0){
                System.out.println("Even : " + number);
            }
        }
    }

    public static void printOdd(int number){
        for(number = 0; number <= 20; number++){
            if(number%2 != 0){
                System.out.println("Odd: " + number);
            }
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printEven(20));

        Thread thread2 = new Thread(() -> printOdd(20));

        thread1.start();
        thread2.start();
    }


}
