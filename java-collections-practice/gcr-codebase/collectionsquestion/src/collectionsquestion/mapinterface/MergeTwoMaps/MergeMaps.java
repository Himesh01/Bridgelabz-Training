package collectionsquestion.mapinterface.MergeTwoMaps;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> m1,
            Map<String, Integer> m2) {

        Map<String, Integer> result = new HashMap<>(m1);

        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            result.put(key, result.getOrDefault(key, 0) + value);
        }

        return result;
    }

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);

        Map<String, Integer> merged = mergeMaps(map1, map2);

        System.out.println("Merged: " + merged);
    }
}