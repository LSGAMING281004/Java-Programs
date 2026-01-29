import java.util.HashMap;
import java.util.Map;
/*
🔑 Major Types of Map in Java
1. HashMap
Stores data in hash table.

No ordering of keys/values.

Allows one null key and multiple null values.

Fast for insert, search, and delete (average O(1)).

2. LinkedHashMap
Maintains insertion order of keys.

Slightly slower than HashMap due to ordering.

Allows one null key and multiple null values.

Useful when predictable iteration order is required.

3. TreeMap
Implements NavigableMap and stores keys in sorted order (natural or custom comparator).

Does not allow null keys (if natural ordering is used).

Useful for range queries and ordered data.

4. Hashtable
Legacy class, synchronized (thread-safe).

Does not allow null keys or null values.

Slower compared to modern alternatives like ConcurrentHashMap.

5. EnumMap
Specialized map for enum keys.

Very efficient and compact.

Maintains natural order of enum constants.

6. WeakHashMap
Keys are stored as weak references.

When a key is no longer referenced elsewhere, its entry is automatically removed.

Useful for memory-sensitive caches.

7. ConcurrentHashMap
Thread-safe implementation for concurrent environments.

Allows high concurrency with minimal locking.

Does not allow null keys or null values.

Preferred 
*/
// This is an example of hash map in java code
public class HashMapDemo {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("Initial Map: " + map);

        // 3. Retrieve a value by key
        String fruit = map.get(2);
        System.out.println("Value at key 2: " + fruit);

        // 4. Update a value
        map.put(2, "Blueberry"); // replaces Banana
        System.out.println("After updating key 2: " + map);

        // 5. Remove a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 6. Check if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1));

        // 7. Check if a value exists
        System.out.println("Contains value 'Date'? " + map.containsValue("Date"));

        // 8. Iterate through keys
        System.out.println("Iterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 9. Iterate through values
        System.out.println("Iterating over values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 10. Iterate through entries (key-value pairs)
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 11. Size of the map
        System.out.println("Size of map: " + map.size());

        // 12. Clear all entries
        map.clear();
        System.out.println("After clearing: " + map);
    }
}


