package reto4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4{

    static Hashtable<String, Integer> table(List<Map.Entry<String, Integer>> par) {
        return par.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,Hashtable::new));
    }
    static HashMap<String, Integer> guardarEnHashMap(List<Map.Entry<String, Integer>> pares){
        return pares.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,HashMap::new));
    }

    static Map<String, Integer> combinado (HashMap<String, Integer> map, Hashtable<String, Integer> table) {

    return Stream.concat(map.entrySet().stream(), table.entrySet().stream())
        .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(v1, v2) -> v2,HashMap::new));
}

    public static void main(String[] args) {
        
    }
    
}





