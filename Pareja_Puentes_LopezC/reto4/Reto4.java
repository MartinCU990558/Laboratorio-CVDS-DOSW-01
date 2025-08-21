package reto4;
import java.util.*;
import java.util.stream.*;

public class Reto4{

    static Hashtable<String, Integer> table(List<Map.Entry<String, Integer>> par) {
        return par.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,Hashtable::new));
    }
    static HashMap<String, Integer> guardarEnHashMap(List<Map.Entry<String, Integer>> pares){
        return pares.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,HashMap::new));
    }
    static HashMap<String,Integer> combinado (Hashtable<String,Integer> hash,HashMap<String,Integer> hash2){
        return Stream.concat(hash.entrySet().stream(),hash2.entrySet().stream()).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (valor1, valor2) -> valor1, 
            HashMap::new
        ));
    }
     static HashMap<String, Integer> ordenarPorClaveAscendente(Map<String, Integer> mapa) {
        return mapa.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (existente, nuevo) -> existente,
                LinkedHashMap::new
            ));
    }

    public static void main(String[] args) {
        
    }
}






