package coreJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {

    String name;              // instance variable
    static String company;   // static variable

    void showName() {
        System.out.println(name);
    }

    static void showCompany() {
        System.out.println(company);
    }

}

public class CountFrequency{


    public static void main(String[] args) {

        List<String > names = List.of("Ram", "Shyam", "Ram", "Amit", "Ram", "Amit");
        Map<String , Integer> map = new HashMap<>();
        int[] arr = {10, 20, 10, 30, 20, 10};
        Employee.company = "Capgemini";
        Employee e1 = new Employee();
        e1.name = "A";
        Employee e2 = new Employee();
        e2.name = "B";

        e1.showName();
        e2.showName();

        Employee.showCompany();



    }
}
