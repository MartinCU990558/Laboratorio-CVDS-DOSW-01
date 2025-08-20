import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class Reto5 {

    static HashSet<Integer> multiplo(HashSet<Integer> lista) {
        return lista.stream().filter(x -> x % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void main(String args[]) {
        Random random = new Random();
        HashSet<Integer> lista = new HashSet<>();
        for (int i = 0; i < 8; i++) {
            int intRandom = random.nextInt(25);
            lista.add(intRandom);
        }

        System.out.println(multiplo(lista));

    }
}