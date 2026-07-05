package ArrayaUnderstanding;

public class ArrayMatrixQuestion {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        System.out.println(bottom);
        System.out.println(right);
    }
}
