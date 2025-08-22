import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    public static Set<Integer> generarHashSet() {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(random.nextInt(30) + 1);
        }
        return hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static Set<Integer> generarTreeSet() {
        Random random = new Random();
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt(30) + 1);
        }
        return treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = generarHashSet();
        Set<Integer> treeSet = generarTreeSet();

        Set<Integer> union = new TreeSet<>();
        union.addAll(hashSet);
        union.addAll(treeSet);

        union.forEach(n -> System.out.println("Número en arena: " + n));
    }
}

