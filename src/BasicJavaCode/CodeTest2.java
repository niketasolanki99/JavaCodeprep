package BasicJavaCode;

public class CodeTest2 {

    public static void main(String[] args) {
        int a = 20; int b = 20;
        char ch = 'g';
        char ch2 = 'h';

        System.out.println(a == b);
        System.out.println(ch == ch2);

        String str1 = "niketa";
        String str2 = new String("niketa");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

    }
}
