package BusinessRequirement;


class TransactionProcessingException extends Exception {}
class FinancialTransactionFaultMessage extends TransactionProcessingException {}
public class CreditCard {

    public void doFinancialTransaction() throws RuntimeException { // A
        try {
            throw new FinancialTransactionFaultMessage();
        } catch (Exception e) {
            throw new NullPointerException();
        } finally {
        }
    }
    public static void main(String[] args) {
        new CreditCard().doFinancialTransaction(); // C

    }
}
