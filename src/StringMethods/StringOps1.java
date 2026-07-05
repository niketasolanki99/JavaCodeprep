package StringMethods;

public class StringOps1 {

    public static void main(String[] args) {

        var name1 = "hii";
        name1 = "ihh";

        System.out.println(name1);

        String city = "paris";
        String str1 = " ";
        String str2 = "";

        System.out.println(city.isBlank() + ", " + str1.isBlank() + ", " + str2.isBlank());
        System.out.println(city.isEmpty() + ", " + str1.isEmpty() + ", " + str2.isEmpty());

        String name = "   Niketa Solanki  ";
        System.out.println(name.stripTrailing());
        System.out.println(name.stripLeading());
        System.out.println(name.trim());

        String address = "           south-city 2 sector 49         ";
        System.out.println(address.trim());

        String state = new String("Haryana");
        String s2 = state.intern();
        String s3 = "Haryana";

        System.out.println(state == s2);
        System.out.println(s3 == s2);

    }
}
