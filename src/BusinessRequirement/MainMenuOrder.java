package BusinessRequirement;

public class MainMenuOrder {
    public static void main(String[] args) {
        int counter = 0;
        do {
            do {
                counter++;  //0,1,2,3, 4
            } while (counter < 3);
            break;
        } while (true);
        System.out.println(counter);
    }
}
