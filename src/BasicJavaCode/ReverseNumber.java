package BasicJavaCode;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12321;
        int originalNum = num;
        int revNum = 0;
        while (num != 0){
            revNum = num%10 + revNum*10;
            num /=10;
        }
        if (revNum == originalNum){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
        System.out.println(revNum);

    }
}
