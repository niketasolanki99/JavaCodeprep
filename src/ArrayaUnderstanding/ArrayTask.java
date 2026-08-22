package ArrayaUnderstanding;

public class ArrayTask {
    public static void main(String[] args) {

        //collection of similar data type.
        //  int[] array = {1,2,3,4,5};

        int[] rollNum = new int[10];
        rollNum[1] = 111;
        int x = 101;
        for(int i = 0; i < rollNum.length; i++){
            rollNum[i] = x;
            x++;
        }
        System.out.println("hello world");
        for (int i : rollNum){
            System.out.println(i);
        }
    }
}
