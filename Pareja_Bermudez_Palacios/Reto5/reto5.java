package Pareja_Bermudez_Palacios.reto5;

import java.util.*;
import java.util.stream.Collectors;

public class BatallaConjuntos {

    public static HashSet<Integer> generarHashSet() {
        HashSet<Integer> conjuntoHash = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            conjuntoHash.add(random.nextInt(30) + 1);
        }
        return conjuntoHash.stream()
                .filter(num -> num % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static TreeSet<Integer> generarTreeSet() {
        TreeSet<Integer> conjuntoTree = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            conjuntoTree.add(random.nextInt(30) + 1);
        }
        return conjuntoTree.stream()
                .filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = generarHashSet();
        TreeSet<Integer> treeSet = generarTreeSet();
        TreeSet<Integer> union = new TreeSet<>(hashSet);
        union.addAll(treeSet);
        union.forEach(num -> System.out.println("Número en arena: " + num));
    }
}
