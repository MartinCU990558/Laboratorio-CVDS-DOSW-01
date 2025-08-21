package SelmaRquel_SuarezAndres_2025.reto4;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

public class reto4 {

    public static Map<String, Integer> mapFromPairsHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> m = new HashMap<>();
        for (Map.Entry<String, Integer> e : pares) {
            m.putIfAbsent(e.getKey(), e.getValue());
        }
        return m;
    }

    public static Hashtable<String, Integer> mapFromPairsHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> t = new Hashtable<>();
        for (Map.Entry<String, Integer> e : pares) {
            t.putIfAbsent(e.getKey(), e.getValue());
        }
        return t;
    }

    public static Map<String,Integer> combinar(Map<String,Integer> hashMap,
                                               Hashtable<String,Integer> hashTable) {

        Map<String,Integer> base = new HashMap<>(hashMap);
        hashTable.forEach(base::put);
        return base;
    }

    public static Map<String,Integer> combinarFormatearImprimir(Map<String,Integer> hashMap,
                                                                Hashtable<String,Integer> hashTable) {
        Map<String,Integer> combinado = combinar(hashMap, hashTable);

        Map<String,Integer> ordenado = combinado.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (a,b) -> a, // merge function (no debería chocar tras 'combinar')
                        LinkedHashMap::new
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));
        return combinado;
    }



}