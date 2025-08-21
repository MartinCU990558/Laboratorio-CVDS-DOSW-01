package reto5;
import java.util.*;
import java.util.stream.Collectors;
public class Reto5 {
     public static Set<Integer> ordenNatural(TreeSet<Integer> arbol) {
        return arbol.stream()
            .filter(num -> num % 5 != 0)
            .collect(Collectors.toCollection(TreeSet::new));
    }
}
