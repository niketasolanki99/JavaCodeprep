package java8Questions;

public class Question01 {
    public static void main(String[] args) {

        int num = 10389;
        int sum =0;
        while(num >0){
             sum += num%10;  //
            System.out.println(sum);
             num = num/10;
            System.out.println(num);
        }
        for(int i =0; i < 5; i++){
            //System.out.println(i);
        }
    }
}
