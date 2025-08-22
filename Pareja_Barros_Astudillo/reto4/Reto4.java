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

    // Método con Hashtable (segundo metodo pedido)
    public static Map<String, Integer> crearHashTable(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Map<String, Integer> tabla = new Hashtable<>();
        for (AbstractMap.SimpleEntry<String, Integer> par : lista) {
            tabla.putIfAbsent(par.getKey(), par.getValue());
        }
        return tabla;
    }

}