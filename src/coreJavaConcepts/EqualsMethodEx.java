package coreJavaConcepts;

import java.util.Objects;

class Employee{
   private String name;

   public Employee(String name){
       this.name = name;
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hashCode(name);
    }*/
}
public class EqualsMethodEx {
    public static void main(String[] args) {

        Employee e1 = new Employee("java");
        Employee e2 = new Employee("java");
        System.out.println(e1.equals(e2));
    }
}
