package collections;

import java.util.ArrayList;
import java.util.List;

public class ListUsingFactoryMethod {
    public static void main(String[] args) {
        List<String> list = List.of("niketa");
        List<String> list2 = List.of("A", null, "C");
        System.out.println(list2);

       List<Employee> employees = List.of(
                new Employee("Alice"),
                new Employee("bob")
        );


    }

}
