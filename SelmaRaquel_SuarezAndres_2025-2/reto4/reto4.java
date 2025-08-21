package SelmaRquel_SuarezAndres_2025.reto4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reto4 {

    // Crea HashMap ignorando duplicados (mantener primer valor)
    public static Map<String, Integer> mapFromPairsHashMap(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> m = new HashMap<>();
        for (Map.Entry<String, Integer> e : pares) {
            m.putIfAbsent(e.getKey(), e.getValue());
        }
        return m;
    }
}