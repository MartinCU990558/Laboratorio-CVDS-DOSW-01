import java.util.HashSet;
import java.util.Random;
import java.util.Set;
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

    public static void main(String[] args) {
        Set<Integer> hashSet = generarHashSet();
        hashSet.forEach(n -> System.out.println("Número en HashSet: " + n));
    }
}
