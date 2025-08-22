package Pareja_Lopez_Albarracin.reto4;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Reto4 {

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
}