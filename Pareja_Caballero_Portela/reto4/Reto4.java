
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Reto4 {
    /**
     * Método que crea un hash table.
     * @param list
     * @return
     */
    public static Hashtable <String, Integer> createHashTable(List<AbstractMap.SimpleEntry<String, Integer>> list){
        Hashtable<String, Integer> table = new Hashtable<>();

        for (AbstractMap.SimpleEntry<String, Integer> even : list) {
            table.putIfAbsent(even.getKey(), even.getValue());
        }
        return table;
    }
    
    /**
     * Método que crea un hashMap.
     */
    public static Map<String, Integer> hash(List<AbstractMap.SimpleEntry<String, Integer>> pairs) {
        Map<String, Integer> map = pairs.stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (v1, v2) -> v1, 
            HashMap::new
            ));
        return map;
    }

    /**
     * Método que combina ambos hash.
     * @param map
     * @param table
     * @return
     */  
    public static Map<String, Integer> splitHash(Map<String, Integer> map, Hashtable<String, Integer> table){
        Map<String, Integer> combined = new HashMap<>(map);
        
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            combined.put(entry.getKey(), entry.getValue());
        }
        return new TreeMap<>(combined);
    }

    /**
     * Método que ordena un mapa con las claves de forma ascendente.
    */
    public static void printSortedByKey(Map<String, Integer> map) {
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> 
                System.out.println("• Clave: " + entry.getKey() + " | Valor: " + entry.getValue())
            );
    }

    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Integer>> listMap = List.of(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<AbstractMap.SimpleEntry<String, Integer>> listTable = List.of(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Map<String, Integer> map = hash(listMap);      
        Hashtable<String,Integer> table = createHashTable(listTable); 

        Map<String,Integer> combined = splitHash(map, table);

        printSortedByKey(combined);
    }
}
