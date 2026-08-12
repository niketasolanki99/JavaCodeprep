package Java8Features;


@FunctionalInterface
interface Bank{
   void payment();

   default void paymentType(){
       System.out.println("Bank Credit card");
   }

   static String printBankName(){
       return "Parent Bank";
   }

}
@FunctionalInterface
interface IndianBank{

    void payment();

    default void paymentType(){
        System.out.println("Indian Bank Credit card");
    }
}

public class DefaultMethodImpl implements Bank, IndianBank {

    @Override
    public void payment() {
        System.out.println("indBankPayment method called!!");

    }

    @Override
    public void paymentType(){
        System.out.println("Bank Credit card method called!! ");
        Bank.super.paymentType();

    }
    public static void main(String[] args) {

        DefaultMethodImpl obj = new DefaultMethodImpl();
        obj.payment();
        obj.paymentType(); //?
        System.out.println(Bank.printBankName());



    }
}
