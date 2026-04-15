package BasicJavaCode;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,4,5};

        for(int i =0; i < arr1.length-1; i++){
            for(int j =0; j < arr1.length-i-1; j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        for(int num : arr1){
            System.out.print(num + " ");
        }

    }
}
