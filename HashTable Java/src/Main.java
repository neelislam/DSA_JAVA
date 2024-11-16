import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // Create a Hashtable to store key-value pairs
        // Key is an Integer, and value is a String
        Hashtable<String, String> table = new Hashtable<>();

        // Insert key-value pairs into the Hashtable
        table.put("100", "Spongebob");
        table.put("123", "Ironman");
        table.put("321", "BabaJi");
        table.put("555", "Elon Musk");
        table.put("777", "Trump");


        //table.remove(321);

        // Iterate over the keys in the Hashtable
        for (String key : table.keySet()) {
            // Print each key and its corresponding value
            System.out.println(key.hashCode() %21+ "\t" + key + "\t" + table.get(key));
        }
    }
}








/*
Hashtable in Java
A Hashtable in Java is a data structure that implements the Map interface and is used to store key-value pairs. It is part of the java.util package and is a synchronized collection, which means it is thread-safe. The keys and values in a Hashtable are both objects, and the keys must be unique. It uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.

Why We Use Hashtable
We use Hashtable for its efficiency in storing and retrieving data using keys. It is especially useful when there are a large number of entries, and we need quick access to them. The time complexity for the basic operations (insertion, deletion, lookup) is on average O(1), making it very efficient.

Advantages of Hashtable
Fast Access: It provides constant time complexity on average for basic operations like add, remove, and lookup.

Thread-Safe: It is synchronized, making it safe for use in a multithreaded environment.

No Null Keys/Values: It does not allow null keys or values, which helps prevent errors related to null references.

Disadvantages of Hashtable
Synchronized Overhead: The synchronization overhead can make it slower compared to non-synchronized collections like HashMap in a single-threaded environment.

No Null Keys/Values: It does not allow null keys or values, which can be restrictive in certain cases.

Iteration Performance: The iteration over its entries can be slower compared to other data structures like HashMap due to its thread-safe nature.







 */
