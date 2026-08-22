package multithreading;

import java8Questions.Main;

public class MyThread extends  Thread{

    @Override
    public void run(){
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
