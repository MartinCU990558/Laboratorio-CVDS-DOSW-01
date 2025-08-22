import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    // Metodo con HashMap (primer metodo pedido)
    public static Map<String, Integer> crearHashMap(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Map<String, Integer> mapa = new HashMap<>();
        for (AbstractMap.SimpleEntry<String, Integer> par : lista) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }

    // Metodo con Hashtable (segundo metodo pedido)
    public static Map<String, Integer> crearHashTable(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (AbstractMap.SimpleEntry<String, Integer> par : lista) {
            tabla.putIfAbsent(par.getKey(), par.getValue());
        }
        return tabla;
    }

    // Metodo unificado por ambos
    public static void combinarEImprimir(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
        
        Map<String, Integer> combinado = new HashMap<>(hashMap);
        hashTable.forEach((k, v) -> combinado.put(k, v)); 

        
        Map<String, Integer> resultado = combinado.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(), 
                        Map.Entry::getValue,
                        (v1, v2) -> v1, 
                        TreeMap::new 
                ));

        // Paso 3: imprimir
        resultado.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
    }

}