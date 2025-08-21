package Idarraga_Estupinan.Reto4;

import java.util.*;

public class Reto4 {

    public static Map<String, Integer> crearMapaHashMap(List<Map.Entry<String, Integer>> entradas) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> entrada : entradas) {
            mapa.putIfAbsent(entrada.getKey(), entrada.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> crearMapaHashTable(List<Map.Entry<String, Integer>> entradas) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> entrada : entradas) {
            tabla.putIfAbsent(entrada.getKey(), entrada.getValue());
        }
        return tabla;
    }

    public static Map<String, Integer> combinarMapas(Map<String, Integer> mapaHashMap, Map<String, Integer> mapaHashTable) {
        Map<String, Integer> mapaFinal = new HashMap<>(mapaHashMap);
        for (Map.Entry<String, Integer> entrada : mapaHashTable.entrySet()) {
            mapaFinal.put(entrada.getKey(), entrada.getValue());
        }
        return mapaFinal;
    }
    public static void imprimirMapaMayusculasOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet()
                .stream().sorted(Map.Entry.comparingByKey());

    }


    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> entradasHash = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<Map.Entry<String, Integer>> entradasTable = Arrays.asList(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

    
        Map<String, Integer> mapaHash = crearMapaHashMap(entradasHash);
        System.out.println("HashMap: " + mapaHash);

        Map<String, Integer> mapaTable = crearMapaHashTable(entradasTable);
        System.out.println("Hashtable: " + mapaTable);


        Map<String, Integer> mapaFinal = combinarMapas(mapaHash, mapaTable);
        System.out.println("Combinado: " + mapaFinal);
        System.out.println((mapaFinal));
    }
}
