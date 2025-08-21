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
        List<String> clavesHashMap = List.of("oro", "plata", "oro", "diamante");
        List<Integer> valoresHashMap = List.of(5, 3, 7, 10);

        List<String> clavesHashTable = List.of("plata", "rubí", "oro", "esmeralda");
        List<Integer> valoresHashTable = List.of(8, 4, 12, 6);

        if (clavesHashMap.size() != valoresHashMap.size() || clavesHashTable.size() != valoresHashTable.size()) {
            System.out.println("La cantidad de claves no coincide con la cantidad de valores");
        } else {
            Map<String, Integer> mapaHashMap = mapaSinDuplicados(clavesHashMap, valoresHashMap);
            Hashtable<String, Integer> mapaHashTable = mapaSinDuplicados2(clavesHashTable, valoresHashTable);

            for (Map.Entry<String, Integer> entry : mapaHashTable.entrySet()) {
                mapaHashMap.put(entry.getKey(), entry.getValue());
            }
            imprimirMapaMayusculas(mapaHashMap);
        }
    }
}
