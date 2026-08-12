package BusinessRequirement;

import collections.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employees{

    int salary;
    String name;

    public Employees(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Employees{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
public class FindSalary {

    public static void main(String[] args) {
        List<Employees> employee = Arrays.asList(
                new Employees(56000, "Akhil"),
                new Employees(45000, "Manas"),
                new Employees(67000, "Amit"),
                new Employees(95000, "Niketa")
        );

      //List<Employees> result = employee.stream().filter(emp ->emp.getSalary() > 50000).toList();
      List<Employees> result = new ArrayList<>();

      for(Employees emp : employee){
          if (emp.getSalary() > 50000){
              result.add(emp);
          }
      }
      System.out.println(result);
       /* Create an empty result list.
       Traverse all employees.
       If employee salary > 50000, add employee to result.
       Return the result lis*/


    }

}
