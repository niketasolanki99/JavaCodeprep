package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        int current = 5;
        List< Integer > numbers = new ArrayList< >();
        do {
            numbers.add(current);
            for (Integer x: numbers) current -= 1;
        } while (current > 0);
        System.out.println(numbers.size());
    }
}
