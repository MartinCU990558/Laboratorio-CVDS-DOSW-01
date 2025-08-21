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

    public static Map<String, Integer> combinarMapas(Map<String, Integer> mapaHashMap, Map<String, Integer> mapaHashTable) {

        Map<String, Integer> mapaFinal = new HashMap<>(mapaHashMap);

        for (Map.Entry<String, Integer> entrada : mapaHashTable.entrySet()) {
            mapaFinal.put(entrada.getKey(), entrada.getValue());
        }

        return mapaFinal;
    }




    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> entradasHash = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        Map<String, Integer> mapaHash = crearMapaHashMap(entradasHash);
        System.out.println(mapaHash);

        Map<String, Integer> mapaTable = new Hashtable<>();
        mapaTable.put("oro", 20);
        mapaTable.put("esmeralda", 15);


        Map<String, Integer> mapaFinal = combinarMapas(mapaHash, mapaTable);
        System.out.println(mapaFinal);
    }

}
