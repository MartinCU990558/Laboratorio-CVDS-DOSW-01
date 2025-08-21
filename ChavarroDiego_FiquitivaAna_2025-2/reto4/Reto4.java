

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {
        
    }

    
    public static Map<String,Integer> crearMapaHashMap(List<AbstractMap.SimpleEntry<String,Integer>> lista) {
        
        return new HashMap<>();
    }

    public static Map<String,Integer> crearMapaHashTable(List<AbstractMap.SimpleEntry<String,Integer>> lista) {
    Map<String,Integer> mapa = new Hashtable<>();
    for (AbstractMap.SimpleEntry<String,Integer> par : lista) {
        mapa.putIfAbsent(par.getKey(), par.getValue()); // sincronizado
    }
    return mapa;
}

public static Map<String,Integer> combinarMapas(Map<String,Integer> hashMap, Map<String,Integer> hashTable) {
    Map<String,Integer> combinado = new HashMap<>(hashMap);
    combinado.putAll(hashTable);

    return combinado.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (v1, v2) -> v2,
            LinkedHashMap::new
        ));
}


  
    public static void imprimirMapa(Map<String,Integer> mapa) {
        
    }
}

