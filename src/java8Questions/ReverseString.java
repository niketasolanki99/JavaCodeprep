package java8Questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "defect";

        String original = str;
       // int strLen = str.length()-1;
        String revStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        System.out.println(revStr);

        if(original.equals(revStr)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

       }



}
