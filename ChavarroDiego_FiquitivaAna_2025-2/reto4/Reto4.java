

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    public static Map<String,Integer> crearMapaHashMap(List<AbstractMap.SimpleEntry<String,Integer>> lista) {
        Map<String,Integer> mapa = new HashMap<>();
        for (AbstractMap.SimpleEntry<String,Integer> par : lista) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

    
    public static Map<String,Integer> crearMapaHashTable(List<AbstractMap.SimpleEntry<String,Integer>> lista) {
        Map<String,Integer> mapa = new Hashtable<>();
        for (AbstractMap.SimpleEntry<String,Integer> par : lista) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

   
    public static Map<String,Integer> combinarMapas(Map<String,Integer> hashMap, Map<String,Integer> hashTable) {
        
        Map<String,Integer> combinadoUpper =
            Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())
                  .collect(Collectors.toMap(
                      e -> e.getKey().toUpperCase(),  
                      Map.Entry::getValue,
                      (v1, v2) -> v2                 
                  ));

        // Paso 2: ordenar ascendente
        return combinadoUpper.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (v1, v2) -> v2,
                    LinkedHashMap::new
                ));
    }

  
    public static void imprimirMapa(Map<String,Integer> mapa) {
        mapa.entrySet().stream()
            .map(e -> String.format("Clave: %s | Valor: %d", e.getKey(), e.getValue()))
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String,Integer>> listaHashMap = Arrays.asList(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        List<AbstractMap.SimpleEntry<String,Integer>> listaHashTable = Arrays.asList(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );

        Map<String,Integer> mapaHashMap = crearMapaHashMap(listaHashMap);
        Map<String,Integer> mapaHashTable = crearMapaHashTable(listaHashTable);

        Map<String,Integer> mapaFinal = combinarMapas(mapaHashMap, mapaHashTable);

        imprimirMapa(mapaFinal);
    }
}
