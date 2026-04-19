package BasicJavaCode;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 3445443;
        int originalNum = num;
        int revNum = 0;

        while (num > 0){
            revNum = revNum*10 + num%10;
            num = num/10;
        }
        if (originalNum == revNum){
            System.out.println("Number is palindrome: " + revNum);
        }
        else {
            System.out.println("Not a Palindrome Number");
        }

    }
}
