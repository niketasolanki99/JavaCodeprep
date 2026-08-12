package BusinessRequirement;
import java.util.*;
public class CountPassedStudent {

    public static int countPassedStudents(List<Integer> marks){
        int count = 0;
        for(int mark : marks){
            if(mark >= 35){
                System.out.println("Student is passed with marks : " + mark);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> marks = List.of(40, 75, 32, 91, 55);

        int passedCount = countPassedStudents(marks);
        System.out.println("passed Student " + passedCount);

    }
}
