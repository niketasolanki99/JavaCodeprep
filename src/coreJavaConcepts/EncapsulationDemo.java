package coreJavaConcepts;

class Payment{
    private int accNo;
    private String name;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.setName("niketa");
        payment.setAccNo(23456);
        System.out.println(payment.getAccNo() + ", " + payment.getName());

    }
}
