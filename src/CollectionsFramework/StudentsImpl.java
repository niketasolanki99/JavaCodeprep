package CollectionsFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsImpl {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Niketa", 1, 230),
                new Student("ram", 2, 500),
                new Student("Bob", 3, 307),
                new Student("Alice", 4, 130)

        );
        //sort the employee based on their marks ascending order

       List<Student> sortedMarks =  students.stream()
               .sorted(Comparator.comparing(Student::getMarks)).collect(Collectors.toList());
        System.out.println(sortedMarks);


    }
}
