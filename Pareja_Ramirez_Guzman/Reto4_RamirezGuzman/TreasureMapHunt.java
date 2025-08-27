package Pareja_Ramirez_Guzman.Reto4_RamirezGuzman;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Involucra todo el proceso relacionado a los dos mapas
 * que ayudarán a abrir el cofre del tesoro.
 */
public class TreasureMapHunt {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        hashMap.putIfAbsent("oro", 5);
        hashMap.putIfAbsent("plata", 3);
        hashMap.putIfAbsent("oro", 7);
        hashMap.putIfAbsent("diamante", 10);

        hashTable.putIfAbsent("plata", 8);
        hashTable.putIfAbsent("rubí", 4);
        hashTable.putIfAbsent("oro", 12);
        hashTable.putIfAbsent("esmeralda", 6);

        Map<String, Integer> mergeMap = new HashMap<>(hashMap);
        mergeMap.putAll(hashTable);

        mergeMap.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey().toUpperCase(), Map.Entry::getValue, (v1, v2) -> v2
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

}