package BusinessRequirement;

public class Review {

    static boolean portable(int rating) {
        System.out.print("portable ");
        return rating > 6 ? true : false;
    }

    static boolean reliable(int rating) {
        System.out.print("reliable ");
        return rating > 6 ? true : false;
    }

    static boolean userFriendly(int rating) {
        System.out.print("user-friendly ");
        return rating > 6 ? true : false;
    }

    static boolean selfDocumenting(int rating) {
        System.out.print("self-documenting ");
        return rating > 6 ? true : false;
    }
    public static void main(String[] args) {
        boolean result = portable(5) | userFriendly(4) & reliable(7) ^ selfDocumenting(8);
        System.out.print(result);
    }
}






