package reto4;

import java.util.*;
import java.util.stream.*;

public class Reto4 {

    static HashMap<String, Integer> guardarEnHashMap(List<Map.Entry<String, Integer>> pares) {
        return pares.stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (primero, ignorado) -> primero,
                HashMap::new
        ));
    }

 
    static Hashtable<String, Integer> guardarEnHashTable(List<Map.Entry<String, Integer>> pares) {
        return pares.stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (primero, ignorado) -> primero,
                Hashtable::new
        ));
    }

    
    static Map<String, Integer> combinado(HashMap<String, Integer> map, Hashtable<String, Integer> table) {
        return Stream.concat(map.entrySet().stream(), table.entrySet().stream())
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue(),
                        (valorMap, valorTable) -> valorTable, 
                        HashMap::new
                ));
    }

    static void imprimirFinal(HashMap<String, Integer> map, Hashtable<String, Integer> table) {
        Map<String, Integer> resultado = combinado(map, table);

        resultado.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(), e.getValue())) 
                .sorted(Map.Entry.comparingByKey()) 
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

    public static void main(String[] args) {
      
        List<Map.Entry<String, Integer>> listaHashMap = List.of(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<Map.Entry<String, Integer>> listaHashTable = List.of(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        HashMap<String, Integer> mapa = guardarEnHashMap(listaHashMap);
        Hashtable<String, Integer> tabla = guardarEnHashTable(listaHashTable);

        imprimirFinal(mapa, tabla);
    }
}
