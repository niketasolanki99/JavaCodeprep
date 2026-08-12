package ExceptionHandling;

public class ExceptionEx2 {


    public static int test() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {

        test();


    }
}
