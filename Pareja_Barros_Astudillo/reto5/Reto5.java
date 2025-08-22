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

    // Eliminar multiplos de 5
    public static Set<Integer> crearTreeSet(int[] numeros) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int n : numeros) {
            treeSet.add(n);
        }
        return treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // Union ambos conjuntos y mostrar resultados
    public static void unirYMostrar(Set<Integer> conjuntoA, Set<Integer> conjuntoB) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(conjuntoA);
        union.addAll(conjuntoB);

        
        union.forEach(n -> System.out.println("Número en arena: " + n));
    }

}