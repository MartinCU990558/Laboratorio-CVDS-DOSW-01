
import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    public static Map<String,Integer> crearMapaHashMap(List<AbstractMap.SimpleEntry<String,Integer>> lista) {
        Map<String,Integer> mapa = new HashMap<>();
        for (AbstractMap.SimpleEntry<String,Integer> par : lista) {
            mapa.putIfAbsent(par.getKey(), par.getValue()); // conserva el primer valor encontrado
        }
        return mapa;
    }

    // Estudiante A: combina y convierte claves a MAYÚSCULAS
    public static Map<String,Integer> combinarMapas(Map<String,Integer> hashMap, Map<String,Integer> hashTable) {
        Map<String,Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashTable); // prioriza valores del Hashtable

        return combinado.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (v1, v2) -> v2, // en conflicto gana el Hashtable
                        LinkedHashMap::new
                ));
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
        Map<String,Integer> mapaHashTable = new HashMap<>(hashTable); // placeholder, B hará el suyo
        Map<String,Integer> mapaFinal = combinarMapas(mapaHashMap, mapaHashTable);

        mapaFinal.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
    }
}
