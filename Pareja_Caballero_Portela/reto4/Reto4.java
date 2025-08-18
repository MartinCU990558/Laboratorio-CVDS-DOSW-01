import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Reto4 {
    public static Map<String, Integer> hash(List<Map.Entry<String, Integer>> pairs) {

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
    
     public static Map<String, Integer> splitHash(HashMap<String, Integer> map, Hashtable<String, Integer> table){
        Map<String, Integer> combined = new HashMap<>(map);
        
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            combined.put(entry.getKey(), entry.getValue());
        }
        return combined;
    }

    /**
     * Metodo para volver en mayusculas las llaves
     * @param map
     */
    public static void toUpperCaseKeys(Map<String, Integer> map){
        map.forEach((k, v) -> System.out.println(k.toUpperCase() + " -> " + v));
    }


    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> list = Arrays.asList(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
    
        );
            Map<String, Integer> result = hash(list);
            toUpperCaseKeys(result);
    }
}
