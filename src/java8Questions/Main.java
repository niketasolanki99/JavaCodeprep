package java8Questions;

import java.util.Map;

interface Bank {
    public void pay();
}

interface Payment{
    public void pay();
}
//If a class implements two interfaces that each have the same default method, a compilation
//error will occur because the compiler cannot determine which default method to inherit.
//To resolve this, the class must explicitly override the default method and provide its own implementation,

public class Main implements Bank, Payment{

    @Override
    public void pay() {
        System.out.println("This is pay method");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.pay();
    }
}
