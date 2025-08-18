import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.List;

public class Reto4 {
    public static Hashtable <String, Integer> createHashTable(List<AbstractMap.SimpleEntry<String, Integer>> list){
        Hashtable<String, Integer> table = new Hashtable<>();

        for (AbstractMap.SimpleEntry<String, Integer> even : list) {
            table.putIfAbsent(even.getKey(), even.getValue());
        }
        return table;
    }



    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Integer>> listTable = List.of(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Hashtable<String, Integer> table = createHashTable(listTable);
        System.out.println("Hashtable: " + table);
     
    }

}
