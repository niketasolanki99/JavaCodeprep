package multithreading;


public class ThreadUsingLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    for (int i =1; i <=20; i++) {
                        if (i % 2 == 0) {
                            System.out.println( Thread.currentThread().getName() +" Even number: " + i);
                        }
                    }
                }
        );
        thread.start();

        Thread thread1 = new Thread(
                () -> {
                    for(int i = 1; i<=20; i++){
                        if(i%2 != 0){
                            System.out.println(Thread.currentThread().getName() + " Odd numbers " + i );
                        }
                    }
                }
        );
        thread1.start();
        System.out.println(thread1.getState());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
