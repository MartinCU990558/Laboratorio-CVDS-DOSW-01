package reto5;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetBattle {

    private static HashSet randomNumbers(int amount) {
        HashSet<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < amount) {
            int num = random.nextInt(51);
            numeros.add(num);
        }

        return numeros;
    }

    private static TreeSet randomNumbersOrdered(int amount) {
        TreeSet<Integer> numeros = new TreeSet<>();
        Random random = new Random();

        while (numeros.size() < amount) {
            int num = random.nextInt(51);
            numeros.add(num);
        }

        return numeros;
    }

    public static HashSet generateHashSet() {
        HashSet<Integer> numberHashSet = randomNumbers(20);
        return numberHashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // DANIEL
    public static TreeSet generateTreeSet() {
        TreeSet<Integer> numberTreeSet = randomNumbersOrdered(20);
        return numberTreeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // AMBOS
    public static TreeSet unifySets(HashSet hash, TreeSet tree) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(hash);
        union.addAll(tree);
        return union;
    }
}


