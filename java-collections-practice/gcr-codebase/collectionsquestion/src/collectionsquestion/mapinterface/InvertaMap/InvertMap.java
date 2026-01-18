package collectionsquestion.mapinterface.InvertaMap;

import java.util.*;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {

        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            inverted.putIfAbsent(value, new ArrayList<>());

            inverted.get(value).add(key);
        }

        return inverted;
    }

    public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        System.out.println("Original: " + input);

        Map<Integer, List<String>> result = invertMap(input);

        System.out.println("Inverted: " + result);
    }
}