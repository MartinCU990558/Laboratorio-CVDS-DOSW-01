package SelmaRquel_SuarezAndres_2025.reto4;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reto4 {

    public static Map<String, Integer> mapFromPairsHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> m = new HashMap<>();
        for (Map.Entry<String, Integer> e : pares) {
            m.putIfAbsent(e.getKey(), e.getValue());
        }
        return m;
    }

    public static Hashtable<String,Integer> mapFromPairsHashtable(List<Map.Entry<String,Integer>> pares) {
        Hashtable<String,Integer> t = new Hashtable<>();
        for (Map.Entry<String,Integer> e : pares) {
            t.putIfAbsent(e.getKey(), e.getValue());
        }
        return t;
    }

    public static Map<String,Integer> combinar(Map<String,Integer> hashMap,
                                               Hashtable<String,Integer> hashTable) {

        Map<String,Integer> base = new HashMap<>(hashMap);
        hashTable.forEach(base::put); // prioridad a Hashtable
        return base;
    }


}