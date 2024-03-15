package Hasmap;

import java.util.HashMap;
import java.util.Map;

public class nameAge {
    public static void main(String[] args) {
        //syntax
        Map<String, Integer> mp = new HashMap<>();
        // adding element
        mp.put("Akash" , 21);
        mp.put("Lav" , 16);
        mp.put("Ram" , 42);
        mp.put("Sam" , 22);
        mp.put("Gobinda", 20);
        // Getting value of key from the HasMap
        System.out.println(mp.get("Akash")); //  value exist
        System.out.println(mp.get("Rahul"));// value not exist so null
        // changing and updating value of Key
        mp.put("Akash" , 23);
        System.out.println(mp.get("Akash"));
        // remove a pair from hasMap
        System.out.println(mp.remove("Akash")); // 23
        // if key does not exist remove will return null
        System.out.println(mp.remove("Riya")); // null
        System.out.println(mp);

        // checking key is or not present in Map
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Sam"));
        // Enter if not present in key
        mp.putIfAbsent("Yashika" , 16); // will enter
        mp.putIfAbsent("Sam" , 25) ; // will not enter

        // get all key values
        System.out.println(mp.keySet());

        // get all values in the HashMap
        System.out.println(mp.values());

        // get all entries in the HashMap
        System.out.println(mp.entrySet());


        //Traversing all entries of Hashmap - multiple methods
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d \n",key,mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String , Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(), e.getValue());
        }
        System.out.println();
        


        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(), e.getValue());
        }

    }
}

