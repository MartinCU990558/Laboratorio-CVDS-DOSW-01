package reto4;
import java.util.HashMap;
import  java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Reto4 {
    static Hashtable<String, Integer> table(List<Map.Entry<String, Integer>> par) {
        return par.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (y, x) -> y,Hashtable::new));
    }
}

