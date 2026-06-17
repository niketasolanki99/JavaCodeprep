package java8Questions;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("ram", "IT", 7000),
                new Employee("Shyam", "telecom", 2000),
                new Employee("siya", "business", 700),
                new Employee("vedika", "testing", 3000),
                new Employee("ram", "telecom", 10000),
                new Employee("anshu", "testing", 3000),
                new Employee("shiv", "IT", 2000)
        );
        //group employees by dept

       Map<String, List<Employee>> result =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        // Find duplicate employee names
        Set<String> names = new HashSet<>();

        employees.stream()
                .map(Employee::getName)
                .filter(name -> !names.add(name)).toList().forEach(System.out::println);


        //Find highest salary employee
        // Find duplicate employee names
        //Sort employees by salary descending
        //
        List<Employee> sortedNamed = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        for(Employee name : sortedNamed){
            System.out.println(name.getName());

        }

       Employee maxSalaryEmp  =  employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow();
        System.out.println(maxSalaryEmp.getName() + ": " + maxSalaryEmp.getSalary());

        //Group employees by department
        Map<String, List<Employee>> dept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(dept);





        List<String>  map = employees
                .stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(emp -> emp.getValue() > 1)
                .map(Map.Entry::getKey).toList();


        List<Integer> numbers = Arrays.asList(30,56,300,23,90,101);
        int secHigh =  numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
       // System.out.println(secHigh);
        int num = numbers.stream().max(Comparator.comparingInt(e -> e)).orElseThrow();
      //  System.out.println(num);



    }
}
