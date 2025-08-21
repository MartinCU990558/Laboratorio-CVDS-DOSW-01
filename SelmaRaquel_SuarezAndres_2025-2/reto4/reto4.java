package SelmaRquel_SuarezAndres_2025.reto4;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



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
                        (a,b) -> a,
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

        ordenado.forEach((k,v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        return ordenado;
    }

    public static void main(String[] args) {
        List<Map.Entry<String,Integer>> A = List.of(
                Map.entry("oro",5), Map.entry("plata",3), Map.entry("oro",7), Map.entry("diamante",10)
        );
        List<Map.Entry<String,Integer>> B = List.of(
                Map.entry("plata",8), Map.entry("rubí",4), Map.entry("oro",12), Map.entry("esmeralda",6)
        );

        var hmap = mapFromPairsHashMap(A);
        var htab = mapFromPairsHashtable(B);
        combinarFormatearImprimir(hmap, htab);
    }
}