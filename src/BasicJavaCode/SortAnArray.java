package BasicJavaCode;

public class SortAnArray {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};

        for(int i = 0; i < arr.length-1; i++){  //0<5

            for(int j = 0; j < arr.length-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
