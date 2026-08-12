package BusinessRequirement;

import java.time.LocalDateTime;
import java.util.*;

class Trade{
    private String instrument;
    private int quantity;
    private double price;
    private LocalDateTime timestamp;
    private Side side;

    public Trade(String instrument, int quantity, double price, LocalDateTime timestamp, Side side) {
        this.instrument = instrument;
        this.quantity = quantity;
        this.price = price;
        this.timestamp = timestamp;
        this.side = side;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}
enum Side{
    BUY,
    SELL
}


public class ProfLossCalculator {
    public static void main(String[] args) {
        System.out.println("Running Intraday Trade P&L Calculator.\n");

        PnLProcessor processor = new PnLProcessor();
        processor.calculatePnL(null);

        /*
        Input:
            BUY AAPL @150 x10
            SELL AAPL @155 x5
        Output:
            AAPL: 25  //(155 - 150) * 5 = 25
        */

        System.out.println("Completed Intraday Trade P&L Calculator.\n");

    }
    static class PnLProcessor {
        public Object calculatePnL(List<?> trades) {
            System.out.println("In Intraday Trade P&L processor.\n");

            Map<String, Double> pnlMap = new HashMap<>();
            Map<String, Queue<Trade>> buyTrades = new HashMap<>();




            return null;
        }
    }

}
