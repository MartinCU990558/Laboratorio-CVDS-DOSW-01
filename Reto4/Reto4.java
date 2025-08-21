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

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> entradasHash = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        Map<String, Integer> mapaHash = crearMapaHashMap(entradasHash);
        System.out.println(mapaHash);
    }
}
