import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {

    // Elimina multiplos de 3
    public static Set<Integer> crearHashSet(int[] numeros) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : numeros) {
            hashSet.add(n);
        }
        return hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

    

}