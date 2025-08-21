package reto4;
import java.util.*;
import java.util.stream.Collectors;

public class Reto4{

    static Hashtable<String, Integer> table(List<Map.Entry<String, Integer>> par) {
        return par.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,Hashtable::new));
    }
    static HashMap<String, Integer> guardarEnHashMap(List<Map.Entry<String, Integer>> pares){
        return pares.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,HashMap::new));
    }

    public static void main(String[] args) {
        
    }
    
}





