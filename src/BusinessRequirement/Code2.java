package BusinessRequirement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Code2 {
    public static void main(String[] args) {
        List<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("Scala");
        languageList.add("Java");
        Set<String> languageSet = new TreeSet<>(languageList);
        System.out.print(languageSet.size()); //2
        System.out.print("-" ); //-
        System.out.print(languageSet.iterator().next());  //
    }
}
