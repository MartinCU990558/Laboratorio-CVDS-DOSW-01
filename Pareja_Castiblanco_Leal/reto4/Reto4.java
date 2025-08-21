package Pareja_Castiblanco_Leal.reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Reto4 {
    public static Map<String, Integer> mapaSinDuplicados(List<String> claves, List<Integer> valores) {
        Map<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < claves.size(); i++) {
            String clave = claves.get(i);
            Integer valor = valores.get(i);
            if (!mapa.containsKey(clave)) {
                mapa.put(clave, valor);
            }
        }
        return mapa;
    }

    public static Hashtable<String, Integer> mapaSinDuplicados2(List<String> claves, List<Integer> valores) {
        Hashtable<String, Integer> mapa = new Hashtable<>();
        for (int i = 0; i < claves.size(); i++) {
            String clave = claves.get(i);
            Integer valor = valores.get(i);
            if (!mapa.containsKey(clave)) {
                mapa.put(clave, valor);
            }
        }
        return mapa;
    }

    public static void imprimirMapa(Map<String, Integer> mapa) {
        mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .forEach(System.out::println);
    }

    public static void imprimirMapa2(Hashtable<String, Integer> mapa) {
        mapa.entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .forEach(System.out::println);
    }
    public static void imprimirMapaMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getKey().toUpperCase() + " = " + entry.getValue()));
    }

    public static void main(String[] args) {
        List<String> claves = List.of("dosw", "aysr", "ptia", "aysr", "comp");
        List<Integer> valores = List.of(1, 3, 5, 7, 9);

        if (claves.size() != valores.size()) {
            System.out.println("La cantidad de claves no coincide con la cantidad de valores");
        } else {
            Map<String, Integer> mapa = mapaSinDuplicados(claves, valores);
            imprimirMapa(mapa);
            imprimirMapaMayusculas(mapa);

            System.out.println("-----------------------------------------------------------");

            Hashtable<String, Integer> mapa2 = mapaSinDuplicados2(claves, valores);
            imprimirMapa2(mapa2);
            imprimirMapaMayusculas(mapa);
    }
}}
