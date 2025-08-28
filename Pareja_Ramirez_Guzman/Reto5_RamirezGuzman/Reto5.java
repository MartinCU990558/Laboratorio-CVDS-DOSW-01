package Pareja_Ramirez_Guzman.Reto5_RamirezGuzman;
import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    private static final Random random = new Random();

    public static Set<Integer> generarHashSet() {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.valueOf(random.nextInt(30) + 1));
        }
        return hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> generarTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(Integer.valueOf(random.nextInt(30) + 1));
        }
        return treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = generarHashSet();
        Set<Integer> treeSet = generarTreeSet();

        Set<Integer> union = new TreeSet<>(hashSet);
        union.addAll(treeSet);

        union.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
