package multithreading;

public class NumberPrinter implements Runnable{

    static int number = 1;
    Object object;

    public NumberPrinter(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (number <= 20){
            if(number%2 == 0 && Thread.currentThread().getName().equals("even")){

                synchronized (object){
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + "value " + number);
                number++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if(number%2 != 0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + "value " + number);
                    number++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();
        Runnable r1 = new NumberPrinter(lock);
        Runnable r2 = new NumberPrinter(lock);

        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();

    }
}
