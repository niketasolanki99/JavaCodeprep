package multithreading;

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(
                () -> {
                   System.out.println("Inside the method: " + Thread.currentThread().getState());
                    System.out.println("Main Thread state: " +mainThread.getState());
                }
        );

        System.out.println(thread.getState());
        thread.start();
        Thread.sleep(1000);
        System.out.println(thread.getState());

    }
}
