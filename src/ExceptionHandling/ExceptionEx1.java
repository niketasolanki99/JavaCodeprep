package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class ExceptionEx1 {
    public static void main(String[] args) {

        PriorityQueue < String > orderIds = new PriorityQueue< String >();
        orderIds.add("A23563");
        orderIds.add("A15362");
        orderIds.add("A35263");
        double average = 2f; // A
        //float amount = 2.0; // B
        double grade = 2.0; // C
        float result = 2f; // D
        String order;
        while ((order = orderIds.poll()) != null) {
            System.out.print(order + " ");
        }

        try {
            FileReader reader = new FileReader("file.txt");
            int i = reader.read();
        } catch(IOException e) {
            System.out.println("I/O error occurred.");
        } finally {
            System.out.println("Executing finally block.");
        }
    }
}
