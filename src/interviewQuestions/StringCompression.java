package interviewQuestions;

public class StringCompression {

    public static void main(String[] args) {
        String str = "aaabbc"; //output : a3b2c

        StringBuilder sb = new StringBuilder(); // To build the compressed string
        int count = 1; // Initialize counter for consecutive characters

        // Traverse the string starting from second character
        for (int i = 1; i <= str.length(); i++) {
            // If current character is same as previous, increment count
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append previous character
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1; // Reset count for next character
            }}
        System.out.println(sb.toString());
    }
}
