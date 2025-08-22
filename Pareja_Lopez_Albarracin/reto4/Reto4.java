import java.util.*;

public class Reto4 {

    public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> par : lista) {
            tabla.putIfAbsent(par.getKey(), par.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinateStructures(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
        Map<String, Integer> combinateMap = new HashMap<>(hashMap);
        combinateMap.putAll(hashTable);
        return combinateMap;
    }

    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

}
