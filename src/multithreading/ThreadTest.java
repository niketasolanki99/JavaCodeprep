package multithreading;

class Demo1 {

    public synchronized void method1() {
        System.out.println("Method1");
       // method2();
    }

    public synchronized void method2() {
        System.out.println("Method2");
      //  method1();
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        Thread T1 = new Thread(() -> obj.method1());
        Thread T2 = new Thread(() -> obj.method2());
        T1.start();
        T2.start();
    }
}
