import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

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
     * Método que combina ambos hash.
     * @param map
     * @param table
     * @return
     */
    public static Map<String, Integer> splitHash(Map<String, Integer> map, Map<String, Integer> table) {
        Map<String, Integer> combined = new Hashtable<>(hashTable);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            combined.putIfAbsent(entry.getKey(), table.getValue());
        }

        return combined;
    }



    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Integer>> listTable = List.of(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Hashtable<String, Integer> table = createHashTable(listTable);
        
        Map<String, Integer> combined = splitHash(map, table);

        System.out.println("Hashtable: " + table);
        System.out.println("Combined: " + combined);
    }

}
