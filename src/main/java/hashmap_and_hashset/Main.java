package hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//
//        // hashSet
//        HashSet<String> set = new HashSet<>();
//        set.add();
//        set.remove();
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//        }
//
//        for (String s: set) {}
//
//
//        //map
//        HashMap<Integer, String> map = new HashMap<>();
//        map.get();
//        map.put();
    }

    // foreach

    public void iterateUsingEntrySet(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void iterateUsingKeySetAndForeach(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public void iterateValues(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

    // iterators

    public void iterateUsingIteratorAndEntry(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void iterateUsingIteratorAndKeySet(Map<String, Integer> map) {
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }

    public void iterateUsingIteratorAndValues(Map<String, Integer> map) {
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value :" + value);
        }
    }
}
