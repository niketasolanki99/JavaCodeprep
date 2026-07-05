package CollectionsFramework;

import java.util.HashMap;

public class HashMapImpl {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Niketa");
        map.put(101, "Solanki");
        map.put(null, "Agra");
        System.out.println(map);
    }
}
