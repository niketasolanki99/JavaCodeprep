package BusinessRequirement;

import java.util.Arrays;

public class Code1 {
    public static void main(String[] args) {
        String[] numbers = new String[] { "2", "6", "25", "45" };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int passengers = 113;
        int vehicle = 5;

        int comp1 = passengers/vehicle; //22
        int comp2 = passengers%vehicle; // 3
        int result = comp2 + comp1*vehicle; // 3 + 22*5 100
        System.out.println(result);


    }
}
