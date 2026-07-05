package multithreading;
class Counter{
    public int count = 0;

    public void increment(){

       // System.out.println("Value of the count before increment: " + count +" Name: " + Thread.currentThread().getName());
        synchronized (this){
            count++;
        }
        //System.out.println("Increase the count: " + count + " Name: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException{
        Counter C1 = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++){
                C1.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++){
                C1.increment();
            }
        });
        t1.start();
        t2.start();
        System.out.println(t2.getState());

        t1.join();
        t2.join();

        System.out.println(C1.count);
    }
}
