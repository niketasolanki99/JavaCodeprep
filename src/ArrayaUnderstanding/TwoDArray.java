package ArrayaUnderstanding;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];

        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2]=  30;
        marks[1][0] = 40;
        marks[1][1] = 28;
        marks[1][2]=  33;
        marks[2][0] = 66;
        marks[2][1] = 84;
        marks[2][2]=  38;

        for(int row = 0; row<marks.length; row++){

            for(int col = 0; col<marks[row].length; col++){
                System.out.print(marks[row][col] + ", ");
            }
            System.out.println();
        }

        int[][] array = {
                {1,2,3,4},
                {1,4,5,67},
                {6,2,8,0},
                {3,7,0,12,34}
        };

    }
}
