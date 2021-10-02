package Collections;
import java.util.*;

public class SortHashMap {
    static Map <String,Integer> map = new HashMap();
    public static void Sortkey(){
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
    }

