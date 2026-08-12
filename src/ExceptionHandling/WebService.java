package ExceptionHandling;

import java.util.LinkedHashSet;
import java.util.Set;

class Message < T > {
    private T messageText;
    void setMessage(T t) {
        messageText = t;
        System.out.println("Message: setMessage");
    }
}
class ErrorMessage < S extends CharSequence > extends Message < String > {
    public ErrorMessage(S s) {}
    void setMessage(S s) {
        System.out.println("ErrorMessage: setMessage");
    }
}
public class WebService {
    public static void main(String[] args) {
        ErrorMessage < String > err = new ErrorMessage < String > ("Error");
        Set< String > attractions = new LinkedHashSet< String >();
        attractions.add("Museum of Modern Art");
        attractions.add("Times Square");
        attractions.add("Grand Central Terminal");
        attractions.add("Museum of Modern Art");
        System.out.println(attractions);
    }
}
