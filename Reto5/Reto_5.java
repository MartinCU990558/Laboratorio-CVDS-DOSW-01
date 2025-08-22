package Idarraga_Estupinan.Reto5;

import java.util.*;
import java.util.stream.Collectors;

public class Reto_5 {

    public static HashSet<Integer> hash(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static TreeSet<Integer> tree(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        List<Integer> numerosHash = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> numerosTree = Arrays.asList(12, 3, 25, 7, 10, 12, 18);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hash(numerosHash));
        treeSet.addAll(tree(numerosTree));

        treeSet.forEach(n -> System.out.print("Número en arena: " + n + "\n"));
    }
}
