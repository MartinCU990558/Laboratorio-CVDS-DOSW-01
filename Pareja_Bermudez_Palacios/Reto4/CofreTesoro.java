package reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CofreTesoro {

    static HashMap<String, Integer> construirHashMap(List<Map.Entry<String, Integer>> entradas) {
        HashMap<String, Integer> resultado = new HashMap<>();
        for (Map.Entry<String, Integer> par : entradas) {
            resultado.putIfAbsent(par.getKey(), par.getValue());
        }
        return resultado;
    }

    static Hashtable<String, Integer> construirHashTable(List<Map.Entry<String, Integer>> entradas) {
        Hashtable<String, Integer> resultado = new Hashtable<>();
        for (Map.Entry<String, Integer> par : entradas) {
            resultado.putIfAbsent(par.getKey(), par.getValue());
        }
        return resultado;
    }

    static Map<String, Integer> unirMapas(HashMap<String, Integer> mapa, Hashtable<String, Integer> tabla) {
        return Stream.concat(mapa.entrySet().stream(), tabla.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorMapa, valorTabla) -> valorTabla,
                        LinkedHashMap::new
                ));
    }

    static void mostrarTesoro(HashMap<String, Integer> mapa, Hashtable<String, Integer> tabla) {
        Map<String, Integer> combinado = unirMapas(mapa, tabla);

        combinado.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(), e.getValue()))
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> datosHashMap = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<Map.Entry<String, Integer>> datosHashTable = Arrays.asList(
                new AbstractMap.SimpleEntry<>("plata", 8),
                new AbstractMap.SimpleEntry<>("rubí", 4),
                new AbstractMap.SimpleEntry<>("oro", 12),
                new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        HashMap<String, Integer> mapa = construirHashMap(datosHashMap);
        Hashtable<String, Integer> tabla = construirHashTable(datosHashTable);

        mostrarTesoro(mapa, tabla);
    }
}
