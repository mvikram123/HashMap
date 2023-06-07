import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);

        // Access and manipulate the map
        int value = map.get("key1");
        System.out.println("Value for key1: " + value);

        map.put("key2", 25);

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
//     some key features of HashMap:
//
//        Key-Value Pairs: It allows you to store key-value pairs, where each key is unique within the HashMap. The keys are used to access and retrieve the corresponding values.
//
//        Performance: HashMap provides constant-time performance for basic operations like get(), put(), containsKey(), and remove(), assuming a good hash function and proper capacity.
//
//        Null Values: HashMap allows storing null values for both keys and values. You can have at most one null key in a HashMap.
//
//        Unordered: HashMap does not maintain the order of its elements. If you need to iterate over the elements in a specific order, you can use LinkedHashMap, which maintains the insertion order.
//
//        Iteration: You can iterate over the elements of a HashMap using an iterator or by using the entrySet() method, which returns a set of key-value pairs (Map.Entry objects) that you can iterate over.
//
//        Resizeable: HashMap automatically resizes itself when the number of elements exceeds a certain threshold, allowing efficient storage and retrieval even with a large number of elements.
//
//        Thread-Unsafe: By default, HashMap is not synchronized and is not thread-safe. If you need to use a HashMap in a concurrent environment, you can use ConcurrentHashMap or synchronize access to the HashMap using external synchronization.
//
//        Overall, HashMap is widely used in Java applications for its efficient lookup and retrieval of key-value pairs.