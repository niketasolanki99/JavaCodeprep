package multithreading;


class Inventory{

   private int stock = 100;

   synchronized void purchase(int quantity){
       if (stock >= quantity){
           stock -= quantity;
           System.out.println(
                   Thread.currentThread().getName()
                           + " purchased "
                           + quantity
                           + " items. Remaining stock = "
                           + stock
           );
       }else {
           System.out.println( Thread.currentThread().getName()
                   + " : Insufficient stock.");
       }
       System.out.println(Thread.currentThread().getName() + ", " + stock);

   }

   int getStock(){
    return stock;
   }

}
public class SynchronizedExample {
    public static void main(String[] args) {
        Inventory obj = new Inventory();
        Thread T1 = new Thread(() -> {

            obj.purchase(40);
        }, "Customer A");
        Thread T2 = new Thread(() -> {

            obj.purchase(40);
        }, "Customer B");

        Thread T3 = new Thread(() -> {
            obj.purchase(40);
        }, "Customer C");

        T1.start();
        T2.start();
        T3.start();
    }
}
