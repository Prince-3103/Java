package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args){

        // Map -> stores data in key-value pairs
        // HashMap -> no order, unique keys, values can repeat

        Map<Integer, String> cricketers = new HashMap<>();

        cricketers.put(7,"MS Dhoni");
        cricketers.put(18, "Virat Kohli");
        cricketers.put(45, "Rohit Sharma");
        cricketers.put(31, "Ruturaj Gaikwad");
        cricketers.put(93, "Jaspret Bumrah");

        cricketers.put(18, "Priyansh Arya");  
        // duplicate key -> old value replaced (18 → Virat Kohli removed)

        System.out.println(cricketers);
        // keySet() -> returns all keys

        // Loop through keys
        System.out.println(cricketers.keySet());
        for(int key : cricketers.keySet()){
            System.out.println(key +" "+ cricketers.get(key));
        }
    }
}
