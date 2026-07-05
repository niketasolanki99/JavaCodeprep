package Java17Features;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "MONDAY";

        switch (day){
            case "Monday":
                System.out.println("weekday");
                break;
            case "Sunday":
                System.out.println("Weekend");
        }

        int number = 2;

        String result = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Unknown";
        };

        System.out.println(result);
    }
}
