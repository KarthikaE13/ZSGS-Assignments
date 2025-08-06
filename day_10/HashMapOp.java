package day_10;

import java.util.*;

public class HashMapOp {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
        map.put(4, "Yellow");
        System.out.println("HashMap: " + map);

        // 2. Count the number of key-value mappings in a map
        System.out.println("Size of HashMap: " + map.size());

        // 3. Copy all mappings from the specified map to another map
        HashMap<Integer, String> copiedMap = new HashMap<>();
        copiedMap.putAll(map);
        System.out.println("Copied HashMap: " + copiedMap);

        // 4. Remove all of the mappings from a map
        map.clear();
        System.out.println("Map after clear(): " + map);

        // 5. Check whether a map is empty or not
        System.out.println("Is map empty? " + map.isEmpty());

        
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");

        // 6. Get a shallow copy of a HashMap instance
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map.clone();
        System.out.println("Shallow copy: " + shallowCopy);

        // 7. Test if a map contains a mapping for the specified key
        System.out.println("Map contains key 2? " + map.containsKey(2));

        // 8. Test if a map contains a mapping for the specified value
        System.out.println("Map contains value 'Blue'? " + map.containsValue("Blue"));

        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println("Entry set: " + entrySet);

        // 10. Get the value of a specified key in a map
        System.out.println("Value of key 3: " + map.get(3));
    }
}

