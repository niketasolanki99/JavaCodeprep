package ExceptionHandling;

public class Record1 {

    public static void main(String[] args) {

        Thread r1 = new Thread(() -> System.out.println("Hi"));
        r1.start();

    }
}
