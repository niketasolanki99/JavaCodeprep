package BusinessRequirement;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Account {
    private static Stream < String > getWords(String firstWord, String secondWord) {
        return Stream.of(firstWord, secondWord);
    }

    public static void main(String[] args) {
        Deque< String > history = new LinkedList< >();
        history.add("Java Tips");
        history.add("World News");
        history.peek();
        history.peek();
       // history.peek(); //A
        System.out.println(history);


        String answer =
                Stream.of(getWords("voyage", "rue"),
                                getWords("habitude", "quel"),
                                getWords("oui", "parfaite")) // c1
                        .flatMap(x -> x)
                                .filter(x -> !x.isEmpty())
                                        .max((a,b) -> b.length() - a.length())
                                                .get();
        System.out.println(answer.toString());
    }
}
