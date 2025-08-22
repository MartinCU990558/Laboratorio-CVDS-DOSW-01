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


    public static HashSet generateHashSet() {
        HashSet<Integer> numberHashSet = randomNumbers(20);
        return numberHashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }


}

