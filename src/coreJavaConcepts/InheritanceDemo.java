package coreJavaConcepts;

class Bank{
    public void payments(){
        System.out.println("Payment done!!");
    }
}

class HDFC extends Bank{

    @Override
    public void payments(){
        System.out.println("Payment done By HDFC Bank");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Bank bank = new HDFC();
        bank.payments();

    }
}
