package Java17Features;

public class PatternMatching {


    public static void main(String[] args) {

        Object obj = "Hello";
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println("Explicit type Casting : "+ str.length());
        }

        Object obj1 = 100;
        if(obj1 instanceof String str){
            System.out.println("No casting required : " + str.length());
        }else {
            System.out.println("no output");
        }

       }
}
