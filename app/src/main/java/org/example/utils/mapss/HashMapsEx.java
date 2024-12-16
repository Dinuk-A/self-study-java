package org.example.utils.mapss;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is an implementation of Map class of java;s util
 * its not a part of a collection
 * use key-value pairs
 * Use immutable types for keys (like String or Integer).
 * allow one null key
 * not thread safe
 * no key duplications
 */

public class HashMapsEx {

    // 1
    public static void createHashMap() {

        // create an empty map
        HashMap<Integer, String> map1 = new HashMap<>();

        // insert data pairs
        map1.put(1, "dinuka");
        map1.put(2, "dinuka2");
        map1.put(2, "dinuka2 again"); // if same key is used again, last entered key's value is saved in map and
                                      // others before that are ignored
        map1.put(3, "   dinuka3"); // spaces are also counted
        map1.put(4, "dinuka4");
        map1.put(5, null); // can pass null

        System.out.println(map1);

        // create a new map by copying all from another map
        HashMap<Integer, String> m2 = new HashMap<>();
        m2.putAll(map1);

        System.out.println("copied map : " + m2);

        //############
        System.out.println("check equality :" + m2.equals(map1));
        
        //############
        System.out.println("check hash code : " + map1.hashCode());

    }

    // 2 retrieve values
    public static void retrieveVals() {

        HashMap<String, String> cities = new HashMap<>();
        cities.put("lk", "colombo");
        cities.put("ind", "dilhi");
        cities.put("usa", "ny");

        System.out.println("for lk: " + cities.get("lk"));
        System.out.println("for usa: " + cities.get("usa"));
        System.out.println("for russia: " + cities.get("rus")); // if the provided key is not foud it returns a null

        // can pass a default value for undefined keys
        String defaultCity = "joe";
        System.out.println("for russia now : " + cities.getOrDefault("rus", defaultCity));

        //check existance of keys
        System.out.println(cities.containsKey("ind"));
        System.out.println(cities.containsKey("jap"));

         //check existance of values
         System.out.println(cities.containsValue("col"));
         System.out.println(cities.containsValue("colombo"));

         //check sizes and others
         System.out.println(cities.size());
         System.out.println(cities.isEmpty());



    }

    // 3 remove values
    public static void removeVals() {

        HashMap<String, String> cities = new HashMap<>();
        cities.put("lk", "colombo");
        cities.put("ind", "dilhi");
        cities.put("can", "ont");
        cities.put("jap", "not tokyo");
        cities.put("china", "osaka");

        HashMap<String, String> newMap = new HashMap<>();
        newMap.putAll(cities);

        newMap.remove("ind"); // removes the value associated with this key and also returns it

        newMap.remove("jap", "not tokyo");
        // remove only if both key and value are matches

        System.out.println(newMap);

        newMap.clear();  //

        System.out.println("after clear ; " + newMap);

    }

    // 4
    public static void iterateOverMap() {
        HashMap<String, String> cities = new HashMap<>();
        cities.put("lk", "colombo");
        cities.put("ind", "dilhi");
        cities.put("can", "ont");
        cities.put("jap", "tokyo");
        cities.put("jap", "not tokyo");
        cities.put("china", "osaka");

        System.out.println(cities.keySet());
        System.out.println(cities.values());

        System.out.println(cities.entrySet());
        
    }

}
