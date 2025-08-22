import java.util.*;

public class Reto4 {

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> listaHashMap = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        List<Map.Entry<String, Integer>> listaHashTable = List.of(
                Map.entry("plata", 8),
                Map.entry("rubí", 4),
                Map.entry("oro", 12),
                Map.entry("esmeralda", 6)
        );

        Map<String, Integer> hashMap = createHashMap(listaHashMap);
        Map<String, Integer> hashTable = crearHashTable(listaHashTable);

        Map<String, Integer> combinado = combinateStructures(hashMap, hashTable);

        Map<String, Integer> combinadoMayus = convertToMayus(combinado);

        imprimirOrdenado(combinadoMayus);
    }

    public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> par : lista) {
            tabla.putIfAbsent(par.getKey(), par.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> createHashMap(List<Map.Entry<String, Integer>> list) {
    Map<String, Integer> map = new HashMap<>();
    for (Map.Entry<String, Integer> par : list) {
        map.putIfAbsent(par.getKey(), par.getValue());
    }
        return map;
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


    public static Map<String, Integer> convertToMayus(Map<String, Integer> mapa) {
        Map<String, Integer> mapMayus = new HashMap<>();
        for (Map.Entry<String, Integer> e : mapa.entrySet()) {
            mapMayus.put(e.getKey().toUpperCase(), e.getValue());
        }
        return mapMayus;
    }

}
