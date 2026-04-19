package BasicJavaCode;

public class ReverseString {
    public static void main(String[] args) {
        String str = "defect";

        String original = str;
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
