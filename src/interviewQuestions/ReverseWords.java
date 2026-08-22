package interviewQuestions;

public class ReverseWords {

    public static void main(String[] args) {
        String str = "Hello World from Java";

        String[] word = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = word.length-1; i >= 0; i --){
            sb.append(word[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());

    }



}
